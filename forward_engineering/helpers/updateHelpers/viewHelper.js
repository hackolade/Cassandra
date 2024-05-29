const { getViewScript: generateViewScript } = require('../viewHelper');
const { dependencies } = require('../appDependencies');
const { AlterScriptDto } = require('../types/AlterScriptDto');

const getViewName = (keyspaceName, nameView) => `${keyspaceName ? `"${keyspaceName}".` : ''}"${nameView}"`;

const modifyProperties = ['code', 'name'];
const getIsOnlyOptionsModify = compMod => {
	const isModifyProperties = modifyProperties.some(property => {
		const { new: newProperty, old: oldProperty } = compMod[property] || {};
		return !dependencies.lodash.isEqual(newProperty, oldProperty);
	});

	const { tableOptions = {}, comments = {} } = compMod;
	if (comments.old && !comments.new) {
		return false;
	}

	const deletedTabOptions = Object.entries(tableOptions.old || {}).some(
		([oldProperty]) => !tableOptions.new?.[oldProperty],
	);

	return !isModifyProperties && !deletedTabOptions;
};

const getProperty = (newProperty, oldProperty) => {
	if (!oldProperty || !dependencies.lodash.isEqual(newProperty, oldProperty)) {
		return newProperty;
	} else if (!newProperty) {
		return oldProperty;
	}
};

const getDifferentOptions = (tableOptions = {}, comments = {}) => {
	const newComments = getProperty(comments.new, comments.old);
	const { new: newProperties = {}, old: oldProperties = {} } = tableOptions;
	const newTableOptions = Object.entries(newProperties)
		.map(([property, value]) => [property, getProperty(value, oldProperties[property])])
		.filter(([__, value]) => value);
	return {
		comments: newComments,
		tableOptions: Object.fromEntries(newTableOptions),
	};
};

const getAddView = child => {
	const { compMod, properties = {} } = child.role;

	const convertedProperties = Object.entries(properties).map(([name, property]) => [
		property.code || property.name || property.displayName || name,
		property,
	]);

	const dataForScript = {
		containerData: [{ name: compMod.keyspaceName }],
		schema: { properties: Object.fromEntries(convertedProperties) },
		viewData: [child.role],
		ifNotExist: true,
		collectionRefsDefinitionsMap: compMod.collectionData?.collectionRefsDefinitionsMap || {},
		entityData: compMod.collectionData?.entityData || [{}],
	};

	return generateViewScript(dataForScript);
};

const getModifyView = child => {
	const compMod = child.role?.compMod || {};
	const isOnlyOptionsModify = getIsOnlyOptionsModify(compMod);
	if (!isOnlyOptionsModify) {
		const dropViewName = compMod.code?.old || compMod.name?.old;
		const dropScript = dependencies.provider.dropView({ ...child, role: { ...child.role, code: dropViewName } });
		const addScript = getAddView(child);
		return [
			AlterScriptDto.getInstance([dropScript], true, 'deletion', 'view'),
			AlterScriptDto.getInstance([addScript], true, 'add', 'view'),
		];
	}
	const { comments, tableOptions } = getDifferentOptions(compMod.tableOptions, compMod.comments);
	const role = {
		...child.role,
		comments,
		tableOptions,
	};

	return [AlterScriptDto.getInstance([dependencies.provider.alterView(role)], true, 'modify', 'view')];
};

const getViewScript = ({ child, mode }) => {
	if (mode === 'add') {
		return [AlterScriptDto.getInstance([getAddView(child)], true, 'add', 'view')];
	} else if (mode === 'delete') {
		return [AlterScriptDto.getInstance([dependencies.provider.dropView(child)], true, 'deletion', 'view')];
	}
	return getModifyView(child);
};

module.exports = {
	getViewScript,
	getViewName,
};
