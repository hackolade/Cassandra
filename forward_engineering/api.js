'use strict'

const { tab } = require('./helpers/formatHelper'); 
const { getTableStatement } = require('./helpers/tableHelper');
const { getUserDefinedTypes } = require('./helpers/udtHelper');
const { getIndexes } = require('./helpers/indexHelper');

module.exports = {
	generateScript(data, logger, callback) {
		data.jsonSchema = JSON.parse(data.jsonSchema);
		data.modelDefinitions = JSON.parse(data.modelDefinitions);
		data.internalDefinitions = JSON.parse(data.internalDefinitions);
		// let result = JSON.stringify(data, null, 2);
		const keyspace = getKeyspaceStatement(data.containerData[0]);
		const modelUdt = getUserDefinedTypes(data.containerData[0].name, data.modelDefinitions);
		const internalUdt = getUserDefinedTypes(data.containerData[0].name, data.internalDefinitions);
		const table = getTableStatement({
			tableData: data.jsonSchema,
			tableMetaData: data.entityData,
			keyspaceMetaData: data.containerData,
			modelDefinitions: data.modelDefinitions,
			internalDefinition: data.internalDefinitions
		});
		const indexes = getIndexes((data.entityData[1].SecIndxs || []), [
			data.jsonSchema,
			data.modelDefinitions,
			data.internalDefinitions
		], data.entityData[0].collectionName, data.containerData[0].name);
		const UDF = getUserDefinedFunctions(data.containerData[1].UDFs);
		const UDA = getUserDefinedAggregations(data.containerData[2].UDAs);

		callback(null, [keyspace, modelUdt, internalUdt, table, indexes, UDF, UDA].filter(item => item).join('\n\n'));
	},
};

const getKeyspaceStatement = (keyspaceData) => {
	const getCreateStatement = (name, replication, durableWrites) => `CREATE KEYSPACE IF NOT EXISTS "${name}" \n${tab(replication)}\n${durableWrites};`;
	const getSimpleStrategy = (factor) => `'class' : 'SimpleStrategy',\n'replication_factor' : ${factor}`;
	const getNetworkTopologyStrategy = (dataCenters) => 
		"'class' : 'NetworkTopologyStrategy',\n" +
		dataCenters.reduce((replicaCenters, data) => [
			...replicaCenters,
			`'${data.dataCenterName}' : ${getFactor(data.replFactorValue)}`
		], []).join(',\n');
	const getTopology = (strategy, factor, dataCenters) => {
		if (strategy === "NetworkTopologyStrategy") {
			return getNetworkTopologyStrategy(dataCenters);
		} else {
			return getSimpleStrategy(getFactor(factor));
		}
	};
	const getReplication = (strategy, factor, dataCenters) => `WITH REPLICATION = {\n${ tab(getTopology(strategy, factor, dataCenters)) }\n}`;
	const getDurableWrites = (durableWrites) =>  `AND DURABLE_WRITES = ${Boolean(durableWrites) + ''}`;
	const getFactor = (factor) => +factor || 1; 

	return getCreateStatement(
		keyspaceData.name,
		getReplication(keyspaceData.replStrategy, keyspaceData.replFactor, keyspaceData.dataCenters),
		getDurableWrites(keyspaceData.durableWrites)
	);
};

const getUserDefinedFunctions = (udfItems) => {
	return udfItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};

const getUserDefinedAggregations = (udaItems) => {
	return udaItems.map(item => item.storedProcFunction).filter(item => item).join('\n');
};
