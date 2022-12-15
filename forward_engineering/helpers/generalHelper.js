'use strict'
const fs = require('fs');
const path = require('path');
const TAB_SIZE = 2;

const getDataStaxVersion = (dbVersion = '') => {
	if (!dbVersion.startsWith('DSE')) {
		return '';
	}

	const version = dbVersion.split(' ')[1] || '';

	return version.split('.')[0] || '';
};

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
const retrieveIndexes = (entityConfig, dbVersion) => {
	const indexTab = entityConfig[1];
	const result = {
		indexes: retrivePropertyFromConfig(entityConfig, 1, "SecIndxs", []),
	};

	if (indexTab.searchIndex) {
		result.searchIndex = {
			indexType: 'search',
			columns: indexTab.searchIndexColumns,
			config: indexTab.searchIndexConfig,
			profiles: getIndexProfiles(indexTab.searchIndexProfiles, dbVersion),
			options: indexTab.searchIndexOptions,
			ifNotExist: indexTab.searchIndexIfNotExist
		};
	}

	return result;
};

const filterSpaceSaving = (searchIndexProfiles, profileForFilter) => searchIndexProfiles.filter(profile => !profileForFilter.includes(profile));

const getIndexProfiles = (searchIndexProfiles, dbVersion) => {
	const dataStaxVersion = getDataStaxVersion(dbVersion);
	const spaceSavingNoTextfieldNotExist = dataStaxVersion.length ? Number(dataStaxVersion) >=6 : false;
	const profileForFilter = [spaceSavingNoTextfieldNotExist ? "spaceSavingNoTextfield" : ''];
	
	searchIndexProfiles = !Array.isArray(searchIndexProfiles) ? [searchIndexProfiles].filter(Boolean) : searchIndexProfiles;
	
	searchIndexProfiles = filterSpaceSaving(searchIndexProfiles, profileForFilter);

	const spaceSavingAll = filterSpaceSaving([
		"spaceSavingNoJoin",
		"spaceSavingNoTextfield",
		"spaceSavingSlowTriePrecision"
	], profileForFilter);

	const isSpaceSavingAll = spaceSavingAll.every(item => searchIndexProfiles.includes(item));

	if (isSpaceSavingAll) {
		return ['spaceSavingAll'];
	}

	return searchIndexProfiles;
};

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
const entityLevelConfig = cacheResult(() => getConfig(path.join("properties_pane", "entity_level", "entityLevelConfig.json")));

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
const getEntityLevelConfig = () => entityLevelConfig();

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

const canTypeHaveSubtype = (type, subtype) => {
	const subtypeConfig = getFieldConfig(type, "mode") || {};

	if (!Array.isArray(subtypeConfig.options)) {
		return false;
	}

	const hasSubtype = subtypeConfig.options.includes(subtype);

	return hasSubtype;
};

const commentDeactivatedStatement = (statement, isActivated = true, isParentActivated = true, useMultiLineComment = true) => {
	if (isActivated || !isParentActivated || !statement) {
		return statement;
	}
	const insertBeforeEachLine = (statement, insertValue = '-- ') =>
		statement
			.split('\n')
			.map((line) => `${insertValue}${line}`)
			.join('\n');
	
	const multiLineComment = (statement) => {
		return `/*\n${insertBeforeEachLine(statement, '  ')}\n*/`;
	}

	return useMultiLineComment ? multiLineComment(statement) : insertBeforeEachLine(statement);
}

const retrieveIsItemActivated = (itemConfig) => {
	const value = itemConfig?.[0]?.["isActivated"];

	if (value === undefined) {
		return true;
	}

	return value;
};

const getUserDefinedFunctions = (udfItems) => {
	return udfItems.map(item => item.functionBody).filter(item => item).join('\n');
};

const getUserDefinedAggregations = (udaItems) => {
	return udaItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};

const getApplyDropStatement = data => {
	const { applyDropStatements, additionalOptions = [] } = data.options || {};
	const applyDropStatementsFromUi = (additionalOptions.find(option => option.id === 'applyDropStatements') || {}).value;
	return applyDropStatements || applyDropStatementsFromUi;
}

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
	eachField,
	canTypeHaveSubtype,
	getEntityLevelConfig,
	commentDeactivatedStatement,
	retrieveIsItemActivated,
	getUserDefinedAggregations,
	getUserDefinedFunctions,
	getIndexProfiles,
	getApplyDropStatement
};
