'use strict';

module.exports = {
	connect: function(connectionInfo, cb){
		cb()
	},

	disconnect: function(connectionInfo, cb){
		cb()
	},

	testConnection: function(connectionInfo, cb){
		cb(true);
	},

	getDatabases: function(connectionInfo, cb){
		cb();
	},

	getDocumentKinds: function(connectionInfo, cb) {
		cb();
	},

	getDbCollectionsNames: function(connectionInfo, cb) {
		cb();
	},

	getDbCollectionsData: function(data, cb){
		cb();
	}
};
