const { getTypeByData } = require('./typeHelper');
const { getTableNameStatement, commentDeactivatedStatement, getApplyDropStatement, tab } = require('./generalHelper');
const { getTableStatement, mergeValuesWithConfigOptions } = require('./tableHelper');
const { getDiff } = require('./tableOptionService/getDiff');
const { parseToString } = require('./tableOptionService/parseToString');
const { dependencies } = require('./appDependencies');
const { getKeySpaceScript } = require('./updateHelpers/keySpaceHelper');
const { mergeArrays } = require('./updateHelpers/generalHelper');
const { getViewScript } = require('./updateHelpers/viewHelper');
const { getIndexTable } = require('./updateHelpers/indexHelper');

let _;

const setDependencies = ({ lodash }) => _ = lodash;

const typesCompatibility = {
	blob: ['ascii', 'bigint', 'boolean', 'decimal', 'double', 'float', 'inet', 'int', 'timestamp', 'timeuuid', 'uuid', 'varchar', 'varint'],
	varint: ['int'],
	varchar: ['text'],
	uuid: ['timeuuid'],
	text: ['varchar']
};

const alterTablePrefix = (tableName, keySpace) => 
	keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"`;
const getUpdateType = updateTypeData => 
	`${alterTablePrefix(updateTypeData.tableName, updateTypeData.keySpace)} 
	ALTER "${updateTypeData.columnData.name}" TYPE ${updateTypeData.columnData.type};`;
const removeColumnStatement = columnName => `DROP "${columnName}";`;
const addColumnStatement = columnData => `ADD "${columnData.name}" ${columnData.type};\n`;
const renameColumnStatement = columnData => `RENAME "${columnData.oldName}" TO "${columnData.newName}"`;
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
const getAdd = addData => {
	const script = `${alterTablePrefix(addData.tableName, addData.keyspaceName)} ${addColumnStatement(addData.columnData)}`;
	return [{
		deleted: false,
		modified: false,
		added: true,
		script,
		field: 'field',
	}];
};
const getRenameColumn = renameData => {
	const script = 
	`${alterTablePrefix(renameData.tableName, renameData.keyspaceName)} ${renameColumnStatement(renameData.columnData)};`;
	return [{
		added: false,
		deleted: false,
		modified: true,
		script,
		field: 'field',
	}];
};
const objectContainsProp = (object, key) => object[key] ? true : false;

const isCommentNew = comment => comment && comment.new !== comment.old;
const getChangeOption = changeData => {
	const optionsDiff = getDiff(changeData.options.new, changeData.options.old);
	const configOptionsWithValues = mergeValuesWithConfigOptions(optionsDiff);
	return isCommentNew(changeData.comment)
		? parseToString(configOptionsWithValues, changeData.comment.new)
		: parseToString(configOptionsWithValues);
};
const getAlterTypePrefix = (keySpaceName) => `ALTER TYPE "${keySpaceName}"`;
const getAddToUDT = (addToUDTData) => {
	let alterScript = '';

	alterScript += Object.keys(addToUDTData.keySpaces).reduce((script, keySpaceName) => {
		return script += `${getAlterTypePrefix(keySpaceName)}."${addToUDTData.udtName}" ADD "${addToUDTData.name}" ${addToUDTData.type};\n`;
	}, '');

	return alterScript;
}
const getCreateTypePrefix = (createData) => `CREATE TYPE IF NOT EXISTS "${createData.keySpaceName}".${createData.UDTName} (\n`;
const getDropUDT = (dropUDTData) => `DROP TYPE "${dropUDTData.keySpaceName}"."${dropUDTData.typeName}";`;
const getRenameType = (renameData) => 
	`${getAlterTypePrefix(renameData.keySpaceName)}."${renameData.udtName}" 
	RENAME "${renameData.oldFieldName}" TO "${renameData.newFieldName}";`;

const DEFAULT_KEY_SPACE = { 'Default_Keyspace': 'Default_Keyspace' };

