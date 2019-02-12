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
    let script = '';
    const firstModified = changeData.modified.shift();
    const firstKey = Object.keys(firstModified)[0];
    const firstValue = firstModified[firstKey];

    script += `${alterPrefix(changeData.tableName, changeData.keySpace)} WITH ${firstKey} = "${firstValue}"`;

    if (changeData.modified.length) {
        script += '\n' + changeData.modified.map((element) => {
            const key = Object.keys(element)[0];
            const value = element[key];
            return getAnd({ key, value });
        }).join('\n');
    }

    return script += ';\n\n'
};

const handleChange = (child, udtMap, generator, data) => {
    let script = '';
    if (objectContainProp(child, 'items') && child.items.length) {
        child.items.forEach(element => {
            script += handleItem(element, udtMap, generator, data);
        });
    } else if (objectContainProp(child, 'items')) {
        script += handleItem(child.items, udtMap, generator, data);
    }

    return script;
}

const handleOptions = () => {

}

handleItem = (item, udtMap, generator, data) => {
    let script = '';
    if (objectContainProp(item, 'properties')) {
        for (let key in item.properties) {
            if (generator.name === 'getUpdate' && item.properties[key].role.compMod) {
                if (item.properties[key].role.compMod.modified) {
                    const keySpace = item.properties[key].role.compMod ? item.properties[key].role.compMod.keyspaceName : '';
                    const data = {
                        keySpace: keySpace,
                        tableName: key,
                        modified: item.properties[key].role.compMod.modified
                    }
                    script += getChangeOption(data);
                }
            }

            if (!item.properties[key].role.compMod.deleted && !item.properties[key].role.compMod.created) {
                if (item.properties[key].properties) {
                    for (let column in item.properties[key].properties) {
                        item.properties[key].properties[column] = getTypeByData(item.properties[key].properties[column], udtMap, column);
                        const keySpace = item.properties[key].role.compMod ? item.properties[key].role.compMod.keyspaceName : '';

                        const data = {
                            keySpace: keySpace,
                            tableName: key,
                            columnData: {
                                name: column,
                                type: item.properties[key].properties[column]
                            }
                        }
                        script += generator(data);
                    }
                }
            }
        }
    }

    return script;
}

const getAlterTableScript = (child, udtMap, data) => {
    let atScript = '';

    if (objectContainProp(child, 'properties')) {
        atScript += getAlterTableScript(child.properties, udtMap, data);
    }

    if (objectContainProp(child, 'items')) {
        atScript += getAlterTableScript(child.items, udtMap, data);
    }

    if (objectContainProp(child, 'entities')) {
        atScript += getAlterTableScript(child.entities, udtMap, data);
    }

    if (objectContainProp(child, 'modified')) {
        atScript += handleChange(child.modified, udtMap, getUpdate, data);
    }

    if (objectContainProp(child, 'deleted')) {
        atScript += handleChange(child.deleted, udtMap, getDelete, data);
    }

    if (objectContainProp(child, 'added')) {
        atScript += handleChange(child.added, udtMap, getAdd, data);
    }

    return atScript;
}

module.exports = {
    getAlterTableScript
};