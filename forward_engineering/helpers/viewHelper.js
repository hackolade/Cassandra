'use strict'

let _;
const { dependencies } = require('./appDependencies');
const { commentDeactivatedStatement } = require('./commentsHelper');
const { retrieveContainerName, retrieveEntityName, retrivePropertyFromConfig, retrieveIsItemActivated } = require('./generalHelper');
const { getOptions, getPrimaryKeyList } = require('./tableHelper');

const setDependencies = ({ lodash }) => _ = lodash;

const columnsToName = column => column.name;

const joinColumns = (columns = [], isParentActivated) => {
	let [activatedColumns, deactivatedColumns] = _.partition(columns, column => _.get(column, 'isActivated', true));
	deactivatedColumns = deactivatedColumns.map(columnsToName).join(', ');
	activatedColumns = activatedColumns.map(columnsToName).join(', ');
	const getDeactivatedStatement = columns => commentDeactivatedStatement(columns, false, isParentActivated, 'INLINE');
	if (!deactivatedColumns.length) {
		return activatedColumns;
	} else if (!activatedColumns.length) {
		return getDeactivatedStatement(deactivatedColumns);
	}
	return activatedColumns + ' ' + getDeactivatedStatement(', ' + deactivatedColumns);
};

const getColumn = (collectionRefsDefinitionsMap, id, columns = {}) => {
	const itemData = collectionRefsDefinitionsMap[id];

	return Object.values(columns).find(column => column.GUID === itemData?.definitionId) || {};
};

const getColumnNames = (collectionRefsDefinitionsMap, columns) => {
	return _.uniqBy(
		Object.keys(columns).map(name => {
			const id = _.get(columns, [name, 'GUID']);

			const itemDataId = Object.keys(collectionRefsDefinitionsMap).find(viewFieldId => {
				const definitionData = collectionRefsDefinitionsMap[viewFieldId];

				return definitionData.definitionId === id;
			});
			const itemData = collectionRefsDefinitionsMap[itemDataId];
			const columnName = `"${_.get(itemData, 'name', name)}"`;
			const isActivated = _.get(columns[name], 'isActivated');

			return { name: columnName, isActivated };
		}), 'name'
	).filter(_.identity);
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

const getWhereStatement = (columns = [], isParentActivated) => {
	const [activatedColumns, deactivatedColumns] = _.partition(columns, column => _.get(column, 'isActivated', true))
	if (_.isEmpty(columns) || deactivatedColumns.length === columns.length) {
		return '';
	}

	const generateNewStatement = name => `AND ${name} IS NOT NULL`;
	const deactivatedColumnsScript = deactivatedColumns.map(column => generateNewStatement(column.name)).join(' ');
	const commentDeactivatedColumnsScript = commentDeactivatedStatement(deactivatedColumnsScript, false, isParentActivated, 'INLINE');
	const activatedColumnsScript = [...activatedColumns]
		.reduce((statement, column) => {
			if (!statement) {
				return `${column.name} IS NOT NULL`;
			}

			return `${statement} ${generateNewStatement(column.name)}`;
		}, '');

	return `WHERE ${activatedColumnsScript}${deactivatedColumnsScript ? ' ' + commentDeactivatedColumnsScript : ''}`;
};

const getNamesByIds = (collectionRefsDefinitionsMap, ids, columns = {}) => {
	return ids.reduce((hash, id) => {
		const name =  _.get(collectionRefsDefinitionsMap, [id, 'name']);
		const column = getColumn(collectionRefsDefinitionsMap, id, columns);
		const isActivated = column.isActivated;
		if (!name) {
			return hash;
		}
		return Object.assign({}, hash, {
			[id]: { name: name, isActivated }
		});
	}, {});
};

const getClusteringKeyData = (collectionRefsDefinitionsMap, viewData, columns) => {
	const clusteringKeys = retrivePropertyFromConfig(viewData, 0, 'compositeClusteringKey', []);

	const clusteringKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		clusteringKeys.map(key => key.keyId),
		columns
	);

	return { clusteringKeys, clusteringKeysHash };
};

const getPrimaryKeys = (collectionRefsDefinitionsMap, viewData, columns) => {
	return [
		...getCompositeKeys({ collectionRefsDefinitionsMap, viewData, key: 'compositePartitionKey', columns }),
		...getCompositeKeys({ collectionRefsDefinitionsMap, viewData, key: 'compositeClusteringKey', columns }),
	];
};

