const net = require('net');

const checkConnection = (host, port, timeout = 5000) =>
	new Promise((resolve, reject) => {
		const timer = setTimeout(() => {
			socket.end();
			reject(new Error('Connection takes more than ' + 5000 + ' ms'));
		}, timeout);

		const socket = net.createConnection(port, host, () => {
			socket.end();
			clearTimeout(timer);
			resolve();
		});
		socket.on('error', err => {
			clearTimeout(timer);
			reject(err);
		});
	});

const logHelper = {
	checkConnection,
};

module.exports = logHelper;
