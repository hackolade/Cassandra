const { isEqual, get, uniq, keys } = require('lodash');

const REDUNDANT_OPTIONS = ['id'];

const REDUNDANT_PROPERTIES_FOR_INDEX = ['SecIndxComments', 'SecIndxDescription'];

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
	realtime: false,
};

const INDEX_CONFIG_DEFAULT = {
	indexIfNotExist: false,
};

const SEARCH_INDEX_PROFILES_DATA_FOR_PREPARE = {
	spaceSavingNoTextfield: {
		mode: ['text', 'varchar'],
	},
	spaceSavingSlowTriePrecision: {
		childType: ['timestamp', 'date', 'time', 'numeric', 'timeuuid'],
		type: ['timestamp', 'date', 'time', 'numeric', 'timeuuid'],
	},
};

const getModifiedProperties = (oldProperties, newProperties) => {
	return Object.entries(newProperties).reduce((acc, [name, value]) => {
		if (REDUNDANT_OPTIONS.includes(name)) {
			return acc;
		}

		if (!oldProperties.hasOwnProperty(name) || !isEqual(oldProperties[name], value)) {
			return { ...acc, [name]: value };
		}

		return acc;
	}, {});
};

const isEmptyValue = value => typeof value !== 'boolean' && !Boolean(value);

const getDeletedProperties = (oldProperties, newProperties) =>
	Object.keys(oldProperties).filter(oldPropertyKey => !newProperties.hasOwnProperty(oldPropertyKey));

const getDefaultPropertiesByName = (propertiesNames, oldProperties, defaultProperties) => {
	return propertiesNames.reduce((acc, propertyName) => {
		if (
			defaultProperties.hasOwnProperty(propertyName) &&
			!isEqual(get(oldProperties, propertyName), defaultProperties[propertyName])
		) {
			return { ...acc, [propertyName]: defaultProperties[propertyName] };
		}

		return acc;
	}, {});
};

const getNotDefaultProperties = (properties = [], defaultProperties = []) => {
	return properties.reduce((acc, property) => (defaultProperties.includes(property) ? acc : [...acc, property]), []);
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
				[property]: newData[property],
			};
		}

		return acc;
	}, {});
};

const getDiffOptions =
	defaultData =>
	(oldData = {}, newData = {}) => {
		const modifyData = getModifiedProperties({ ...defaultData, ...oldData }, { ...defaultData, ...newData });
		const deleteDataProperties = getDeletedProperties(oldData, { ...defaultData, ...newData });

		return {
			modifyData,
			dropData: getDefaultPropertiesByName(deleteDataProperties, oldData, defaultData),
		};
	};

const getDiff =
	defaultData =>
	(oldData = {}, newData = {}) => {
		const modifyData = getModifiedProperties({ ...defaultData, ...oldData }, { ...defaultData, ...newData });

		return {
			modifyData,
			dropData: getDropProperties(oldData, newData, defaultData),
		};
	};

const isEqualIndex =
	(defaultData, redundantProperty) =>
	(oldData = {}, newData = {}) => {
		newData = { ...defaultData, ...newData };
		oldData = { ...defaultData, ...oldData };

		return uniq([...keys(newData), ...keys(oldData)])
			.filter(key => !redundantProperty.includes(key))
			.reduce((isEqual, key) => isEqual?.(newData[key], oldData[key]) ?? false, true);
	};

const prepareSearchIndexProfile = (oldProfiles = [], newProfiles = [], oldColumns = []) => {
	return Object.entries(SEARCH_INDEX_PROFILES_DATA_FOR_PREPARE).reduce((oldProfiles, [profile, profileData]) => {
		if (!newProfiles.includes(profile) || oldProfiles.includes(profile)) {
			return oldProfiles;
		}

		const profileIsNotExist = Object.entries(profileData).reduce((profileValue, [key, keyValues]) => {
			if (profileValue) {
				return profileValue;
			}
			const keysOldColumns = oldColumns.map(column => column[key]).filter(Boolean);
			return keyValues.some(value => keysOldColumns.includes(value));
		}, false);

		return profileIsNotExist ? oldProfiles : [...oldProfiles, profile];
	}, oldProfiles);
};

module.exports = {
	getDiffOptions: getDiffOptions(SEARCH_INDEX_OPTIONS_DEFAULT),
	getDiffConfig: getDiff(SEARCH_INDEX_CONFIG_DEFAULT),
	getDiffIndexProfiles: getDiff({}),
	isEqualIndex: isEqualIndex(INDEX_CONFIG_DEFAULT, [...REDUNDANT_OPTIONS, ...REDUNDANT_PROPERTIES_FOR_INDEX]),
	prepareSearchIndexProfile,
	REDUNDANT_OPTIONS,
};