const getCollectionName = compMod => {
	const { collectionName = {}, code = {} } = compMod;
	return {
		oldName: code.old || collectionName.old,
		newName: code.new || collectionName.new,
	}
}

const getUpdate = updateData => {
	const property = updateData.property;
	const oldName = _.get(property, 'compMod.oldField.name');
	const newName = _.get(property, 'compMod.newField.name');
	const getData = columnData => ({ ...updateData, columnData: { ...updateData.columnData, ...columnData }});
	if (!oldName || !newName) {
		return '';
	}
	if (!property.primaryKey) {
		const deletePropertyScript = getDelete(getData({ name: oldName }));
		const addPropertyScript = getAdd(getData({ name: newName }));
		return [...deletePropertyScript, ...addPropertyScript];;
	}
	return getRenameColumn(getData({ oldName, newName })); 
};

const getDeleteTable = deleteData => { 
	const tableStatement = getTableNameStatement(deleteData.keyspaceName, deleteData.tableName);
	const script = `DROP TABLE ${tableStatement}`;
	return [{
		modified: false,
		added: false,
		deleted: true,
		script,
		table: 'table',
	}];
};

const getIsChangeTable = compMod => {
	const tableProperties = ['name', 'isActivated'];
	return tableProperties.some(property => !_.isEqual(compMod[property]?.new, compMod[property]?.old));
}

const getPropertiesForUpdateTable = properties => {
	const newProperties = Object.entries(properties).map(([name, value]) => {
		if (!value.compMod) {
			return [name, value];
		}
		const newField = value.compMod?.newField || {};
		const oldField = value.compMod?.oldField || {};
		Object.entries(newField).map(([keyNewField, valueNewField]) => {
			if (oldField[keyNewField] !== valueNewField) {
				value[keyNewField] = valueNewField;
			}
			if (keyNewField === 'name' && oldField[keyNewField] !== valueNewField) {
				name = valueNewField;
			}
		})
		return [name, value];
	})
	return Object.fromEntries(newProperties);
} 

const getUpdateTable = updateData => {
	const { item, propertiesScript = [] } = updateData;
	const { oldName, newName } = getCollectionName(item.role?.compMod);

	const indexTableScript = getIndexTable(item, updateData.data);

	const isChangeTable = getIsChangeTable({ ...item.role?.compMod, name: { new: newName, old: oldName } } || {});

	if (!isChangeTable) {
		const tableName = updateData.tableName || oldName || newName;
		const optionScript = getOptionsScript(item.role?.compMod || {}, tableName, updateData.isOptionScript);
		return [
			{
				added: false,
				deleted: false,
				modified: true,
				script: optionScript,
				table: 'table',
			},
			...indexTableScript,
			...propertiesScript
		];
	}
		
	if (!oldName || !newName) {
		return '';
	}

	const data = { 
		keyspaceName: updateData.keyspaceName,
		data: updateData.data,
		item: {
			...item,
			properties: getPropertiesForUpdateTable(item.role?.properties || item.properties),
		},
		isKeyspaceActivated: true,
	};
	const deleteScript = getDeleteTable({ ...data, tableName: oldName });
	const addScript = getAddTable({ ...data, tableName: newName});
	return [...deleteScript, ...addScript, ...indexTableScript];
}

const getOptionsScript = (compMod, tableName, isGetOptionScript) => {
	if (!isGetOptionScript || !compMod || !compMod.tableOptions) {
		return;
	}
	
	const script = getChangeOption({
		keySpace: compMod.keyspaceName,
		tableName: tableName,
		options: compMod.tableOptions,
		comment: compMod.comments
	});

	return script ? `${alterTablePrefix(tableName, compMod.keyspaceName)}${tab(script)};` : '';
}

