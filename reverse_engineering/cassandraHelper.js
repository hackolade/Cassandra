const cassandra = require('cassandra-driver');
const typesHelper = require('./typesHelper');
const _ = require('lodash');

var state = {
	client: null
};

const connect = (info) => {
	if (!state.client) {
		const username = info.user;
		const password = info.password;
		const authProvider = new cassandra.auth.PlainTextAuthProvider(username, password);
		const contactPoints = info.hosts.map(item => `${item.host}:${item.port}`);
		state.client = new cassandra.Client({ contactPoints, authProvider });
	}
	
	return state.client.connect();
};

const close = () => {
	if (state.client) {
		state.client = null;
	}
};

const getKeyspaceMetaData = (keyspace) => {
	return state.client.metadata.keyspaces[keyspace];
};

const getKeyspaceInfo = (keyspace) => {
	const metaData = getKeyspaceMetaData(keyspace);
	const strategy = metaData.strategy.split('.').slice(-1).pop();
	let keyspaceInfo = {
		code: keyspace,
		durableWrites: metaData.durableWrites,
		replStrategy: strategy
	};

	if (strategy === 'SimpleStrategy') {
		keyspaceInfo.replFactor = metaData.strategyOptions.replication_factor;
	} else if (strategy === 'NetworkTopologyStrategy') {
		keyspaceInfo.dataCenters = Object.keys(metaData.strategyOptions).map(key => {
			return {
				dataCenterName: key,
				replFactorValue: metaData.strategyOptions[key]
			};
		});
	}
	return keyspaceInfo;
};

const getKeyspacesNames = () => {
	return Object.keys(state.client.metadata.keyspaces);
};

const getTablesNames = (keyspace) => {
	const query = `SELECT table_name FROM system_schema.tables WHERE keyspace_name='${keyspace}'`;
	return execute(query);
};

const execute = (query) => {
	return state.client.execute(query);
};

const getTableMetadata = (keyspace, table) => {
	return state.client.metadata.getTable(keyspace, table);
};

const getColumnInfo = (keyspace, table) => {
	const query = `SELECT * FROM system_schema.columns WHERE keyspace_name='${keyspace}' AND table_name='${table}';`;
	return execute(query);
};

const prepareConnectionDataItem = (keyspace, tables) => {
	let connectionDataItem = {
		dbName: keyspace,
		dbCollections: tables
	};

	return connectionDataItem;
};

const getTableSchema = (columns, udtHash) => {
	let schema = {};
	columns.forEach(column => {
		const columnType = typesHelper.getColumnType(column, udtHash);
		schema[column.name] = columnType;
		schema[column.name].code = column.name;
		schema[column.name].static = column.isStatic;
		schema[column.name].frozen = column.type.options.frozen;
	});
	return { properties: schema };
};

const scanRecords = (keyspace, table) => {
	const options = { prepare : true , fetchSize : 1000 };
	const query = `SELECT * FROM "${keyspace}"."${table}"`;
	return execute(query);
};


const getEntityLevelData = (table, tableName) => {
	const partitionKeys = handlePartitionKeys(table.partitionKeys);
	const clusteringKeys = handleClusteringKeys(table);
	const indexes = handleIndexes(table.indexes);

	return {
		code: tableName,
		compositePartitionKey: partitionKeys,
		compositeClusteringKey: clusteringKeys,
		SecIndxs: indexes,
		comments: table.comment,
		tableOptions: getTableOptions(table)
	};
};

const getTableOptions = (table) => {
	const options = [
		`read_repair_chance = ${table.readRepairChance}`,
		`dclocal_read_repair_chance = ${table.localReadRepairChance}`,
		`gc_grace_seconds = ${table.gcGraceSeconds}`,
		`bloom_filter_fp_chance = ${table.bloomFilterFalsePositiveChance}`,
		`caching = ${table.caching}`,
		`compaction = ${JSON.stringify(table.compactionOptions)}`,
		`compression = ${JSON.stringify(table.compression)}`,
		`default_time_to_live = ${table.defaultTtl}`,
		`speculative_retry = '${table.speculativeRetry}'`,
		`min_index_interval = ${table.minIndexInterval}`,
		`max_index_interval = ${table.maxIndexInterval}`,
		`crc_check_chance = ${table.crcCheckChance}`
	];
	return options.join('\nAND ');
};

const getKeyOrder = (order) => {
	switch(order) {
		case 'DESC':
			return 'descending';
		case 'ASC':
		default:
			return 'ascending';
	}
};
const handlePartitionKeys = (partitionKeys) => {
	return (partitionKeys || []).map(item => item.name);
};

const handleClusteringKeys = (table) => {
	return (table.clusteringKeys || []).map((item, index) => {
		let clusteringOrder = table.clusteringOrder ? table.clusteringOrder[index] : '';
		return {
			name: item.name,
			type: getKeyOrder(clusteringOrder)
		};
	});
};

