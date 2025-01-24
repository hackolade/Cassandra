const joinScripts = structure => {
	return structure.filter(item => item).join('\n\n');
};

module.exports = {
	joinScripts,
};
