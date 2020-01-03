module.exports = (cassandraHelper) => (connectionInfo, app) => {
	const cassandra = cassandraHelper(app.require('lodash'));

	return cassandra.connect(app)(connectionInfo)
		.then(() => {
			cassandra.close();
		}, (err) => {
			cassandra.close();
			return Promise.reject(cassandra.prepareError(err));
		});
};