'use strict'

const { commentDeactivatedStatement } = require('./commentsHelper');
const { tab, getTableNameStatement } = require('./generalHelper');
const { getNamesByIds } = require('./schemaHelper');

const getIndexes = (indexes, dataSources, tableName, keyspaceName, isTableActivated, isKeyspaceActivated) => {
	const indexStatements = unwindIndexes(indexes).map(index => {
		const isIndexKeyActivated = isIndexColumnKeyActivated(index.SecIndxKey, dataSources);
		const indexStatement = getIndex(
			index.name,
			keyspaceName,
			tableName,
			getIndexColumnStatement(index.SecIndxKey, dataSources)
		);
		return commentDeactivatedStatement(
			indexStatement,
			isIndexKeyActivated,
			isTableActivated && isKeyspaceActivated
		);
	}).join('\n\n');

	return commentDeactivatedStatement(indexStatements, isTableActivated, isKeyspaceActivated);
};

const getIndex = (name, keyspaceName, tableName, indexColumnStatement) => (
	`CREATE INDEX IF NOT EXISTS "${name}"\n${tab(`ON ${getTableNameStatement(keyspaceName, tableName)} (${indexColumnStatement});`)}`	
);

const getIndexColumnStatement = (key, dataSources) => {
	const { name } = getNamesByIds([key.keyId], dataSources)[key.keyId];

	return `"${name}"`;
};

const isIndexColumnKeyActivated = (key, dataSources) => {
	const { isActivated } = getNamesByIds([key.keyId], dataSources)[key.keyId];

	return isActivated !== false;
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
