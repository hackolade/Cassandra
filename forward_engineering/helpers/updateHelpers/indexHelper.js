const { dependencies } = require('../appDependencies');
const { getIndexProfiles, getTableNameStatement, tab } = require('../generalHelper');
const { getIndexes } = require('../indexHelper');
const { getNamesByIds } = require('../schemaHelper');
const {
	getDiffOptions,
	getDiffConfig,
	getDiffIndexProfiles,
	isEqualIndex,
	prepareSearchIndexProfile,
} = require('./indexService');
const { AlterScriptDto } = require('../types/AlterScriptDto');

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
};

const setNameCollectionsScript = (keyspaceName, name, type) => {
	const statement = getTableNameStatement(keyspaceName, name);
	nameCollectionsExistsScript = {
		...nameCollectionsExistsScript,
		[type]: [...nameCollectionsExistsScript[type], statement],
	};
};

const indexSearchProperties = ['searchIndexProfiles', 'searchIndexOptions'];

const getDataSearchIndex = (indexTab, dbVersion) => {
	return {
		indexType: 'search',
		columns: indexTab.searchIndexColumns,
		config: indexTab.searchIndexConfig,
		profiles: getIndexProfiles(indexTab.searchIndexProfiles, dbVersion),
		options: indexTab.searchIndexOptions,
		ifNotExist: indexTab.searchIndexIfNotExist,
	};
};

const getModifyDataSearchIndex = (item, type, dbVersion) => {
	const itemData = [...indexSearchProperties, 'searchIndexIfNotExist', 'searchIndexColumns', 'searchIndexConfig']
		.map(property => [property, (item?.compMod || {})[property]?.[type]])
		.filter(([__, value]) => !!value);
	item = { ...item, ...Object.fromEntries(itemData) };
	return getDataSearchIndex(item, dbVersion);
};

const getDataForScript = (newData, oldData, isEqual = dependencies.lodash.isEqual) => {
	let addData;
	let dropData;

	if (!newData.length && !oldData.length) {
		return {};
	}

	if (!newData.length) {
		dropData = oldData;
	} else if (!oldData.length) {
		addData = newData;
	} else if (!dependencies.lodash.isEqual(newData, oldData)) {
		const equalElements = dependencies.lodash.intersectionWith(newData, oldData, isEqual);
		dropData = dependencies.lodash.xorWith(oldData, equalElements, isEqual);
		addData = dependencies.lodash.xorWith(newData, equalElements, isEqual);
	}
	return {
		addData,
		dropData,
	};
};

const getDataForSearchIndexScript = (role, dataSources, dbVersion) => {
	const { compMod } = role;
	const oldIdToNameHashTable = dependencies.lodash.get(role, 'compMod.oldIdToNameHashTable', {});
	const columns = dependencies.lodash.get(role, 'compMod.searchIndexColumns', {});
	const filterColumn = column => column?.name && !column?.compositePartitionKey;
	const oldColumns = (columns.old || [])
		.map(column =>
			getDataColumnIndex({
				dataSources,
				column,
				allAttributes: true,
				idToNameHashTable: oldIdToNameHashTable,
			}),
		)
		.filter(filterColumn);
	const dataSearchIndex = getDataSearchIndex(role, dbVersion);
	const searchIndex = dependencies.lodash.get(role, 'compMod.searchIndex', {});
	const newProfiles = compMod?.searchIndexProfiles?.new;
	const oldProfiles = prepareSearchIndexProfile(compMod?.searchIndexProfiles?.old, newProfiles, oldColumns);
	const searchPropertiesCompare = dependencies.lodash.merge(
		getDiffOptions(compMod?.searchIndexOptions?.old, compMod?.searchIndexOptions?.new),
		getDiffIndexProfiles(oldProfiles, newProfiles),
	);

	let dropData;
	let addData;

	if (!searchIndex.old && !searchIndex.new) {
		return {};
	}

	if (!searchIndex.old) {
		addData = getModifyDataSearchIndex(role, 'new', dbVersion);
	} else if (!searchIndex.new) {
		dropData = dataSearchIndex;
	} else if (
		!dependencies.lodash.isEmpty(searchPropertiesCompare.modifyData) ||
		!dependencies.lodash.isEmpty(searchPropertiesCompare.dropData)
	) {
		addData = getModifyDataSearchIndex(role, 'new', dbVersion);
		dropData = dataSearchIndex;
	}
	return {
		addData,
		dropData,
	};
};