const getCompositeKeys = ({ collectionRefsDefinitionsMap, viewData, key, columns }) => {
	const partitionKeys = retrivePropertyFromConfig(viewData, 0, key, []);
	const partitionKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		partitionKeys.map(key => key.keyId),
		columns
	);

	return _.values(partitionKeysHash).filter(_.identity).map(field => ({ ...field, name: `"${field.name}"` }));
};

const getPrimaryKeyScript = ({ collectionRefsDefinitionsMap, viewData, isParentActivated, columns }) => {
	const partitionKeys = retrivePropertyFromConfig(viewData, 0, 'compositePartitionKey', []);
	const partitionKeysHash = getNamesByIds(
		collectionRefsDefinitionsMap,
		partitionKeys.map(key => key.keyId),
		columns
	);
	const clusteringKeyData = getClusteringKeyData(collectionRefsDefinitionsMap, viewData, columns);

	const keysList = getPrimaryKeyList(partitionKeysHash, clusteringKeyData.clusteringKeysHash, isParentActivated);
	if (!keysList) {
		return '';
	}

	return `PRIMARY KEY (${keysList})`;
};

const addTab = script => _.trim(script || '').replace(/  /g, '    ');

const getOptionsScript = ({ collectionRefsDefinitionsMap, viewData, columns, isParentActivated }) => {
	setDependencies(dependencies);
	const clusteringKeyData = getClusteringKeyData(collectionRefsDefinitionsMap, viewData, columns);
	const tableComment = retrivePropertyFromConfig(viewData, 0, 'comments', '');
	const tableOptions = retrivePropertyFromConfig(viewData, 0, 'tableOptions', '');

	return addTab(getOptions(
		clusteringKeyData.clusteringKeys,
		clusteringKeyData.clusteringKeysHash,
		'',
		tableOptions,
		tableComment,
		isParentActivated
	));
};

const getEmptyViewScript = ({ 
	viewData, 
	entitySchema, 
	entityData, 
	entityName, 
	isParentActivated, 
	collectionRefsDefinitionsMap,
	columns
}) => {
	let script = [];

	const entityColumns = entitySchema?.properties || {};
	const entityFieldsMap = Object.keys(entityColumns).reduce(( fieldsMap, key ) => {
		const field = entitySchema.properties[key];

		return {
			...fieldsMap,
			[field.GUID]: field,
		};
	}, {});
	const primaryKeyScript = getPrimaryKeyScript({ entityFieldsMap, entityData, isParentActivated, columns });
	const optionsScript = getOptionsScript({ 
		collectionRefsDefinitionsMap: {}, 
		viewData, 
		columns, 
		isParentActivated
	});

	script.push(`AS SELECT * FROM ${entityName}`);
	script.push(getWhereStatement(getPrimaryKeys(collectionRefsDefinitionsMap, entityData, columns), isParentActivated));

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
		const isParentActivated = isKeyspaceActivated && isViewActivated;

		const primaryKeyScript = getPrimaryKeyScript({ collectionRefsDefinitionsMap, viewData, isParentActivated, columns });
		const optionsScript = getOptionsScript({ collectionRefsDefinitionsMap, viewData, columns, isParentActivated });
		script.push(`CREATE MATERIALIZED VIEW ${ifNotExist? `IF NOT EXISTS `:``}${name}`);
	
		if (_.isEmpty(columns)) {
			script = script.concat(getEmptyViewScript({
				viewData,
				entitySchema,
				entityData,
				entityName: tableName,
				isParentActivated,
				collectionRefsDefinitionsMap,
				columns
			}));
		} else {
			const columnsData = getColumnNames(collectionRefsDefinitionsMap, columns);
			const joinedColumns = joinColumns(columnsData, isParentActivated);
			script.push(`AS SELECT ${joinedColumns}`);
			script.push(`FROM ${tableName}`);
			script.push(
				getWhereStatement(
					_.uniq([
						...getPrimaryKeys(collectionRefsDefinitionsMap, viewData, columns),
						...getCompositeKeys({ collectionRefsDefinitionsMap, viewData, key: 'whereClause', columns })
					]),
					isParentActivated
				)
			);
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
