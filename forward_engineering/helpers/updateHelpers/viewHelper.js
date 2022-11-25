const { getViewScript: generateViewScript, getOptionsScript } = require('../viewHelper');
const { tab } = require('../generalHelper');
const { dependencies } = require('../appDependencies');
let _;

const setDependencies = ({ lodash }) => _ = lodash;

const scriptData = {
	added: false,
	deleted: false,
	modified: false,
	view: 'view',
};

const getViewName = (keyspaceName, nameView) => `${keyspaceName ? `"${keyspaceName}".` : ''}"${nameView}"`;

const modifyProperties = ['code', 'name'];
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

const getDifferentOptions = (tableOptions = {}, comments = {}) => {
	const newComments = getProperty(comments.new, comments.old);
	const { new: newProperties = {}, old: oldProperties = {} } = tableOptions;
	const newTableOptions = Object.entries(newProperties)
		.map(([property, value]) => [property, getProperty(value, oldProperties[property])])
		.filter(([__, value]) => value);
	return {
		comments: newComments,
		tableOptions: Object.fromEntries(newTableOptions),
	}
}

const getAddView = child => {
	const { compMod, properties = {} } = child.role;

	const convertedProperties = Object.entries(properties).map(([name, property]) => ([property.code || property.name || property.displayName || name, property]));

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
	const optionScript = getOptionsScript({ 
		collectionRefsDefinitionsMap: role.compMod.collectionData?.collectionRefsDefinitionsMap || {}, 
		viewData 
	});
	const viewName = role.name || role.code;
	const keyspaceName = role.compMod.keyspaceName;
	if (optionScript) {
		return `ALTER MATERIALIZED VIEW ${getViewName(keyspaceName, viewName)}\n${tab(optionScript)};`;
	}
}

const getModifyView = child => {
	const compMod = child.role?.compMod || {};
	const isOnlyOptionsModify = getIsOnlyOptionsModify(compMod);
	if (!isOnlyOptionsModify) {
		const dropViewName = compMod.code?.old || compMod.name?.old;
		const dropScript = getDropView({ ...child, role: { ...child.role, code: dropViewName }});
		const addScript = getAddView(child);
		return [{
				...scriptData,
				script: dropScript,
				deleted: true,
			}, {
				...scriptData,
				script: addScript,
				added: true,
			}
		];
	}
	const { comments, tableOptions } = getDifferentOptions(compMod.tableOptions, compMod.comments);
	const role = {
		...child.role,
		comments,
		tableOptions
	};
	return [{
		...scriptData,
		script: getAlterView(role),
		modified: true,
	}];
}

const getViewScript = ({ child, data, mode }) => {
	setDependencies(dependencies);
	
	if (mode === 'add') {
		return [{
			...scriptData,
			added: true,
			script: getAddView(child)
		}];
	} else if (mode === 'delete') {
		return [{
			...scriptData,
			deleted: true,
			script: getDropView(child)
		}];
	}
	return getModifyView(child);
}

module.exports = {
	getViewScript,
}
