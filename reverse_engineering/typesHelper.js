const _ = require('lodash');
const types = require('cassandra-driver').types;
const defaultData = require('../properties_pane/defaultData.json');
const abbrHash = {
	numeric: 'num',
	char: 'str',
	timestamp: 'ts',
	reference: 'udt'
};
const defaultColumnName = defaultData.field.name;

const getColumnType = (column, udtHash, sample) => {
	const fullCassandraType = types.getDataTypeNameByCode(column.type || column);
	const cassandraType = fullCassandraType.split('<')[0];

	if (udtHash && cassandraType === 'udt') {
		udtHash.push({
			udt: column,
			sample
		});
		return getRef(column);
	}
	return getType(cassandraType, column, sample, udtHash);
};

const getRef = (column) => {
	const name = _.get(column, 'type.info.name', 
		_.get(column, 'info.name', column.name)
	);

	return { type: 'reference', $ref: name };
};

const getType = (cassandraType, column, sample, udtHash) => {
	let appType = getAppType(cassandraType);

	if (cassandraType === 'map') {
		return handleMap(appType, column, sample, udtHash);
	} else if (cassandraType === 'tuple') {
		return handleTuple(appType, column, sample, udtHash);
	} else if (cassandraType === 'set' || cassandraType === 'list') {
		return handleList(appType, column, sample, udtHash);
	} else {
		return appType;
	}
};

const handleMap = (appType, column, sample, udtHash) => {
	const keyData = (column.info || column.type.info)[0];
	const valueData = (column.info || column.type.info)[1];
	const handledKeyData = getColumnType(keyData);
	const properties = getProperties(valueData, sample, udtHash);
	const keySubtype = handledKeyData.mode
		? { keySubtype: handledKeyData.mode }
		: {};
	const keyType = handledKeyData.type;
	const valueType = getChildTypeByProperties(properties);
	const subtype = getSubType(appType.type, valueType);
	
	return Object.assign({}, appType, keySubtype, {
		keyType,
		subtype,
		properties
	});
};

const handleTuple = (appType, column, sample, udtHash) => {
	sample = Array.isArray(sample) ? sample : [];

	const items = (column.info || column.type.info).map(item => {
		const sampleItem = sample.find(sampleItem => isTypeEqual(sampleItem, item));
		const handledValueData = getColumnType(item, udtHash, sampleItem);

		return handledValueData;
	});

	return Object.assign({}, appType, { items });
};

const handleList = (appType, column, sample, udtHash) => {
	const valueData = (column.info || column.type.info);
	const items = getItems(valueData, sample, udtHash);
	const valueType = (items[0] || { type: 'text' }).type;
	const subtype = getSubType(appType.type, valueType);

	return Object.assign({}, appType, {
		items, subtype
	});
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

const getProperties = (valueData, sample, udtHash) => {
	if (!sample || typeof sample !== 'object') {
		return getDefaultProperties(valueData, udtHash);
	}

	return Object.keys(sample).reduce((result, propertyName) => {
		return Object.assign({}, result, {
			[propertyName]: getColumnType(valueData, udtHash, sample[propertyName])
		})
	}, {});
};

const getDefaultProperties = (valueData, udtHash) => {
	const handledValueData = getColumnType(valueData, udtHash);
	const name = handledValueData.$ref || defaultColumnName;

	return {
		[name]: handledValueData
	};
};

const getJsonType = (type) => {
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
			return 'number';
		case "text":
		case "varchar":
		case "ascii":
		case "inet":
		case "timestamp":
		case "timeuuid":
		case "blob":
		case "date":
		case "time":
		case "uuid":
			return 'string';
		case "boolean":
			return 'boolean';
		case "tuple":
		case "list":
		case "set":
			return 'array';
		case "map":
			return 'object';
		default:
			return 'string';
	}
};

const isTypeEqual = (value, valueData) => {
	const fullCassandraType = types.getDataTypeNameByCode(valueData.type || valueData);
	const cassandraType = fullCassandraType.split('<')[0];
	const jsonType = getJsonType(cassandraType);

	if (jsonType === 'array') {
		return Array.isArray(value);
	} else if (jsonType === 'array') {
		return Object(value) === value;
	} else {
		return typeof value === jsonType;
	}
};

const getItems = (valueData, sample, udtHash) => {
	if (!Array.isArray(sample)) {
		return getDefaultItems(valueData, udtHash);
	}

	return sample.map(item => {
		return getColumnType(valueData, udtHash, item);
	});
};

const getDefaultItems = (valueData, udtHash) => {
	const handledValueData = getColumnType(valueData, udtHash);

	return [handledValueData];
};

const getChildTypeByProperties = (properties) => {
	const key = Object.keys(properties).pop();
	const type = (properties[key] || {}).type;

	if (type) {
		return type;
	} else {
		return 'text';
	}
};

module.exports = {
    getColumnType
};
