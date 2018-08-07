'use strict'

const { getFieldConfig, getTypeConfig } = require('./generalHelper');

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

const getModeType = (type, defaultType, udtTypeMap) => {
	if (type) {
		const mode = getFieldConfig(type, "mode");
		const definedType = (mode && mode.options) ? mode.options[0] : type;

		return getHandlerByType(definedType, udtTypeMap)({
			type: type,
			mode: (mode && mode.options && mode.options[0]),
			keyType: "string",
			items: { type: "string", mode: "varchar" },
			properties: { field: { type: "string", mode: "varchar" } }
		});
	}

	return defaultType;
};

const getScalarType = (type) => {
	const simpleType = (propertyData) => propertyData.type;
	const geoSpatioalType = (propertyData) => `'${propertyData.subType || "PointType"}'`;

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
		("DseExecutorStateType", (propertyData) => `'${simpleType(propertyData)}'`)
		("DateRangeType", (propertyData) => `'${simpleType(propertyData)}'`)
		("geospatial", geoSpatioalType)
		();
};

const getStructuralTypeHandler = (type, isNeedToBeFrozen, udtTypeMap) => {
	const isFrozen = property => Boolean(property.frozen);
	const setFrozen = typeHandler => propertyData => {
		const type = typeHandler(propertyData);

		return isFrozen(propertyData) ? getFrozen(type) : type;
	};

	const getValueTypeFromArray = (arraySchema, defaultType, udtTypeMap) => {
		if (arraySchema.items) {
			if (Array.isArray(arraySchema.items)) {
				return complexType(arraySchema.items[0], isFrozen(arraySchema));
			} else {
				return complexType(arraySchema.items, isFrozen(arraySchema));
			}
		} else {
			const typeConfig = getTypeConfig(arraySchema.type);
			if (typeConfig.subtypes && arraySchema.subtype) {
				const subTypeConfig = typeConfig.subtypes[arraySchema.subtype];
				if (subTypeConfig && subTypeConfig.childValueType) {
					return getModeType(subTypeConfig.childValueType, defaultType, udtTypeMap);
				}
			}
		}

		return defaultType;
	};

	const getValueTypeFromObject = (objectSchema, defaultType, udtTypeMap) => {
		if (objectSchema.properties) {
			const propertyName = Object.keys(objectSchema.properties)[0];
			
			if (propertyName) {
				const nestedPropertyData = objectSchema.properties[propertyName];
				
				return complexType(nestedPropertyData, isFrozen(objectSchema));
			}
		} else {
			const typeConfig = getTypeConfig(objectSchema.type);
			if (typeConfig.subtypes && objectSchema.subtype) {
				const subTypeConfig = typeConfig.subtypes[objectSchema.subtype];
				if (subTypeConfig && subTypeConfig.childValueType) {
					return getModeType(subTypeConfig.childValueType, defaultType, udtTypeMap);
				}
			}
		}

		return defaultType;
	};

	const complexType = ((isNeedToBeFrozen, udtTypeMap) => (nestedPropertyData, isParentFrozen) => {
		if (nestedPropertyData) {
			return getNestedTypeByData(nestedPropertyData, !isParentFrozen && isNeedToBeFrozen, udtTypeMap);
		} else {
			return "text";
		}
	})(isNeedToBeFrozen, udtTypeMap);

	const typeSet = (propertyData) => `set<${getValueTypeFromArray(propertyData, "varchar", udtTypeMap)}>`;

	const list = (propertyData) => `list<${getValueTypeFromArray(propertyData, "text", udtTypeMap)}>`;

	const tuple = (propertyData) => {
		let items = Array.isArray(propertyData.items) ? propertyData.items : [propertyData.items];

		return `tuple<${items.map(item => complexType(item, true)).join(', ')}>`;
	};

	const map = (propertyData) => {
		const keyType = getModeType(propertyData.keyType, "text", udtTypeMap);
		const valueType = getValueTypeFromObject(propertyData, "text", udtTypeMap);

		return `map<${keyType}, ${valueType}>`;
	};

	return ifType(type)
		("map", setFrozen(map))
		("list", setFrozen(list))
		("set", setFrozen(typeSet))
		("tuple", tuple)
		();
};

const getUDTHandler = (type, udtTypeMap) => {
	return () => udtTypeMap[type] ? udtTypeMap[type] : type;
};

const getFrozen = (typeDefinition) => `frozen<${typeDefinition}>`;

const getHandlerByType = (type, udtTypeMap) => (
	getScalarType(type)
	||
	getStructuralTypeHandler(type, true, udtTypeMap)
	||
	getUDTHandler(type, udtTypeMap)
);

const getNestedTypeByData = (propertyData, isNeedToBeFrozen, udtTypeMap) => {
	const type = getTypeByPropertyData(propertyData);
	const scalarTypeHandler = getScalarType(type);

	if (scalarTypeHandler) {
		return scalarTypeHandler(propertyData);
	}

	const freezingType = (
		getStructuralTypeHandler(type, false, udtTypeMap)
		||
		getUDTHandler(type, udtTypeMap)
	)(propertyData);

	return (isNeedToBeFrozen) ? getFrozen(freezingType) : freezingType;
};

const getTypeByPropertyData = (propertyData, udtTypeMap) => {
	if (propertyData.$ref) {
		return propertyData.$ref.split('/').pop();
	} else if (propertyData.type) {
		return propertyData.type;
	} else {
		return "string";
	}
};

const getTypeByData = (propertyData, udtTypeMap) => {
	const type = getTypeByPropertyData(propertyData);

	return getHandlerByType(type, udtTypeMap)(propertyData);
};

module.exports = {
	getTypeByData
};
