'use strict';

const async = require('async');
const cassandra = require('./cassandraHelper');


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
		cassandra.connect(connectionInfo).then(() => {
				const keyspaces = cassandra.getKeyspacesNames();
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
		const fieldInference = data.fieldInference;
		const includeEmptyCollection = data.includeEmptyCollection;
		const includeSystemCollection = data.includeSystemCollection;
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

			let pipeline = (UDAs, UDFs) => {
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
							return packageData && columns && columns.length ? cassandra.scanRecords(keyspaceName, tableName) : null;
						})
						.then(columns => {
							if (columns) {
								let docData = cassandra.handleRows(columns);
								packageData.documents = docData.documents;
							}
							return tableCallback(null, packageData);
						})
						.catch(tableCallback);
					}, (err, res) => {
						return keyspaceCallback(err, res)
					});
				}
			};

		}, (err, res) => {
			return cb(err, res);
		});
	}
};