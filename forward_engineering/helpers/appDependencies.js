let dependencies = {};

const setDependencies = () => {
	dependencies.provider = require('../ddlProvider/ddlProvider')();
};

module.exports = {
	setDependencies,
	dependencies,
};
