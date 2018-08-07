'use strict'

const { 
	tab,
	retrieveContainerName,
	retrieveEntityName,
	retrivePropertyFromConfig,
	getTableNameStatement
} = require('./generalHelper');
const { getColumnDefinition } = require('./columnHelper');
const { getNamesByIds } = require('./schemaHelper');

module.exports = {
	getTableStatement({
		tableData,
		tableMetaData,
		dataSources,
		keyspaceMetaData,
		udtTypeMap
	}) {
		const keyspaceName = retrieveContainerName(keyspaceMetaData);
		const tableName = retrieveEntityName(tableMetaData);
		const partitionKeys = retrivePropertyFromConfig(tableMetaData, 0, "compositePartitionKey", []);
		const clusteringKeys = retrivePropertyFromConfig(tableMetaData, 0, "compositeClusteringKey", []);
		const tableId = retrivePropertyFromConfig(tableMetaData, 0, "schemaId", "");
		const tableComment = retrivePropertyFromConfig(tableMetaData, 0, "comments", "");
		const tableOptions = retrivePropertyFromConfig(tableMetaData, 0, "tableOptions", "");

		const partitionKeysHash = getNamesByIds(
			partitionKeys.map(key => key.keyId),
			dataSources
		);
		const clusteringKeysHash = getNamesByIds(
			clusteringKeys.map(key => key.keyId),
			dataSources
		);

		return getCreateTableStatement(
			keyspaceName,
			tableName,
			getColumnDefinition(tableData.properties || {}, udtTypeMap),
			getPrimaryKeyList(partitionKeysHash, clusteringKeysHash),
			getOptions(clusteringKeys, clusteringKeysHash, tableId, tableComment, tableOptions)
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

	return `CREATE TABLE IF NOT EXISTS ${getTableNameStatement(keyspaceName, tableName)} (\n` + 
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

const getOptions = (clusteringKeys, clusteringKeysHash, id, comment, tableOptions) => {
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
	const parseTableOptions = (tableOptions) => (tableOptions || "")
		.replace(/;$/, "")
		.split('AND')
		.map(option => String(option).trim())
		.filter(option => option);

	let options = [];
	const clusteringOrder = getClusteringOrder(clusteringKeys, clusteringKeysHash);
	const hasId = id && !/id\=/gi.test(tableOptions);
	const hasComment = comment && !/comments\=/gi.test(tableOptions);

	if (clusteringOrder) {
		options.push(clusteringOrder);
	}

	if (hasId) {
		options.push(`ID='${id}'`);
	}

	if (hasComment) {
		options.push(`comment='${comment}'`);
	}

	options = options.concat(parseTableOptions(tableOptions));

	if (options.length) {
		return `\nWITH ${ options.join("\n" + tab("AND ")) }`;
	} else {
		return "";
	}
};
