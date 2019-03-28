const { getTypeByData } = require('./typeHelper');
const { getReplication, getDurableWrites } = require('./keyspaceHelper');
const { tab, retrivePropertyFromConfig } = require('./generalHelper');
const { getTableStatement } = require('./tableHelper');
const _ = require('lodash');

const typesCompatibility = {
    blob: ['ascii', 'bigint', 'boolean', 'decimal', 'double', 'float', 'inet', 'int', 'timestamp', 'timeuuid', 'uuid', 'varchar', 'varint'],
    varint: ['int'],
    varchar: ['text'],
    uuid: ['timeuuid'],
    text: ['varchar']
};
const alterTablePrefix = (tableName, keySpace) => { return keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"` };
const alterKeyspacePrefix = keyspaceName => `ALTER KEYSPACE "${keyspaceName}" \n`;
const remove = columnName => `DROP "${columnName}";\n`;
const getUpdateType = updateTypeData => `${alterTablePrefix(updateTypeData.tableName, updateTypeData.keySpace)} ALTER "${updateTypeData.columnData.name}" TYPE ${updateTypeData.columnData.type};\n`;
const add = columnData => `ADD "${columnData.name}" ${columnData.type};\n`;
const getDelete = deleteData => `${alterTablePrefix(deleteData.tableName, deleteData.keySpace)} ${remove(deleteData.columnData.name)}`;
const getAdd = addData => `${alterTablePrefix(addData.tableName, addData.keySpace)} ${add(addData.columnData)}`;
const getUpdate = updateData => getDelete(updateData) + getAdd(updateData);
const objectContainsProp = (object, key) => object[key] ? true : false;
const getAnd = data => ` AND ${data.key} = '${data.value}'`;
const getDeleteTable = deleteData => { return deleteData.keySpace ? `DROP TABLE "${deleteData.keySpace}"."${deleteData.tableName}";\n\n` : `DROP TABLE "${deleteData.tableName}";\n\n` };
const getChangeOption = changeData => {
    const newOptions = getComparedOptions(changeData.options.new.split("\nAND "), changeData.options.old.split("\nAND "));
    let alterTableScript = '';

    if (changeData.comment && changeData.comment.new !== changeData.comment.old) {
        alterTableScript += `${alterTablePrefix(changeData.tableName, changeData.keySpace)} WITH comment = '${changeData.comment ? changeData.comment.new : changeData.comment.old}'`;
    } else if (newOptions.length) {
        alterTableScript += `${alterTablePrefix(changeData.tableName, changeData.keySpace)} WITH ${firstKey} = '${firstValue}'`;
    } else {
        return alterTableScript;
    }

    if (!newOptions.length) {
        return alterTableScript += ';\n\n';
    }

    alterTableScript += '\n' + newOptions.map((element) => {
        const key = Object.keys(element)[0];
        const value = element[key];
        return getAnd({ key, value });
    }).join('\n');

    return alterTableScript += ';\n\n';
};
const getAddKeyspacePrefix = (keySpaceName) => `CREATE KEYSPACE IF NOT EXISTS "${keySpaceName}" \n`;
const getDropKeyspace = (keySpaceName) => `DROP KEYSPACE "${keySpaceName}"`;
const getAlterTypePrefix = (keySpaceName) => `ALTER TYPE "${keySpaceName}"`;
const getAddToUDT = (addToUDTData) => {
    let alterScript = '';

    alterScript += Object.keys(addToUDTData.keySpaces).reduce((script, keySpaceName) => {
        return script += `${getAlterTypePrefix(keySpaceName)}."${addToUDTData.udtName}" ADD "${addToUDTData.name}" ${addToUDTData.type};\n`;
    }, '');

    return alterScript += '\n';
}
const getCreateTypePrefix = (createData) => `CREATE TYPE IF NOT EXISTS "${createData.keySpaceName}".${createData.UDTName} (\n`;
const getDropUDT = (dropUDTData) => `DROP TYPE "${dropUDTData.keySpaceName}"."${dropUDTData.typeName}";\n`;
const getRenameType = (renameData) => `${getAlterTypePrefix(renameData.keySpaceName)}."${renameData.udtName}" RENAME "${renameData.oldFieldName}" TO "${renameData.newFieldName}";\n`;
const DEFAULT_KEYSPACE = 'Default_Keyspace';
const getComparedOptions = (newOptions, oldOptions) => {
    const newOptionsDIf = newOptions.filter(newOption => {
        const inOld = oldOptions.filter((oldOption) => {
            return (newOption === oldOption);
        });

        return inOld.length ? false : true;
    });

    return newOptionsDIf.map((option) => {

        const key = option.split(' = ')[0];
        const value = option.split(' = ')[1];

        return ({ [key]: value });
    });
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

const handleOptions = (generator, itemCompModData, tableName) => {
    let alterTableScript = '';

    if (generator.name !== 'getUpdate' || !itemCompModData) {
        return alterTableScript;
    }

    if (itemCompModData.tableOptions) {
        alterTableScript += getChangeOption({
            keySpace: itemCompModData.keyspaceName,
            tableName: tableName,
            options: itemCompModData.tableOptions,
            comment: itemCompModData.comments
        });
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

            const tableProperties = item.properties[tableKey].properties;

            let keyspaceName;

            if (itemCompModData.keyspaceName) {
                keyspaceName = itemCompModData.keyspaceName;
            };

            if (itemCompModData.deleted) {
                const innerScript = getDeleteTable({
                    keySpace: keyspaceName,
                    tableName
                });

                alterTableScript = alterTableScript.concat([{
                    script: innerScript,
                    added: false,
                    deleted: true,
                    modified: false,
                    keySpaces: keyspaceName,
                    name: tableName
                }]);
                return alterTableScript;
            }

            if (itemCompModData.created) {
                const innerScript = handleCreate(itemProperties[tableKey], keyspaceName, data, tableName);
                alterTableScript = alterTableScript.concat([{
                    script: innerScript,
                    added: true,
                    deleted: false,
                    modified: false,
                    keySpaces: keyspaceName,
                    name: tableName
                }]);

                return alterTableScript;
            }

            const option = handleOptions(generator, itemCompModData, tableName);

            if (option) {
                alterTableScript = alterTableScript.concat([{
                    script: option,
                    added: false,
                    deleted: false,
                    modified: true,
                    name: tableName
                }]);
            }

            alterTableScript = alterTableScript.concat(handleProperties({ generator, tableProperties, udtMap, itemCompModData, tableName, isOldModel }));

            return alterTableScript;
        }, []);

    return alterTableScript;
}

const handleCreate = (table, keyspaceName, data, tableName) => {
    const tableProperties = table.properties;
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
        collectionName: tableName,
        compositePartitionKey: [...partitionKeys],
        compositeClusteringKey: [...clusteringKeys],
        tableOptions: table.role.tableOptions || '',
        comments: table.role.comments || ''
    }];

    const dataSources = [
        data.externalDefinitions,
        data.modelDefinitions,
        data.internalDefinitions,
        table
    ];

    return getTableStatement({
        tableData: table,
        tableMetaData: entityData,
        keyspaceMetaData: [{ name: keyspaceName }],
        dataSources,
        udtTypeMap: {}
    }) + '\n\n';
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

