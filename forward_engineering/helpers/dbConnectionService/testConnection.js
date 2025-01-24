module.exports = cassandraHelper => (connectionInfo, app) => {
	const cassandra = cassandraHelper();

	return cassandra
		.connect(app)(connectionInfo)
		.then(
			() => {
				cassandra.close(app);
			},
			err => {
				cassandra.close(app);
				return Promise.reject(cassandra.prepareError(err));
			},
		);
};
