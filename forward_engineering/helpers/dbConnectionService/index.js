const cassandra = require('../../../reverse_engineering/cassandraHelper');
const applyToInstance = require('./applyToInstance.js')(cassandra);
const testConnection = require('./testConnection.js')(cassandra);

module.exports = {
	applyToInstance,
	testConnection
};
