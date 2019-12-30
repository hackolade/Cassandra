module.exports = (cassandra) => (connectionInfo, app) => {
	return cassandra.connect(app)(connectionInfo)
		.then(() => {
			cassandra.close();
		}, (err) => {
			cassandra.close();
			return Promise.reject(cassandra.prepareError(err));
		});
};