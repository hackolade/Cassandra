'use strict'

const { 
	tab,
	retrieveContainerName,
	retrieveEntityName,
	retrivePropertyFromConfig,
	getTableNameStatement,
	commentDeactivatedStatement
} = require('./generalHelper');
const { getColumnDefinition } = require('./columnHelper');
const { getNamesByIds } = require('./schemaHelper');
const { getEntityLevelConfig } = require('./generalHelper');
const { parseToString, addId, addClustering } = require('./tableOptionService/parseToString');
const { inlineComment } = require('./commentsHelper');
const { dependencies } = require('./appDependencies');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const getCreateTableStatement = (keyspaceName, tableName, columnDefinition, primaryKeys, options, ifNotExist) => {
	const items = [];

	if (columnDefinition) {
		items.push(columnDefinition);
	}

	if (primaryKeys) {
		items.push(`PRIMARY KEY (${primaryKeys})`);
	}

	return `CREATE TABLE ${ifNotExist? `IF NOT EXISTS `:``}${getTableNameStatement(keyspaceName, tableName)} (\n` + 
		items.map(item => tab(item)).join(',\n') + '\n' +
	`)${options};`;
};

const getPrimaryKeyList = (partitionKeysHash, clusteringKeysHash, isParentActivated) => {
	setDependencies(dependencies);

	const partitionKeys = getPartitionKeys(partitionKeysHash, isParentActivated);
	const clusteringKeys = getClusteringKeys(clusteringKeysHash, isParentActivated);
	const keys = [];

	if (partitionKeys) {
		keys.push(partitionKeys);
	}

	if (clusteringKeys) {
		keys.push(clusteringKeys);
	}

	return keys.join(clusteringKeys.startsWith('/*') || partitionKeys.endsWith('*/') ? ' ' : ', ');
};

const getPartitionKeys = (partitionKeysHash, isParentActivated) => {
	const keysIds = Object.keys(partitionKeysHash);

	if (keysIds.length) {
		const keysString = commentDeactivatedKeys(keysIds, partitionKeysHash, isParentActivated);

		return (keysIds.length > 1) ? `(${keysString})` : keysString;
	} else {
		return "";
	}
};

const getClusteringKeys = (clusteringKeysHash, isParentActivated) => {
	const keysIds = Object.keys(clusteringKeysHash);

	if (keysIds.length) {
		return commentDeactivatedKeys(keysIds, clusteringKeysHash, isParentActivated);
	} else {
		return "";
	}
};

const seedOptionsWithValues = (options, valueObject) => options.map(option => {
	const value = valueObject[option['propertyKeyword']];
	if (value === undefined) {
		return option;
	}

	return Object.assign({}, option, { value });
});

const getOptionsFromTab = config => {
	const optionsBlock = config.structure.find(prop => prop.propertyName === 'Options');
	return optionsBlock.structure;
}

const mergeValuesWithConfigOptions = values => {
	const [detailsTab] = getEntityLevelConfig();
	const configOptions = getOptionsFromTab(detailsTab);
	return seedOptionsWithValues(configOptions, values);
}

const getOptions = (clusteringKeys, clusteringKeysHash, tableId, tableOptions, comment, isParentActivated) => {
	const optionsWithValues = mergeValuesWithConfigOptions(tableOptions);
	const optionsString = addId(
		tableId,
		addClustering(clusteringKeys, clusteringKeysHash, parseToString(optionsWithValues, comment), isParentActivated)
	);

	return optionsString ? optionsString.replace(/\n$/, '') : '';
};

const commentDeactivatedKeys = (keysIds, keysHash, isParentActivated) => {
	const joinKeys = keys => keys.map(id => keysHash[id].name).join('", "');
	
	if (!isParentActivated) {
		return `"${joinKeys(keysIds)}"`;
	}

	const [activatedKeys, deactivatedKeys] = _.partition(keysIds, id => keysHash[id].isActivated !== false);
	if (deactivatedKeys.length === 0) {
		return `"${joinKeys(activatedKeys)}"`;
	} else if (activatedKeys.length === 0) {
		return `${inlineComment(`"${joinKeys(deactivatedKeys)}"`)}`;
	}
	return `"${joinKeys(activatedKeys)}" ${inlineComment(`, "${joinKeys(deactivatedKeys)}"`)}`;
}

module.exports = {
	getOptions,
	getPrimaryKeyList,
	getTableStatement({
		tableData,
		tableMetaData,
		dataSources,
		keyspaceMetaData,
		udtTypeMap,
		isKeyspaceActivated
	}) {
		setDependencies(dependencies);

		const keyspaceName = retrieveContainerName(keyspaceMetaData);
		const tableName = retrieveEntityName(tableMetaData);
		const partitionKeys = retrivePropertyFromConfig(tableMetaData, 0, "compositePartitionKey", []);
		const clusteringKeys = retrivePropertyFromConfig(tableMetaData, 0, "compositeClusteringKey", []);
		const tableId = retrivePropertyFromConfig(tableMetaData, 0, "schemaId", "");
		const tableComment = retrivePropertyFromConfig(tableMetaData, 0, "comments", "");
		const tableOptions = retrivePropertyFromConfig(tableMetaData, 0, "tableOptions", "");
		const isTableActivated = retrivePropertyFromConfig(tableMetaData, 0, "isActivated", false);
		const isTableChildrenActivated = isKeyspaceActivated && isTableActivated;

		const partitionKeysHash = getNamesByIds(
			partitionKeys.map(key => key.keyId),
			dataSources
		);
		const clusteringKeysHash = getNamesByIds(
			clusteringKeys.map(key => key.keyId),
			dataSources
		);
		
		const createTableStatement = getCreateTableStatement(
			keyspaceName,
			tableName,
			getColumnDefinition(
				tableData.properties || {},
				udtTypeMap,
				isTableChildrenActivated
			),
			getPrimaryKeyList(
				partitionKeysHash,
				clusteringKeysHash,
				isTableChildrenActivated
			),
			getOptions(
				clusteringKeys,
				clusteringKeysHash,
				tableId,
				tableOptions,
				tableComment,
				isTableChildrenActivated
			),
			retrivePropertyFromConfig(tableMetaData, 0, "tableIfNotExist", undefined)
		);

		return commentDeactivatedStatement(
			createTableStatement,
			isTableActivated,
			isKeyspaceActivated
		);
	},
	mergeValuesWithConfigOptions,
};
