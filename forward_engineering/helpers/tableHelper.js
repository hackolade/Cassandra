'use strict'

const { tab } = require('./formatHelper');
const { getColumnDefinition } = require('./columnHelper');
const { getNamesByIds } = require('./schemaHelper');

module.exports = {
	getTableStatement({
		tableData,
		tableMetaData,
		modelDefinitions,
		internalDefinition,
		externalDefinitions,
		keyspaceMetaData
	}) {
		const tableFirstTab = (tableMetaData[0] || {});
		const keyspaceName = (keyspaceMetaData[0] || {}).name || "";
		const tableName = tableFirstTab.collectionName || "";
		const partitionKeys = (tableFirstTab.compositePartitionKey || []);
		const clusteringKeys = (tableFirstTab.compositeClusteringKey || []);

		const partitionKeysHash = getNamesByIds(
			partitionKeys.map(key => key.keyId),
			[ tableData, modelDefinitions, internalDefinition, externalDefinitions ]
		);
		const clusteringKeysHash = getNamesByIds(
			clusteringKeys.map(key => key.keyId),
			[ tableData, modelDefinitions, internalDefinition, externalDefinitions ]
		);

		return getCreateTableStatement(
			keyspaceName,
			tableName,
			getColumnDefinition(tableData.properties),
			getPrimaryKeyList(partitionKeysHash, clusteringKeysHash),
			getOptions(clusteringKeys, clusteringKeysHash, tableFirstTab.schemaId, tableFirstTab.comments)
		);
	}
};

const getCreateTableStatement = (keyspaceName, tableName, columnDefinition, primaryKeys, options) => {
	const items = [];

	if (columnDefinition) {
		items.push(columnDefinition);
	}

	if (primaryKeys) {
		items.push(`PRIMARY KEY (${primaryKeys})`);
	}

	return `CREATE TABLE IF NOT EXISTS "${keyspaceName}"."${tableName}" (\n` + 
		items.map(item => tab(item)).join(',\n') + '\n' +
	`)${options};`;
};

const getPrimaryKeyList = (partitionKeysHash, clusteringKeysHash) => {
	const partitionKeys = getPartitionKeys(partitionKeysHash);
	const clusteringKeys = getClusteringKeys(clusteringKeysHash);
	const keys = [];

	if (partitionKeys) {
		keys.push(partitionKeys);
	}

	if (clusteringKeys) {
		keys.push(clusteringKeys);
	}

	return keys.join(', ');
};

const getPartitionKeys = (partitionKeysHash) => {
	const keysIds = Object.keys(partitionKeysHash);

	if (keysIds.length) {
		const keysString = `"${keysIds.map(id => partitionKeysHash[id]).join('", "')}"`;

		return (keysIds.length > 1) ? `(${keysString})` : keysString;
	} else {
		return "";
	}
};

const getClusteringKeys = (clusteringKeysHash) => {
	const keysIds = Object.keys(clusteringKeysHash);

	if (keysIds.length) {
		return `"${keysIds.map(id => clusteringKeysHash[id]).join('", "')}"`;
	} else {
		return "";
	}
};

const getOptions = (clusteringKeys, clusteringKeysHash, id, comment) => {
	const getClusteringOrder = (clusteringKeys, clusteringKeysHash) => {
		const order = (order) => (order === 'ascending') ? 'ASC' : 'DESC'; 
		const orderString = clusteringKeys.map(key => {
			const name = clusteringKeysHash[key.keyId];

			if (name) {
				return `"${name}" ${order(key.type)}`;
			}
		}).filter(key => key).join(', ');

		if (orderString) {
			return `CLUSTERING ORDER BY (${orderString})`;
		} else {
			return false;
		}
	};

	const options = [];
	const clusteringOrder = getClusteringOrder(clusteringKeys, clusteringKeysHash);

	if (clusteringOrder) {
		options.push(clusteringOrder);
	}

	if (id) {
		options.push(`ID='${id}'`);
	}

	if (comment) {
		options.push(`comment='${comment}'`);
	}

	if (options.length) {
		return `\nWITH ${ options.join("\n" + tab("AND ")) }`;
	} else {
		return "";
	}
};
