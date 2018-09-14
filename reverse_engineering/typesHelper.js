const types = require('cassandra-driver').types;
const defaultData = require('../properties_pane/defaultData.json');
const abbrHash = {
	numeric: 'num',
	char: 'str',
	timestamp: 'st'
};
const defaultColumnName = defaultData.field.name;

const getColumnType = (column, udtHash) => {
	const fullCassandraType = types.getDataTypeNameByCode(column.type || column);
	const cassandraType = fullCassandraType.split('<')[0];

	if (udtHash && cassandraType === 'udt') {
		udtHash.push(column);
		return getRef(column);
	}
	return getType(cassandraType, column);
};

const getRef = (column) => {
	return { type: 'reference' };
};

const getType = (cassandraType, column) => {
	let appType = getAppType(cassandraType);

	if (cassandraType === 'map') {
		handleMap(appType, column);
	}

	if (cassandraType === 'tuple') {
		handleTuple(appType, column);
	}

	if (cassandraType === 'set' || cassandraType === 'list') {
		handleList(appType, column);
	}

	return appType;
};

const handleMap = (appType, column) => {
	const keyData = (column.info || column.type.info)[0];
	const valueData = (column.info || column.type.info)[1];
	const handledKeyData = getColumnType(keyData);
	const handledValueData = getColumnType(valueData);
	const keyType = handledKeyData.type;
	const subtype = getSubType(appType.type, handledValueData.type);
	
	appType.keyType = keyType;
	appType.subtype = subtype;
	appType.properties = {
		[defaultColumnName]: handledValueData
	};

	return appType;
};

const handleTuple = (appType, column) => {
	const valueData = (column.info || column.type.info).map(item => {
		const valueData = item;
		const handledValueData = getColumnType(valueData);
		return handledValueData;
	});
	appType.items = valueData;
	return appType;
};

const handleList = (appType, column) => {
	const valueData = (column.info || column.type.info);
	const handledValueData = getColumnType(valueData);
	const subtype = getSubType(appType.type, handledValueData.type);

	appType.subtype = subtype;
	appType.items = [handledValueData];
	return appType;
};

const getAppType = (type) => {
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
				type: "numeric",
				mode: type	
			};
		case "text":
		case "varchar":
		case "ascii":
		case "inet":
			return {
				type: "char",
				mode: type
			};
		case "boolean":
			return {
				type: 'bool'
			};
		case "timestamp":
		case "timeuuid":
		case "blob":
		case "date":
		case "time":
		case "uuid":
			return { type };
		case "tuple":
		case "list":
		case "set":
		case "map":
			return { type };
		default:
			return {
				type: 'char'
			};
	}
}

const getSubType = (type, subType) => {
	return `${type}<${abbrHash[subType] || subType}>`;
}

module.exports = {
    getColumnType
};
