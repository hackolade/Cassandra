let _;
const { dependencies } = require('../appDependencies');
const CACHING = 'caching';
const COMPACTION = 'compaction';
const COMPRESSION = 'compression';
const ID = 'id';
const REDUNDANT_OPTIONS = [ID];

const setDependencies = ({ lodash }) => _ = lodash;

const optionDefaultValues = {
	localReadRepairChance: 0,
	caching: {'keys': 'ALL', 'rows_per_partition': 'NONE'},
	compaction: "{'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy', 'max_threshold': '32', 'min_threshold': '4'}",
	compression: "{'chunk_length_in_kb': '64', 'class': 'org.apache.cassandra.io.compress.LZ4Compressor'}",
	readRepairChance: 0,
	gcGraceSeconds: 864000,
	bloomFilterFalsePositiveChance: 0.01,
	defaultTtl: 0,
	speculativeRetry: '99PERCENTILE',
	minIndexInterval: 128,
	maxIndexInterval: 2048,
	crcCheckChance: 1,
	memtableFlushPeriod: 0,
}

const isDiff = (oldValue, value, optionName) => {
	switch(optionName) {
		case COMPRESSION:
		case COMPACTION: return isDiffParsedJsonString(oldValue, value);
		case CACHING: return isDiffCaching(oldValue, value);
		default: return oldValue !== value;
	}
};

const isDiffParsedJsonString = (oldValue, value) => {
	if (oldValue === '' || value === '') {
		return oldValue !== value;
	}

	const jsonOld = JSON.parse(oldValue.replace(/[\'']/g, '\"'));
	const jsonNew = JSON.parse(value.replace(/[\'']/g, '\"'));

	return !_.isEqual(jsonOld, jsonNew);
};

const isDiffCaching = (oldValue, value) => {
	const updateKeys = caches => {
		const perPartitionValue = _.get(caches, 'rowsPerPartition');
		if (perPartitionValue) {
			return { ..._.omit(caches, 'rowsPerPartition'), 'rows_per_partition': perPartitionValue };
		}

		return caches;
	};

	const jsonOld = Object.assign({}, updateKeys(oldValue), { id: null });
	const jsonNew = Object.assign({}, updateKeys(value), { id: null });

	return !_.isEqual(jsonOld, jsonNew);
};

const getModifiedAndNewOptions = (newOptions, oldOptions) => {
	oldOptions = _.isEmpty(oldOptions) ? optionDefaultValues : oldOptions;
	
	return Object.entries(newOptions).reduce((acc, [name, value]) => {
		if (REDUNDANT_OPTIONS.includes(name)) {
			return acc;
		}
	
		if (!oldOptions.hasOwnProperty(name) || isDiff(oldOptions[name], value, name)) {
			return Object.assign({}, acc, { [name]: value })
		}
	
		return acc;
	}, {});
};

const getDeletedOptions = (newOptions, oldOptions) => {
	newOptions = _.isEmpty(newOptions) ? optionDefaultValues : newOptions;

	return Object.keys(oldOptions).filter(oldOptionKey => !newOptions.hasOwnProperty(oldOptionKey));
};

const getDefaultOptionsByName = (optionNames, oldOptions) => {
	return optionNames.reduce((acc, optionName) => {
		if (optionDefaultValues.hasOwnProperty(optionName) && isDiff(_.get(oldOptions, optionName), optionDefaultValues[optionName], optionName)) {
			return Object.assign({}, acc, { [optionName]: optionDefaultValues[optionName] });
		}

		return acc;
	}, {});
};

module.exports = {
	getDiff(newOptions, oldOptions) {
		setDependencies(dependencies);
		const modifiedAndNewOptions = getModifiedAndNewOptions(newOptions, oldOptions);
		const deletedOptionNames = getDeletedOptions(newOptions, oldOptions);
		return Object.assign({}, modifiedAndNewOptions, getDefaultOptionsByName(deletedOptionNames, oldOptions));
	},
};