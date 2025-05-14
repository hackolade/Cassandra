const os = require('os');
const net = require('net');
const packageFile = require('../package.json');

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

const getPluginVersion = () => packageFile.version;

const maxClock = cpus => {
	return cpus.reduce((highestClock, cpu) => Math.max(highestClock, cpu.speed), 0);
};

const prefixZero = number => (number < 10 ? '0' + number : number);

const toTime = number => {
	return Math.floor(number / 3600) + ':' + prefixZero(parseInt((number / 3600 - Math.floor(number / 3600)) * 60));
};

const logHelper = {
	checkConnection,
};

module.exports = logHelper;
