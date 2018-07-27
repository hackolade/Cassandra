const cassandra = require('cassandra-driver');
const types = require('cassandra-driver').types;

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

const getTableSchema = (columns) => {
	let schema = {};
	columns.forEach(column => {
		const columnType = getColumnType(column.type);
		schema[column.name] = columnType;
		schema[column.name].static = column.isStatic;
		schema[column.name].frozen = column.type.options.frozen;
	});
	return { properties: schema };
};

const getColumnType = (code) => {
	const cassanddraType = types.getDataTypeNameByCode(code);
	return getType(cassanddraType);
};

const getType = (type, value) => {
	// custom:     0x0000,
	// udt:        0x0030

	switch(type) {
		case "smallint":
		case "tinyint":
		case "int":
		case "bigint":
		case "counter":
		case "decimal":
		case "double":
		case "float":
		case "varint":
			return {
				type: "number",
				mode: type	
			};
		case "text":
		case "varchar":
		case "ascii":
		case "inet":
			return {
				type: "string",
				mode: type
			};
		case "timestamp":
		case "timeuuid":
		case "tuple":
		case "boolean":
		case "blob":
		case "date":
		case "time":
		case "uuid":
			return { type };
		case "list":
		case "set":
			return { 
				type,
				subtype: getSubtype(value)
			};
		case "map":
			return { 
				type,
				subtype: getSubtype(value),
				keyType: getSubtype(value)
			};
		default:
			return {
				type: 'string'
			};
	}
};

const getSubtype = (type, value) => {
	return 'string';
};

const scanRecords = (keyspace, table) => {
	const options = { prepare : true , fetchSize : 1000 };
	const query = `SELECT * FROM ${keyspace}.${table}`;
	return execute(query);
};


const getEntityLevelData = (table) => {
	const partitionKeys = (table.partitionKeys || []).map(item => item.name);
	const clusteringKeys = (table.clusteringKeys || []).map((item, index) => {
		let clusteringOrder = table.clusteringOrder ? table.clusteringOrder[index] : '';
		return {
			name: item.name,
			type: getKeyOrder(clusteringOrder)
		};
	});
	const indexes = (table.indexes || []).map(item => {
		return { name: item.name };
	});
	
	return {
		compositePartitionKey: partitionKeys,
		compositeClusteringKey: clusteringKeys,
		indexes
	}
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
	getEntityLevelData
};
