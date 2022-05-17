'use strict'

let _;
const { dependencies } = require('./appDependencies');
const { commentDeactivatedStatement } = require('./commentsHelper');
const { retrieveContainerName, retrieveEntityName, retrivePropertyFromConfig, retrieveIsItemActivated } = require('./generalHelper');
const { getOptions, getPrimaryKeyList } = require('./tableHelper');

const setDependencies = ({ lodash }) => _ = lodash;

const getColumnNames = (collectionRefsDefinitionsMap, columns) => {
	return _.uniq(Object.keys(columns).map(name => {
		const id = _.get(columns, [name, 'GUID']);

		const itemDataId = Object.keys(collectionRefsDefinitionsMap).find(viewFieldId => {
			const definitionData = collectionRefsDefinitionsMap[viewFieldId];

			return definitionData.definitionId === id;
		});
		const itemData = collectionRefsDefinitionsMap[itemDataId];

		return `"${_.get(itemData, 'name', name)}"`;
	})).filter(_.identity);
};

const getViewColumns = (collectionRefsDefinitionsMap, properties) => {
	return Object.keys(properties).reduce((columns, name) => {
		const id = _.get(properties, [name, 'GUID']);

		const itemDataId = Object.keys(collectionRefsDefinitionsMap).find(viewFieldId => {
			const definitionData = collectionRefsDefinitionsMap[viewFieldId];

			return definitionData.definitionId === id;
		});
		const itemData = collectionRefsDefinitionsMap[itemDataId];

		return {
			...columns,
			[_.get(itemData, 'name', name)]: properties[name],
		};
	}, {});
};

const getWhereStatement = columnsNames => {
	if (_.isEmpty(columnsNames)) {
		return '';
	}
	return 'WHERE ' + columnsNames
		.reduce((statement, name) => {
			if (!statement) {
				return `${name} IS NOT NULL`;
			}

			return `${statement} AND ${name} IS NOT NULL`;
		}, '');
};

const getNamesByIds = (collectionRefsDefinitionsMap, ids) => {
	return ids.reduce((hash, id) => {
		const name =  _.get(collectionRefsDefinitionsMap, [id, 'name']);
		if (!name) {
			return hash;
		}
		return Object.assign({}, hash, {
			[id]: { name: name }
		});
	}, {});
};

const getClusteringKeyData = (collectionRefsDefinitionsMap, viewData) => {
	const clusteringKeys = retrivePropertyFromConfig(viewData, 0, 'compositeClusteringKey', []);

	const clusteringKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		clusteringKeys.map(key => key.keyId)
	);

	return { clusteringKeys, clusteringKeysHash };
};

const getPrimaryKeyScript = (collectionRefsDefinitionsMap, viewData, isParentActivated) => {
	const partitionKeys = retrivePropertyFromConfig(viewData, 0, 'compositePartitionKey', []);
	const partitionKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		partitionKeys.map(key => key.keyId)
	);
	const clusteringKeyData = getClusteringKeyData(collectionRefsDefinitionsMap, viewData);

	const keysList = getPrimaryKeyList(partitionKeysHash, clusteringKeyData.clusteringKeysHash, isParentActivated);
	if (!keysList) {
		return '';
	}

	return `PRIMARY KEY (${keysList})`;
};

const addTab = script => _.trim(script || '').replace(/  /g, '    ');

const getOptionsScript = (collectionRefsDefinitionsMap, viewData) => {
	setDependencies(dependencies);
	const clusteringKeyData = getClusteringKeyData(collectionRefsDefinitionsMap, viewData);
	const tableComment = retrivePropertyFromConfig(viewData, 0, 'comments', '');
	const tableOptions = retrivePropertyFromConfig(viewData, 0, 'tableOptions', '');

	return addTab(getOptions(
		clusteringKeyData.clusteringKeys,
		clusteringKeyData.clusteringKeysHash,
		'',
		tableOptions,
		tableComment
	));
};

const getEmptyViewScript = ({ viewData, entitySchema, entityData, entityName, isViewChildrenActivated }) => {
	let script = [];

	const entityColumns = entitySchema?.properties || {};
	const entityFieldsMap = Object.keys(entityColumns).reduce(( fieldsMap, key ) => {
		const field = entitySchema.properties[key];

		return {
			...fieldsMap,
			[field.GUID]: field,
		};
	}, {});
	const primaryKeyScript = getPrimaryKeyScript(entityFieldsMap, entityData, isViewChildrenActivated);
	const optionsScript = getOptionsScript({}, viewData);

	script.push(`AS SELECT * FROM ${entityName}`);
	script.push(getWhereStatement(Object.keys(entityColumns)));

	if (primaryKeyScript) {
		script.push(primaryKeyScript);
	}
	
	if (optionsScript) {
		script.push(optionsScript);
	}

	return script;
};

module.exports = {
	getOptionsScript,
	getViewScript({
		schema,
		entitySchema,
		viewData,
		entityData,
		containerData,
		collectionRefsDefinitionsMap,
		isKeyspaceActivated = true,
		ifNotExist = false
	}) {
		setDependencies(dependencies);
		let script = [];
		const columns = getViewColumns(collectionRefsDefinitionsMap, schema.properties || {});
		const view = _.first(viewData) || {};

		const entityName = retrieveEntityName(entityData);
		const bucketName = retrieveContainerName(containerData);
		const tableName = bucketName ? `"${bucketName}"."${entityName}"` : `"${entityName}"`;
		const viewName = view.code || view.name;
		const name = bucketName ? `"${bucketName}"."${viewName}"` : `"${viewName}"`;
		
		const isViewActivated = retrieveIsItemActivated(entityData) && retrieveIsItemActivated(viewData);
		const isViewChildrenActivated = isKeyspaceActivated && isViewActivated;

		const primaryKeyScript = getPrimaryKeyScript(collectionRefsDefinitionsMap, viewData, isViewChildrenActivated);
		const optionsScript = getOptionsScript(collectionRefsDefinitionsMap, viewData);
		script.push(`CREATE MATERIALIZED VIEW ${ifNotExist? `IF NOT EXISTS `:``}${name}`);
	
		if (_.isEmpty(columns)) {
			script.concat(getEmptyViewScript({
				viewData,
				entitySchema,
				entityData,
				entityName: tableName,
				isViewChildrenActivated,
			}));
		} else {
			const columnsNames = getColumnNames(collectionRefsDefinitionsMap, columns);
			script.push(`AS SELECT ${columnsNames.join(', ')}`);
			script.push(`FROM ${tableName}`);
			script.push(getWhereStatement(columnsNames));
			if (primaryKeyScript) {
				script.push(primaryKeyScript);
			}
	
			if (optionsScript) {
				script.push(optionsScript);
			}
		}
		
		return commentDeactivatedStatement(
			script.join('\n  ') + ';',
			isViewActivated,
			isKeyspaceActivated
		);
	}
};
