const { getTypeByData } = require('../typeHelper');
const { getNamesByIds } = require('../schemaHelper');
const { dependencies } = require('../appDependencies');
const { eachField, getTableNameStatement } = require('../generalHelper');
const { getTableStatement } = require('../tableHelper');
const { AlterScriptDto } = require('../types/AlterScriptDto');

let existScripts = {
	modifiedColumn: [],
	addTable: [],
	deleteTable: [],
};

/**
 *
 * @param addData {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getAdd = addData => {
	if (isScriptExists(addData)) {
		return [];
	}

	return [AlterScriptDto.getInstance([dependencies.provider.addEntity(addData)], true, 'add', 'field')];
};

/**
 *
 * @param deleteData {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getDelete = deleteData => {
	if (isScriptExists(deleteData)) {
		return [];
	}

	return [AlterScriptDto.getInstance([dependencies.provider.deleteEntity(deleteData)], true, 'deletion', 'field')];
};

/**
 *
 * @param data {Object}
 * @returns {string}
 */
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
	};
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
				};
			}, {}),
		};
	};

	const fieldAfterTransform = propertiesFromArrayToObj(field);

	return eachField(fieldAfterTransform, field => {
		if (field?.type !== 'reference' || dependencies.lodash.isEmpty(field.refIdPath)) {
			return field;
		}

		const preparedField =
			getNamesByIds([dependencies.lodash.last(field.refIdPath)], dataSources)[
				dependencies.lodash.last(field.refIdPath)
			] || {};
		return {
			...field,
			...preparedField,
		};
	});
};

const hydrateColumn = ({ tableName, keyspaceName, isOldModel, property, udtMap, dataSources }) => {
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
			},
		},
	};
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
				...dependencies.lodash.omit(key, 'type'),
				...(type ? { type } : {}),
			},
		};
	}, {});
};

const deleteFalseValuesIfNotPresentInOtherColumn = (left, right) =>
	dependencies.lodash.omitBy(left, (value, key) => value === false && !right[key]);

const areTableKeyColumnsEqual = (column1, column2) => {
	const comparedColumn1 = deleteFalseValuesIfNotPresentInOtherColumn(column1, column2);
	const comparedColumn2 = deleteFalseValuesIfNotPresentInOtherColumn(column2, column1);

	return dependencies.lodash.isEqual(comparedColumn1, comparedColumn2);
};

const tableKeysIsEqual = ({ newKeys = [], oldKeys = [], dataSources }) => {
	if (newKeys.length !== oldKeys.length) {
		return false;
	}
	const newKeysHash = addToKeysHashType(
		getNamesByIds(
			newKeys.map(key => key.keyId),
			dataSources,
		),
		newKeys,
	);
	const oldKeysHash = addToKeysHashType(
		getNamesByIds(
			oldKeys.map(key => key.keyId),
			dataSources,
		),
		oldKeys,
	);
	const difference = dependencies.lodash.differenceWith(
		dependencies.lodash.values(newKeysHash),
		dependencies.lodash.values(oldKeysHash),
		areTableKeyColumnsEqual,
	);

	return dependencies.lodash.isEmpty(difference);
};

const isTableChange = ({ item, dataSources }) => {
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

	return (
		!compositeClusteringKeyIsEqual ||
		!compositePartitionKeyIsEqual ||
		tableProperties.some(property => !dependencies.lodash.isEqual(compMod[property]?.new, compMod[property]?.old))
	);
};

/**
 *
 * @param deleteData {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getDeleteTableDto = deleteData => {
	if (isScriptExists(deleteData, 'deleteTable')) {
		return [];
	}
	const tableStatement = getTableNameStatement(deleteData.keyspaceName, deleteData.tableName);
	addScriptToExistScripts(deleteData, 'deleteTable');
	return [AlterScriptDto.getInstance([dependencies.provider.dropTable(tableStatement)], true, 'deletion', 'table')];
};

const getAddTable = addTableData => {
	if (isScriptExists(addTableData, 'addTable')) {
		return [];
	}
	let table = addTableData.item;
	const data = addTableData.data;
	const compositePartitionKey = getTableParameter(table, 'compositePartitionKey') || [];
	const compositeClusteringKey = getTableParameter(table, 'compositeClusteringKey') || [];

	const entityData = [
		{
			compositePartitionKey,
			compositeClusteringKey,
			collectionName: addTableData.tableName,
			tableOptions: table.role.tableOptions || '',
			comments: table.role.comments || '',
			isActivated: table.role.isActivated,
		},
	];

	const script = getTableStatement({
		tableData: table,
		tableMetaData: entityData,
		keyspaceMetaData: [{ name: addTableData.keyspaceName }],
		dataSources: addTableData.dataSources,
		udtTypeMap: data.udtTypeMap || {},
		isKeyspaceActivated: addTableData.isKeyspaceActivated,
	});
	addScriptToExistScripts(addTableData, 'addTable');
	return [AlterScriptDto.getInstance([script], true, 'add', 'table')];
};

module.exports = {
	getDelete,
	getAdd,
	hydrateColumn,
	isTableChange,
	getTableParameter,
	addScriptToExistScripts,
	getDeleteTableDto,
	getAddTable,
};
