const COMPACTION = 'compaction';
const COMPRESSION = 'compression';
const CACHING = 'caching';
const specialOptions = [CACHING, COMPACTION, COMPRESSION];

const handleSpecialOption = (optionName, tableMeta) => {
	switch (optionName) {
		case COMPACTION: return handleCompactionOption(tableMeta);
		case CACHING: return handleCashingOption(tableMeta);
		case COMPRESSION: return handleCompressionOption(tableMeta);
		default: return null;
	}
};

const handleCompressionOption = tableMeta => {
	const { compression } = tableMeta;
	return JSON.stringify(compression);
}

const handleCompactionOption = tableMeta => {
	const { compactionClass, compactionOptions } = tableMeta;
	const valueObj = Object.assign({}, { class: compactionClass }, compactionOptions);
	return JSON.stringify(valueObj);
}

const handleCashingOption = tableMeta => {
	const obj = JSON.parse(tableMeta.caching);
	return {
		keys: obj.keys,
		rowsPerPartition: obj['rows_per_partition'],
	};
}

generateTableOptionsReducer = (tableMeta) => (options, configOption) => {
	const optionName = configOption.propertyKeyword;
	if (specialOptions.includes(optionName)) {
		const specialOptionValue = handleSpecialOption(optionName, tableMeta);
		return Object.assign({}, options, { [optionName]: specialOptionValue });
	}

	if (tableMeta.hasOwnProperty(optionName)) {
		return Object.assign({}, options, { [optionName]: tableMeta[optionName] });
	}

	return options;
}

module.exports = {
	createTableOptionsFromMeta(tableMeta, config) {
		return config.reduce(generateTableOptionsReducer(tableMeta), {});
	}
};
