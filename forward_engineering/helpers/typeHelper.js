'use strict'

const { getFieldConfig, getTypeConfig, canTypeHaveSubtype } = require('./generalHelper');

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

		return getHandlerByType(type, udtTypeMap)({
			type: type,
			mode: definedType,
			frozen: true,
			keyType: "char",
			keySubtype: "text",
			items: { type: "char", mode: "varchar" },
			properties: { field: { type: "char", mode: "varchar" } }
		});
	}

	return defaultType;
};

const getScalarType = (type, udtTypeMap) => {
	const simpleType = (propertyData) => propertyData.type;
	const geoSpatialType = (propertyData) => `'${propertyData.subType || "PointType"}'`;
	const getJsonType = (propertyData) => {
		if (propertyData.physicalType) {
			return getHandlerByType(propertyData.physicalType)(Object.assign(propertyData, { type: propertyData.physicalType }));
		}
	};

	return ifType(type)
		("char", (propertyData) => (propertyData.mode || "text"))
		("numeric", (propertyData) => { 
			const type = (propertyData.mode || "integer");
	
			return (type === "integer") ? "int" : type;
		})
		("binary", () => "blob")
		("bool", () => "boolean")
		("blob", simpleType)
		("timestamp", simpleType)
		("date", simpleType)
		("time", simpleType)
		("duration", simpleType)
		("uuid", simpleType)
		("timeuuid", simpleType)
		("DseExecutorStateType", (propertyData) => `'${simpleType(propertyData)}'`)
		("DateRangeType", (propertyData) => `'${simpleType(propertyData)}'`)
		("geospatial", geoSpatialType)
		("udt", (propertyData, propertyName) => {
			return getUDTHandler(propertyName, udtTypeMap)();
		})
		("jsonObject", getJsonType)
		("jsonArray", getJsonType)
		();
};

const getStructuralTypeHandler = (type, isNeedToBeFrozen, udtTypeMap) => {
	const isFrozen = property => Boolean(property.frozen);
	const setFrozen = typeHandler => propertyData => {
		const type = typeHandler(propertyData);

		return isFrozen(propertyData) ? getFrozen(type) : type;
	};

	const getValueTypeFromArray = (arraySchema, defaultType, udtTypeMap, propertyName) => {
		if (arraySchema.items) {
			if (Array.isArray(arraySchema.items)) {
				return complexType(arraySchema.items[0], isFrozen(arraySchema), 0);
			} else {
				return complexType(arraySchema.items, isFrozen(arraySchema), 0);
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
				
				return complexType(nestedPropertyData, isFrozen(objectSchema), propertyName);
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

	const complexType = ((isNeedToBeFrozen, udtTypeMap) => (nestedPropertyData, isParentFrozen, propertyName) => {
		if (nestedPropertyData) {
			const nestedType = getNestedTypeByData(nestedPropertyData, !isParentFrozen && isNeedToBeFrozen, udtTypeMap, propertyName);
			
			if (nestedType !== undefined) {
				return nestedType;
			} else {
				'';
			}
		} else {
			return "text";
		}
	})(isNeedToBeFrozen, udtTypeMap);

	const typeSet = (propertyData, propertyName) => `set<${getValueTypeFromArray(propertyData, "varchar", udtTypeMap, propertyName)}>`;

	const list = (propertyData, propertyName) => `list<${getValueTypeFromArray(propertyData, "text", udtTypeMap, propertyName)}>`;

	const tuple = (propertyData, propertyName) => {
		let items = Array.isArray(propertyData.items) ? propertyData.items : [propertyData.items];

		return `tuple<${items.map((item, i) => complexType(item, true, i)).join(', ')}>`;
	};

	const map = (propertyData, propertyName) => {
		const keyType = canTypeHaveSubtype(propertyData.keyType, propertyData.keySubtype)
			? propertyData.keySubtype
			: getModeType(propertyData.keyType, "text", udtTypeMap);
		const valueType = getValueTypeFromObject(propertyData, "text", udtTypeMap, propertyName);

		return `map<${keyType}, ${valueType}>`;
	};

	return ifType(type)
		("map", setFrozen(map))
		("list", setFrozen(list))
		("set", setFrozen(typeSet))
		("tuple", tuple)
		();
};

const getUDTHandler = (type, udtTypeMap, parentIsFrozen) => {
	return () => {
		const data = (udtTypeMap[type] || {});

		if (data.frozen && !parentIsFrozen) {
			return getFrozen(data.name);
		} else {
			return data.name;
		}
	};
};

const getFrozen = (typeDefinition) => typeDefinition === undefined ? undefined : `frozen<${typeDefinition}>`;

const getHandlerByType = (type, udtTypeMap) => (
	getScalarType(type, udtTypeMap)
	||
	getStructuralTypeHandler(type, true, udtTypeMap)
	||
	getUDTHandler(type, udtTypeMap)
);

const getNestedTypeByData = (propertyData, isNeedToBeFrozen, udtTypeMap, propertyName) => {
	const type = getTypeByPropertyData(propertyData);
	const scalarTypeHandler = getScalarType(type, udtTypeMap);

	if (scalarTypeHandler) {
		return scalarTypeHandler(propertyData, propertyName);
	}

	const freezingType = (
		getStructuralTypeHandler(type, false, udtTypeMap)
		||
		getUDTHandler(type, udtTypeMap, isNeedToBeFrozen)
	)(propertyData, propertyName);

	return (isNeedToBeFrozen) ? getFrozen(freezingType) : freezingType;
};

const getTypeByPropertyData = (propertyData) => {
	if (propertyData.$ref) {
		return propertyData.$ref.split('/').pop();
	} else if (propertyData.type) {
		return propertyData.type;
	} else {
		return "char";
	}
};

const getTypeByData = (propertyData, udtTypeMap, propertyName) => {
	const type = getTypeByPropertyData(propertyData);

	return getHandlerByType(type, udtTypeMap)(propertyData, propertyName);
};

module.exports = {
	getTypeByData
};
