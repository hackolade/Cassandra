const { tab, retrieveContainerName, retrivePropertyFromConfig } = require('./generalHelper'); 

const getUseStatement = (name) => `USE "${name}";`

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

const getKeyspaceStatement = (keyspaceData) => 	getUseStatement(retrieveContainerName(keyspaceData));

module.exports = {
	getKeyspaceStatement,
	getReplication,
	getDurableWrites
};
