const { dependencies } = require('../appDependencies');

let _;

const setDependencies = ({ lodash }) => _ = lodash;

const REDUNDANT_OPTIONS = ['id'];

const SEARCH_INDEX_OPTIONS_DEFAULT = {
	recovery: false,
	reindex: true,
	lenient: false,
};

const SEARCH_INDEX_CONFIG_DEFAULT = {
	autoCommitTime: 10000,
	filterCacheLowWaterMark: 1024,
	filterCacheHighWaterMark: 2048,
	mergeFactor: 10,
	ramBufferSize: 512,
	realtime: false
};

const isDiff = (oldValue, newValue) => oldValue !== newValue;

const getModifiedProperties = (oldProperties, newProperties) => {
	
	return Object.entries(newProperties).reduce((acc, [name, value]) => {
		if (REDUNDANT_OPTIONS.includes(name)) {
			return acc;
		}
	
		if (!oldProperties.hasOwnProperty(name) || isDiff(oldProperties[name], value)) {
			return Object.assign({}, acc, { [name]: value })
		}
	
		return acc;
	}, {});
};

const isEmptyValue = value => typeof value !== 'boolean' && !Boolean(value);

const getDeletedProperties = (oldProperties, newProperties) => 
	Object.keys(oldProperties)
		.filter(oldPropertyKey => !newProperties.hasOwnProperty(oldPropertyKey));

const getDefaultPropertiesByName = (propertiesNames, oldProperties, defaultProperties) => {
	return propertiesNames.reduce((acc, propertyName) => {
		if (defaultProperties.hasOwnProperty(propertyName) && isDiff(_.get(oldProperties, propertyName), defaultProperties[propertyName])) {
			return Object.assign({}, acc, { [propertyName]: defaultProperties[propertyName] });
		}

		return acc;
	}, {});
};

const getNotDefaultProperties = (properties = [], defaultProperties = []) => {
	return properties.reduce((acc, property) => defaultProperties.includes(property) ? acc : [...acc, property], []);
};

const getDropProperties = (oldData, newData, defaultData = {}) => {
	const notDefaultProperties = getNotDefaultProperties(Object.keys(newData), Object.keys(defaultData));

	return notDefaultProperties.reduce((acc, property) => {
		if (REDUNDANT_OPTIONS.includes(property)) {
			return acc;
		}

		if (oldData.hasOwnProperty(property) && isEmptyValue(newData[property]) && !isEmptyValue(oldData[property])) {
			return {
				...acc,
				[property]: newData[property]
			}
		};

		return acc;
	}, {})
};

const getDiffOptions = defaultData => (oldData = {}, newData = {}) => {
	setDependencies(dependencies);
	const modifyData = getModifiedProperties(Object.assign({}, defaultData, oldData), Object.assign({}, defaultData, newData));
	const deleteDataProperties = getDeletedProperties(oldData, Object.assign({}, defaultData, newData));

	return {
		modifyData,
		dropData: getDefaultPropertiesByName(deleteDataProperties, oldData, defaultData),
	};
};

const getDiff = defaultData => (oldData = {}, newData = {}) => {
	setDependencies(dependencies);
	const modifyData = getModifiedProperties(Object.assign({}, defaultData, oldData), Object.assign({}, defaultData, newData));

	return {
		modifyData,
		dropData: getDropProperties(oldData, newData, defaultData)
	}
};

module.exports = {
	getDiffOptions: getDiffOptions(SEARCH_INDEX_OPTIONS_DEFAULT),
	getDiffConfig: getDiff(SEARCH_INDEX_CONFIG_DEFAULT),
	getDiffIndexProfiles: getDiff({}),
}