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
						const table_name_selector = cassandra.isOldVersion() ? 'columnfamily_name' : 'table_name';
						const tableNames = tablesData.rows.map(table => table[table_name_selector]);
						
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
	}
};

const progress = (logger, keyspace, table, message) => {
	logger.progress({
		containerName: keyspace,
		entityName: table,
		message: message
	});
}