const getFieldDataByKeyId = ({ dataSources, idToNameHashTable, keyId, allAttributes = false }) => {
	const fieldData = getNamesByIds([keyId], dataSources, allAttributes)[keyId] || {};
	if (fieldData.name) {
		return fieldData;
	}

	const name = idToNameHashTable[keyId] || '';

	return { name };
};

const getDataColumnIndex = ({ dataSources, idToNameHashTable, column = {}, key = 'key', allAttributes = false }) => {
	const keyId = dependencies.lodash.get(column, `${key}[0].keyId`, '');
	const fieldData = getFieldDataByKeyId({ dataSources, idToNameHashTable, keyId, allAttributes }) || {};

	return {
		...dependencies.lodash.omit(column, key),
		...fieldData,
	};
};

const getDataForSearchIndexColumns = (item, dataSources) => {
	const oldIdToNameHashTable = dependencies.lodash.get(item, 'role.compMod.oldIdToNameHashTable', {});
	const newIdToNameHashTable = dependencies.lodash.get(item, 'role.compMod.newIdToNameHashTable', {});
	const columns = dependencies.lodash.get(item, 'role.compMod.searchIndexColumns', {});
	const filterColumn = column => column.name && !column.compositePartitionKey;
	const newColumns = (columns.new || [])
		.map(column => getDataColumnIndex({ dataSources, idToNameHashTable: newIdToNameHashTable, column }))
		.filter(filterColumn);
	const oldColumns = (columns.old || [])
		.map(column => getDataColumnIndex({ dataSources, idToNameHashTable: oldIdToNameHashTable, column }))
		.filter(filterColumn);
	const isEqual = (oldValue, newValue) => oldValue?.name === newValue?.name;
	return getDataForScript(newColumns, oldColumns, isEqual);
};

const getSearchConfigScript = (keyspaceName, tableName, config) => {
	const dropScript = Object.entries(config.dropData).map(([key]) =>
		AlterScriptDto.getInstance(
			[dependencies.provider.dropSearchIndexConfig(keyspaceName, tableName, key)],
			true,
			'deletion',
			'index',
		),
	);
	const modifyScript = Object.entries(config.modifyData)
		.filter(([__, value]) => typeof value !== 'string' || Boolean(value))
		.map(([key, value]) => {
			const preparedValue = dependencies.lodash.isString(value) ? `'${value}'` : value;

			return AlterScriptDto.getInstance(
				[dependencies.provider.modifySearchIndex(keyspaceName, tableName, key, preparedValue)],
				true,
				'modify',
				'index',
			);
		});

	return [...modifyScript, ...dropScript];
};

const getSearchColumnsScript = (keyspaceName, tableName, columns) => {
	const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
	const alterScript = `ALTER SEARCH INDEX SCHEMA\n` + tab(`ON ${tableNameStatement}\n`);

	const getScript = (alterScript, statement, scriptPurpose, column) => {
		const script = alterScript + tab(`${statement} "${column.name}";`);

		return AlterScriptDto.getInstance([script], true, scriptPurpose, 'index');
	};

	const dropSearchScripts = (columns.dropData || []).map(getScript.bind(null, alterScript, `DROP field`, 'deletion'));
	const addSearchScripts = (columns.addData || []).map(getScript.bind(null, alterScript, `ADD field`, 'modify'));
	if (dropSearchScripts.length) {
		dropSearchScripts.push(getRenewalScript(keyspaceName, tableName, 'RELOAD', 'deletion'));
	}

	return { dropSearchScripts, addSearchScripts };
};

const getRenewalScript = (keyspaceName, tableName, startStatement, scriptPurpose) => {
	const tableNameStatement = getTableNameStatement(keyspaceName, tableName);
	const script = `${startStatement} SEARCH INDEX\n` + tab(`ON ${tableNameStatement};`);

	return AlterScriptDto.getInstance([script], true, scriptPurpose, 'renewal');
};

