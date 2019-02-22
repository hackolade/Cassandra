'use strict';

const async = require('async');
const cassandra = require('./cassandraHelper');
const systemKeyspaces = require('./package').systemKeyspaces;

module.exports = {
	connect: function(connectionInfo, logger, cb){
		logger.clear();
		logger.log('info', connectionInfo, 'connectionInfo', connectionInfo.hiddenKeys);

		if (!Array.isArray(connectionInfo.hosts)) {
			return cb({ message: 'Hosts were not defined' });
		}

		cassandra.connect(connectionInfo).then(cb, cb);
	},

	disconnect: function(connectionInfo, cb){
		cassandra.close();
		cb();
	},

	testConnection: function(connectionInfo, logger, cb){
		this.connect(connectionInfo, logger, (error) => {
			this.disconnect(connectionInfo, () => {});
			return cb(error);
		});
	},

	getDbCollectionsNames: function(connectionInfo, logger, cb) {
		const { includeSystemCollection } = connectionInfo;

		cassandra.connect(connectionInfo).then(() => {
				let keyspaces = cassandra.getKeyspacesNames();

				if (!includeSystemCollection) {
					keyspaces = cassandra.filterKeyspaces(keyspaces, systemKeyspaces);
				}

				async.map(keyspaces, (keyspace, next) => {
					cassandra.getTablesNames(keyspace).then(tablesData => {
						const tableNames = tablesData.rows.map(table => table.table_name);
						return next(null, cassandra.prepareConnectionDataItem(keyspace, tableNames)); 
					}).catch(next);
				}, (err, result) => {
					return cb(err, result);
				});
			}).catch((error) => {
				return cb(error || 'error');
			});
	},

	getDbCollectionsData: function(data, logger, cb){
		logger.clear();
		logger.log('info', data, 'connectionInfo', data.hiddenKeys);
	
		const tables = data.collectionData.collections;
		const keyspacesNames = data.collectionData.dataBaseNames;
		const includeEmptyCollection = data.includeEmptyCollection;
		const recordSamplingSettings = data.recordSamplingSettings;
	
		async.map(keyspacesNames, (keyspaceName, keyspaceCallback) => {
			const tableNames = tables[keyspaceName] || [];
			let udfData = [];
			
			cassandra.getUDF(keyspaceName)
			.then(udf => {
				logger.progress({ message: 'UDF has loaded', containerName: keyspaceName, entityName: '' });

				udfData = cassandra.handleUDF(udf);
				return cassandra.getUDA(keyspaceName)
			})
			.then(uda => {
				logger.progress({ message: 'UDA has loaded', containerName: keyspaceName, entityName: '' });

				let udaData = cassandra.handleUDA(uda);
				pipeline(udaData, udfData);
			})
			.catch(err => {
				pipeline([], []);
			});

			const pipeline = (UDAs, UDFs) => {
				if (!tableNames.length) {
					let packageData = {
						dbName: keyspaceName,
						emptyBucket: true
					};

					packageData.bucketInfo = cassandra.getKeyspaceInfo(keyspaceName);
					packageData.bucketInfo.UDFs = UDFs;
					packageData.bucketInfo.UDAs = UDAs;
					return keyspaceCallback(null, packageData);
				} else {
					async.map(tableNames, (tableName, tableCallback) => {
						let packageData = {
							dbName: keyspaceName,
							collectionName: tableName,
							documents: []
						};
						const loadProgress = progress.bind(null, logger, keyspaceName, tableName);
						const exec = (promise, startMessage, finishMessage) => {
							loadProgress(startMessage);
							return promise.then(result => {
								loadProgress(finishMessage);

								return result;
							});
						};
	
						Promise.all([
							exec(cassandra.getTableMetadata(keyspaceName, tableName), 'Load meta data...', 'Meta data has loaded'),
							exec(cassandra.scanRecords(keyspaceName, tableName, recordSamplingSettings), 'Load records...', 'Records have loaded')
						]).then(([table, records]) => {
							logger.progress({ message: 'Meta data has loaded', containerName: keyspaceName, entityName: tableName });

							packageData = cassandra.getPackageData({
								keyspaceName,
								table,
								tableName,
								UDFs,
								UDAs,
								records
							}, includeEmptyCollection);

							return packageData;
						})
						.then(
							packageData => tableCallback(null, packageData),
							err => tableCallback(err)
						);
					}, (err, res) => {
						if (err) {
							logger.log('error', cassandra.prepareError(err), "Error");
						}

						return keyspaceCallback(err, res)
					});
				}
			};
		}, (err, res) => {
			if (!err) {
				logger.progress({ message: 'Reverse-Engineering complete!', containerName: '', entityName: '' });
			}

			return cb(err, res);
		});
	},

	applyToInstance(connectionInfo, logger, cb) {
		const script = connectionInfo.script;

		this.connect(connectionInfo, logger, (err) => {
			if (err) {
				logger.log('error', {
					error: err
				}, 'Cassandra script');

				return cb(cassandra.prepareError(err));
			}

			logger.log('info', {
				message: 'Applying cassandra script has been started'
			}, 'Cassandra script');	

			cassandra.batch(script, (query, result, i, total) => {
				logger.progress({
					message: `Completed queries: ${i + 1} / ${total}`
				});
			})
				.then(result => {
					logger.log('info', {
						message: 'Cassandra script has been applied successfully!'
					}, 'Cassandra script');
					cb(null);
				}, ({ error, query }) => {
					const err = modifyLineError(error, script, query);
					const preparedError = cassandra.prepareError(err);
					logger.log('error', {
						query: query,
						error: preparedError,
						detail: error
					}, "Cassandra script: query has been executed with error");

					logger.progress({
						message: `Query has executed with error: \n ${query} \n ${err.message}`
					});

					cb(preparedError);
				})
				.catch(err => {
					const error = cassandra.prepareError(err);
					logger.log('error', {
						error: error,
						detail: err
					}, "Cassandra script");

					cb(error);
				});
		})
	}
};

const modifyLineError = (error, wholeScript, query) => {
	const lineRegExp = /^line\ (\d+)\:(\-?\d+)/i;

	const i = wholeScript.indexOf(query);

	if (i === -1) {
		return error;
	}

	const lineOffset = wholeScript.slice(0, i).split('\n').length;

	if (!lineRegExp.test(error.message)) {
		return Object.assign({}, error, {
			message: `query line ${lineOffset}:0 ${error.message}`
		});
	}

	const lineData = error.message.match(lineRegExp);
	const line = +(lineData[1]);
	const offset = lineData[2];

	const message = error.message.replace(lineRegExp, `line ${lineOffset + line - 1}:${offset}`);

	return Object.assign({}, error, { message });
};

const progress = (logger, keyspace, table, message) => {
	logger.progress({
		containerName: keyspace,
		entityName: table,
		message: message
	});
}
