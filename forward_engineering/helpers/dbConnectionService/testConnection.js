module.exports = (cassandra) => (connectionInfo, app) => {
	if (!Array.isArray(connectionInfo.hosts)) {
		return Promise.reject({ message: 'Hosts were not defined' });
	}

	return cassandra.connect(app)(connectionInfo)
		.then(() => {
			cassandra.close();
		}, (err) => {
			cassandra.close();
			return Promise.reject(cassandra.prepareError(err));
		});
};