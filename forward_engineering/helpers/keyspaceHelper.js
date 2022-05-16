const { tab, retrieveContainerName, retrivePropertyFromConfig } = require('./generalHelper'); 

const getCreateStatement = ({name, replication, durableWrites, ifNotExist}) => `CREATE KEYSPACE ${ifNotExist? `IF NOT EXISTS ` : ``}"${name}" \n${tab(replication)}\n${durableWrites}; \n\nUSE "${name}";`;

const getSimpleStrategy = (factor) => `'class' : 'SimpleStrategy',\n'replication_factor' : ${factor}`;

const getNetworkTopologyStrategy = (dataCenters) => 
	["'class' : 'NetworkTopologyStrategy'"].concat(
		dataCenters.reduce((replicaCenters, data) => [
			...replicaCenters,
			`'${data.dataCenterName}' : ${getFactor(data.replFactorValue)}`
		], [])
	).join(',\n')

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

	if (keyspaceData[0] && !keyspaceData[0].addToCqlScript) {
		return "";
	} else if (keyspaceName === "") {
		return "";
	} else {
		return getCreateStatement({
			name: keyspaceName,
			replication: getReplication(replicationStrategy, replicationFactor, dataCenters),
			durableWrites: getDurableWrites(durableWrites),
			ifNotExist: retrivePropertyFromConfig(keyspaceData, 0, "keyspaceIfNotExist", undefined)
		});	
	}
};

module.exports = {
	getKeyspaceStatement,
	getReplication,
	getDurableWrites
};
