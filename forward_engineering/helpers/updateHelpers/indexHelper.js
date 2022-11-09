const { dependencies } = require('../appDependencies');
const { getIndexProfiles, getTableNameStatement, tab } = require('../generalHelper');
const { getIndexes } = require('../indexHelper');
const { getNamesByIds } = require('../schemaHelper');
const { 
	getDiffOptions, 
	getDiffConfig, 
	getDiffIndexProfiles,
	isEqualIndex,
} = require('./indexService');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

let nameCollectionsExistsScript = {
	dropIndexes: [],
	dropSearchIndexes: [],
	createIndexes: [],
	createSearchIndexes: [],
};

const scriptData = {
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

const indexSearchProperties = ['searchIndexProfiles', 'searchIndexOptions'];

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
	const itemData = [...indexSearchProperties, 'searchIndexIfNotExist', 'searchIndexColumns', 'searchIndexConfig']
		.map(property => ([property, (item?.compMod || {})[property]?.[type]]))
		.filter(([__, value]) => !!value);
	item = { ...item, ...Object.fromEntries(itemData) };
	return getDataSearchIndex(item);
}

const getDataForScript = (newData, oldData, isEqual = _.isEqual) => {
	let addData;
	let dropData;
	
	if (!newData.length && !oldData.length) {
		return {};
	}

	if (!newData.length) {
		dropData = oldData;
	} else if (!oldData.length) {
		addData = newData;
	} else if (!_.isEqual(newData, oldData)) {
		const equalElements = _.intersectionWith(newData, oldData, isEqual);
		dropData = _.xorWith(oldData, equalElements, isEqual);
		addData = _.xorWith(newData, equalElements, isEqual);
	}
	return {
		addData,
		dropData,
	}
}

const getDataForSearchIndexScript = role => {
	const { compMod } = role;
	const dataSearchIndex = getDataSearchIndex(role);
	const searchIndex = _.get(role, 'compMod.searchIndex', {});
	const searchPropertiesCompare = _.merge(
		getDiffOptions(compMod?.searchIndexOptions?.old, compMod?.searchIndexOptions?.new),
		getDiffIndexProfiles(compMod?.searchIndexProfiles?.old, compMod?.searchIndexProfiles?.new),
	);

	let dropData;
	let addData;

	if (!searchIndex.old && !searchIndex.new) {
		return {};
	}

	if (!searchIndex.old) {
		addData = getModifyDataSearchIndex(role, 'new');
	} else if (!searchIndex.new) {
		dropData = dataSearchIndex;
	} else if (!_.isEmpty(searchPropertiesCompare.modifyData) || !_.isEmpty(searchPropertiesCompare.dropData)) {
		addData = getModifyDataSearchIndex(role, 'new');
		dropData = dataSearchIndex;
	} 
	return {
		addData,
		dropData
	};
}

const getNameByKeyId = (dataSources, idToNameHashTable, keyId) => {
	const nameFromHashTable = idToNameHashTable[keyId];
	if (nameFromHashTable) {
		return nameFromHashTable
	}

	const { name = '' } = getNamesByIds([keyId], dataSources)[keyId] || {};

	return name;
}

const getDataColumnIndex = (dataSources, idToNameHashTable, column = {}, key = 'key') => {
	setDependencies(dependencies);
	const keyId = _.get(column, `${key}[0].keyId`, '');
	const name = getNameByKeyId(dataSources, idToNameHashTable, keyId);

	return {
		..._.omit(column, key),
		name,
	};
}

const getDataForSearchIndexColumns = (item, dataSources) => {
	const oldIdToNameHashTable = _.get(item, 'role.compMod.oldIdToNameHashTable', {});
	const newIdToNameHashTable = _.get(item, 'role.compMod.newIdToNameHashTable', {});
	const columns = _.get(item, 'role.compMod.searchIndexColumns', {});
	const filterColumn = column => column.name;
	const newColumns = (columns.new || [])
		.map(column => getDataColumnIndex(dataSources, newIdToNameHashTable, column)).filter(filterColumn);
	const oldColumns = (columns.old || [])
		.map(column => getDataColumnIndex(dataSources, oldIdToNameHashTable, column)).filter(filterColumn);
	const isEqual = (oldValue, newValue) => oldValue?.name === newValue?.name;
	return getDataForScript(newColumns, oldColumns, isEqual);
}

const getSearchConfigScript = (keyspaceName, tableName, config) => {
	const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
	const alterScript = `ALTER SEARCH INDEX CONFIG\n` +
		tab(`ON ${tableNameStatement}\n`);
	
	const dropScript = Object.entries(config.dropData).map(([key]) => {
		const script = alterScript +
			tab(`DROP ${key};`);
		return {
			...scriptData,
			deleted: true,
			script,
		};
	})
	const modifyScript = Object.entries(config.modifyData)
		.filter(([__, value]) => typeof value !== 'string' || Boolean(value))
		.map(([key, value]) => {
			const preparedValue = _.isString(value) ? `'${value}'` : value;
			const script = alterScript +
				tab(`SET ${key} = ${preparedValue};`);
			return {
				...scriptData,
				modified: true,
				script,
			};
		});

	return [...modifyScript, ...dropScript];
}