const handleChange = (child, udtMap, generator, data) => {
	let alterTableScript = [];

	if (objectContainsProp(child, 'items') && child.items.length) {
		const alterScript = child.items.reduce((result, current) => {
			return result.concat(handleItem(current, udtMap, generator, data));
		}, []);
		alterTableScript = alterTableScript.concat(alterScript);
	} else if (objectContainsProp(child, 'items')) {
		alterTableScript = alterTableScript.concat(handleItem(child.items, udtMap, generator, data));
	}

	return alterTableScript;
}

const checkIsOldModel = (modelData) => {
	const modelVersion = modelData.filter(element => {
		return element.dbVersion;
	})[0].dbVersion;
	const majorDigitIndex = modelVersion.search(/\d/);

	if (majorDigitIndex !== -1) {
		const majorDigit = modelVersion[majorDigitIndex];
		return majorDigit < 3;
	}
}

const handleItem = (item, udtMap, generator, data) => {
	let alterTableScript = [];

	if (!objectContainsProp(item, 'properties')) {
			return alterTableScript;
	}

	const isOldModel = checkIsOldModel(_.get(data, 'modelData'));
	const itemProperties = item.properties;

	alterTableScript = Object.keys(itemProperties)
		.reduce((alterTableScript, tableKey) => {
			const itemCompModData = itemProperties[tableKey].role.compMod;
			const codeName = _.get(itemProperties, `${tableKey}.role.code`, '');
			const tableName = codeName.length ? codeName : tableKey;

			if (!itemCompModData) {
				return alterTableScript;
			}

			const tableProperties = itemProperties[tableKey].properties || {};

			const keyspaceName = itemCompModData.keyspaceName;

			if (itemCompModData.deleted) {
				const deletedIndexScript = getIndexTable(itemProperties[tableKey], data);
				return [ 
					...alterTableScript, 
					...getDeleteTable({
						keyspaceName,
						tableName
					}),
					...deletedIndexScript,
				];
			}

			if (itemCompModData.created) {
				const addedIndexScript = getIndexTable(itemProperties[tableKey], data);
				return [ 
					...alterTableScript, 
					...getAddTable({
						item: itemProperties[tableKey], 
						keyspaceName, 
						data, 
						tableName,
					}),
					...addedIndexScript,
				];
			}

			if (itemCompModData.modified) {
				const updateTableScript = getUpdateTable({ keyspaceName, data, item: itemProperties[tableKey], isOptionScript: true, tableName });

				return [...alterTableScript, ...updateTableScript];
			}

			const propertiesScript = handleProperties({ 
				generator,
				tableProperties, 
				udtMap, 
				itemCompModData, 
				tableName, 
				isOldModel,
				data,
			});

			const updateTableScript = getUpdateTable({ 
				item: itemProperties[tableKey], 
				isOptionScript: generator.name === 'getUpdate',
				propertiesScript,
				keyspaceName,
				tableName,
				data,
			})

			return [...alterTableScript, ...updateTableScript];
		}, []);

	return alterTableScript;
}

const getAddTable = (addTableData) => {
	const table = addTableData.item;
	const data = addTableData.data;
	const tableProperties = table.properties || {};
	let partitionKeys = [];
	let clusteringKeys = [];
	if (tableProperties) {
		partitionKeys = Object.keys(tableProperties).map(key => {
			if (tableProperties[key].compositePartitionKey) {
				return { keyId: tableProperties[key].GUID };
			}
			return;
		}).filter(item => item);

		clusteringKeys = Object.keys(tableProperties).map(key => {
			if (tableProperties[key].compositeClusteringKey) {
				return { keyId: tableProperties[key].GUID };
			}
			return;
		}).filter(item => item);
}

	const entityData = [{
		collectionName: addTableData.tableName,
		compositePartitionKey: [...partitionKeys],
		compositeClusteringKey: [...clusteringKeys],
		tableOptions: table.role.tableOptions || '',
		comments: table.role.comments || '',
		isActivated: table.role.isActivated,
	}];

	const dataSources = [
		data.externalDefinitions,
		data.modelDefinitions,
		data.internalDefinitions,
		table
	];

	const script = getTableStatement({
		tableData: table,
		tableMetaData: entityData,
		keyspaceMetaData: [{ name: addTableData.keyspaceName }],
		dataSources,
		udtTypeMap: {},
		isKeyspaceActivated: addTableData.isKeyspaceActivated,
	});

	return [{
		deleted: false,
		modified: false,
		added: true,
		script,
		table: 'table',
	}];
}