const getDropSearchIndexScript = (keyspaceName, tableName, isDrop) => {
	const isExistScript = checkExistsScript(keyspaceName, tableName, 'dropSearchIndexes');
	let script = '';
	if (!!isDrop && !isExistScript) {
		script = dependencies.provider.dropSearchIndex(keyspaceName, tableName);
		setNameCollectionsScript(keyspaceName, tableName, 'dropSearchIndexes');
	}
	return [AlterScriptDto.getInstance([script], true, 'deletion', 'index')];
};

const getDropIndexScript = (keyspaceName, tableName, secIndxs = []) =>
	secIndxs.map(index => {
		const tableIndexName = `${tableName}.${index.name}`;
		const isExistScript = checkExistsScript(keyspaceName, tableIndexName, 'dropIndexes');
		let script = '';
		if (index.name && !isExistScript) {
			script = dependencies.provider.dropIndex(keyspaceName, index.name);
			setNameCollectionsScript(keyspaceName, tableIndexName, 'dropIndexes');
		}
		return AlterScriptDto.getInstance([script], true, 'deletion', 'index');
	});

const getAddSearchIndexScript = data => {
	const { keyspaceName, tableName, searchIndex, dataSources, isActivated, dbVersion } = data;
	const isExistScript = checkExistsScript(keyspaceName, tableName, 'createSearchIndexes');
	if (isExistScript) {
		return [];
	}
	setNameCollectionsScript(keyspaceName, tableName, 'createSearchIndexes');
	const script = getIndexes({ searchIndex }, dataSources, tableName, keyspaceName, isActivated, true, dbVersion);
	return [AlterScriptDto.getInstance([script], true, 'add', 'index')];
};

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
	});
	const script = getIndexes(
		{ indexes: filteredIndexes },
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		true,
		dbVersion,
	);
	return [AlterScriptDto.getInstance([script], true, 'add', 'index')];
};

const getCreatedIndex = data => {
	const { item, dataSources, tableName, keyspaceName, isActivated, dbVersion } = data;
	const isSearchIndex = !!item.role?.searchIndex;
	const dataForSearchIndexScript = getDataSearchIndex(item.role || {}, dbVersion);

	const script = getIndexes(
		{
			searchIndex: isSearchIndex && dataForSearchIndexScript,
			indexes: item.role?.SecIndxs || [],
		},
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		true,
		dbVersion,
	);
	return [AlterScriptDto.getInstance([script], true, 'add', 'index')];
};

const getDeletedIndex = data => {
	const { item, keyspaceName, tableName } = data;
	const dropIndexScript = getDropIndexScript(keyspaceName, tableName, item.role?.SecIndxs);
	const dropSearchIndexScript = getDropSearchIndexScript(keyspaceName, tableName, item.role?.searchIndex);
	return [...dropIndexScript, ...dropSearchIndexScript];
};

const getUpdateSearchIndexScript = data => {
	const { item, keyspaceName, tableName, dbVersion, isActivated, dataSources } = data;

	const dataForScript = getDataForSearchIndexScript(item.role, dataSources, dbVersion);

	if (dataForScript.dropData || dataForScript.addData) {
		const dropIndexSearchScript = getDropSearchIndexScript(keyspaceName, tableName, !!dataForScript.dropData);

		const addSearchIndexScript = getAddSearchIndexScript({
			searchIndex: dataForScript.addData,
			dataSources,
			tableName,
			keyspaceName,
			isActivated,
			dbVersion,
		});

		return [...dropIndexSearchScript, ...addSearchIndexScript];
	}

	const config = dependencies.lodash.get(item, 'role.compMod.searchIndexConfig', {});

	const dataForColumnsScript = getDataForSearchIndexColumns(item, dataSources);
	const dataForConfigScript = getDiffConfig(config.old, config.new);

	const configScript = getSearchConfigScript(keyspaceName, tableName, dataForConfigScript);
	const { dropSearchScripts, addSearchScripts } = getSearchColumnsScript(
		keyspaceName,
		tableName,
		dataForColumnsScript,
	);

	const renewalData = {
		RELOAD: configScript.length || addSearchScripts.length,
		REBUILD: dropSearchScripts.length || addSearchScripts.length,
	};
	const renewalScripts = Object.entries(renewalData).reduce((scripts, [key, value]) => {
		if (!value) {
			return scripts;
		}
		return [...scripts, getRenewalScript(keyspaceName, tableName, key, 'add')];
	}, []);

	return [...configScript, ...dropSearchScripts, ...addSearchScripts, ...renewalScripts];
};

