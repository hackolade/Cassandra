const { dependencies } = require('../appDependencies');
const { getIndexProfiles, getTableNameStatement } = require('../generalHelper');
const { getIndexes } = require('../indexHelper');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const scriptData = {
	added: false,
	deleted: false,
	modified: false,
	index: 'index',
};

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
		const equalElements = _.intersectionWith(newIndexs, oldIndexs, _.isEqual);
		dropSecIndxs = _.xorWith(oldIndexs, equalElements, _.isEqual);
		addSecIndxs = _.xorWith(newIndexs, equalElements, _.isEqual);
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

const getDropSearchIndexScript = (keyspaceName, tableName, isDrop) => {
	let script = '';
	if (!!isDrop) {
		const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
		script = `DROP SEARCH INDEX ON ${tableNameStatement};`;
	}
	return [{ ...scriptData, deleted: true, script}];
}

const getDropIndexScript = (keyspaceName, secIndxs = []) => secIndxs.map(index => {
	const indexNameStatement = getTableNameStatement(keyspaceName, index.name);
	const script = index.name ? `DROP INDEX IF EXISTS ${indexNameStatement}` : '';
	return {
		...scriptData, deleted: true, script,
	};
})

const getCreatedIndex = data => {
	const { item, dataSources, tableName, keyspaceName, isActivated, dbVersion } = data;
	const isSearchIndex = !!item.role?.searchIndex;
	const dataForSearchIndexScript = getDataSearchIndex(item.role || {});

	const properties = { ...item.properties || {}, ...item.role.properties || {} };
	dataSources[0] = { ...(dataSources[0] || {}), properties };

	const script = getIndexes({
			searchIndex: isSearchIndex && dataForSearchIndexScript,
			indexes: item.role?.SecIndxs || [],
		},
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		true,
		dbVersion
	);
	return [{
		...scriptData,
		added: true,
		script,
	}]
}

const getDeletedIndex = data => {
	const { item, keyspaceName, tableName } = data;
	const dropIndexScript = getDropIndexScript(keyspaceName, item.role?.SecIndxs || []);
	const dropSearchIndexScript = getDropSearchIndexScript(keyspaceName, tableName, item.role?.searchIndex);
	return [...dropIndexScript, ...dropSearchIndexScript];
}

const getIndexTable = (item, data) => {
	setDependencies(dependencies);

	const tableName = item.role?.code || item.role?.name;
	const dataSources = [item.role, data.modelDefinitions];
	const keyspaceName = item.role.compMod?.keyspaceName;
	const dbVersion = data.modelData[0].dbVersion;
	const isActivated = item.role?.isActivated;

	const { compMod = {} } = item.role || {};

	if (compMod.created) {
		return getCreatedIndex({ item, dataSources, tableName, keyspaceName, isActivated, dbVersion });
	}

	if (compMod.deleted) {
		return getDeletedIndex({ item, keyspaceName, tableName });
	}
	
	const dataForSearchIndexScript = getDataForSearchIndexScript(item.role);
	const dataForIndexScript = getDataForIndexScript(item.role?.compMod || {});

	const dropIndexSearchScript = getDropSearchIndexScript(
		keyspaceName, 
		tableName,
		dataForSearchIndexScript.dropDataSearchIndex,
	);
	const dropIndexScript = getDropIndexScript(
		keyspaceName,
		dataForIndexScript.dropSecIndxs,
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
	return [
		...dropIndexScript, 
		...dropIndexSearchScript, 
		{ ...scriptData, added: true, script: addSearchIndexScript }, 
		{ ...scriptData, added: true, script: addIndexScript }
	];
}

module.exports = {
	getIndexTable
}