const handleIndexes = (indexes) => {
	return indexes.map(item => {
		return {
			name: item.name,
			SecIndxKey: [getIndexKey(item.target)]
		};
	});
};

const getIndexKey = (target) => {
	const regex = /\((.*?)\)/;
	const key = target.match(regex);
	return key ? key[1] : '';
};

const handleUdts = (udts) => {
	udts = _.uniqBy(udts, 'name');
	let schema = udts.length ? getTableSchema(udts) : null;
	return schema;
};

const getUDF = (keyspace) => {
	const query = `SELECT * FROM system_schema.functions WHERE keyspace_name='${keyspace}'`;
	return execute(query);
};

const getUDA = (keyspace) => {
	const query = `SELECT * FROM system_schema.aggregates WHERE keyspace_name='${keyspace}'`;
	return execute(query);
};

const handleUDF = (udf) => {
	const udfData = udf.rows.map(item => {
		const args = item.argument_names.map((name, index) => {
			return `${name} ${item.argument_types[index] || ''}`;
		}).join(', ');

		const deterministic = item.deterministic ? 'DETERMINISTIC' : '';
		const monotonic = item.monotonic ? 'MONOTONIC ON' + item.monotonic_on.join(', ') : '';

		const func = `CREATE OR REPLACE FUNCTION ${item.function_name} ( ${args} )
			${item.called_on_null_input ? 'CALLED' : 'RETURNS NULL'} ON NULL INPUT
			RETURNS ${item.return_type}  ${deterministic} ${monotonic}
			LANGUAGE ${item.language} AS
			$$ ${item.body} $$ ;`;

		console.log(func + '\n');

		return {
			name: item.function_name,
			storedProcFunction: func
		};
	});
	return udfData;
};

const handleUDA = (uda) => {
	const udaData = uda.rows.map(item => {
		const args = item.argument_types.join(', ');
		
		const aggr = `CREATE AGGREGATE  ${item.aggregate_name} (${args})
			SFUNC ${item.state_func}
			STYPE ${item.state_type}
			FINALFUNC ${item.final_func}
			INITCOND ${item.initcond}
			${item.deterministic ? 'DETERMINISTIC' : ''};`;

		console.log(aggr + '\n');

		return {
			name: item.aggregate_name,
			storedProcFunction: aggr
		};
	});
	return udaData;
};

const handleRows = (rows) => {

};

/*
const generateCustomInferSchema = (bucketName, documents, params) => {
	function typeOf(obj) {
		return {}.toString.call(obj).split(' ')[1].slice(0, -1).toLowerCase();
	};

	let sampleSize = params.sampleSize || 30;

	let inferSchema = {
		"#docs": 0,
		"$schema": "http://json-schema.org/schema#",
		"properties": {}
	};

	documents.forEach(item => {
		inferSchema["#docs"]++;
		
		for(let prop in item){
			if(inferSchema.properties.hasOwnProperty(prop)){
				inferSchema.properties[prop]["#docs"]++;
				inferSchema.properties[prop]["samples"].indexOf(item[prop]) === -1 && inferSchema.properties[prop]["samples"].length < sampleSize? inferSchema.properties[prop]["samples"].push(item[prop]) : '';
				inferSchema.properties[prop]["type"] = typeOf(item[prop]);
			} else {
				inferSchema.properties[prop] = {
					"#docs": 1,
					"%docs": 100,
					"samples": [item[prop]],
					"type": typeOf(item[prop])
				}
			}
		}
	});

	for (let prop in inferSchema.properties){
		inferSchema.properties[prop]["%docs"] = Math.round((inferSchema.properties[prop]["#docs"] / inferSchema["#docs"] * 100), 2);
	}
	return inferSchema;
};

const getSampleDocSize = (count, recordSamplingSettings) => {
	let per = recordSamplingSettings.relative.value;
	return (recordSamplingSettings.active === 'absolute')
		? recordSamplingSettings.absolute.value
			: Math.round( count/100 * per);
};

const getIndexes = (indexingPolicy) => {
	let generalIndexes = [];
	
	if(indexingPolicy){
		indexingPolicy.includedPaths.forEach(item => {
			let indexes = item.indexes;
			indexes = indexes.map(index => {
				index.indexPrecision = index.precision;
				index.automatic = item.automatic;
				index.mode = indexingPolicy.indexingMode;
				index.indexIncludedPath = item.path;
				return index;
			});

			generalIndexes = generalIndexes.concat(generalIndexes, indexes);
		});
	}

	return generalIndexes;
};

*/

module.exports = {
	connect,
	close,
	getKeyspacesNames,
	getTablesNames,
	prepareConnectionDataItem,
	getColumnInfo,
	getTableMetadata,
	getTableSchema,
	scanRecords,
	getEntityLevelData,
	getKeyspaceMetaData,
	getKeyspaceInfo,
	handleUdts,
	getUDF,
	getUDA,
	handleUDF,
	handleUDA
};
