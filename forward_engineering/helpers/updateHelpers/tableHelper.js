const { getTypeByData } = require("../typeHelper");
const { getNamesByIds } = require("../schemaHelper");
const { dependencies } = require('../appDependencies');
const { getUdtMap } = require("../udtHelper");

let _;

const setDependencies = ({ lodash }) => _ = lodash;

const removeColumnStatement = columnName => `DROP "${columnName}";`;

const alterTablePrefix = (tableName, keySpace) => 
	keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"`;

const getDelete = deleteData => {
	const script = `${alterTablePrefix(deleteData.tableName, deleteData.keyspaceName)} ${removeColumnStatement(deleteData.columnData.name)}`;
	return [{
		added: false,
		modified: false,
		deleted: true,
		script,
		field: 'field',
	}];
};

const hydrateColumn = ({ tableName, keyspaceName, isOldModel, property, udtMap }) => {
	const { oldField = {}, newField = {} } = property?.compMod || {};
	const udtTypeMap = Object.assign(
		{},
		udtMap,
		getUdtMap([oldField, newField, {}])
	);
	const newType = getTypeByData(property, udtTypeMap);
	const oldType = getTypeByData(oldField, udtTypeMap)
	return {
		property,
		isOldModel,
		oldName: oldField.name,
		newName: newField.name,
		newType,
		oldType,
		isNameChange: oldField.name !== newField.name,
		isTypeChange: newType !== oldType,
		dataForScript: {
			tableName,
			keyspaceName,
			columnData: {
				name: newField.name,
				type: newType,
			}
		}
	}
};

const getTableParameter = (item, key) => {
	const parameter = item?.role?.compMod?.[key];

	return parameter?.new || item?.role?.[key];
};

const addToKeysHashType = (keysHash, keys) => {
	return Object.entries(keysHash).reduce((keysHash, [id, key]) => {
		const type = (keys.find(key => key.keyId === id) || {}).type;
		return {
			...keysHash,
			[id]: {
				...key,
				...(type ? { type } : {})
			}
		};
	}, {});
};

const tableKeysIsEqual = ({ newKeys = [], oldKeys =[], dataSources }) => {
	const newKeysHash = addToKeysHashType(getNamesByIds(newKeys.map(key => key.keyId), dataSources), newKeys);
	const oldKeysHash = addToKeysHashType(getNamesByIds(oldKeys.map(key => key.keyId), dataSources), oldKeys);
	const difference = _.differenceWith(_.values(newKeysHash), _.values(oldKeysHash), _.isEqual);

	return _.isEmpty(difference);
};

const isTableChange = ({ item, data }) => {
	setDependencies(dependencies);

	const compMod = item?.role?.compMod || {};
	const dataSources = [
		item,
		{ properties: item.role.properties },
		data.externalDefinitions,
		data.modelDefinitions,
		data.internalDefinitions,
	];	
	const tableProperties = ['name', 'isActivated'];
	const { compositeClusteringKey = {}, compositePartitionKey = {} } = compMod || {};
	const compositeClusteringKeyIsEqual = tableKeysIsEqual({ 
		newKeys: compositeClusteringKey.new, 
		oldKeys: compositeClusteringKey.old, 
		dataSources,
	});

	const compositePartitionKeyIsEqual = tableKeysIsEqual({ 
		newKeys: compositePartitionKey.new, 
		oldKeys: compositePartitionKey.old, 
		dataSources,
	});

	return !compositeClusteringKeyIsEqual || !compositePartitionKeyIsEqual ||
		tableProperties.some(property => !_.isEqual(compMod[property]?.new, compMod[property]?.old));
}

module.exports = {
	getDelete,
	alterTablePrefix,
	hydrateColumn,
	isTableChange,
	getTableParameter,
}