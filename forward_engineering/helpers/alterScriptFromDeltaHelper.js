const { getTypeByData } = require('./typeHelper');
const { dependencies } = require('./appDependencies');
const { getKeySpaceScript } = require('./updateHelpers/keySpaceHelper');
const { checkIsOldModel, fieldTypeCompatible } = require('./updateHelpers/generalHelper');
const { getViewScript } = require('./updateHelpers/viewHelper');
const { getIndexTable, getDataColumnIndex } = require('./updateHelpers/indexHelper');
const { getUdtScript, sortAddedUdt } = require('./updateHelpers/udtHelper');
const {
	getDelete,
	hydrateColumn,
	isTableChange,
	addScriptToExistScripts,
	getAdd,
	getDeleteTableDto,
	getAddTable,
} = require('./updateHelpers/tableHelper');
const { getUdtMap } = require('./udtHelper');
const { AlterScriptDto } = require('./types/AlterScriptDto');

/**
 *
 * @param renameData {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getRenameColumnDto = renameData => {
	return [AlterScriptDto.getInstance([dependencies.provider.renameColumn(renameData)], true, 'modify', 'field')];
};
const objectContainsProp = (object, key) => !!object[key];

const getCollectionName = compMod => {
	const { collectionName = {}, code = {} } = compMod;
	return {
		oldName: code.old || collectionName.old,
		newName: code.new || collectionName.new,
	};
};

const getUpdateColumnProvider = {
	/**
	 *
	 * @param paramsObject: {Object}
	 * @returns {[(AlterScriptDto|undefined)]}
	 */
	alterDropCreate({ dataForScript, oldName, newName }) {
		const getData = columnData => ({
			...dataForScript,
			columnData: { ...dataForScript.columnData, ...columnData },
		});
		const deletePropertyScript = getDelete(getData({ name: oldName }));
		const addPropertyScript = getAdd(getData({ name: newName }));
		return [...deletePropertyScript, ...addPropertyScript];
	},

	/**
	 *
	 * @param hydratedColumn: {Object}
	 * @returns {[(AlterScriptDto|undefined)]}
	 */
	alterNameDto(hydratedColumn) {
		const { newName, oldName, dataForScript, property, isTypeChange } = hydratedColumn;
		if (property.primaryKey && isTypeChange) {
			return [];
		}
		if (!property.primaryKey) {
			return this.alterDropCreate(hydratedColumn);
		}

		return getRenameColumnDto({ ...dataForScript, columnData: { oldName, newName } });
	},

	/**
	 *
	 * @param hydratedColumn: {Object}
	 * @returns {[(AlterScriptDto|undefined)]}
	 */
	alterType(hydratedColumn) {
		const { isOldModel, oldType, newType, dataForScript, property } = hydratedColumn;
		if (!oldType || !newType || property.primaryKey) {
			return [];
		}
		const isFieldTypeCompatible = fieldTypeCompatible(oldType, newType);

		if (isOldModel) {
			if (!isFieldTypeCompatible) {
				return this.alterDropCreate(hydratedColumn);
			}

			return [
				AlterScriptDto.getInstance([dependencies.provider.updateType(dataForScript)], true, 'modify', 'field'),
			];
		}

		return this.alterDropCreate(hydratedColumn);
	},
};