const prepareIndexes = (idToNameHashTable, dataSources, indexes = []) => {
	return indexes.map(index => {
		const secIndexesKey = dependencies.lodash.get(index, 'SecIndxKey', []).map(key => ({
			...key,
			name:
				getFieldDataByKeyId({ dataSources, idToNameHashTable, keyId: dependencies.lodash.get(key, 'keyId') })
					?.name || '',
		}));
		return {
			...dependencies.lodash.omit(index, ['SecIndxKey']),
			SecIndxKey: secIndexesKey,
		};
	});
};

const removeKeyIdFromKeys = (keys = []) => keys.map(key => dependencies.lodash.omit(key, 'keyId'));

const getUpdateIndexScript = data => {
	const { item, keyspaceName, tableName, dbVersion, isActivated, dataSources } = data;
	const { new: newIndexes = [], old: oldIndexes = [] } = dependencies.lodash.get(item, 'role.compMod.SecIndxs', {});
	const { oldIdToNameHashTable = {}, newIdToNameHashTable = {} } = dependencies.lodash.get(item, 'role.compMod', {});
	const preparedNewIndexes = prepareIndexes(newIdToNameHashTable, dataSources, newIndexes);
	const preparedOldIndexes = prepareIndexes(oldIdToNameHashTable, dataSources, oldIndexes);

	const isEqual = (newIndex = {}, oldIndex = {}) => {
		return isEqualIndex(
			{ ...oldIndex, SecIndxKey: removeKeyIdFromKeys(oldIndex.SecIndxKey) },
			{ ...newIndex, SecIndxKey: removeKeyIdFromKeys(newIndex.SecIndxKey) },
		);
	};

	const dataForIndexScript = getDataForScript(preparedNewIndexes, preparedOldIndexes, isEqual);

	const dropIndexScript = getDropIndexScript(keyspaceName, tableName, dataForIndexScript.dropData);

	const addIndexScript = getAddIndexScript({
		indexes: dataForIndexScript.addData,
		dataSources,
		tableName,
		keyspaceName,
		isActivated,
		dbVersion,
	});

	return [...dropIndexScript, ...addIndexScript];
};

const getUpdateIndex = data => {
	const updateSearchIndexScript = getUpdateSearchIndexScript(data);
	const updateIndexScript = getUpdateIndexScript(data);

	return [...updateIndexScript, ...updateSearchIndexScript];
};

const createDataSources = (item, data) => {
	const properties = { ...(item.properties || {}), ...(item.role.properties || {}) };
	const itemData = { properties, ...dependencies.lodash.omit(item.role || {}, ['properties']) };

	return [
		itemData,
		data.modelDefinitions,
		data.externalDefinitions,
		data.internalDefinitions,
		{ properties: item?.properties || {} },
		{ properties: dependencies.lodash.get(item, 'role.compMod.newProperties', []) },
		{ properties: dependencies.lodash.get(item, 'role.compMod.oldProperties', []) },
	];
};

const getTableNameFromCompMod = table =>
	table.role?.compMod?.collectionName?.new ?? table.role?.compMod?.collectionName?.old;

const getIndexTable = (item, data, tableIsChange) => {
	const dataSources = createDataSources(item, data);
	const tableName = item.role?.code || item.role?.name || getTableNameFromCompMod(item);
	const keyspaceName = item.role.compMod?.keyspaceName;
	const dbVersion = data.modelData[0].dbVersion;
	const isActivated = item.role?.isActivated;

	const { compMod = {} } = item.role || {};

	if (tableIsChange) {
		const createdIndexes = getCreatedIndex({ item, dataSources, tableName, keyspaceName, isActivated, dbVersion });
		const deletedIndex = getDeletedIndex({ item, keyspaceName, tableName });

		return [...createdIndexes, ...deletedIndex];
	}

	if (compMod.created) {
		return getCreatedIndex({ item, dataSources, tableName, keyspaceName, isActivated, dbVersion });
	}

	if (compMod.deleted) {
		return getDeletedIndex({ item, keyspaceName, tableName });
	}

	return getUpdateIndex({ item, keyspaceName, tableName, dataSources, isActivated, dbVersion });
};

module.exports = {
	getIndexTable,
	getDataColumnIndex,
};
