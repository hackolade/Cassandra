const { getTypeByData } = require('./typeHelper');
const { getCreateTableScript } = require('./createHelper');
const { getReplication, getDurableWrites } = require('./keyspaceHelper');
const { tab, retrivePropertyFromConfig } = require('./generalHelper');

const typesCompatibility = {
    blob: ['ascii', 'bigint', 'boolean', 'decimal', 'double', 'float', 'inet', 'int', 'timestamp', 'timeuuid', 'uuid', 'varchar', 'varint'],
    varint: ['int'],
    varchar: ['text'],
    uuid: ['timeuuid'],
    text: ['varchar']
};
const alterTablePrefix = (tableName, keySpace) => { return keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"` };
const alterKeyspacePrefix = keyspaceName => `ALTER KEYSPACE ${keyspaceName}`;
const remove = columnName => `DROP "${columnName}";\n`;
const getUpdateType = updateTypeData => `${alterTablePrefix(updateTypeData.tableName, updateTypeData.keySpace)} ALTER "${updateTypeData.columnData.name}" TYPE ${updateTypeData.columnData.type};\n`;
const add = columnData => `ADD "${columnData.name}" ${columnData.type};\n`;
const getDelete = deleteData => `${alterTablePrefix(deleteData.tableName, deleteData.keySpace)} ${remove(deleteData.columnData.name)}`;
const getAdd = addData => `${alterTablePrefix(addData.tableName, addData.keySpace)} ${add(addData.columnData)}`;
const getUpdate = updateData => getDelete(updateData) + getAdd(updateData);
const objectContainsProp = (object, key) => object[key] ? true : false;
const getAnd = data => ` AND ${data.key} = '${data.value}'`;
const getDeleteTable = deleteData => { return deleteData.keySpace ? `DROP TABLE "${deleteData.keySpace}"."${deleteData.tableName}";\n` : `DROP TABLE "${deleteData.tableName}";\n` };
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
    let alterTableScript = '';

    if (objectContainsProp(child, 'items') && child.items.length) {
        child.items.forEach(element => {
            alterTableScript += handleItem(element, udtMap, generator, data);
        });
    } else if (objectContainsProp(child, 'items')) {
        alterTableScript += handleItem(child.items, udtMap, generator, data);
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

const handleItem = (item, udtMap, generator, data) => {
    let alterTableScript = '';

    if (!objectContainsProp(item, 'properties')) {
        return alterTableScript;
    }

    let isOldModel = false;

    if (objectContainsProp(data, 'modelData')) {
        const modelVersion = data.modelData.filter(element => {
            return element.dbVersion;
        })[0].dbVersion;
        const majorDigitIndex = modelVersion.search(/\d/);

        if (majorDigitIndex !== -1) {
            const majorDigit = modelVersion[majorDigitIndex];
            isOldModel = majorDigit < 3;
        }
    }

    const itemProperties = item.properties;

    alterTableScript += Object.keys(itemProperties)
        .reduce((alterTableScript, tableName) => {
            const itemCompModData = itemProperties[tableName].role.compMod;

            if (!itemCompModData) {
                return alterTableScript;
            }

            const tableProperties = item.properties[tableName].properties;

            if (!tableProperties) {
                return alterTableScript;
            }

            let keyspaceName;

            if (itemCompModData.keyspaceName) {
                keyspaceName = itemCompModData.keyspaceName;
            };

            if (itemCompModData.deleted) {
                alterTableScript += getDeleteTable({
                    keySpace: keyspaceName,
                    tableName
                });
                return alterTableScript;
            }

            if (itemCompModData.created) {
                alterTableScript += handleCreate(itemProperties[tableName], keyspaceName, data, tableName);

                return alterTableScript;
            }

            alterTableScript += handleOptions(generator, itemCompModData, tableName);

            alterTableScript += handleProperties({ generator, tableProperties, udtMap, itemCompModData, tableName, isOldModel });

            return alterTableScript;
        }, '');

    return alterTableScript;
}

const handleCreate = (table, keyspaceName, data, tableName) => {
    const tableProperties = table.properties;
    const partitionKeys = Object.keys(tableProperties).map(key => {
        if (tableProperties[key].compositePartitionKey) {
            return { keyId: tableProperties[key].GUID };
        }
        return;
    }).filter(item => item);

    const clusteringKeys = Object.keys(tableProperties).map(key => {
        if (tableProperties[key].compositeClusteringKey) {
            return { keyId: tableProperties[key].GUID };
        }
        return;
    }).filter(item => item);

    data.jsonSchema = table;
    data.containerData = [{ name: keyspaceName }];
    data.entityData = [{
        collectionName: tableName,
        compositePartitionKey: [...partitionKeys],
        compositeClusteringKey: [...clusteringKeys],
        tableOptions: table.role.tableOptions || '',
        comments: table.role.comments || ''
    }];

    const result = getCreateTableScript(data);

    return result;
}

const fieldTypeCompatible = (oldType, newType) => {
    const compabilityTypes = typesCompatibility[newType];

    if (!compabilityTypes) {
        return false;
    }

    const foundCapabilityType = compabilityTypes.filter(type => {
        return type === oldType;
    });

    if (!foundCapabilityType) {
        return false;
    }

    return true
}

const handleProperties = ({ generator, tableProperties, udtMap, itemCompModData, tableName, isOldModel }) => {
    return Object.keys(tableProperties)
        .reduce((alterTableScript, columnName) => {
            let columnType = getTypeByData(tableProperties[columnName], udtMap, columnName);
            let keyspaceName;

            if (itemCompModData && itemCompModData.keyspaceName) {
                keyspaceName = itemCompModData.keyspaceName;
            };

            if (isOldModel) {
                const oldFieldCassandraType = getTypeByData(tableProperties[columnName].compMod.oldField.properties, udtMap, 'oldField');
                const newFieldCassandraType = getTypeByData(tableProperties[columnName].compMod.newField.properties, udtMap, 'newField');

                if (fieldTypeCompatible(oldFieldCassandraType, newFieldCassandraType)) {
                    columnType = newFieldCassandraType;

                    alterTableScript += getUpdateType({
                        keySpace: keyspaceName,
                        tableName: tableName,
                        columnData: {
                            name: columnName,
                            type: columnType
                        }
                    });

                    return alterTableScript;
                }
            }

            alterTableScript += generator({
                keySpace: keyspaceName,
                tableName: tableName,
                columnData: {
                    name: columnName,
                    type: columnType
                }
            });

            return alterTableScript;
        }, '');
}

const alterkeyspaceScript = (child) => {
    let alterTableScript = '';
    const keyspaceData = [child.role];
    const keyspaceName = child.role.name;
    const replicationStrategyProp = retrivePropertyFromConfig(keyspaceData, 0, "replStrategy", "");
    const replicationFactorProp = retrivePropertyFromConfig(keyspaceData, 0, "replFactor", undefined);
    const dataCentersProp = retrivePropertyFromConfig(keyspaceData, 0, "dataCenters", []);
    const durableWritesProp = retrivePropertyFromConfig(keyspaceData, 0, "durableWrites", false);

    const replication = getReplication(replicationStrategyProp, replicationFactorProp, dataCentersProp);
    const durableWrites = getDurableWrites(durableWritesProp);

    alterTableScript += alterKeyspacePrefix(keyspaceName);
    alterTableScript += `${tab(replication)}\n${durableWrites}; \n\n`;

    return alterTableScript;
}

const generateAlterKeyspaceScript = (child, udtMap, data) => {
    const properties = (child.properties);
    let alterTableScript = '';

    if (!properties) {
        return alterTableScript;
    }

    if (Array.isArray(properties) && properties.length) {
        properties.forEach(item => {
            alterTableScript += alterkeyspaceScript(item);
        });
    } else {
        const itemKey = Object.keys(properties)[0];
        const item = properties[itemKey];
        alterTableScript += alterkeyspaceScript(item);
    }

    return alterTableScript;
}

const getAlterKeyspaceScript = (child, udtMap, data) => {
    let alterScript = '';

    if (objectContainsProp(child, 'properties')) {
        alterScript += getAlterKeyspaceScript(child.properties, udtMap, data);
    }

    if (objectContainsProp(child, 'modified')) {
        alterScript += getAlterKeyspaceScript(child.modified, udtMap, getUpdate, data);
    }

    if (objectContainsProp(child, 'items')) {
        alterScript += generateAlterKeyspaceScript(child.items, udtMap, data);
    }

    return alterScript;
}

const getAlterScript = (child, udtMap, data) => {
    let alterScript = '';

    if (objectContainsProp(child, 'properties')) {
        alterScript += getAlterScript(child.properties, udtMap, data);
    }

    if (objectContainsProp(child, 'items')) {
        alterScript += getAlterScript(child.items, udtMap, data);
    }

    if (objectContainsProp(child, 'containers')) {
        alterScript += getAlterKeyspaceScript(child.containers, udtMap, data);
    }

    if (objectContainsProp(child, 'entities')) {
        alterScript += getAlterScript(child.entities, udtMap, data);
    }

    if (objectContainsProp(child, 'modified')) {
        alterScript += handleChange(child.modified, udtMap, getUpdate, data);
    }

    if (objectContainsProp(child, 'deleted')) {
        alterScript += handleChange(child.deleted, udtMap, getDelete, data);
    }

    if (objectContainsProp(child, 'added')) {
        alterScript += handleChange(child.added, udtMap, getAdd, data);
    }

    return alterScript;
}

module.exports = {
    getAlterScript
};