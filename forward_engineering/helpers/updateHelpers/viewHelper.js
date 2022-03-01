const { getViewScript: generateViewScript, getOptionsScript } = require('../viewHelper');
const { tab } = require('../generalHelper');
const { dependencies } = require('../appDependencies');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const getViewName = (keyspaceName, nameView) => `${keyspaceName ? `"${keyspaceName}".` : ''}"${nameView}"`;

const modifyProperties = ['code', 'name', 'viewOn'];
const getIsOnlyOptionsModify = compMod => {
	const isModifyProperties = modifyProperties.some(property => {
		const { new: newProperty, old: oldProperty } = compMod[property] || {};
		return !_.isEqual(newProperty, oldProperty);
	});

	const { tableOptions = {}, comments = {} } = compMod;
	if (comments.old && !comments.new) {
		return false;
	}

	const deletedTabOptions = Object.entries(tableOptions.old || {}).some(([oldProperty]) => !tableOptions.new?.[oldProperty]);

	return !isModifyProperties && !deletedTabOptions;
}

const getProperty = (newProperty, oldProperty) => {
	if (!oldProperty || !_.isEqual(newProperty, oldProperty)) {
		return newProperty;
	} else if (!newProperty) {
		return oldProperty;
	}
}

const getDifferentOptions = (tableOptions, comments = {}) => {
	const newComments = getProperty(comments.new, comments.old);
	const { new: newProperties, old: oldProperties } = tableOptions;
	const newTableOptions = Object.entries(newProperties)
		.map(([property, value]) => [property, getProperty(value, oldProperties[property])])
		.filter(([__, value]) => value);
	return {
		comments: newComments,
		tableOptions: Object.fromEntries(newTableOptions),
	}
}

const getAddView = child => {
	const { compMod, properties = [] } = child.role;

	const convertedProperties = properties.map(property => ([property.code || property.name, property]));

	const dataForScript = {
		containerData: [{ name: compMod.keyspaceName }],
		schema: { properties: Object.fromEntries(convertedProperties) },
		viewData: [child.role],
		ifNotExist: true,
		collectionRefsDefinitionsMap: compMod.collectionData?.collectionRefsDefinitionsMap || {}, 
		entityData: compMod.collectionData?.entityData || [{}],
	}

	return generateViewScript(dataForScript);
}

const getDropView = child => {
	const { compMod, name, code } = child.role;

	return `DROP MATERIALIZED VIEW IF EXISTS ${getViewName(compMod.keyspaceName, code || name)};`;
}

const getAlterView = role => {
	const viewData = [role];
	const optionScript = getOptionsScript(role.compMod.collectionData?.collectionRefsDefinitionsMap || {}, viewData);
	const viewName = role.name || role.code;
	const keyspaceName = role.compMod.keyspaceName;
	if (optionScript) {
		return `ALTER MATERIALIZED VIEW ${getViewName(keyspaceName, viewName)}\n${tab(optionScript)}`;
	}
}

const getModifyView = child => {
	const compMod = child.role?.compMod || {};
	const isOnlyOptionsModify = getIsOnlyOptionsModify(compMod);
	if (!isOnlyOptionsModify) {
		const dropViewName = compMod.code?.old || compMod.name?.old;
		const dropScript = getDropView({ ...child, role: { ...child.role, code: dropViewName }});
		const addScript = getAddView(child);
		return `${dropScript}\n\n${addScript}`;
	}
	const { comments, tableOptions } = getDifferentOptions(compMod.tableOptions, compMod.comments);
	const role = {
		...child.role,
		comments,
		tableOptions
	}
	return getAlterView(role);
}

const getViewScript = ({ child, data, mode }) => {
	setDependencies(dependencies);
	const result = {
		added: false,
		deleted: false,
		modified: false,
		viewName: 'view',
	}
	
	if (mode === 'add') {
		return {
			...result,
			added: true,
			script: getAddView(child)
		};
	} else if (mode === 'delete') {
		return {
			...result,
			deleted: true,
			script: getDropView(child)
		};
	}
	return {
		...result,
		modified: true,
		script: getModifyView(child)
	};
}

module.exports = {
	getViewScript,
}