const getSearchColumnsScript = (keyspaceName, tableName, columns) => {
	const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
	const alterScript = `ALTER SEARCH INDEX SCHEMA\n` +
		tab(`ON ${tableNameStatement}\n`);
	
	const getScript = (alterScript, statement, scriptType, column) => {
		const script = alterScript +
			tab(`${statement} "${column.name}";`);
		return {
			...scriptData,
			...scriptType,
			script
		};
	};

	const dropSearchScripts = (columns.dropData || []).map(getScript.bind(null, alterScript, `DROP field`, { deleted: true }));
	const addSearchScripts = (columns.addData || []).map(getScript.bind(null, alterScript, `ADD field`, { modified: true }));
	if (dropSearchScripts.length) {
		dropSearchScripts.push(getRenewalScript(keyspaceName, tableName, 'RELOAD', 'deleted'));
	}

	return { dropSearchScripts, addSearchScripts };
}

const getRenewalScript = (keyspaceName, tableName, startStatement, key = 'added') => {
	const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
	const script = `${startStatement} SEARCH INDEX\n` +
		tab(`ON ${tableNameStatement};`);
	
	return {
		renewal: true,
		[key]: true,
		script
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
		script = `DROP INDEX IF EXISTS ${tableNameStatement};`;
		setNameCollectionsScript(keyspaceName, tableIndexName, 'dropIndexes');
	}
	return {
		...scriptData, deleted: true, script,
	};
})

const getAddSearchIndexScript = data => {
	const { keyspaceName, tableName, searchIndex, dataSources, isActivated, dbVersion } = data;
	const isExistScript = checkExistsScript(keyspaceName, tableName, 'createSearchIndexes');
	const dataIndexScript = { ...scriptData, added: true, script: '' };
	if (isExistScript) {
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

const getUpdateSearchIndexScript = data => {
	const { item, keyspaceName, tableName, dbVersion, isActivated, dataSources } = data;

	const dataForScript = getDataForSearchIndexScript(item.role);
	
	if (dataForScript.dropData || dataForScript.addData) {
		const dropIndexSearchScript = getDropSearchIndexScript(
			keyspaceName, 
			tableName,
			!!dataForScript.dropData,
		);
	
		const addSearchIndexScript = getAddSearchIndexScript({
			searchIndex: dataForScript.addData,
			dataSources: [...dataSources, { properties: item.properties || [] }],
			tableName,
			keyspaceName,
			isActivated,
			dbVersion
		});
		
		return [...dropIndexSearchScript, ...addSearchIndexScript];
	}
	
	const config = _.get(item, 'role.compMod.searchIndexConfig', {})
	
	const dataForColumnsScript = getDataForSearchIndexColumns(item, dataSources);
	const dataForConfigScript = getDiffConfig(config.old, config.new)

	const configScript = getSearchConfigScript(keyspaceName, tableName, dataForConfigScript);
	const { dropSearchScripts, addSearchScripts } = getSearchColumnsScript(keyspaceName, tableName, dataForColumnsScript);

	const renewalData = {
		RELOAD: configScript.length || addSearchScripts.length,
		REBUILD: dropSearchScripts.length || addSearchScripts.length,
	};
	const renewalScripts = Object.entries(renewalData).reduce((scripts, [key, value]) => {
		if (!value) {
			return scripts;
		}
		return [...scripts, getRenewalScript(keyspaceName, tableName, key)];
	}, []);

	return [...configScript, ...dropSearchScripts, ...addSearchScripts, ...renewalScripts];
}

const prepareIndexes = (idToNameHashTable, dataSources, indexes = []) => {
	return indexes.map(index => {
		const secIndexesKey = _.get(index, 'SecIndxKey', []).map(key => ({
				...key,
				name: getNameByKeyId(dataSources, idToNameHashTable, _.get(key, 'keyId')),
			})
		);
		return {
			..._.omit(index, ['SecIndxKey']),
			SecIndxKey: secIndexesKey,
		}
	})
}

const removeKeyIdFromKeys = (keys = []) => keys.map(key => _.omit(key, 'keyId'));

const getUpdateIndexScript = data => {
	const { item, keyspaceName, tableName, dbVersion, isActivated, dataSources } = data;
	const { new: newIndexes = [], old: oldIndexes = [] } = _.get(item, 'role.compMod.SecIndxs', {});
	const { oldIdToNameHashTable = {}, newIdToNameHashTable = {} } = _.get(item, 'role.compMod', {});
	const preparedNewIndexes = prepareIndexes(newIdToNameHashTable, dataSources, newIndexes);
	const preparedOldIndexes = prepareIndexes(oldIdToNameHashTable, dataSources, oldIndexes);

	const isEqual = (newIndex = {}, oldIndex = {}) => {
		return isEqualIndex(
			{ ...oldIndex, SecIndxKey: removeKeyIdFromKeys(oldIndex.SecIndxKey) }, 
			{ ...newIndex, SecIndxKey: removeKeyIdFromKeys(newIndex.SecIndxKey) }, 
		);
	};

	const dataForIndexScript = getDataForScript(preparedNewIndexes, preparedOldIndexes, isEqual);

	const dropIndexScript = getDropIndexScript(
		keyspaceName,
		tableName,
		dataForIndexScript.dropData,
	);

	const addIndexScript = getAddIndexScript({
		indexes: dataForIndexScript.addData,
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		dbVersion
	});

	return [...dropIndexScript, ...addIndexScript];
}

const getUpdateIndex = data => {
	const updateSearchIndexScript = getUpdateSearchIndexScript(data);
	const updateIndexScript = getUpdateIndexScript(data);

	return [...updateIndexScript, ...updateSearchIndexScript];
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
	getIndexTable,
	getDataColumnIndex
}