/**
 *
 * @param updateData {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getUpdate = updateData => {
	const hydratedColumn = hydrateColumn(updateData);
	const { newName, oldName } = hydratedColumn;
	if (!oldName || !newName) {
		return [];
	}
	if (hydratedColumn.isNameChange) {
		return getUpdateColumnProvider.alterNameDto(hydratedColumn);
	} else if (hydratedColumn.isTypeChange) {
		return getUpdateColumnProvider.alterType(hydratedColumn);
	}
	addScriptToExistScripts(hydratedColumn.dataForScript);

	return [];
};

const getIsColumnInIndex = (item, columnName, data) => {
	const itemData = {
		properties: item.properties || {},
		...dependencies.lodash.omit(item.role || {}, ['properties']),
	};

	const dataSources = [itemData, data.modelDefinitions];
	const secIndexes = dependencies.lodash
		.get(item, 'role.SecIndxs', [])
		.map(index => getDataColumnIndex({ dataSources, idToNameHashTable: {}, column: index, key: 'SecIndxKey' }))
		.map(index => index.name)
		.filter(Boolean);
	const searchIndexes = dependencies.lodash
		.get(item, 'role.searchIndexColumns', [])
		.map(index => getDataColumnIndex({ dataSources, idToNameHashTable: {}, column: index }))
		.map(index => index.name)
		.filter(Boolean);
	return [...searchIndexes, ...secIndexes].includes(columnName);
};

const getPropertiesForUpdateTable = (properties = []) => {
	const newProperties = Object.entries(properties).map(([name, value]) => {
		if (!value.compMod) {
			return [name, value];
		}
		const newField = value.compMod?.newField || {};
		const oldField = value.compMod?.oldField || {};
		Object.entries(newField).forEach(([keyNewField, valueNewField]) => {
			if (oldField[keyNewField] !== valueNewField) {
				value[keyNewField] = valueNewField;
			}
			if (keyNewField === 'name' && oldField[keyNewField] !== valueNewField) {
				name = valueNewField;
			} 
		});
		return [name, value];
	});
	return Object.fromEntries(newProperties);
};

/**
 *
 * @param updateData: {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getUpdateTableDto = updateData => {
	const { item, propertiesScript = [] } = updateData;
	const { oldName, newName } = getCollectionName(item.role?.compMod);

	const compModeWithName = { ...(item.role?.compMod || {}), name: { new: newName, old: oldName } };

	const tableIsChange = isTableChange({
		item: {
			...item,
			role: { ...item.role, compMod: compModeWithName },
		},
		data: updateData.data,
		dataSources: updateData.dataSources,
	});
	const indexTableScript = getIndexTable(item, updateData.data, tableIsChange);

	if (!tableIsChange) {
		const tableName = updateData.tableName || oldName || newName;

		return [
			AlterScriptDto.getInstance(
				[
					dependencies.provider.updateTableOptions(
						item.role?.compMod || {},
						tableName,
						updateData.isOptionScript,
					),
				],
				true,
				'modify',
				'table',
			),
			...indexTableScript,
			...propertiesScript,
		];
	}

	if (!oldName || !newName) {
		return [];
	}

	const data = {
		keyspaceName: updateData.keyspaceName,
		data: updateData.data,
		item: {
			...item,
			properties: getPropertiesForUpdateTable(item.role?.properties || item.properties),
			role: {
				...(item?.role || {}),
				tableOptions: item?.role?.compMod?.['tableOptions'] || {},
			},
		},
		isKeyspaceActivated: true,
		dataSources: updateData.dataSources,
	};
	const deleteScript = getDeleteTableDto({ ...data, tableName: oldName });
	const addScript = getAddTable({ ...data, tableName: newName });
	return [...deleteScript, ...addScript, ...indexTableScript];
};

/**
 *
 * @param child {Object}
 * @param udtMap {Object}
 * @param generator {Object}
 * @param data {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const handleChange = (child, udtMap, generator, data) => {
	let alterTableScriptDto = [];

	if (objectContainsProp(child, 'items') && child.items.length) {
		const alterScript = child.items.reduce((result, current) => {
			return result.concat(handleItem(current, udtMap, generator, data));
		}, []);
		alterTableScriptDto = alterTableScriptDto.concat(alterScript);
	} else if (objectContainsProp(child, 'items')) {
		alterTableScriptDto = alterTableScriptDto.concat(handleItem(child.items, udtMap, generator, data));
	}

	return alterTableScriptDto;
};

const handleItem = (item, udtMap, generator, data) => {
	let alterTableScript = [];

	if (!objectContainsProp(item, 'properties')) {
		return alterTableScript;
	}

	const isOldModel = checkIsOldModel(dependencies.lodash.get(data, 'modelData'));
	const itemProperties = item.properties;

	alterTableScript = Object.keys(itemProperties).reduce((alterTableScript, tableKey) => {
		const itemCompModData = itemProperties[tableKey].role.compMod;

		if (!itemCompModData) {
			return alterTableScript;
		}

		const codeName = dependencies.lodash.get(itemProperties, `${tableKey}.role.code`, '');
		const tableName = codeName.length ? codeName : tableKey;
		const tableProperties = itemProperties[tableKey].properties || {};

		const keyspaceName = itemCompModData.keyspaceName;

		if (itemCompModData.deleted) {
			const deletedIndexScript = getIndexTable(itemProperties[tableKey], data);
			return [
				...alterTableScript,
				...getDeleteTableDto({
					keyspaceName,
					tableName,
				}),
				...deletedIndexScript,
			];
		}

		const dataSources = [
			data.modelDefinitions,
			data.internalDefinitions,
			data.externalDefinitions,
			{ properties: tableProperties },
			{ properties: dependencies.lodash.get(itemProperties[tableKey], 'role.properties', []) },
			{ properties: dependencies.lodash.get(itemProperties[tableKey], 'role.compMod.newProperties', []) },
			{ properties: dependencies.lodash.get(itemProperties[tableKey], 'role.compMod.oldProperties', []) },
		];

		if (itemCompModData.created) {
			const addedIndexScript = getIndexTable(itemProperties[tableKey], data);
			return [
				...alterTableScript,
				...getAddTable({
					item: itemProperties[tableKey],
					keyspaceName,
					data,
					tableName,
					dataSources,
				}),
				...addedIndexScript,
			];
		}

		if (itemCompModData.modified) {
			const updateTableScript = getUpdateTableDto({
				keyspaceName,
				data,
				item: itemProperties[tableKey],
				isOptionScript: true,
				tableName,
				dataSources,
			});

			return [...alterTableScript, ...updateTableScript];
		}

		const propertiesScript = handleProperties({
			item: itemProperties[tableKey],
			generator,
			tableProperties,
			udtMap,
			itemCompModData,
			tableName,
			isOldModel,
			data,
			dataSources,
		});

		const updateTableScript = getUpdateTableDto({
			item: itemProperties[tableKey],
			isOptionScript: generator.name === 'getUpdate' || generator.name === 'getAdd',
			propertiesScript,
			keyspaceName,
			tableName,
			data,
			dataSources,
		});

		return [...alterTableScript, ...updateTableScript];
	}, []);

	return alterTableScript;
};

const handleProperties = ({
	generator,
	tableProperties,
	udtMap,
	itemCompModData,
	tableName,
	isOldModel,
	data,
	item,
	dataSources,
}) => {
	return Object.keys(tableProperties).reduce((alterTableScript, columnName) => {
		const property = tableProperties[columnName] || {};
		if (generator.name !== 'getUpdate' && (property.compositePartitionKey || property.compositeClusteringKey)) {
			return alterTableScript;
		}
		if (generator.name === 'getAdd' && property.hasOwnProperty('compMod')) {
			return alterTableScript;
		}
		let columnType = getTypeByData(property, udtMap, columnName);

		if (property.$ref && !columnType) {
			columnType = dependencies.lodash.last(property.$ref.split('/'));
		}

		if (!columnType) {
			return alterTableScript;
		}

		const keyspaceName = itemCompModData?.keyspaceName;

		const isColumnInIndex = getIsColumnInIndex(item, columnName, data);

		if (generator.name === 'getUpdate' && (!property.compMod || isColumnInIndex)) {
			return alterTableScript;
		}

		return [
			...alterTableScript,
			...generator({
				keyspaceName,
				tableName,
				columnData: {
					name: columnName,
					type: columnType,
				},
				property,
				isOldModel,
				udtMap,
				dataSources,
			}),
		];
	}, []);
};

const columns = {
	views: getViewScript,
	containers: getKeySpaceScript,
	udt: getUdtScript,
};

const generateScript = (child, udtMap, data, column, mode) => {
	if (!child) {
		return [];
	}
	const getScript = columns[column];

	if (Array.isArray(child) && child.length) {
		return child.reduce(
			(scriptsData, item) => [
				...scriptsData,
				...getScript({ child: item.properties[Object.keys(item.properties)[0]], udtMap, data, mode }),
			],
			[],
		);
	}
	const properties = child.properties;
	const itemKey = Object.keys(properties)[0];
	const item = properties[itemKey];

	return getScript({ child: item, udtMap, data, mode });
};
/**
 * @param child {PersistenceSchemaChild}
 * @param udtMap {Object}
 * @param data {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getEntitiesDto = (child, udtMap, data) => {
	const addedEntities = child?.properties?.entities?.properties?.added;
	const modifiedEntities = child?.properties?.entities?.properties?.modified;
	const deletedEntities = child?.properties?.entities?.properties?.deleted;

	const addedEntitiesDto = handleChange(addedEntities, udtMap, getAdd, data);
	const modifiedEntitiesDto = handleChange(modifiedEntities, udtMap, getUpdate, data);
	const deletedEntitiesDto = handleChange(deletedEntities, udtMap, getDelete, data);

	return [...modifiedEntitiesDto, ...addedEntitiesDto, ...deletedEntitiesDto];
};

/**
 * @param child {PersistenceSchemaChild}
 * @param udtMap {Object}
 * @param data {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getContainersDto = (child, udtMap, data) => {
	const addedContainers = child?.properties?.containers?.properties?.added;
	const modifiedContainers = child?.properties?.containers?.properties?.modified;
	const deletedContainers = child?.properties?.containers?.properties?.deleted;

	let addedContainersDto = [];
	let modifiedContainersDto = [];
	let deletedContainersDto = [];

	if (!data?.scriptOptions?.containers?.skipModified) {
		addedContainersDto = generateScript(addedContainers?.items, udtMap, data, 'containers', 'add');
		modifiedContainersDto = generateScript(modifiedContainers?.items, udtMap, data, 'containers', 'update');
		deletedContainersDto = generateScript(deletedContainers?.items, udtMap, data, 'containers', 'delete');
	}

	return [...addedContainersDto, ...modifiedContainersDto, ...deletedContainersDto];
};

/**
 * @param child {PersistenceSchemaChild}
 * @param udtMap {Object}
 * @param data {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getViewsDto = (child, udtMap, data) => {
	const addedViews = child?.properties?.views?.properties?.added;
	const modifiedViews = child?.properties?.views?.properties?.modified;
	const deletedViews = child?.properties?.views?.properties?.deleted;

	const addedViewsDto = generateScript(addedViews?.items, udtMap, data, 'views', 'add');
	const modifiedViewsDto = generateScript(modifiedViews?.items, udtMap, data, 'views', 'update');
	const deletedViewsDto = generateScript(deletedViews?.items, udtMap, data, 'views', 'delete');

	return [...modifiedViewsDto, ...addedViewsDto, ...deletedViewsDto];
};

/**
 * @param child {PersistenceSchemaChild}
 * @param udtMap {Object}
 * @param data {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getModelDefinitionsDto = (child, udtMap, data) => {
	const modelDefinitions = child?.properties?.modelDefinitions;
	const sortAddedUdtResult = sortAddedUdt(modelDefinitions);
	const addedModelDefinitions = sortAddedUdtResult?.properties?.added;
	const modifiedModelDefinitions = sortAddedUdtResult?.properties?.modified;
	const deletedModelDefinitions = sortAddedUdtResult?.properties?.deleted;

	const addedModelDefinitionsDto = generateScript(addedModelDefinitions.items, udtMap, data, 'udt', 'add');
	const modifiedModelDefinitionsDto = generateScript(modifiedModelDefinitions.items, udtMap, data, 'udt', 'update');
	const deletedModelDefinitionsDto = generateScript(deletedModelDefinitions.items, udtMap, data, 'udt', 'delete');

	return [...addedModelDefinitionsDto, ...modifiedModelDefinitionsDto, ...deletedModelDefinitionsDto];
};

/**
 * @param child {PersistenceSchemaChild}
 * @param udtMap {Object}
 * @param data {Object}
 * @returns {[(AlterScriptDto|undefined)]}
 */
const getAlterScriptDtos = (child, udtMap, data) => {
	const generalUdtTypeMap = Object.assign({}, udtMap, getUdtMap([child]));

	return [
		...getEntitiesDto(child, generalUdtTypeMap, data),
		...getContainersDto(child, generalUdtTypeMap, data),
		...getViewsDto(child, generalUdtTypeMap, data),
		...getModelDefinitionsDto(child, generalUdtTypeMap, data),
	].filter(Boolean);
};

module.exports = {
	getAlterScriptDtos,
};
