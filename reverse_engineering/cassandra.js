'use strict';

const config = {} //require("./config");
const cassandra = require('cassandra-driver');
config.endpoint = ['40.112.248.195'];
config.keyspace = 'cfs';

var authProvider = new cassandra.auth.PlainTextAuthProvider('cassandra', 'bar456$');
const client = new cassandra.Client({ contactPoints: config.endpoint, keyspace: config.keyspace, authProvider });
//const async = require('async');
//const _ = require('lodash');


(function runCassandra(connectionInfo, cb){
		client.connect(function (err) {
		  if (err){ 
		  	console.error(err);
		  }

		  console.log('Connected to cluster with %d host(s): %j', client.hosts.length, client.hosts.keys());
		});
}());