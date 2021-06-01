const { inlineComment } = require("../commentsHelper");
const { dependencies } = require('../appDependencies');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const NUMERIC = 'numeric';
const TEXT = 'text';
const DETAILS = 'details';
const CHECKBOX = 'checkbox';

const OTHER = 'otherProperties';
const CACHING = 'caching';
const specialOptions = [CACHING, OTHER];

const getStringStart = str => str === '' ? '\nWITH' : '  AND';
const changeQuotes = str => String(str || '').replace(/[\"\`]/g, '\'');

const tableOptionsHashMap = {
	localReadRepairChance: 'dclocal_read_repair_chance',
	readRepairChance: 'read_repair_chance',
	gcGraceSeconds: 'gc_grace_seconds',
	bloomFilterFalsePositiveChance: 'bloom_filter_fp_chance',
	defaultTtl: 'default_time_to_live',
	speculativeRetry: 'speculative_retry',
	minIndexInterval: 'min_index_interval',
	maxIndexInterval: 'max_index_interval',
	crcCheckChance: 'crc_check_chance',
	memtableFlushPeriod: 'memtable_flush_period_in_ms',
}

const convertKeywordToTableOptionName = keyword => {
	if (tableOptionsHashMap.hasOwnProperty(keyword)) {
		return tableOptionsHashMap[keyword];
	}

	return keyword;
}

const transformOption = (option) => {
	if (specialOptions.includes(option.propertyKeyword)) {
		return transformSpecialOption(option);
	}

	return transformOptionByPropertyType(option);

};

const transformSpecialOption = option => {
	switch (option.propertyKeyword) {
		case CACHING: return transformCachingOption(option);
		case OTHER: return transformOtherOptions(option);
		default: return null;
	}
}

const transformOptionByPropertyType = option => {
	switch (option.propertyType) {
		case TEXT: return transformTextOption(option);
		case CHECKBOX: return transformBooleanOption(option);
		case NUMERIC: return transformNumericOption(option);
		case DETAILS: return transformDetailsOptions(option);
		default: return null;
	}
}

const transformTextOption = option =>
	`${convertKeywordToTableOptionName(option['propertyKeyword'])} = '${option.value}'`;

const transformNumericOption = option =>
	`${convertKeywordToTableOptionName(option['propertyKeyword'])} = ${option.value}`;

const transformDetailsOptions = option => {
	const getStringValue = value => {
		if (typeof value === 'object') {
			return JSON.stringify(option.value);
		}

		return value;
	}
	const stringValue = getStringValue(option.value);
	const trimmedValue = stringValue.replace(/\n/g, '');
	return `${convertKeywordToTableOptionName(option['propertyKeyword'])} = ${changeQuotes(trimmedValue)}`;
}

const transformOtherOptions = option => {
	const subOptionArray = option.value;
	return subOptionArray
		.reduce((optionString, option) => {
			const { name, value } = option;
			if (!name || !value) {
				return optionString;
			}

			const start = optionString === '' ? '' : '  AND';
			return optionString.concat(`${start} ${name} = '${value}'\n`);
		}, '')
		.replace(/\n$/, '');
}

const transformBooleanOption = option => {
	const keyword = option['propertyKeyword'];
	if (!Boolean(option.value)) {
		return null;
	}

	if (keyword === 'cdc') {
		return 'cdc = TRUE';
	}

	if (keyword === 'compactStorage') {
		return 'COMPACT STORAGE';
	}

	return null;
}

const transformCachingOption = option => {
	const validateKeys = value => allowedValues.includes(value) ? value : null;
	const validateRows = value => {
		if (allowedValues.includes(value)) {
			return value;
		}

		if (!isNaN(value)) {
			return Number(value);
		}

		return null;
	};
	const createValueObject = (keys, rows) => Object.assign(
		{},
		keys && { keys },
		rows && { rows_per_partition: rows }
	);
	const allowedValues = ['ALL', 'NONE'];
	const keys = validateKeys(option.value['keys']);
	const rows = validateRows(option.value['rowsPerPartition']);
	if (!keys && !rows) {
		return null;
	}

	const stringValue = JSON.stringify(createValueObject(keys, rows));
	return `caching = ${changeQuotes(stringValue)}`;
}

const generateOptionsStringReducer = (str, option) => {
	if (!option.value && typeof option.value !== 'number') {
		return str;
	}

	const optionString = transformOption(option);
	if (!optionString) {
		return str;
	}

	const start = getStringStart(str);
	return str.concat(`${start} ${optionString}\n`);
}

const addCommentToOptionString = (optionString, comment) => {
	if (comment) {
		const start = getStringStart(optionString);
		return optionString.concat(`${start} comment = '${comment}'\n`);
	}

	return optionString;
}

const addId = (tableId, options) => {
	if (!tableId) {
		return options;
	}

	const start = getStringStart(options);
	return options.concat(`${start} ID = '${tableId}'\n`);
}

const addClustering = (clusteringKeys, clusteringKeysHash, options, isParentActivated) => {
	setDependencies(dependencies);
	const validClusteredKeys = clusteringKeys.filter(key => clusteringKeysHash[key && key.keyId]);
	if (!validClusteredKeys.length) {
		return options;
	}
	const mapKeys = keys => {
		return keys
			.map((key) => {
				const { keyId, type } = key;
				const { name } = clusteringKeysHash[keyId];
				const order = type === 'descending' ? 'DESC' : 'ASC';
				return `"${name}" ${order}`;
			});
	};

	let [activatedKeys, deactivatedKeys] = _.partition(
		validClusteredKeys,
		({ keyId }) => _.get(clusteringKeysHash, `${keyId}.isActivated`) !== false
	);
	activatedKeys = mapKeys(activatedKeys);
	deactivatedKeys = mapKeys(deactivatedKeys);
	let fields;
	if (!isParentActivated) {
		fields = mapKeys(validClusteredKeys).join(', ');
	} else if (deactivatedKeys.length === 0) {
		fields = activatedKeys.join(', ');
	} else if (activatedKeys.length === 0) {
		fields = inlineComment(deactivatedKeys.join(', '));
	} else {
		fields = `${activatedKeys.join(', ')} ${inlineComment(`, ${deactivatedKeys.join(', ')}`)}`;
	}

	const start = getStringStart(options);
	return options.concat(`${start} CLUSTERING ORDER BY (${fields})\n`);
}

module.exports = {
	parseToString(options, comment) {
		const optionString = options.reduce(generateOptionsStringReducer, '');
		const optionsWithComment = addCommentToOptionString(optionString, comment);
		return optionsWithComment;
	},
	addId,
	addClustering,
};
