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
		const readTimeout = 60 * 1000;
		state.client = new cassandra.Client({
			contactPoints,
			authProvider,
			socketOptions: {
				readTimeout
			}
		});
	}
	
	return state.client.connect();
};

const close = () => {
	if (state.client) {
		state.client.shutdown();
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
		durableWrites: Boolean(metaData.durableWrites),
		replStrategy: strategy
	};

	if (strategy === 'SimpleStrategy') {
		keyspaceInfo.replFactor = Number(metaData.strategyOptions.replication_factor);
	} else if (strategy === 'NetworkTopologyStrategy') {
		keyspaceInfo.dataCenters = Object.keys(metaData.strategyOptions).map(key => {
			return {
				dataCenterName: key,
				replFactorValue: Number(metaData.strategyOptions[key])
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
	const connectionDataItem = {
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

const scanRecords = (keyspace, table, recordSamplingSettings) => {
	const defaultCount = 1000;
	const query = `SELECT COUNT(*) FROM "${keyspace}"."${table}"`;
	
	return execute(query)
	.then(count => new Promise((resolve, reject) => {
		const rowsCount = _.get(count, 'rows[0].count.low', defaultCount);
		let rows = [];

		if (!rowsCount) {
			return resolve(rows);
		}

		const size = getSampleDocSize(rowsCount, recordSamplingSettings)
		const options = { prepare : true , autoPage: true };
		const selQuery = `SELECT * FROM "${keyspace}"."${table}" LIMIT ${size}`;
		
		state.client.eachRow(selQuery, [], options, function(n, row) {
			rows.push(row)
		}, (err, rs) => {
			return (err ? reject(err) : resolve(rows))
		});
	}));
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

const changeQuotes = (str) => {
	return String(str).replace(/\"/g, '\'');
};

const getCompaction = (data) => {
	return Object.assign({}, data.compactionOptions, {
		class: data.compactionClass
	});
};

const getTableOptions = (table) => {
	const options = [
		`read_repair_chance = ${table.readRepairChance}`,
		`dclocal_read_repair_chance = ${table.localReadRepairChance}`,
		`gc_grace_seconds = ${table.gcGraceSeconds}`,
		`bloom_filter_fp_chance = ${table.bloomFilterFalsePositiveChance}`,
		`caching = ${changeQuotes(table.caching)}`,
		`compaction = ${changeQuotes(JSON.stringify(getCompaction(table)))}`,
		`compression = ${changeQuotes(JSON.stringify(table.compression))}`,
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
		const clusteringOrder = table.clusteringOrder ? table.clusteringOrder[index] : '';
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
	return target;
};

const handleUdts = (udts) => {
	if (udts && udts.length) {
		let schema = { properties: {}};

		udts.forEach(udt => {
			schema.properties[udt.name] = {
				type: 'udt',
				static: udt.isStatic,
				properties: getTableSchema(udt.type.info.fields).properties
			};
		});
		return schema;
	} else {
		return null;
	}
};

const getUDT = (keyspace) => {
	const query = `SELECT * FROM system_schema.types WHERE keyspace_name='${keyspace}'`;
	return execute(query);
};

const getUDF = (keyspace) => {
	const query = `SELECT * FROM system_schema.functions WHERE keyspace_name='${keyspace}'`;
	return execute(query);
};

const getUDA = (keyspace) => {
	const query = `SELECT * FROM system_schema.aggregates WHERE keyspace_name='${keyspace}'`;
	return execute(query);
};

const removeFrozen = str => str.replace(/frozen\<(.*)\>/i, '$1')

const handleUDF = (udf) => {
	const udfData = udf.rows.map(item => {
		const args = item.argument_names.map((name, index) => {
			return `${name} ${removeFrozen(item.argument_types[index] || '')}`;
		}).join(', ');

		const deterministic = item.deterministic ? 'DETERMINISTIC' : '';
		const monotonic = item.monotonic ? 'MONOTONIC ON' + item.monotonic_on.join(', ') : '';

		const func = `CREATE OR REPLACE FUNCTION ${item.function_name} ( ${args} )
			${item.called_on_null_input ? 'CALLED' : 'RETURNS NULL'} ON NULL INPUT
			RETURNS ${removeFrozen(item.return_type)}  ${deterministic} ${monotonic}
			LANGUAGE ${item.language} AS
			$$ ${item.body} $$ ;`;

		return {
			name: item.function_name,
			storedProcFunction: func
		};
	});
	return udfData;
};

const handleUDA = (uda) => {
	const udaData = uda.rows.map(item => {
		const args = item.argument_types.map(removeFrozen).join(', ');
		
		const aggr = `CREATE AGGREGATE  ${item.aggregate_name} (${args})
			SFUNC ${item.state_func}
			STYPE ${removeFrozen(item.state_type)}
			FINALFUNC ${item.final_func}
			INITCOND ${item.initcond}
			${item.deterministic ? 'DETERMINISTIC' : ''};`;

		return {
			name: item.aggregate_name,
			storedProcFunction: aggr
		};
	});
	return udaData;
};

const getPackageData = (data, includeEmptyCollection) => {
	let packageData = {
		dbName: data.keyspaceName,
		collectionName: data.tableName,
		documents: []
	};

	if (data.table.columns && data.table.columns.length) {
		packageData.bucketInfo = getKeyspaceInfo(data.keyspaceName);
		packageData.bucketInfo.UDFs = data.UDFs;
		packageData.bucketInfo.UDAs = data.UDAs;
		packageData.entityLevel = getEntityLevelData(data.table, data.tableName);
		
		const schema = getTableSchema(data.table.columns, data.udtHash);
		packageData.validation = {
			jsonSchema: schema
		};
		packageData.modelDefinitions = handleUdts(data.udtHash);
	} else if (!includeEmptyCollection) {
		packageData = null;
	}
	return packageData;
};

const prepareError = (error) => {
	return {
		message: error.message,
		stack: error.stack
	};
};

const filterKeyspaces = (keyspaces, systemKeyspaces) => {
	return _.difference(keyspaces, systemKeyspaces || []);
};


const getSampleDocSize = (count, recordSamplingSettings) => {
	const per = recordSamplingSettings.relative.value;
	return (recordSamplingSettings.active === 'absolute')
		? recordSamplingSettings.absolute.value
			: Math.round( count/100 * per);
};

const splitScriptByQueries = (script) => {
	const findFunctionStatements = (script) => {
		return (script.match(/\$\$([\s\S]+?)\$\$/g) || [])
			.map(item => item.trim().replace(/(^\$\$|\$\$$)/g, ''));
	};
	const getPlaceholder = (n) => `\$__HACKOLADE__PLACEHOLDER_${n}__\$`;
	const functionStatements = findFunctionStatements(script);

	const queries = functionStatements.reduce((script, func, i) => {
		return script.replace(func, getPlaceholder(i));
	}, script)
		.split(';')
		.map(query => query.trim())
		.filter(Boolean);

	return functionStatements.reduce((queries, func, i) => {
		return queries.map(query => query.replace(getPlaceholder(i), func));
	}, queries);
};

const batch = (script, progress) => {
	const queries = splitScriptByQueries(script);

	const totalQueries = queries.length;
	let currentQuery = 0;

	return promiseSeriesAll(
		queries.map(query => () => state.client.execute(query)),
		(result) => {
			const query = queries[currentQuery];

			progress(query, result, currentQuery, totalQueries);

			currentQuery++;
		}
	).then(
		result => result,
		error => Promise.reject({ error, query: queries[currentQuery] })
	);
};

const promiseSeriesAll = (promises, callback) => {
	if (!promises.length) {
		return Promise.resolve();
	}

	return promises[0]().then(result => {
		callback(result);

		return promiseSeriesAll(promises.slice(1), callback);
	});
};

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
	handleUDA,
	getPackageData,
	prepareError,
	filterKeyspaces,
	batch
};
