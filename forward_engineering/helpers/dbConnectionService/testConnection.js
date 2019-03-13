module.exports = (cassandra) => (connectionInfo) => {
	if (!Array.isArray(connectionInfo.hosts)) {
		return Promise.reject({ message: 'Hosts were not defined' });
	}

	return cassandra.connect(connectionInfo)
		.then(() => {
			cassandra.close();
		}, (err) => {
			cassandra.close();
			return Promise.reject(err);
		});
};