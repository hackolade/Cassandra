const COMPACTION = 'compaction';
const CACHING = 'caching';
const specialOptions = [CACHING, COMPACTION];

const handleSpecialOption = (optionName, tableMeta) => {
	switch (optionName) {
		case COMPACTION: return handleCompactionOption(tableMeta);
		case CACHING: return handleCashingOption(tableMeta);
		default: return null;
	}
};

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
