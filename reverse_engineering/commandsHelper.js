const CREATE_COLLECTION_COMMAND = 'createCollection';
const REMOVE_COLLECTION_COMMAND = 'removeCollection';
const CREATE_BUCKET_COMMAND = 'createBucket';
const REMOVE_BUCKET_COMMAND = 'removeBucket';
const USE_BUCKET_COMMAND = 'useBucket';
const CREATE_DEFINITION_COMMAND = 'createDefinition';
const ADD_FIELDS_TO_COLLECTION_COMMAND = 'addFieldsToCollection';
const RENAME_FIELD_COMMAND = 'renameField';
const CREATE_VIEW_COMMAND = 'createView';
const ADD_BUCKET_DATA_COMMAND = 'addBucketData';

const DEFAULT_BUCKET = 'New Keyspace';

const convertCommandsToEntities = commands => {
	return commands.reduce(
		(entitiesData, statementData) => {
			const command = statementData && statementData.type;

			if (!command) {
				return entitiesData;
			}

			const bucket = statementData.bucketName || entitiesData.currentBucket;
			if (command === CREATE_COLLECTION_COMMAND) {
				return createCollection(entitiesData, bucket, statementData);
			}

			if (command === REMOVE_COLLECTION_COMMAND) {
				return removeCollection(entitiesData, bucket, statementData);
			}

			if (command === CREATE_BUCKET_COMMAND) {
				return createBucket(entitiesData, statementData);
			}

			if (command === REMOVE_BUCKET_COMMAND) {
				return removeBucket(entitiesData, statementData);
			}

			if (command === USE_BUCKET_COMMAND) {
				return useBucket(entitiesData, statementData);
			}

			if (command === CREATE_DEFINITION_COMMAND) {
				return createDefinition(entitiesData, statementData);
			}

			if (command === ADD_FIELDS_TO_COLLECTION_COMMAND) {
				return addFieldsToCollection(entitiesData, bucket, statementData);
			}

			if (command === RENAME_FIELD_COMMAND) {
				return renameField(entitiesData, bucket, statementData);
			}

			if (command === CREATE_VIEW_COMMAND) {
				return createView(entitiesData, bucket, statementData);
			}

			if (command === ADD_BUCKET_DATA_COMMAND) {
				return addDataToBucket(entitiesData, bucket, statementData);
			}

			return entitiesData;
		},
		{
			entities: [],
			views: [],
			currentBucket: DEFAULT_BUCKET,
			buckets: {},
			definitions: {},
		},
	);
};

const convertCommandsToReDocs = commands => {
	const reData = convertCommandsToEntities(commands);

	return reData.entities.map(entity => {
		const relatedViews = reData.views.filter(view => view.collectionName === entity.collectionName);
		return {
			objectNames: {
				collectionName: entity.collectionName,
			},
			doc: {
				dbName: entity.bucketName,
				collectionName: entity.collectionName,
				modelDefinitions: { definitions: reData.definitions },
				bucketInfo: reData.buckets[entity.bucketName] || {},
				entityLevel: entity.entityLevelData,
				views: relatedViews.map(view => ({
					name: view.name,
					jsonSchema: view.jsonSchema,
				})),
			},
			jsonSchema: entity.schema,
		};
	});
};

const createCollection = (entitiesData, bucket, statementData) => {
	const { entities, currentBucket } = entitiesData;
	if (!statementData.bucketName) {
		return { ...entitiesData, entities: [...entities, { ...statementData, bucketName: bucket }] };
	}

	if (currentBucket === DEFAULT_BUCKET) {
		return {
			...entitiesData,
			entities: [...entities, statementData],
			bucketName: statementData.bucketName,
		};
	} else {
		return { ...entitiesData, entities: [...entities, statementData] };
	}
};

const removeCollection = (entitiesData, bucket, statementData) => {
	const { entities } = entitiesData;
	const index = findEntityIndex(entities, bucket, statementData.collectionName);
	if (index === -1) {
		return entitiesData;
	}

	return { ...entitiesData, entities: remove(entities, index) };
};

const createBucket = (entitiesData, statementData) => {
	const { buckets } = entitiesData;
	const bucketName = statementData.name;
	return {
		...entitiesData,
		currentBucket: bucketName,
		buckets: { ...buckets, [bucketName]: statementData.data || {} },
	};
};

