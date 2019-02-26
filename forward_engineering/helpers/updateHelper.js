const { getTypeByData } = require('./typeHelper');
const { getCreateTableScript } = require('./createHelper');

const alterPrefix = (tableName, keySpace) => { return keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"` };
const remove = columnName => `DROP "${columnName}";\n`;
const add = columnData => `ADD "${columnData.name}" ${columnData.type};\n`;
const getDelete = deleteData => `${alterPrefix(deleteData.tableName, deleteData.keySpace)} ${remove(deleteData.columnData.name)}`;
const getAdd = addData => `${alterPrefix(addData.tableName, addData.keySpace)} ${add(addData.columnData)}`;
const getUpdate = updateData => getDelete(updateData) + getAdd(updateData);
const objectContainsProp = (object, key) => object[key] ? true : false;
const getAnd = data => ` AND ${data.key} = '${data.value}'`;
const getDeleteTable = deleteData => { return deleteData.keySpace ? `DROP TABLE "${deleteData.keySpace}"."${deleteData.tableName}";\n` : `DROP TABLE "${deleteData.tableName}";\n` };
const getChangeOption = changeData => {
    const newOptions = getComparedOptions(changeData.options.new.split("\nAND "), changeData.options.old.split("\nAND "));
    let alterTableScript = '';

    if (changeData.comment && changeData.comment.new !== changeData.comment.old) {
        alterTableScript += `${alterPrefix(changeData.tableName, changeData.keySpace)} WITH comment = '${changeData.comment ? changeData.comment.new : changeData.comment.old}'`;
    } else if (newOptions.length) {
        alterTableScript += `${alterPrefix(changeData.tableName, changeData.keySpace)} WITH ${firstKey} = '${firstValue}'`;
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

            alterTableScript += handleProperties({ generator, tableProperties, udtMap, itemCompModData, tableName });

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

const handleProperties = ({ generator, tableProperties, udtMap, itemCompModData, tableName }) => {
    return Object.keys(tableProperties)
        .reduce((alterTableScript, columnName) => {
            const columnData = getTypeByData(tableProperties[columnName], udtMap, columnName);
            let keyspaceName;

            if (itemCompModData && itemCompModData.keyspaceName) {
                keyspaceName = itemCompModData.keyspaceName;
            };

            alterTableScript += generator({
                keySpace: keyspaceName,
                tableName: tableName,
                columnData: {
                    name: columnName,
                    type: columnData
                }
            });

            return alterTableScript;
        }, '');
}

const getAlterTableScript = (child, udtMap, data) => {
    let alterTableScript = '';

    if (objectContainsProp(child, 'properties')) {
        alterTableScript += getAlterTableScript(child.properties, udtMap, data);
    }

    if (objectContainsProp(child, 'items')) {
        alterTableScript += getAlterTableScript(child.items, udtMap, data);
    }

    if (objectContainsProp(child, 'entities')) {
        alterTableScript += getAlterTableScript(child.entities, udtMap, data);
    }

    if (objectContainsProp(child, 'modified')) {
        alterTableScript += handleChange(child.modified, udtMap, getUpdate, data);
    }

    if (objectContainsProp(child, 'deleted')) {
        alterTableScript += handleChange(child.deleted, udtMap, getDelete, data);
    }

    if (objectContainsProp(child, 'added')) {
        alterTableScript += handleChange(child.added, udtMap, getAdd, data);
    }

    return alterTableScript;
}

module.exports = {
    getAlterTableScript
};