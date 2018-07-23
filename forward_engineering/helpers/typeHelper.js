'use strict'

const typeHandler = () => {
	const getSetType = (propertyData, defaultType) => {
		let valueType = getValueTypeFromArray(propertyData, defaultType);

		return getComplexDefinition(`set<${valueType}>`, hasComplex(valueType));
	};

	const string = (propertyData) => (propertyData.mode || "text");
	const number = (propertyData) => { 
		const type = (propertyData.mode || "integer");

		if (type === "integer") {
			return "int";
		} else {
			return type;
		}
	};
	const binary = (propertyData) => "blob";

	const boolean = simpleType.bind(null);
	const blob = simpleType.bind(null);
	const timestamp = simpleType.bind(null);
	const date = simpleType.bind(null);
	const time = simpleType.bind(null);
	const duration = simpleType.bind(null);
	const uuid = simpleType.bind(null);
	const timeuuid = simpleType.bind(null);

	const map = (propertyData) => {
		const keyType = "varchar";
		let valueType = getValueTypeFromObject(propertyData, "text");

		return getComplexDefinition(`map<${keyType}, ${valueType}>`, hasComplex(valueType));
	};

	const list = (propertyData) => {
		let valueType = getValueTypeFromArray(propertyData, "text");

		return getComplexDefinition(`list<${valueType}>`, hasComplex(valueType));
	};

	const tuple = (propertyData) => {
		let items = Array.isArray(propertyData.items) ? propertyData.items : [propertyData.items];

		return `tuple<${items.map(complexType).join(', ')}>`;
	};

	const arrayHandler = list.bind(null);

	const stringSet = (propertyData) => getSetType(propertyData, "varchar");
	const numberSet = (propertyData) => getSetType(propertyData, "int");
	const binarySet = (propertyData) => getSetType(propertyData, "blob");

	const handlersMap = {
		string, number, binary, 
		boolean, blob, timestamp,
		date, time, duration, 
		uuid, timeuuid, map,
		list, tuple, stringSet,
		numberSet, binarySet,
		array: arrayHandler
	};

	return handlersMap;
};

const hasComplex = (valueType) => /(map|list|tuple|set)/i.test(valueType);

const getFrozen = (typeDefinition) => `frozen<${typeDefinition}>`;

const getComplexDefinition = (typeDefinition, hasComplex) => {
	if (hasComplex) {
		return getFrozen(typeDefinition);
	} else {
		return typeDefinition;
	}
};
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

const simpleType = (propertyData) => propertyData.type;

const complexType = (nestedPropertyData) => {
	if (nestedPropertyData) {	
		return typeHandler()[nestedPropertyData.type](nestedPropertyData);
	} else {
		return "text";
	}
};

module.exports = {
	typeHandler	
};
