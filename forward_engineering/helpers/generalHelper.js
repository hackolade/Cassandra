'use strict'
const fs = require('fs');
const path = require('path');
const TAB_SIZE = 2;

const tab = (text, count = 1) => {
	const space = ' '.repeat(count * TAB_SIZE);

	return text.split('\n').map(string => space + string).join('\n');
};

const retrivePropertyFromConfig = (config, tab, propertyName, defaultValue = "") => ((config || [])[tab] || {})[propertyName] || defaultValue;

const retrieveContainerName = (containerConfig) => retrivePropertyFromConfig(
		containerConfig, 0, "code", 
		retrivePropertyFromConfig(containerConfig, 0, "name", "")	
	);
const retrieveEntityName = (entityConfig) => retrivePropertyFromConfig(
	entityConfig, 0, "code",
	retrivePropertyFromConfig(entityConfig, 0, "collectionName", "")
);
const retrieveUDF = (containerConfig) => retrivePropertyFromConfig(containerConfig, 1, "UDFs", []);
const retrieveUDA = (containerConfig) => retrivePropertyFromConfig(containerConfig, 2, "UDAs", []);
const retrieveIndexes = (entityConfig) => retrivePropertyFromConfig(entityConfig, 1, "SecIndxs", []);
const getTableNameStatement = (keyspaceName, tableName) => getNameWithKeyspace(keyspaceName, `"${tableName}"`);
const getNameWithKeyspace = (keyspaceName, name) => `${(keyspaceName) ? `"${keyspaceName}".` : ""}${name}`;

const getConfig = (pathToConfig) => {
	try {
		const config = fs.readFileSync(path.join(__dirname, "..", "..", pathToConfig));

		return JSON.parse(config.toString().replace(/\/\*[\s\S]*?\*\//g, ""));
	} catch (e) {
		return {};
	}
};

const cacheResult = (method) => {
	let result;

	return (...args) => {
		if (!result) {
			result = method(...args);
		}

		return result;
	}
};

const getFieldLevelConfig = cacheResult(() => getConfig(path.join("properties_pane", "field_level", "fieldLevelConfig.json")));

const getTypesConfig = cacheResult(() => {
	const getName = typeFile => typeFile.replace(/\.json/, "");
	const typeDir = path.join(__dirname, "..", "..", "types");
	const types = fs.readdirSync(typeDir);

	return types.reduce((typesMap, fileName) => {
		typesMap[getName(fileName)] = getConfig(path.join("types", fileName));

		return typesMap;
	}, {});
});

const getTypeConfig = (type) => getTypesConfig()[type];

const getFieldConfig = (type, property) => {
	const fieldLevelConfig = getFieldLevelConfig().structure;

	if (!fieldLevelConfig[type]) {
		return;
	}
	const propertyData = fieldLevelConfig[type].find(config => config.propertyKeyword === property);

	return propertyData;
};

const eachField = (jsonSchema, callback) => {
	const resultSchema = Object.assign({}, jsonSchema);

	const eachProperty = (properties, callback) => {
		return Object.keys(properties).reduce((resultSchema, propertyName) => {
			const property = properties[propertyName];

			resultSchema[propertyName] = callback(eachField(property, callback), propertyName);

			return resultSchema;
		}, {});
	};
	const eachItem = (items, callback) => {
		return items.map((item, i) => {
			return callback(eachField(item, callback), i);
		});
	};

	if (resultSchema.hasOwnProperty('properties')) {
		resultSchema.properties = eachProperty(resultSchema.properties, callback);
	}

	if (resultSchema.hasOwnProperty('items')) {
		const items = Array.isArray(resultSchema.items) ? resultSchema.items : [resultSchema.items];

		resultSchema.items = eachItem(items, callback);
	}

	return resultSchema;
};


module.exports = {
	tab,
	retrieveContainerName,
	retrieveEntityName,
	retrieveUDF,
	retrieveUDA,
	retrieveIndexes,
	retrivePropertyFromConfig,
	getTableNameStatement,
	getFieldConfig,
	getTypeConfig,
	getNameWithKeyspace,
	eachField
};
