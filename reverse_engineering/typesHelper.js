const types = require('cassandra-driver').types;
const regex = '\<(.*)\>';

const getColumnType = (type) => {
	const cassandraType = types.getDataTypeNameByCode(type);
	return getType(cassandraType);
};

const getType = (cassandraType) => {
	// custom:     0x0000,
	// udt:        0x0030
	
	let type = cassandraType;
	let matchedType = type.match(regex);
	if (matchedType) {
		const subTypeBlock = matchedType[0];
		type = type.replace(subTypeBlock, '');
	}

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
		case "map":
			return getSubtype(cassandraType);
		default:
			return {
				type: 'string'
			};
	}
};

const getSubtype = (cassandraType) => {
	const handleCassandraType = (cassandraType) => {
		let matchedType = cassandraType.match(regex);
		let jsonType = {};

		if (matchedType) {
			const subTypeBlock = matchedType[0];
			const subType = matchedType[1];
			jsonType.type = cassandraType.replace(subTypeBlock, '');

			if (jsonType.type === 'set' || jsonType.type === 'list') {
				jsonType.items = [handleCassandraType(subType)];
				let typeData = handleType(jsonType.type,  jsonType.items[0].type);
				jsonType.subtype = typeData.subtype; 
			} else {
				jsonType.properties = [handleCassandraType(subType)];
				let typeData = handleType(jsonType.type,  jsonType.properties[0].type);
				jsonType.properties = [];
				jsonType.subtype = typeData.subtype; 
				jsonType.key = typeData.key; 
			}
		} else {
			const bla = cassandraType.split(',');
			if(bla && bla.length > 1) {
				jsonType.type = cassandraType;
			} else {
				jsonType = Object.assign(jsonType, getType(cassandraType));
			}
		}

		return jsonType;
	};

	const handleType = (type, subtype) => {
		subtype = subtype.split(',');

		if (Array.isArray(subtype)) {
			let sType = `${type}<${subtype[0]}>`; 
			return {
				key: subtype[1],
				subtype: sType
			};
		} else {
			let sType = `${type}<${subtype}>`; 
			return {
				subtype: sType
			};
		}
	};

	return handleCassandraType(cassandraType);
};


module.exports = {
    getColumnType,
	getType,
	getSubtype
};
