const { getTypeByData } = require('./typeHelper');

const alterPrefix = (tableName, keySpace) => { return keySpace ? `ALTER TABLE "${keySpace}"."${tableName}"` : `ALTER TABLE "${tableName}"` };
const remove = columnName => `DROP "${columnName}";\n`;
const add = columnData => `ADD "${columnData.name}" ${columnData.type};\n`;
const getDelete = deleteData => `${alterPrefix(deleteData.tableName, deleteData.keySpace)} ${remove(deleteData.columnData.name)}`;
const getAdd = addData => `${alterPrefix(addData.tableName, addData.keySpace)} ${add(addData.columnData)}`;
const getUpdate = updateData => getDelete(updateData) + getAdd(updateData);
const objectContainProp = (object, key) => object[key] ? true : false;
const getAnd = data => ` AND ${data.key} = "${data.value}"`
const getChangeOption = changeData => {
    let alterTableScript = '';
    const firstModified = changeData.modified.shift();
    const firstKey = Object.keys(firstModified)[0];
    const firstValue = firstModified[firstKey];

    alterTableScript += `${alterPrefix(changeData.tableName, changeData.keySpace)} WITH ${firstKey} = '${firstValue}'`;

    if (changeData.modified.length) {
        return alterTableScript += ';\n\n';
    }

    alterTableScript += '\n' + changeData.modified.map((element) => {
        const key = Object.keys(element)[0];
        const value = element[key];
        return getAnd({ key, value });
    }).join('\n');

    return alterTableScript += ';\n\n';
};

const handleChange = (child, udtMap, generator, data) => {
    let alterTableScript = '';

    if (objectContainProp(child, 'items') && child.items.length) {
        child.items.forEach(element => {
            alterTableScript += handleItem(element, udtMap, generator, data);
        });
    } else if (objectContainProp(child, 'items')) {
        alterTableScript += handleItem(child.items, udtMap, generator, data);
    }

    return alterTableScript;
}

const handleOptions = (generator, itemCompModData, tableName) => {
    let alterTableScript = '';

    if (generator.name !== 'getUpdate' || !itemCompModData) {
        return alterTableScript;
    }

    if (itemCompModData.modified) {
        alterTableScript += getChangeOption({
            keySpace: itemCompModData.keyspaceName,
            tableName: tableName,
            modified: itemCompModData.modified
        });
    }

    return alterTableScript;
}

const handleItem = (item, udtMap, generator, data) => {
    let alterTableScript = '';

    if (!objectContainProp(item, 'properties')) {
        return alterTableScript;
    }

    const itemProperties = item.properties;

    alterTableScript += Object.keys(itemProperties).reduce((alterTableScript, tableName) => {
        const itemCompModData = itemProperties[tableName].role.compMod;

        if (!itemCompModData) {
            return alterTableScript;
        }

        const tableProperties = item.properties[tableName].properties;

        alterTableScript += handleOptions(generator, itemCompModData, tableName);

        if (itemCompModData.deleted) {
            return alterTableScript;
        }

        if (!tableProperties) {
            return alterTableScript;
        }

        alterTableScript += handlePropeties({ generator, tableProperties, udtMap, itemCompModData, tableName });

        return alterTableScript;
    }, '');

    return alterTableScript;
}

const handlePropeties = ({ generator, tableProperties, udtMap, itemCompModData, tableName }) => {
    return Object.keys(tableProperties).reduce((alterTableScript, columnName) => {
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

    if (objectContainProp(child, 'properties')) {
        alterTableScript += getAlterTableScript(child.properties, udtMap, data);
    }

    if (objectContainProp(child, 'items')) {
        alterTableScript += getAlterTableScript(child.items, udtMap, data);
    }

    if (objectContainProp(child, 'entities')) {
        alterTableScript += getAlterTableScript(child.entities, udtMap, data);
    }

    if (objectContainProp(child, 'modified')) {
        alterTableScript += handleChange(child.modified, udtMap, getUpdate, data);
    }

    if (objectContainProp(child, 'deleted')) {
        alterTableScript += handleChange(child.deleted, udtMap, getDelete, data);
    }

    if (objectContainProp(child, 'added')) {
        alterTableScript += handleChange(child.added, udtMap, getAdd, data);
    }

    return alterTableScript;
}

module.exports = {
    getAlterTableScript
};