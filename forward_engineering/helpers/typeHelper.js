'use strict'

const ifType = type => {
	let result;

	const handler = (wanted, returnValue) => {
		if (wanted === type) {
			result = returnValue;
		} else if (wanted === undefined) {
			return result;
		}

		return handler;
	};

	return handler;
};

const getScalarType = (type) => {
	const simpleType = (propertyData) => propertyData.type;

	return ifType(type)
		("string", (propertyData) => (propertyData.mode || "text"))
		("number", (propertyData) => { 
			const type = (propertyData.mode || "integer");
	
			return (type === "integer") ? "int" : type;
		})
		("binary", () => "blob")
		("boolean", simpleType)
		("blob", simpleType)
		("timestamp", simpleType)
		("date", simpleType)
		("time", simpleType)
		("duration", simpleType)
		("uuid", simpleType)
		("timeuuid", simpleType)
		();
};

const getStructuralTypeHandler = (type, isNeedToBeFrozen) => {
	const getValueTypeFromArray = (arraySchema, defaultType) => {
		if (arraySchema.items) {
			if (Array.isArray(arraySchema.items)) {
				return complexType(arraySchema.items[0]);
			} else {
				return complexType(arraySchema.items);
			}
		}

		return defaultType;
	};

	const getValueTypeFromObject = (objectSchema, defaultType) => {
		if (objectSchema.properties) {
			const propertyName = Object.keys(objectSchema.properties)[0];
			
			if (propertyName) {
				const nestedPropertyData = objectSchema.properties[propertyName];
				
				return complexType(nestedPropertyData);
			}
		}

		return defaultType;
	};

	const complexType = (nestedPropertyData) => {
		if (nestedPropertyData) {
			return getNestedTypeByData(nestedPropertyData, isNeedToBeFrozen);
		} else {
			return "text";
		}
	};

	const getSetType = (propertyData, defaultType) => `set<${getValueTypeFromArray(propertyData, defaultType)}>`;

	const list = (propertyData) => `list<${getValueTypeFromArray(propertyData, "text")}>`;

	const tuple = (propertyData) => {
		let items = Array.isArray(propertyData.items) ? propertyData.items : [propertyData.items];

		return `tuple<${items.map(complexType).join(', ')}>`;
	};

	const map = (propertyData) => {
		const keyType = "varchar";
		const valueType = getValueTypeFromObject(propertyData, "text");

		return `map<${keyType}, ${valueType}>`;
	};

	return ifType(type)
		("map", map)
		("list", list)
		("array", list)
		("tuple", tuple)
		("stringSet", data => getSetType(data, "varchar"))
		("numberSet", data => getSetType(data, "int"))
		("binarySet", data => getSetType(data, "blob"))
		();
};

const getUDTHandler = (type) => {
	return () => type;
};

const getFrozen = (typeDefinition) => `frozen<${typeDefinition}>`;

const getHandlerByType = (type) => (
	getScalarType(type)
	||
	getStructuralTypeHandler(type, true)
	||
	getUDTHandler(type)
);

const getNestedTypeByData = (propertyData, isNeedToBeFrozen) => {
	const type = getTypeByPropertyData(propertyData);
	const scalarTypeHandler = getScalarType(type);

	if (scalarTypeHandler) {
		return scalarTypeHandler(propertyData);
	}

	const freezingType = (
		getStructuralTypeHandler(type, false)
		||
		getUDTHandler(type)
	)(propertyData);

	return (isNeedToBeFrozen) ? getFrozen(freezingType) : freezingType;
};

const getTypeByPropertyData = (propertyData) => {
	if (propertyData.$ref) {
		return propertyData.$ref.split('/').pop();
	} else if (propertyData.type) {
		return propertyData.type;
	} else {
		return "string";
	}
};

const getTypeByData = (propertyData) => {
	const type = getTypeByPropertyData(propertyData);

	return getHandlerByType(type)(propertyData);
};

module.exports = {
	getTypeByData
};
