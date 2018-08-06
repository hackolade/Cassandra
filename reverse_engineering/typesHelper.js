const types = require('cassandra-driver').types;
const regex = '\<(.*)\>';
const abbrHash = {
	number: 'num',
	string: 'str',
	timestamp: 'st'
};

const getColumnType = (column, udtHash) => {
	const cassandraType = types.getDataTypeNameByCode(column.type);
	if (udtHash && cassandraType === 'udt') {
		udtHash.push(column);
		return getRef(column);
	}
	return getType(cassandraType);
};

const getRef = (column) => {
	return { type: 'reference' };
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
			const csType = cassandraType.split(',');
			if(csType && csType.length > 1) {
				jsonType.type = cassandraType;
			} else {
				jsonType = Object.assign(jsonType, getType(cassandraType));
			}
		}

		return jsonType;
	};

	const handleType = (type, subtype) => {
		subtype = subtype.split(',');
		
		if (Array.isArray(subtype) && subtype.length === 1) {
			subtype = subtype[0];
		}

		if (Array.isArray(subtype)) {
			subtype[0] = getType(subtype[0]).type;
			subtype[0] = abbrHash[subtype[0]]; 
			let sType = `${type}<${subtype[0]}>`;
			
			return {
				keyType: getType(subtype[1].trim()).type,
				subtype: sType
			};
		} else {
			subtype = getType(subtype).type;
			subtype = abbrHash[subtype]; 
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