const fieldTypeCompatible = (oldType, newType) => {
	const compatibility = typesCompatibility[newType];

	if (!compatibility) {
		return false;
	}

	const foundCapabilityType = compatibility.filter(type => {
		return type === oldType;
	});

	if (!foundCapabilityType) {
		return false;
	}

	return true
}

const handleAlterTypeForOldModel = ({ property, udtMap, tableName, keyspaceName, columnName }) => {
	const { oldField, newField } = property?.compMod || {};
	if (!oldField && !newField) {
		return;
	}

	const oldFieldCassandraType = getTypeByData(oldField, udtMap);
	const newFieldCassandraType = getTypeByData(newField, udtMap);

	if (!oldFieldCassandraType || !newFieldCassandraType || oldFieldCassandraType === newFieldCassandraType) {
		return;
	}

	const isFieldFieldTypeCompatible = fieldTypeCompatible(oldFieldCassandraType, newFieldCassandraType);

	if (!isFieldFieldTypeCompatible) {
		return;
	}

	const innerScript = getUpdateType({
		keySpace: keyspaceName,
		tableName: tableName,
		columnData: {
			name: columnName,
			type: newFieldCassandraType
		}
	});

	return {
		script: innerScript,
		added: false,
		deleted: false,
		modified: true,
		keySpaces: keyspaceName,
		name: tableName,
		columnName: columnName
	};
}

const handleProperties = ({ generator, tableProperties, udtMap, itemCompModData, tableName, isOldModel, data }) => {
	return Object.keys(tableProperties)
		.reduce((alterTableScript, columnName) => {
			const property = tableProperties[columnName];
			if (generator.name !== 'getUpdate' && (property.compositePartitionKey || property.compositeClusteringKey)) {
				return alterTableScript;
			}
			const columnType = getTypeByData(property, udtMap, columnName);
			
			if (property.$ref && !columnType) {
				columnType = _.last(property.$ref.split('/'));
			}

			if (!columnType) {
				return alterTableScript;
			}

			const keyspaceName = itemCompModData?.keyspaceName;

			if (isOldModel) {
				alterTableScript = alterTableScript.concat(handleAlterTypeForOldModel({ property, udtMap, tableName, keyspaceName, columnName }) || []);
			}

			if (generator.name === 'getUpdate' && !property.compMod) {
				return alterTableScript;
			}

			return [
				...alterTableScript,
				...generator({
					keyspaceName,
					tableName,
					columnData: {
						name: columnName,
						type: columnType
					},
					property,
				})
			];
		}, []);
}

