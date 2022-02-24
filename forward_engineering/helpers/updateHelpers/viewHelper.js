const { getViewScript: generateViewScript, getOptionsScript } = require('../viewHelper');

const getNameScript = (keyspaceName, nameView) => `${keyspaceName ? `"${keyspaceName}".` : ''}"${nameView}"`;

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

	return `DROP MATERIALIZED VIEW IF EXISTS ${getNameScript(compMod.keyspaceName, code || name)};`;
}

const getModifyView = child => {
	const dropScript = getDropView(child);
	const addScript = getAddView(child);
	
	return `${dropScript}\n${addScript}`;
}

const getViewScript = ({ child, data, mode }) => {
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