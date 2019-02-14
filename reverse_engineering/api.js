'use strict';

const async = require('async');
const cassandra = require('./cassandraHelper');
const systemKeyspaces = require('./package').systemKeyspaces;

module.exports = {
	connect: function(connectionInfo, logger, cb){
		logger.clear();
		logger.log('info', connectionInfo, 'connectionInfo', connectionInfo.hiddenKeys);
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
			let udtHash = [];
			let udfData = [];
			
			cassandra.getUDF(keyspaceName)
			.then(udf => {
				udfData = cassandra.handleUDF(udf);
				return cassandra.getUDA(keyspaceName)
			})
			.then(uda => {
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
						let columns = [];
	
						cassandra.getTableMetadata(keyspaceName, tableName)
						.then(table => {
							columns = table.columns;
							packageData = cassandra.getPackageData({
								keyspaceName,
								table,
								tableName,
								udtHash,
								UDFs,
								UDAs
							}, includeEmptyCollection);
							return packageData;
						})
						.then(packageData => {
							return packageData && columns && columns.length ? cassandra.scanRecords(keyspaceName, tableName, recordSamplingSettings) : null;
						})
						.then(columns => {
							if (columns) {
								packageData.documents = columns;
							}
							return tableCallback(null, packageData);
						})
						.catch(tableCallback);
					}, (err, res) => {
						if (err) {
							logger.log('error', cassandra.prepareError(err), "Error");
						}
						return keyspaceCallback(err, res)
					});
				}
			};
		}, (err, res) => {
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
				logger.log('info', {
					message: `Completed queries: ${i + 1} / ${total}`
				});
			})
				.then(result => {
					logger.log('info', {
						message: 'Cassandra script has been applied successfully!'
					}, 'Cassandra script');
					cb(null);
				}, ({ error, query }) => {
					const preparedError = cassandra.prepareError(error);
					logger.log('error', {
						query: query,
						error: preparedError,
						detail: error
					}, "Cassandra script: query has been executed with error");

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