const getAlterAddUdtScript = (child, udtMap, data) => {
	let alterTableScript = [];

	if (!child.items) {
		return alterTableScript;
	}

	const items = child.items;

	const itemProps = items.properties;

	if (Array.isArray(items) && items.length) {
		items.forEach(item => {
			const itemKey = Object.keys(item.properties)[0];
			const prop = item.properties[itemKey];
			const propertiesCopy = Object.assign({}, prop.properties);
			if (prop.compMod && prop.compMod.created) {
				const keySpaces = prop.role.compMod.bucketsWithCurrentDefinition || DEFAULT_KEY_SPACE;

				const innerCreateTypes = Object.keys(propertiesCopy).reduce((alterScript, currentPropKey) => {
					if (propertiesCopy[currentPropKey].$ref) {
						return alterScript;
					}

					alterScript += ` "${currentPropKey}" ${getTypeByData(propertiesCopy[currentPropKey], udtMap)} \n`;

					return alterScript;
				}, '');

				alterTableScript = mergeArrays(alterTableScript, Object.keys(keySpaces).reduce((scripts, currentKeyspace) => {
					let innerScript = getCreateTypePrefix({ keySpaceName: currentKeyspace, UDTName: itemKey });
					innerScript += innerCreateTypes;
					innerScript += ');';

					return scripts.concat([
						{
							script: innerScript,
							added: true,
							deleted: false,
							modified: false,
							keySpaces: currentKeyspace,
							udtName: itemKey
						}]);
				}, []));
			} else {
				alterTableScript = mergeArrays(alterTableScript, Object.keys(propertiesCopy).reduce((alterScript, currentPropKey) => {
					const currentProp = propertiesCopy[currentPropKey];

					if (currentProp.$ref) {
						const innerScript = getAddToUDT(
							{
								keySpaces: prop.role.compMod.bucketsWithCurrentDefinition,
								name: currentPropKey,
								type: `frozen<${currentPropKey}>`,
								udtName: itemKey
							}
						);

						return alterScript.concat([
							{
								script: innerScript,
								added: true,
								deleted: false,
								modified: false,
								keySpaces: prop.role.compMod.bucketsWithCurrentDefinition,
								name: currentPropKey,
								udtName: itemKey
							}
						]);
					} else {
						const innerScript = getAddToUDT(
							{
								keySpaces: prop.role.compMod.bucketsWithCurrentDefinition,
								name: currentPropKey,
								type: getTypeByData(currentProp, udtMap),
								udtName: itemKey
							}
						);

						return alterScript.concat([{
							script: innerScript,
							added: true,
							deleted: false,
							modified: false,
							keySpaces: prop.role.compMod.bucketsWithCurrentDefinition,
							name: currentPropKey,
							udtName: itemKey
						}]);
					}

				}, []));
			}
		});
	} else {
		const itemKey = Object.keys(itemProps)[0];
		const item = items.properties[itemKey];

		if (!item.properties) {
			return alterTableScript;
		}

		alterTableScript = Object.keys(item.properties).reduce((alterScript, currentPropKey) => {
			const currentProp = item.properties[currentPropKey];
			const innerScript = getAddToUDT({
				keySpaces: item.role.compMod.bucketsWithCurrentDefinition,
				name: currentPropKey,
				type: getTypeByData(currentProp, udtMap),
				udtName: itemKey
			});

			return alterScript.concat([{
				script: innerScript,
				added: true,
				deleted: false,
				modified: false,
				keySpaces: item.role.compMod.bucketsWithCurrentDefinition,
				name: currentPropKey,
				udtName: itemKey
			}]);
		}, []);
	}

		return alterTableScript;
}

const getAlterDropUdtScript = (child, udtMap, data) => {
	const items = child.items;
	let alterTableScript = '';

	if (!items) {
		return alterTableScript;
	}

	if (_.isArray(items)) {
		alterScript = items.reduce((alterScript, item) => {
			const properties = item.properties;

			if (!properties) {
				return alterScript;
			}

			alterScript += Object.keys(properties).reduce((script, propKey) => {

				if (!properties[propKey].compMod || !properties[propKey].compMod.deleted) {
					return script;
				}

				const bucketsWithCurrentDefinition = properties[propKey].compMod.bucketsWithCurrentDefinition;

				script += Object.keys(bucketsWithCurrentDefinition)
					.reduce((dropScript, bucket) => {
						const tablesInKeyspace = bucketsWithCurrentDefinition[bucket];

						dropScript += tablesInKeyspace.map(table => {
							return getDelete({
								keySpace: bucket,
								tableName: table.collectionName,
								columnData: {
									name: propKey
								}
							});
						});

						return dropScript;
					}, '');


				script += Object.keys(bucketsWithCurrentDefinition)
					.reduce((dropTypeScript, bucket) => {
						dropTypeScript += getDropUDT({
							keySpaceName: bucket,
							typeName: propKey
						});


						return dropTypeScript;
					}, '');

				return script;
			}, '');

			return alterScript;
		}, '');
	}

	return alterTableScript;
}

