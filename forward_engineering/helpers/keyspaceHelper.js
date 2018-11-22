const { tab, retrieveContainerName, retrivePropertyFromConfig } = require('./generalHelper'); 

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

const getKeyspaceStatement = (keyspaceData) => {
	const keyspaceName = retrieveContainerName(keyspaceData);
	const replicationStrategy = retrivePropertyFromConfig(keyspaceData, 0, "replStrategy", "");
	const replicationFactor = retrivePropertyFromConfig(keyspaceData, 0, "replFactor", undefined);
	const dataCenters = retrivePropertyFromConfig(keyspaceData, 0, "dataCenters", []);
	const durableWrites = retrivePropertyFromConfig(keyspaceData, 0, "durableWrites", false);

	if (keyspaceName === "") {
		return "";
	} else {
		return getCreateStatement(
			keyspaceName,
			getReplication(replicationStrategy, replicationFactor, dataCenters),
			getDurableWrites(durableWrites)
		);	
	}
};

module.exports = {
	getKeyspaceStatement
};
