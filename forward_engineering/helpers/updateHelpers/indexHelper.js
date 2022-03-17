const { dependencies } = require('../appDependencies');
const { getIndexProfiles, getTableNameStatement } = require('../generalHelper');
const { getIndexes } = require('../indexHelper');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

let nameCollectionsExistsScript = {
	dropIndexes: [],
	dropSearchIndexes: [],
	createIndexes: [],
	createSearchIndexes: [],
};

const scriptData = {
	added: false,
	deleted: false,
	modified: false,
	index: 'index',
};

const checkExistsScript = (keyspaceName, name, type) => {
	const statement = getTableNameStatement(keyspaceName, name);
	const filteredScriptName = nameCollectionsExistsScript[type].filter(name => name === statement);
	return !!filteredScriptName.length;
}

const setNameCollectionsScript = (keyspaceName, name, type) => {
	const statement = getTableNameStatement(keyspaceName, name);
	nameCollectionsExistsScript = { ...nameCollectionsExistsScript, [type]: [...nameCollectionsExistsScript[type], statement] };
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

const getModifyDataSearchIndex = (item, type) => {
	const itemData = [...indexSearchProperties, 'searchIndexIfNotExist']
		.map(property => ([property, (item?.compMod || {})[property]?.[type]]))
		.filter(([__, value]) => !!value);
	item = { ...item, ...Object.fromEntries(itemData) };
	return getDataSearchIndex(item);
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
		addDataSearchIndex = getModifyDataSearchIndex(role, 'new');
	} else if (searchIndexCompare.drop && !searchIndexCompare.add && !searchIndexCompare.modify) {
		dropDataSearchIndex = dataSearchIndex;
	} else if (searchIndexCompare.modify) {
		addDataSearchIndex = getModifyDataSearchIndex(role, 'new');;
		dropDataSearchIndex = dataSearchIndex;
	} 
	return {
		addDataSearchIndex,
		dropDataSearchIndex
	};
}

const getDropSearchIndexScript = (keyspaceName, tableName, isDrop) => {
	const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
	const isExistScript = checkExistsScript(keyspaceName, tableName, 'dropSearchIndexes');
	let script = '';
	if (!!isDrop && !isExistScript) {
		script = `DROP SEARCH INDEX ON ${tableNameStatement};`;
		setNameCollectionsScript(keyspaceName, tableName, 'dropSearchIndexes');
	}
	return [{ ...scriptData, deleted: true, script}];
}

const getDropIndexScript = (keyspaceName, tableName, secIndxs = []) => secIndxs.map(index => {
	const tableNameStatement = getTableNameStatement(keyspaceName, index.name);
	const tableIndexName = `${tableName}.${index.name}`;
	const isExistScript = checkExistsScript(keyspaceName, tableIndexName, 'dropIndexes');
	let script = '';
	if (index.name && !isExistScript) {
		script = `DROP INDEX IF EXISTS ${tableNameStatement}`;
		setNameCollectionsScript(keyspaceName, tableIndexName, 'dropIndexes');
	}
	return {
		...scriptData, deleted: true, script,
	};
})

const getAddSearchIndexScript = data => {
	const { keyspaceName, tableName, searchIndex, dataSources, isActivated, dbVersion } = data;
	const isExistScrip = checkExistsScript(keyspaceName, tableName, 'createSearchIndexes');
	const dataIndexScript = { ...scriptData, added: true, script: '' };
	if (isExistScrip) {
		return [dataIndexScript];
	}
	setNameCollectionsScript(keyspaceName, tableName, 'createSearchIndexes');
	const script = getIndexes(
		{ searchIndex },
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		true,
		dbVersion
	);
	return [{ ...dataIndexScript, script }];
}

const getAddIndexScript = data => {
	const { keyspaceName, indexes = [], dataSources, tableName, isActivated, dbVersion } = data;
	const filteredIndexes = indexes.filter(index => {
		const tableIndexName = `${tableName}.${index.name}`;
		const isExistScrip = checkExistsScript(keyspaceName, tableIndexName, 'createIndexes');
		if (isExistScrip) {
			return false;
		}
		setNameCollectionsScript(keyspaceName, tableIndexName, 'createIndexes');
		return true;
	})
	const script = getIndexes(
		{ indexes: filteredIndexes },
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		true,
		dbVersion
	);
	return [{ ...scriptData, added: true, script }];
}

const getCreatedIndex = data => {
	const { item, dataSources, tableName, keyspaceName, isActivated, dbVersion } = data;
	const isSearchIndex = !!item.role?.searchIndex;
	const dataForSearchIndexScript = getDataSearchIndex(item.role || {});

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
	const dropIndexScript = getDropIndexScript(keyspaceName, tableName, item.role?.SecIndxs);
	const dropSearchIndexScript = getDropSearchIndexScript(
		keyspaceName, 
		tableName, 
		item.role?.searchIndex, 
	);
	return [...dropIndexScript, ...dropSearchIndexScript];
}

const getUpdateIndex = data => {
	const { item, keyspaceName, tableName, dbVersion, isActivated, dataSources } = data;

	const dataForSearchIndexScript = getDataForSearchIndexScript(item.role);
	const dataForIndexScript = getDataForIndexScript(item.role?.compMod || {});

	const dropIndexSearchScript = getDropSearchIndexScript(
		keyspaceName, 
		tableName,
		!!dataForSearchIndexScript.dropDataSearchIndex,
	);

	const dropIndexScript = getDropIndexScript(
		keyspaceName,
		tableName,
		dataForIndexScript.dropSecIndxs,
	);

	let addSearchIndexScript = getAddSearchIndexScript({
		searchIndex: dataForSearchIndexScript.addDataSearchIndex,
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		dbVersion
	});

	const addIndexScript = getAddIndexScript({
		indexes: dataForIndexScript.addSecIndxs,
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		dbVersion
	});

	return [...dropIndexScript, ...dropIndexSearchScript, ...addSearchIndexScript, ...addIndexScript];
}

const getIndexTable = (item, data) => {
	setDependencies(dependencies);

	const properties = { ...item.properties || {}, ...item.role.properties || {} };
	const itemData = { properties, ..._.omit(item.role || {}, ['properties']) };

	const tableName = item.role?.code || item.role?.name;
	const dataSources = [itemData, data.modelDefinitions];
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
	
	return getUpdateIndex({ item, keyspaceName, tableName, dataSources, isActivated, dbVersion });
}

module.exports = {
	getIndexTable
}