const getAlterModifyUDTScript = (child, udtMap, data) => {
	const childItems = _.get(child, 'items');

	if (!childItems) {
		return [];
	}

	const getAlterScript = (item) => {
		const itemProperties = _.get(item, 'properties', []);
		return Object.keys(itemProperties).reduce((resultScript, udtKey) => {
			const fieldsInUDT = itemProperties[udtKey].properties;
			const bucketsWithCurrentDefinition = itemProperties[udtKey].role.compMod.bucketsWithCurrentDefinition || {};

			if (!fieldsInUDT) {
				return resultScript;
			}

			return mergeArrays(resultScript, Object.keys(fieldsInUDT).reduce((alterNameScript, fieldKey) => {
				const itemOldName = _.get(fieldsInUDT[fieldKey], 'compMod.oldField.name');
				const itemNewName = _.get(fieldsInUDT[fieldKey], 'compMod.newField.name');
				const compMod = _.get(fieldsInUDT[fieldKey], 'compMod');
				const { oldField, newField } = compMod;

				const oldFieldCassandraType = getTypeByData(oldField, {}, 'newField');
				const newFieldCassandraType = getTypeByData(newField, {}, 'oldField');
				const isOldModel = checkIsOldModel(_.get(data, 'modelData'));

				return mergeArrays(alterNameScript, Object.keys(bucketsWithCurrentDefinition).reduce((script, bucketName) => {
					if (newFieldCassandraType && oldFieldCassandraType && newFieldCassandraType !== oldFieldCassandraType) {
						if (isOldModel && fieldTypeCompatible(oldFieldCassandraType, newFieldCassandraType)) {
							const bucket = bucketsWithCurrentDefinition[bucketName];

							script = script.concat(bucket.reduce((alterTypeScript, tableData) => {
								const newTypeScript = getUpdateType({
									keySpace: bucketName,
									tableName: tableData.code || tableData.collectionName,
									columnData: {
										name: fieldKey,
										type: newFieldCassandraType
									}
								});

								return alterTypeScript.concat({
									script: newTypeScript,
									added: false,
									deleted: false,
									modified: true,
									udtName: udtKey,
								});
							}, []));
						}
					}

					if (itemNewName && itemOldName && itemOldName !== itemNewName) {
						const renameScript = getRenameType({
							keySpaceName: bucketName,
							udtName: udtKey,
							oldFieldName: itemOldName,
							newFieldName: itemNewName
						})
						script = script.concat({
							script: renameScript,
							added: false,
							deleted: false,
							modified: true,
							udtName: udtKey,
						})
					}
					return script;
				}, []));
			}, []));
		}, []);
	};

	let alterScript;

	if (_.isArray(childItems)) {
		alterScript = childItems.reduce((alterScript, childItem) => mergeArrays(alterScript, getAlterScript(childItem)), []);
	} else {
		alterScript = getAlterScript(childItems);
	}

	return alterScript;
}

const columns = {
	views: getViewScript,
	containers: getKeySpaceScript,
}

const generateScript = (child, udtMap, data, column, mode) => {
	const getScript = columns[column];

	if (Array.isArray(child) && child.length) {
		return child.reduce((scriptsData, item) => 
			([...scriptsData, 
				...getScript({ child: item.properties[Object.keys(item.properties)[0]], udtMap, data, mode })]), 
			[]);
	}
	const properties = child.properties;
	const itemKey = Object.keys(properties)[0];
	const item = properties[itemKey];

	return getScript({ child: item, udtMap, data, mode });
}

const getScript = (child, udtMap, data, column, mode) => {
	let alterScript = [];

	if (objectContainsProp(child, 'properties')) {
		alterScript = mergeArrays(alterScript, getScript(child.properties, udtMap, data, column));
	}

	if (objectContainsProp(child, 'modified')) {
		alterScript = mergeArrays(alterScript, getScript(child.modified, udtMap, data, column,'update'))
	}

	if (objectContainsProp(child, 'added')) {
		alterScript = mergeArrays(alterScript, getScript(child.added, udtMap, data, column,'add'));
	}

	if (objectContainsProp(child, 'deleted')) {
		alterScript = mergeArrays(alterScript, getScript(child.deleted, udtMap, data, column,'delete'));
	}

	if (objectContainsProp(child, 'items')) {
		alterScript = mergeArrays(alterScript, generateScript(child.items, udtMap, data, column, mode));
	}

	return alterScript;
}

