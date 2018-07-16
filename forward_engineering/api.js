
module.exports = {
	generateScript(data, logger, callback) {
		data.jsonSchema = JSON.parse(data.jsonSchema);
		callback(null, JSON.stringify(data, null, 4));
	}
}; 