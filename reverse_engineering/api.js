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
			const tableNames = tables[keyspaceName];

			if (!tableNames.length) {
				let packageData = {
					dbName: keyspaceName,
					emptyBucket: true
				};
				return keyspaceCallback(null, packageData);
			} else {
				async.map(tableNames, (tableName, tableCallback) => {
					let packageData = {
						dbName: keyspaceName,
						collectionName: tableName
					};
					let columns = [];

					cassandra.getTableMetadata(keyspaceName, tableName)
					.then(table => {
						columns = table.columns;
						if (columns) {
							const schema = cassandra.getTableSchema(columns);
							packageData.validation = {
								jsonSchema: schema
                            };
                            packageData.bucketInfo = cassandra.getKeyspaceInfo(keyspaceName);
                            packageData.entityLevel = cassandra.getEntityLevelData(table);
						} else if (includeEmptyCollection) {
							packageData.documents = [];
						} else {
							packageData = null;
						}
						return packageData;
					})
					.then(packageData => {
						return columns && columns.length ? cassandra.scanRecords(keyspaceName, tableName) : null;
					})
					.then(res => {
						if (res) {
							packageData.documents = [];
						}
						packageData.documents = [];
						return tableCallback(null, packageData);
					})
					.catch(tableCallback);
				}, (err, res) => {
					return keyspaceCallback(err, res)
				});
			}
		}, (err, res) => {
			return cb(err, res);
		});
	}
};

let data = {
    "collectionData": {
        "collections": {
            "videodb3": [
				"videos",
                "video_rating",
                "video_event"
            ]
        },
        "dataBaseNames": [
            "videodb3"
        ]
    },
    "fieldInference": {
        "active": "alphabetical"
    },
    "includeEmptyCollection": false,
    "pagination": {
        "enabled": false,
        "value": 1000
    },
    "pluginPath": "/home/eduard/.hackolade/plugins/Link to Cassandra",
    "recordSamplingSettings": {
        "absolute": {
            "value": "10"
        },
        "active": "relative",
        "maxValue": 10000,
        "relative": {
            "value": "100"
        }
    },
    "target": "CASSANDRA"
};


let connectionInfo = {
    appVersion: "2.0.6",
    excludeDocKind: [
        "id"
    ],
    hiddenKeys: [],
    host: "",
    hosts: [
        {
            host: "104.42.183.164",
            port: "9042"
        },
        {
            host: "104.42.177.63",
            port: "9042"
        },
        {
            host: "104.42.181.176",
            port: "9042"
        }
    ],
    id: "c6814170-8b59-11e8-a9b4-a7357fb9ce45",
    includeEmptyCollection: false,
    includeSystemCollection: false,
    name: "Datasax",
    pagination: {
        enabled: false,
        value: 1000
    },
    password: "bar456$",
    pluginPath: "/home/eduard/.hackolade/plugins/Link to Cassandra",
    recordSamplingSettings: {
        absolute: {
            value: "10"
        },
        active: "relative",
        maxValue: 10000,
        relative: {
            value: "100"
        }
    },
    target: "CASSANDRA",
    undefined: [],
    user: "cassandra"
};

const connect = (connectionInfo, cb) => {
    cassandra.connect(connectionInfo).then(res => {
        return cb(null, res);
    }).catch((error) => {
		console.log(err)
        return cb(error || 'error');
    });
};

const getDbCollectionsData = (data, cb) => {
    // logger.clear();
    // logger.log('info', data, 'connectionInfo', data.hiddenKeys);

    const tables = data.collectionData.collections;
    const keyspacesNames = data.collectionData.dataBaseNames;
    const fieldInference = data.fieldInference;
    const includeEmptyCollection = data.includeEmptyCollection;
    const includeSystemCollection = data.includeSystemCollection;
    const recordSamplingSettings = data.recordSamplingSettings;

    connect(connectionInfo, (err, aaa) => {
        async.map(keyspacesNames, (keyspaceName, keyspaceCallback) => {
            const tableNames = tables[keyspaceName];

            if (!tableNames.length) {
                let packageData = {
                    dbName: keyspaceName,
                    emptyBucket: true
                };
                return keyspaceCallback(null, packageData);
            } else {
                async.map(tableNames, (tableName, tableCallback) => {
                    let packageData = {
                        dbName: keyspaceName,
                        collectionName: tableName
                    };
                    let columns = [];

                    cassandra.getTableMetadata(keyspaceName, tableName)
                    .then(table => {
                        columns = table.columns;
                        if (columns) {
                            const schema = cassandra.getTableSchema(columns);
                            console.log(JSON.stringify(schema, null, 4));
                            packageData.validation = {
                                jsonSchema: schema
							};
                        } else if (includeEmptyCollection) {
                            packageData.documents = [];
                        } else {
                            packageData = null;
                        }
                        return packageData;
                    })
                    .then(packageData => {
                        //console.log(JSON.stringify(packageData, null, 4))
                        return columns && columns.length ? cassandra.scanRecords(keyspaceName, tableName) : null;
                    })
                    .then(res => {
                        if (res) {
                            //console.log(res)
                            packageData.documents = [];
                        }
                        packageData.documents = [];
                        return tableCallback(null, packageData);
                    })
                    .catch(tableCallback);
                }, (err, res) => {
                    return keyspaceCallback(err, res)
                });
            }
        }, (err, res) => {
            return cb(err, res);
        });
    });

};

getDbCollectionsData(data, (err, res) => {
    console.log(err)
});