const getAlterUdtScript = (child, udtMap, data) => {
	let alterScript = [];

	if (objectContainsProp(child, 'properties')) {
		alterScript = mergeArrays(alterScript, getAlterUdtScript(child.properties, udtMap, data));
	}

	if (objectContainsProp(child, 'added')) {
		alterScript = mergeArrays(alterScript, getAlterAddUdtScript(child.added, udtMap, data));
	}

	if (objectContainsProp(child, 'deleted')) {
		alterScript = mergeArrays(alterScript, getAlterDropUdtScript(child.deleted, udtMap, data));
	}

	if (objectContainsProp(child, 'modified')) {
		alterScript = mergeArrays(alterScript, getAlterModifyUDTScript(child.modified, udtMap, data));
	}

	if (objectContainsProp(child, 'items')) {
		alterScript = mergeArrays(alterScript, generateAlterKeyspaceScript(child.items, udtMap, data));
	}

	return alterScript;
}

const getAlterTableScript = (child, udtMap, data) => {
	let alterScript = [];

	if (objectContainsProp(child, 'properties')) {
		alterScript = mergeArrays(alterScript, getAlterTableScript(child.properties, udtMap, data));
	}

	if (objectContainsProp(child, 'items')) {
		alterScript = mergeArrays(alterScript, getAlterTableScript(child.items, udtMap, data));
	}

	if (objectContainsProp(child, 'entities')) {
		alterScript = mergeArrays(alterScript, getAlterTableScript(child.entities, udtMap, data));
	}

	if (objectContainsProp(child, 'views')) {
		alterScript = mergeArrays(alterScript, getScript(child.views, udtMap, data, 'views'));
	}

	if (objectContainsProp(child, 'containers')) {
		alterScript = mergeArrays(alterScript, getScript(child.containers, udtMap, data, 'containers'));
	}

	if (objectContainsProp(child, 'modelDefinitions')) {
		alterScript = mergeArrays(alterScript, getAlterUdtScript(child.modelDefinitions, udtMap, data));
	}

	if (objectContainsProp(child, 'added')) {
		alterScript = mergeArrays(alterScript, handleChange(child.added, udtMap, getAdd, data));
	}

	if (objectContainsProp(child, 'modified')) {
		alterScript = mergeArrays(alterScript, handleChange(child.modified, udtMap, getUpdate, data));
	}

	if (objectContainsProp(child, 'deleted')) {
		alterScript = mergeArrays(alterScript, handleChange(child.deleted, udtMap, getDelete, data));
	}

	return alterScript;
}

const getAlterScript = (child, udtMap, data) => {
	setDependencies(dependencies);
	let scriptData = getAlterTableScript(child, udtMap, data);
	scriptData = getCommentedDropScript(scriptData, data);
	scriptData = sortScript(scriptData);
	return scriptData.filter(Boolean).join('\n\n');
}

const getCommentedDropScript = (scriptsData, data) => {
	const applyDropStatements = getApplyDropStatement(data);
	if (applyDropStatements) {
		return scriptsData;
	}
	return scriptsData.map((scriptData = {}) => {
		if (!scriptData.deleted || !scriptData.script) {
			return scriptData;
		}
		return {
			...scriptData,
			script: commentDeactivatedStatement(scriptData.script, false),
		};
	})
}

