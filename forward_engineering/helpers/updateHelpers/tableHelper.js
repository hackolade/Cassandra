const { getTypeByData } = require("../typeHelper");
const { getNamesByIds } = require("../schemaHelper");
const { dependencies } = require('../appDependencies');
const { eachField, getTableNameStatement } = require('../generalHelper');
const { getTableStatement } = require('../tableHelper');

let _;

let existScripts = {
	modifiedColumn: [],
	addTable: [],
	deleteTable: [],
};

const setDependencies = ({ lodash }) => _ = lodash;

const removeColumnStatement = columnName => `DROP "${columnName}";`;
const addColumnStatement = columnData => `ADD "${columnData.name}" ${columnData.type}`;

const alterTablePrefix = (tableName, keySpace) =>
	keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"`;

const getAdd = addData => {
	if (isScriptExists(addData)) {
		return [];
	}

	const script = `${alterTablePrefix(addData.tableName, addData.keyspaceName)} ${addColumnStatement(addData.columnData)};`;
	return [{
		deleted: false,
		modified: false,
		added: true,
		script,
		field: 'field',
	}];
};

const getDelete = deleteData => {
	if (isScriptExists(deleteData)) {
		return [];
	};
	const script = `${alterTablePrefix(deleteData.tableName, deleteData.keyspaceName)} ${removeColumnStatement(deleteData.columnData.name)}`;
	return [{
		added: false,
		modified: false,
		deleted: true,
		script,
		field: 'field',
	}];
};

const generateFullName = data => {
	const { tableName, keyspaceName, columnData } = data;
	const fulTableName = getTableNameStatement(keyspaceName, tableName);
	return columnData?.name ? `${fulTableName}.${columnData?.name}` : fulTableName;
};

const addScriptToExistScripts = (data = {}, type = 'modifiedColumn') => {
	const fullName = generateFullName(data);
	existScripts = {
		...existScripts,
		[type]: [...(existScripts?.[type] || []), fullName],
	}
};

const isScriptExists = (data = {}, type = 'modifiedColumn') => {
	const fullName = generateFullName(data);

	return (existScripts?.[type] || []).some(scriptName => scriptName === fullName);
};

const prepareField = (field, dataSources) => {
	const propertiesFromArrayToObj = field => {
		if (!field.hasOwnProperty('properties') || !Array.isArray(field.properties)) {
			return field;
		}

		return {
			...field,
			properties: field.properties.reduce((properties, property) => {
				return {
					...properties,
					[property.name]: propertiesFromArrayToObj(property),
				}
			}, {})
		};

	};

	const fieldAfterTransform = propertiesFromArrayToObj(field);

	return eachField(fieldAfterTransform, (field) => {
		if (field?.type !== 'reference' || _.isEmpty(field.refIdPath)) {
			return field;
		}

		const preparedField = getNamesByIds([_.last(field.refIdPath)], dataSources)[_.last(field.refIdPath)] || {};
		return {
			...field,
			...preparedField,
		}
	});
};

const hydrateColumn = ({ tableName, keyspaceName, isOldModel, property, udtMap, dataSources }) => {
	setDependencies(dependencies);
	const { oldField = {}, newField = {} } = property?.compMod || {};
	const preparedOldField = prepareField(oldField, dataSources);
	const newType = getTypeByData(property, udtMap, newField.name);
	const oldType = getTypeByData(preparedOldField, udtMap, oldField.name);

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
				..._.omit(key, 'type'),
				...(type ? { type } : {})
			}
		};
	}, {});
};

const deleteFalseValuesIfNotPresentInOtherColumn = (left, right) => _.omitBy(left, (value, key) => value === false && !right[key]);

const areTableKeyColumnsEqual = (column1, column2) => {
	const comparedColumn1 = deleteFalseValuesIfNotPresentInOtherColumn(column1, column2);
	const comparedColumn2 = deleteFalseValuesIfNotPresentInOtherColumn(column2, column1);

	return _.isEqual(comparedColumn1, comparedColumn2);
}

const tableKeysIsEqual = ({ newKeys = [], oldKeys =[], dataSources }) => {
	if (newKeys.length !== oldKeys.length) {
		return false;
	}
	const newKeysHash = addToKeysHashType(getNamesByIds(newKeys.map(key => key.keyId), dataSources), newKeys);
	const oldKeysHash = addToKeysHashType(getNamesByIds(oldKeys.map(key => key.keyId), dataSources), oldKeys);
	const difference = _.differenceWith(_.values(newKeysHash), _.values(oldKeysHash), areTableKeyColumnsEqual);

	return _.isEmpty(difference);
};

const isTableChange = ({ item, dataSources }) => {
	setDependencies(dependencies);

	const compMod = item?.role?.compMod || {};
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
};

const getDeleteTable = deleteData => {
	if (isScriptExists(deleteData, 'deleteTable')) {
		return [];
	}
	const tableStatement = getTableNameStatement(deleteData.keyspaceName, deleteData.tableName);
	const script = `DROP TABLE IF EXISTS ${tableStatement};`;
	addScriptToExistScripts(deleteData, 'deleteTable')
	return [{
		modified: false,
		added: false,
		deleted: true,
		script,
		table: 'table',
	}];
};

const getAddTable = (addTableData) => {
	if (isScriptExists(addTableData, 'addTable')) {
		return [];
	}
	let table = addTableData.item;
	const data = addTableData.data;
	const compositePartitionKey = getTableParameter(table, 'compositePartitionKey') || [];
	const compositeClusteringKey = getTableParameter(table, 'compositeClusteringKey') || [];

	const entityData = [{
		compositePartitionKey,
		compositeClusteringKey,
		collectionName: addTableData.tableName,
		tableOptions: table.role.tableOptions || '',
		comments: table.role.comments || '',
		isActivated: table.role.isActivated,
	}];

	const script = getTableStatement({
		tableData: table,
		tableMetaData: entityData,
		keyspaceMetaData: [{ name: addTableData.keyspaceName }],
		dataSources: addTableData.dataSources,
		udtTypeMap: data.udtTypeMap || {},
		isKeyspaceActivated: addTableData.isKeyspaceActivated,
	});
	addScriptToExistScripts(addTableData, 'addTable');
	return [{
		deleted: false,
		modified: false,
		added: true,
		script,
		table: 'table',
	}];
}

module.exports = {
	getDelete,
	getAdd,
	alterTablePrefix,
	hydrateColumn,
	isTableChange,
	getTableParameter,
	addScriptToExistScripts,
	getDeleteTable,
	getAddTable,
}