const handleAlterTypeForOldModel = ({ tableProperties, udtMap, tableName }) => {
    const oldFielType = _.get(tableProperties[columnName], 'compMod.oldField.properties');
    const newFieldType = _.get(tableProperties[columnName], 'compMod.newField.properties');
    if (oldFielType && newFieldType) {
        const oldFieldCassandraType = getTypeByData(tableProperties[columnName].compMod.oldField.properties, udtMap, 'oldField');
        const newFieldCassandraType = getTypeByData(tableProperties[columnName].compMod.newField.properties, udtMap, 'newField');

        if (fieldTypeCompatible(oldFieldCassandraType, newFieldCassandraType)) {
            columnType = newFieldCassandraType;

            const innerScript = getUpdateType({
                keySpace: keyspaceName,
                tableName: tableName,
                columnData: {
                    name: columnName,
                    type: columnType
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
    }
}

const handleProperties = ({ generator, tableProperties, udtMap, itemCompModData, tableName, isOldModel }) => {
    return Object.keys(tableProperties)
        .reduce((alterTableScript, columnName) => {
            if (tableProperties[columnName].compositePartitionKey || tableProperties[columnName].compositeClusteringKey) {
                return alterTableScript;
            }
            let columnType = getTypeByData(tableProperties[columnName], udtMap, columnName);
            
            if (tableProperties[columnName].$ref && !columnType) {
                columnType = _.last(tableProperties[columnName].$ref.split('/'));
            }

            if (!columnType) {
                return alterTableScript;
            }

            let keyspaceName;

            if (itemCompModData && itemCompModData.keyspaceName) {
                keyspaceName = itemCompModData.keyspaceName;
            };

            if (isOldModel) {
                alterTableScript = alterTableScript.concat([handleAlterTypeForOldModel({ tableProperties, udtMap, tableName })]);
            }

            const innerScript = generator({
                keySpace: keyspaceName,
                tableName: tableName,
                columnData: {
                    name: columnName,
                    type: columnType
                }
            });

            alterTableScript = alterTableScript.concat([{
                script: innerScript,
                addedField: generator.name === 'getAdd',
                deletedField: generator.name === 'getDelete',
                modifiedField: generator.name === 'getUpdate',
                keySpaces: keyspaceName,
                name: tableName
            }]);

            return alterTableScript;
        }, []);
}

const getKeyspaceScript = (child, mode) => {
    const keyspaceData = [child.role];
    const keyspaceName = child.role.code || child.role.name;
    const replicationStrategyProp = retrivePropertyFromConfig(keyspaceData, 0, "replStrategy", "");
    const replicationFactorProp = retrivePropertyFromConfig(keyspaceData, 0, "replFactor", undefined);
    const dataCentersProp = retrivePropertyFromConfig(keyspaceData, 0, "dataCenters", []);
    const durableWritesProp = retrivePropertyFromConfig(keyspaceData, 0, "durableWrites", false);

    const replication = getReplication(replicationStrategyProp, replicationFactorProp, dataCentersProp);
    const durableWrites = getDurableWrites(durableWritesProp);

    if (mode === 'add') {
        let innerScript = getAddKeyspacePrefix(keyspaceName);
        innerScript += `${tab(replication)}\n${durableWrites}; \n\n`;

        return {
            script: innerScript,
            added: true,
            deleted: false,
            modified: false,
            keySpaces: keyspaceName
        };
    } else if (mode === 'delete') {
        const innerScript = `${getDropKeyspace(keyspaceName)}; \n`;

        return {
            script: innerScript,
            added: false,
            deleted: true,
            modified: false,
            keySpaces: keyspaceName
        };
    } else {
        let innerScript = alterKeyspacePrefix(keyspaceName);
        innerScript += `${tab(replication)}\n${durableWrites}; \n\n`;

        return {
            script: innerScript,
            added: false,
            deleted: false,
            modified: true,
            keySpaces: keyspaceName
        };
    }
}

const generateKeyspaceScript = (child, udtMap, mode) => {
    const properties = child.properties;
    let alterTableScript = [];

    if (Array.isArray(child) && child.length) {
        alterTableScript = mergeArrays(alterTableScript, child.map(item => {
            return getKeyspaceScript(item.properties[Object.keys(item.properties)[0]], mode);
        }));
    } else {
        const itemKey = Object.keys(properties)[0];
        const item = properties[itemKey];
        alterTableScript = alterTableScript.concat([getKeyspaceScript(item, mode)]);
    }

    return alterTableScript;
}

const getAlterKeyspaceScript = (child, udtMap, data, mode) => {
    let alterScript = [];

    if (objectContainsProp(child, 'properties')) {
        alterScript = mergeArrays(alterScript, getAlterKeyspaceScript(child.properties, udtMap, data));
    }

    if (objectContainsProp(child, 'modified')) {
        alterScript = mergeArrays(alterScript, getAlterKeyspaceScript(child.modified, udtMap, data, 'update'))
    }

    if (objectContainsProp(child, 'added')) {
        alterScript = mergeArrays(alterScript, getAlterKeyspaceScript(child.added, udtMap, data, 'add'));
    }

    if (objectContainsProp(child, 'deleted')) {
        alterScript = mergeArrays(alterScript, getAlterKeyspaceScript(child.deleted, udtMap, data, 'delete'));
    }

    if (objectContainsProp(child, 'items')) {
        alterScript = mergeArrays(alterScript, generateKeyspaceScript(child.items, udtMap, mode));
    }

    return alterScript;
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
                const keyspaces = prop.role.compMod.bucketsWithCurrentDefinition || DEFAULT_KEYSPACE;

                const innerCreateTypes = Object.keys(propertiesCopy).reduce((alterScript, currentPropKey) => {
                    if (propertiesCopy[currentPropKey].$ref) {
                        return alterScript;
                    }

                    alterScript += ` "${currentPropKey}" ${getTypeByData(propertiesCopy[currentPropKey], udtMap)} \n`;

                    return alterScript;
                }, '');

                alterTableScript = mergeArrays(alterTableScript, Object.keys(keyspaces).reduce((scripts, currentKeyspace) => {
                    let innerScript = getCreateTypePrefix({ keySpaceName: currentKeyspace, UDTName: itemKey });
                    innerScript += innerCreateTypes;
                    innerScript += ');\n';

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
    const childProperties = _.get(child, 'items.properties');
    if (!childProperties) {
        return '';
    }

    return Object.keys(childProperties).reduce((resultScript, udtKey) => {
        const fieldsInUDT = childProperties[udtKey].properties;
        const bucketsWithCurrentDefinition = childProperties[udtKey].role.compMod.bucketsWithCurrentDefinition;

        if (!fieldsInUDT) {
            return resultScript;
        }

        resultScript += Object.keys(fieldsInUDT).reduce((alterNameScript, fieldKey) => {
            const itemOldName = _.get(fieldsInUDT[fieldKey], 'compMod.oldField.name');
            const itemNewName = _.get(fieldsInUDT[fieldKey], 'compMod.newField.name');
            const compMod = _.get(fieldsInUDT[fieldKey], 'compMod');
            const { oldField, newField } = compMod;

            const oldFieldCassandraType = getTypeByData(oldField, {}, 'newField');
            const newFieldCassandraType = getTypeByData(newField, {}, 'oldField');
            const isOldModel = checkIsOldModel(_.get(data, 'modelData'));

            alterNameScript += Object.keys(bucketsWithCurrentDefinition).reduce((script, bucketName) => {

                if (newFieldCassandraType && oldFieldCassandraType && newFieldCassandraType !== oldFieldCassandraType) {
                    if (isOldModel && fieldTypeCompatible(oldFieldCassandraType, newFieldCassandraType)) {
                        const bucket = bucketsWithCurrentDefinition[bucketName];

                        script += bucket.reduce((alterTypeScript, tableData) => {
                            alterTypeScript += getUpdateType({
                                keySpace: bucketName,
                                tableName: tableData.code || tableData.collectionName,
                                columnData: {
                                    name: fieldKey,
                                    type: newFieldCassandraType
                                }
                            });

                            return alterTypeScript;
                        }, '');
                    }
                }

                if (itemNewName && itemOldName && itemOldName !== itemNewName) {
                    script += getRenameType({
                        keySpaceName: bucketName,
                        udtName: udtKey,
                        oldFieldName: itemOldName,
                        newFieldName: itemNewName
                    })
                }
                return script;
            }, '');

            return alterNameScript;
        }, '');

        return resultScript;
    }, '');
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

    if (objectContainsProp(child, 'containers')) {
        alterScript = mergeArrays(alterScript, getAlterKeyspaceScript(child.containers, udtMap, data));
    }

    if (objectContainsProp(child, 'modelDefinitions')) {
        alterScript = mergeArrays(alterScript, getAlterUdtScript(child.modelDefinitions, udtMap, data));
    }

    if (objectContainsProp(child, 'modified')) {
        alterScript = mergeArrays(alterScript, handleChange(child.modified, udtMap, getUpdate, data));
    }

    if (objectContainsProp(child, 'deleted')) {
        alterScript = mergeArrays(alterScript, handleChange(child.deleted, udtMap, getDelete, data));
    }

    if (objectContainsProp(child, 'added')) {
        alterScript = mergeArrays(alterScript, handleChange(child.added, udtMap, getAdd, data));
    }

    return alterScript;
}

const mergeArrays = (first, sec) => {
    return [...first, ...sec];
}

const getAlterScript = (child, udtMap, data) => {
    let scriptData = getAlterTableScript(child, udtMap, data);
    scriptData = sortScript(scriptData);
    const finalScript = scriptData.join('');

    return finalScript;
}

const sortScript = (scriptData) => {
    const filter = (key, scriptData, filter) => {
        return scriptData.reduce((scripts, currentScript) => {
            if (filter(key, currentScript)) {
                scripts.scripts.push(currentScript);
                return scripts;
            }

            scripts.filteredScripts.push(currentScript);

            return scripts;
        }, { scripts: [], filteredScripts: [] });
    }

    let sortedScripts = [];
    const udtFilter = (key, script) => script[key] && script.udtName;
    const keyspaceFilter = (key, script) => script[key] && _.isString(script.keySpaces) && !script.name;
    const tableFilter = (key, script) => script[key] && _.isString(script.keySpaces) && script.name;
    const fieldFilter = (key, script) => script[key];

    const { scripts: createKeyspacesScripts, filteredScripts: scriptsWithoutCreateKeyspace } = filter('added', scriptData, keyspaceFilter);
    const { scripts: deleteKeyspaceScripts, filteredScripts: scriptsWithoutDropKeyspace } = filter('deleted', scriptsWithoutCreateKeyspace, keyspaceFilter);
    const { scripts: modifyKeyspacesScripts, filteredScripts: scriptsWithoutModifyKeyspace } = filter('modified', scriptsWithoutDropKeyspace, keyspaceFilter);
    const { scripts: createTablesScripts, filteredScripts: scriptsWithoutCreateTable } = filter('added', scriptsWithoutModifyKeyspace, tableFilter);
    const { scripts: deleteTablesScripts, filteredScripts: scriptsWithoutDropTable } = filter('deleted', scriptsWithoutCreateTable, tableFilter);
    const { scripts: modifyTablesScripts, filteredScripts: scriptsWithoutModifyTable } = filter('modified', scriptsWithoutDropTable, tableFilter);
    const { scripts: createFieldsScripts, filteredScripts: scriptsWithoutCreateField } = filter('addedField', scriptsWithoutModifyTable, fieldFilter);
    const { scripts: deleteFieldsScripts, filteredScripts: scriptsWithoutDeleteField } = filter('deletedField', scriptsWithoutCreateField, fieldFilter);
    const { scripts: modifyFieldsScripts, filteredScripts: scriptsWithoutModifyField } = filter('modifiedField', scriptsWithoutDeleteField, fieldFilter);
    const { scripts: createUdtScripts, filteredScripts: scriptsWithoutCreateUdt } = filter('added', scriptsWithoutModifyField, udtFilter);
    const { scripts: deleteUdtScripts, filteredScripts: scriptsWithoutDeleteUdt } = filter('deleted', scriptsWithoutCreateUdt, udtFilter);
    const { scripts: modifyUdtScripts, filteredScripts: scriptsWithoutModifyUdt } = filter('modified', scriptsWithoutDeleteUdt, udtFilter);

    return sortedScripts.concat(
        createKeyspacesScripts,
        createUdtScripts,
        createTablesScripts,
        modifyKeyspacesScripts,
        modifyUdtScripts,
        modifyTablesScripts,
        createFieldsScripts,
        deleteFieldsScripts,
        modifyFieldsScripts,
        deleteUdtScripts,
        deleteTablesScripts,
        deleteKeyspaceScripts,
        scriptsWithoutModifyUdt).map((data) => data.script);
}

module.exports = {
    getAlterScript
};