const sortScript = (scriptData) => {
	const filterProp = (key, prop, script = {}) => script[key] && script[prop];
	const filter = (key, scriptData, keyProp) => {
		return scriptData.reduce((scripts, currentScript) => {
			if (filterProp(key, keyProp, currentScript)) {
				scripts.scripts.push(currentScript);
				return scripts;
			}

			scripts.filteredScripts.push(currentScript);

			return scripts;
		}, { scripts: [], filteredScripts: [] });
	}

	let sortedScripts = [];

	const { scripts: createKeyspacesScripts, filteredScripts: scriptsWithoutCreateKeyspace } = filter('added', scriptData, 'keySpaces');
	const { scripts: deleteKeyspaceScripts, filteredScripts: scriptsWithoutDropKeyspace } = filter('deleted', scriptsWithoutCreateKeyspace, 'keySpaces');
	const { scripts: modifyKeyspacesScripts, filteredScripts: scriptsWithoutModifyKeyspace } = filter('modified', scriptsWithoutDropKeyspace, 'keySpaces');
	const { scripts: createTablesScripts, filteredScripts: scriptsWithoutCreateTable } = filter('added', scriptsWithoutModifyKeyspace, 'table');
	const { scripts: deleteTablesScripts, filteredScripts: scriptsWithoutDropTable } = filter('deleted', scriptsWithoutCreateTable, 'table');
	const { scripts: modifyTablesScripts, filteredScripts: scriptsWithoutModifyTable } = filter('modified', scriptsWithoutDropTable, 'table');
	const { scripts: createIndexesScripts, filteredScripts: scriptsWithoutCreateIndexes } = filter('added', scriptsWithoutModifyTable, 'index');
	const { scripts: deleteIndexesScripts, filteredScripts: scriptsWithoutDropIndexes } = filter('deleted', scriptsWithoutCreateIndexes, 'index');
	const { scripts: modifyIndexesScripts, filteredScripts: scriptsWithoutModifyIndexes } = filter('modified', scriptsWithoutDropIndexes, 'index');
	const { scripts: createViewsScripts, filteredScripts: scriptsWithoutCreateViews } = filter('added', scriptsWithoutModifyIndexes, 'viewName');
	const { scripts: deleteViewsScripts, filteredScripts: scriptsWithoutDeleteViews } = filter('deleted', scriptsWithoutCreateViews, 'viewName');
	const { scripts: modifyViewsScripts, filteredScripts: scriptsWithoutModifyViews } = filter('modified', scriptsWithoutDeleteViews, 'viewName');
	const { scripts: createFieldsScripts, filteredScripts: scriptsWithoutCreateField } = filter('added', scriptsWithoutModifyViews, 'field');    
	const { scripts: deleteFieldsScripts, filteredScripts: scriptsWithoutDeleteField } = filter('deleted', scriptsWithoutCreateField, 'field');
	const { scripts: modifyFieldsScripts, filteredScripts: scriptsWithoutModifyField } = filter('modified', scriptsWithoutDeleteField, 'field');
	const { scripts: createUdtScripts, filteredScripts: scriptsWithoutCreateUdt } = filter('added', scriptsWithoutModifyField, 'udtName');
	const { scripts: deleteUdtScripts, filteredScripts: scriptsWithoutDeleteUdt } = filter('deleted', scriptsWithoutCreateUdt, 'udtName');
	const { scripts: modifyUdtScripts, filteredScripts: scriptsWithoutModifyUdt } = filter('modified', scriptsWithoutDeleteUdt, 'udtName');

	return sortedScripts.concat(
		createKeyspacesScripts,
		createUdtScripts,
		createTablesScripts,
		modifyKeyspacesScripts,
		modifyUdtScripts,
		modifyTablesScripts,
		deleteIndexesScripts,
		modifyIndexesScripts,
		deleteViewsScripts,
		modifyViewsScripts,
		deleteFieldsScripts,
		createFieldsScripts,
		modifyFieldsScripts,
		createIndexesScripts,
		createViewsScripts,
		deleteUdtScripts,
		deleteTablesScripts,
		deleteKeyspaceScripts,
		scriptsWithoutModifyUdt).map(data => data.script);
}

module.exports = {
	getAlterScript
};
