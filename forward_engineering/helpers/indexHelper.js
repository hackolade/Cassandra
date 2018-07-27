'use strict'

const { tab, getTableNameStatement } = require('./generalHelper');
const { getNamesByIds } = require('./schemaHelper');

const getIndexes = (indexes, dataSources, tableName, keyspaceName) => {
	return unwindIndexes(indexes).map(index => {
		return getIndex(
			index.name,
			keyspaceName,
			tableName,
			getIndexColumnStatement(index.SecIndxKey, dataSources)
		);
	}).join('\n\n');
};

const getIndex = (name, keyspaceName, tableName, indexColumnStatement) => (
	`CREATE INDEX IF NOT EXISTS "${name}"\n${tab(`ON ${getTableNameStatement(keyspaceName, tableName)} (${indexColumnStatement});`)}`	
);

const getIndexColumnStatement = (key, dataSources) => {
	const name = getNamesByIds([key.keyId], dataSources)[key.keyId];

	return `"${name}"`;
};

const unwindIndexes = (indexes) => {
	return indexes.reduce((result, index) => {
		return [...result, ...(index.SecIndxKey || []).map((key, i) => {
			return Object.assign({}, index, {
				name: i > 0 ? index.name + '_' + i : index.name,
				SecIndxKey: key
			});
		})];
	}, []);
};

module.exports = {
	getIndexes
};