const removeBucket = (entitiesData, statementData) => {
	const { buckets, entities } = entitiesData;
	const bucketName = statementData.name;

	return {
		currentBucket: DEFAULT_BUCKET,
		buckets: omitCaseInsensitive(buckets, bucketName),
		entities: entities.filter(entity => !isEqualCaseInsensitive(entity.bucketName, bucketName)),
	};
};

const useBucket = (entitiesData, statementData) => {
	return {
		...entitiesData,
		currentBucket: statementData.bucketName,
	};
};

const createDefinition = (entitiesData, statementData) => {
	const { definitions } = entitiesData;

	return {
		...entitiesData,
		definitions: {
			...definitions,
			[statementData.name]: {
				type: 'udt',
				properties: statementData.properties,
			},
		},
	};
};

const addFieldsToCollection = (entitiesData, bucket, statementData) => {
	const { entities } = entitiesData;
	const index = findEntityIndex(entities, bucket, statementData.collectionName);
	if (index === -1) {
		return entitiesData;
	}

	const entity = entities[index];
	return {
		...entitiesData,
		entities: [
			...entities.slice(0, index),
			{
				...entity,
				schema: {
					...entity.schema,
					properties: {
						...entity.schema.properties,
						...statementData.data,
					},
				},
			},
			...entities.slice(index + 1),
		],
	};
};

const renameField = (entitiesData, bucket, statementData) => {
	const { entities } = entitiesData;

	const index = findEntityIndex(entities, bucket, statementData.collectionName);
	if (index === -1) {
		return entitiesData;
	}

	const entity = entities[index];
	const field = entity[statementData.nameFrom];

	return {
		...entitiesData,
		entities: [
			...entities.slice(0, index),
			{
				...entity,
				schema: {
					...entity.schema,
					properties: {
						...omitCaseInsensitive(entity.schema.properties, statementData.nameFrom),
						[statementData.nameTo]: field,
					},
				},
			},
			...entities.slice(index + 1),
		],
	};
};

const createView = (entitiesData, bucket, statementData) => {
	const { views } = entitiesData;
	return {
		...entitiesData,
		views: [
			...views,
			{
				...statementData,
				bucketName: statementData.bucketName || bucket,
			},
		],
	};
};

const addDataToBucket = (entitiesData, bucket, statementData) => {
	const { buckets } = entitiesData;
	const bucketName = getCaseInsensitiveKey(buckets, bucket);
	const { key, data } = statementData;

	return {
		...entitiesData,
		buckets: {
			...buckets,
			[bucketName]: {
				...buckets[bucketName],
				[key]: [...(buckets[bucketName][key] || []), data],
			},
		},
	};
};

const findEntityIndex = (entities, bucket, name) => {
	const entityIndex = entities.findIndex(
		entity =>
			isEqualCaseInsensitive(entity.bucketName, bucket) && isEqualCaseInsensitive(entity.collectionName, name),
	);

	if (entityIndex !== -1) {
		return entityIndex;
	}

	return entities.findIndex(entity => entity.collectionName === name);
};

const getCaseInsensitiveKey = (object, key) => {
	if (object[key]) {
		return key;
	}

	return Object.keys(object).find(objectKey => isEqualCaseInsensitive(objectKey, key));
};

const omitCaseInsensitive = (object, key) => {
	const objectCopy = { ...object };
	delete objectCopy[getCaseInsensitiveKey(object, key)];

	return objectCopy;
};

const isEqualCaseInsensitive = (str1, str2) => (str1 || '').toLowerCase() === (str2 || '').toLowerCase();

const remove = (items, index) => [...items.slice(0, index), ...items.slice(index + 1)];

module.exports = {
	convertCommandsToReDocs,
	CREATE_COLLECTION_COMMAND,
	REMOVE_COLLECTION_COMMAND,
	CREATE_BUCKET_COMMAND,
	REMOVE_BUCKET_COMMAND,
	USE_BUCKET_COMMAND,
	CREATE_DEFINITION_COMMAND,
	ADD_FIELDS_TO_COLLECTION_COMMAND,
	RENAME_FIELD_COMMAND,
	CREATE_VIEW_COMMAND,
	ADD_BUCKET_DATA_COMMAND,
};
