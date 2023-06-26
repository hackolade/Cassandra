let dependencies = {};

const setDependencies = app => {
    dependencies.lodash = app.require('lodash');
    dependencies.provider = require('../ddlProvider/ddlProvider')(app);
};

module.exports = {
    setDependencies,
    dependencies
};