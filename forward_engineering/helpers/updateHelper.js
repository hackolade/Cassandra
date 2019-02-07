const { getTypeByData } = require('./typeHelper');
const alterPrefix = tableName => `ALTER TABLE "${tableName}"`;
const remove = columnName => `DROP "${columnName}"; \n`;
const add = columnData => `ADD "${columnData.name}" ${columnData.type}; \n`;
const getDelete = deleteData => `${alterPrefix(deleteData.tableName)} ${remove(deleteData.columnData.name)}`;
const getAdd = addData => `${alterPrefix(addData.tableName)} ${add(addData.columnData)}`;
const getUpdate = updateData => getDelete(updateData) + getAdd(updateData);
const objectContainProp = (object, key) => object[key] ? true : false;

const handleChange = (child, udtMap, generator) => {
    let script = '';
    if (objectContainProp(child, 'items') && child.items.length) {
        child.items.forEach(element => {
            script += handleItem(element, udtMap, generator);
        });
    } else if (objectContainProp(child, 'items')) {
        script += handleItem(child.items, udtMap, generator);
    }

    return script;
}

handleItem = (item, udtMap, generator) => {
    let script = '';
    if (objectContainProp(item, 'properties')) {
        for (let key in item.properties) {

            if (item.properties[key].properties) {
                for (let column in item.properties[key].properties) {
                    item.properties[key].properties[column] = getTypeByData(item.properties[key].properties[column], udtMap, column);
                    const data = {
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

    return script;
}

const getAlterTableScript = (child, udtMap) => {
    let atScript = '';

    if (objectContainProp(child, 'properties')) {
        atScript += getAlterTableScript(child.properties, udtMap);
    }

    if (objectContainProp(child, 'items')) {
        atScript += getAlterTableScript(child.items, udtMap);
    }

    if (objectContainProp(child, 'entities')) {
        atScript += getAlterTableScript(child.entities, udtMap);
    }

    if (objectContainProp(child, 'deleted')) {
        atScript += handleChange(child.deleted, udtMap, getDelete);
    }

    if (objectContainProp(child, 'added')) {
        atScript += handleChange(child.added, udtMap, getAdd);
    }

    if (objectContainProp(child, 'modified')) {
        atScript += handleChange(child.modified, udtMap, getUpdate);
    }

    return atScript;
}

module.exports = {
    getAlterTableScript
};
