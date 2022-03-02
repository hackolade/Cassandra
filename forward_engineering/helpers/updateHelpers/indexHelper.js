const { dependencies } = require('../appDependencies');
const { getIndexProfiles, getTableNameStatement } = require('../generalHelper');
const { getIndexes } = require('../indexHelper');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const dropIndexStatement = 'DROP INDEX IF EXISTS';
const dropSearchIndexStatement = 'DROP SEARCH INDEX ON';
const indexSearchProperties = ['searchIndexColumns', 'searchIndexConfig', 'searchIndexOptions', 'searchIndex', 'searchIndexProfiles'];

const getDataSearchIndex = indexTab => {
	return {
		indexType: 'search',
		columns: indexTab.searchIndexColumns,
		config: indexTab.searchIndexConfig,
		profiles: getIndexProfiles(indexTab.searchIndexProfiles),
		options: indexTab.searchIndexOptions,
		ifNotExist: indexTab.searchIndexIfNotExist
	};
}

const compareProperty = (newProperty, oldProperty, data) => {
	if (_.isEmpty(newProperty) && _.isEmpty(oldProperty)) {
		return data;
	}
	if (_.isEmpty(newProperty)) {
		return { ...data, drop: true };
	} else if (_.isEmpty(oldProperty)) {
		return { ...data, add: true };
	} else if (!_.isEqual(newProperty, oldProperty)) {
		return { ...data, modify: true};
	}
	return data;
}

const getDataForIndexScript = compMod => {
	const { new: newIndexs = [], old: oldIndexs = [] } = compMod.SecIndxs || {};
	let addSecIndxs;
	let dropSecIndxs;
	
	if (!newIndexs.length && !oldIndexs.length) {
		return {};
	}

	if (!newIndexs.length) {
		dropSecIndxs = oldIndexs;
	} else if (!oldIndexs.length) {
		addSecIndxs = newIndexs;
	} else if (!_.isEqual(newIndexs, oldIndexs)) {
		dropSecIndxs = oldIndexs;
		addSecIndxs = newIndexs;
	}
	return {
		addSecIndxs,
		dropSecIndxs,
	}
}

const getDataForSearchIndexScript = role => {
	const { compMod } = role;
	const dataSearchIndex = getDataSearchIndex(role);
	const searchIndexCompare = indexSearchProperties
		.reduce((data, property) => compareProperty(compMod[property]?.new, compMod[property]?.old, data), {});
	
	let dropDataSearchIndex;
	let addDataSearchIndex;

	if (searchIndexCompare.add && !searchIndexCompare.drop && !searchIndexCompare.modify) {
		addDataSearchIndex = dataSearchIndex
	} else if (searchIndexCompare.drop && !searchIndexCompare.add && !searchIndexCompare.modify) {
		dropDataSearchIndex = dataSearchIndex;
	} else if (searchIndexCompare.modify) {
		addDataSearchIndex = dataSearchIndex;
		dropDataSearchIndex = dataSearchIndex;
	} 
	return {
		addDataSearchIndex,
		dropDataSearchIndex
	};
}

const getDropIndexScript = (keySpaceName, tableName, isDrop, statement) => {
	if (!isDrop) {
		return '';
	}
	const tableNameStatement = getTableNameStatement(keySpaceName, tableName);
	return `${statement} ${tableNameStatement};`;
}

const getIndexTable = (item, data) => {
	setDependencies(dependencies);
	const dataForSearchIndexScript = getDataForSearchIndexScript(item.role);
	const dataForIndexScript = getDataForIndexScript(item.role?.compMod || {});

	const tableName = item.role?.code || item.role?.name;
	const dataSources = [item.role, data.modelDefinitions];
	const keyspaceName = item.role.compMod?.keyspaceName;
	const dbVersion = data.modelData[0].dbVersion;
	const isActivated = item.role?.isActivated;

	const dropIndexSearchScript = getDropIndexScript(
		keyspaceName, 
		tableName, 
		dataForSearchIndexScript.dropDataSearchIndex,
		dropSearchIndexStatement
	);
	const dropIndexScript = getDropIndexScript(
		keyspaceName, 
		tableName, 
		dataForIndexScript.dropSecIndxs,
		dropIndexStatement
	);
	
	const addSearchIndexScript = getIndexes(
		{ searchIndex: dataForSearchIndexScript.addDataSearchIndex },
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		true,
		dbVersion
	);
	const addIndexScript = getIndexes(
		{ indexes: dataForIndexScript.addSecIndxs },
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		true,
		dbVersion
	)
	return [dropIndexSearchScript, addSearchIndexScript, dropIndexScript, addIndexScript].filter(Boolean).join('\n\n');
}

module.exports = {
	getIndexTable
}