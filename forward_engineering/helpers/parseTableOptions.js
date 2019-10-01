const NUMERIC = 'numeric';
const TEXT = 'text';
const DETAILS = 'details';
const CHECKBOX = 'checkbox';
const GROUP = 'group';
const BLOCK = 'block';

const getStringStart = str => str === '' ? '\nWITH' : 'AND';

const transformOptionToString = (option) => {
	switch (option['propertyType']) {
		case TEXT: return `${option['propertyKeyword']} = \'${option.value}\'`;
		case BLOCK: return transformBlockOptionToString(option);
		case CHECKBOX: return transformBooleanOptionToString(option);
		case GROUP: return transformGroupOptionsToString(option);
		case NUMERIC:
		case DETAILS:return `${option['propertyKeyword']} = ${option.value}`;
		default: return null;
	}
};

const transformBlockOptionToString = option => {
	if (option['propertyKeyword'] === 'clustering') {
		return transformClusteringOptionToString(option);
	}

	return null;
}

const transformGroupOptionsToString = option => {
	const subOptionArray = option.value;
	return subOptionArray
		.reduce((optionString, option) => {
			const { name, value } = option;
			if (!name || !value) {
				return optionString;
			}

			const start = optionString === '' ? '' : 'AND';
			return optionString.concat(`${start} ${name} = ${value}\n`);
		}, '')
		.replace(/\n$/, '');
}

const transformBooleanOptionToString = option => {
	const keyword = option['propertyKeyword'];
	if (!Boolean(option.value)) {
		return null;
	}

	if (keyword === 'cdc') {
		return 'cdc = TRUE';
	}

	if (keyword === 'compact_storage') {
		return 'COMPACT STORAGE';
	}

	return null;
}

const transformClusteringOptionToString = option => {
	const columnName = option.value['column_name'];
	if (!columnName) {
		return null;
	}

	const order = option.value['descending_order'] ? 'DESC' : 'ASC';
	return `CLUSTERING ORDER BY (${columnName} ${order})`;
}

const generateOptionsStringReducer = (str, option) => {
	if (!option.value) {
		return str;
	}

	const optionString = transformOptionToString(option);
	if (!optionString) {
		return str;
	}

	const start = getStringStart(str);
	return str.concat(`${start} ${optionString}\n`);
}

const addCommentToOptionString = (optionString, comment) => {
	if (comment) {
		const start = getStringStart(optionString);
		return optionString.concat(`${start} comment = ${comment}\n`);
	}

	return optionString;
}

module.exports = {
	parseTableOptions(options, comment) {
		const optionString = options.reduce(generateOptionsStringReducer, '');
		const optionsWithComment = addCommentToOptionString(optionString, comment);
		return optionsWithComment;
	}
};
