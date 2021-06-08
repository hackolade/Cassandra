const typesHelper = require('../typesHelper');

let state = {
    keyspaces: null,
    tables: null,
}

const clearState = () => {
    state = {
        keyspaces: null,
        tables: null,
    };
}

const getKeyspacesNames = async (astraClient) => {
    const { data, status } = await astraClient.get(`/api/rest/v2/schemas/keyspaces`);
    if (status === 200) {
        state.keyspaces = data;
        return data.map(keyspace => keyspace.name);
    }
    return [];
}

const getTableNames = async (astraClient, keyspace) => {
    const { data, status } = await astraClient.get(`/api/rest/v2/schemas/keyspaces/${keyspace}/tables`);
    if (status === 200) {
        state.tables = data;
        return data.map(table => table.name);
    }
    return [];
}

const getKeyspaceInfo = (keyspaceName) => {
    return state.keyspaces.find(keyspace => keyspace.name === keyspaceName);
}

const getTableMetadata = async (astraClient, keyspace, tableName) => {
    const table = state.tables.find(table => table.name === tableName && table.keyspace === keyspace)
    const columns = table.columnDefinitions.map(column => ({
        name: column.name,
        type: { code: typesHelper().getTypeCode(column.typeDefinition) },
        isStatic: column.static
    }))
    const columnsByName = columns.reduce((columnsByName, column) => ({ ...columnsByName, [column.name]: column }), {});

    const { data, status } = await astraClient.get(`/api/rest/v2/schemas/keyspaces/${keyspace}/tables/${tableName}/indexes`);
    const indexes = data.map(index => ({ name: index.index_name, target: index.options[1].value }))

    return {
        columns,
        columnsByName,
        partitionKeys: table.primaryKey.partitionKey.map(key => columnsByName[key]),
        clusteringKeys: table.tableOptions.clusteringExpression.map(expression => ({ name: expression.column })),
        clusteringOrder: table.tableOptions.clusteringExpression.map(expression => expression.order),
        indexes
    };
}

module.exports = {
    getKeyspacesNames,
    getTableNames,
    clearState,
    getKeyspaceInfo,
    getTableMetadata
}