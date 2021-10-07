const commandsHelper = require('./helpers/commandsHelper');

const CREATE_COLLECTION_COMMAND = 'createCollection';
const REMOVE_COLLECTION_COMMAND = 'removeCollection';
const CREATE_BUCKET_COMMAND = 'createBucket';
const REMOVE_BUCKET_COMMAND = 'removeBucket';
const UPDATE_BUCKET_COMMAND = 'updateBucket';
const USE_BUCKET_COMMAND = 'useBucket';
const CREATE_DEFINITION_COMMAND = 'createDefinition';
const ADD_FIELDS_TO_COLLECTION_COMMAND = 'addFieldsToCollection';
const RENAME_FIELD_COMMAND = 'renameField';
const CREATE_VIEW_COMMAND = 'createView';
const ADD_BUCKET_DATA_COMMAND = 'addBucketData';
const ADD_COLLECTION_LEVEL_INDEX_COMMAND = 'addCollectionLevelIndex';
const ADD_COLLECTION_LEVEL_SEARCH_INDEX_COMMAND = 'addCollectionLevelSearchIndex'
const UPDATE_ENTITY_LEVEL_DATA_COMMAND = 'updateEntityLevelData';
const UPDATE_VIEW_LEVEL_DATA_COMMAND = 'updateViewLevelData';
const ADD_FIELDS_TO_DEFINITION_COMMAND = 'addFieldsToDefinition'

const DEFAULT_BUCKET = 'New Keyspace';

const initialState = {
    entities: [],
    views: [],
    currentBucket: DEFAULT_BUCKET,
    buckets: {},
    definitions: {},
};

const convertCommandsToEntities = commands => {
    return commands.reduce((entitiesData, statementData) => {
        const command = statementData && statementData.type;
    
        const action = commandActionsMap[command];

        if (!action) {
            return entitiesData;
        }

        return action(entitiesData, statementData);
    }, initialState);
};


const convertCommandsToReDocs = commands => {
    const { entities, views, definitions, buckets} = convertCommandsToEntities(commands);

    return entities.map(entity => {
        const relatedViews = views.filter(view => view.collectionName.toLowerCase() === entity.collectionName.toLowerCase());

        return {
            objectNames: {
                collectionName: entity.collectionName
            },
            doc: {
                dbName: entity.bucketName,
                collectionName: entity.collectionName,
                modelDefinitions: { definitions },
                bucketInfo: buckets[entity.bucketName] || {},
                entityLevel: entity.entityLevelData,
                views: relatedViews.map(view => ({
                    name: view.name,
                    jsonSchema: view.jsonSchema,
                    data: view.data
                }))
            },
            jsonSchema: entity.schema
        }
    });
};

const createCollection = (entitiesData, statementData) => {
    const { entities, currentBucket } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);

    if (!statementData.bucketName) {
        return { ...entitiesData, entities: [ ...entities, { ...statementData, bucketName: bucket } ] };
    }

    if (currentBucket === DEFAULT_BUCKET) {
        return {
            ...entitiesData,
            entities: [ ...entities, statementData ],
            bucketName: statementData.bucketName
        };
    } else {
        return { ...entitiesData, entities: [ ...entities, statementData ] };
    }
};

const removeCollection = (entitiesData, statementData) => {
    const { entities } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const index = commandsHelper.findEntityIndex(entities, bucket, statementData.collectionName)
    if (index === -1) {
        return entitiesData;
    }

    return { ...entitiesData, entities: commandsHelper.remove(entities, index) }
};

const createBucket = (entitiesData, statementData) => {
    const { buckets } = entitiesData;
    const bucketName = statementData.name;
    return {
        ...entitiesData,
        currentBucket: bucketName,
        buckets: { ...buckets, [bucketName]: statementData.data || {}}
    };
};

const updateBucket = (entitiesData, statementData) => {
    const { buckets } = entitiesData;
    const bucketName = commandsHelper.getCaseInsensitiveKey(buckets, statementData.name);
    const bucket = entitiesData[bucketName];
    if (!bucket) {
        return entitiesData;
    }

    return {
        ...entitiesData,
        currentBucket: bucketName,
        buckets: { ...buckets, [bucketName]: { ...bucket, ...(statementData.data || {}) } }
    };
};

const removeBucket = (entitiesData, statementData) => {
    const { buckets, entities } = entitiesData;
    const bucketName = statementData.name;

    return {
        currentBucket: DEFAULT_BUCKET,
        buckets: commandsHelper.omitCaseInsensitive(buckets, bucketName),
        entities: entities.filter(entity => !commandsHelper.isEqualCaseInsensitive(entity.bucketName, bucketName))
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
                properties:	statementData.properties
            }
        }
    };
};

const addFieldsToDefinition = (entitiesData, statementData) => {
    const { definitions } = entitiesData;
    const definitionName = commandsHelper.getCaseInsensitiveKey(definitions, statementData.name);
    const definition = definitions[definitionName];
    if (!definition) {
        return entitiesData;
    }

    return {
        ...entitiesData,
        definitions: {
            ...definitions,
            [definitionName]: {
                ...definition,
                properties: {
                    ...definition.properties,
                    ...statementData.data
                }
            }
        }
    }
}

const addFieldsToCollection = (entitiesData, statementData) => {
    const { entities } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const index = commandsHelper.findEntityIndex(entities, bucket, statementData.collectionName);
    if (index === -1) {
        return entitiesData;
    }

    const entity = entities[index];

    return {
        ...entitiesData,
        entities: commandsHelper.set(entities, index, {
            ...entity,
            schema: {
                ...entity.schema,
                properties: {
                    ...entity.schema.properties,
                    ...statementData.data
                }
            }
        })
    };
};

const updateEntityLevelData = (entitiesData, statementData) => {
    const { entities } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const index = commandsHelper.findEntityIndex(entities, bucket, statementData.collectionName);
    if (index === -1) {
        return entitiesData;
    }

    const entity = entities[index];

    return {
        ...entitiesData,
        entities: commandsHelper.set(entities, index, {
            ...entity,
            entityLevelData: commandsHelper.merge(entity.entityLevelData, statementData.data)
        })
    };
}


const updateViewLevelData = (entitiesData, statementData) => {
    const { views } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const index = commandsHelper.findEntityIndex(views, bucket, statementData.name);

    const view = views[index];

    return {
        ...entitiesData,
        views: commandsHelper.set(views, index, {
            ...view,
            data: commandsHelper.merge(view.data, statementData.data)
        })
    };
}

const addIndexToCollection = (entitiesData, statementData) => {
    const { entities } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const entityIndex = commandsHelper.findEntityIndex(entities, bucket, statementData.collectionName);
    if (entityIndex === -1) {
        return entitiesData;
    }
    
    const entity = entities[entityIndex];
    const entityLevelData = entity.entityLevelData || {};
    const indexes = [
        ...entityLevelData.SecIndxs || [],
        {
            name: statementData.name,
            SecIndxKey: [{name: statementData.column, type: statementData.columnType}],
            indexType: statementData.indexType,
            customOptions: statementData.customOptions,
            indexIfNotExist: statementData.indexIfNotExist
        }
    ];

    return {
        ...entitiesData,
        entities: commandsHelper.set(entities, entityIndex, {
            ...entity,
            entityLevelData: {
                ...entityLevelData,
                SecIndxs: indexes
            }
        })
    };
};

const addSearchIndexToCollection = (entitiesData, statementData) => {
    let indexData = {...statementData}
    const { entities } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const entityIndex = commandsHelper.findEntityIndex(entities, bucket, statementData.collectionName);
    if (entityIndex === -1) {
        return entitiesData;
    }
    const entity = entities[entityIndex];
    const entityLevelData = entity.entityLevelData || {};
    if(indexData.searchIndexColumns.length ===  1 && indexData.searchIndexColumns[0].key[0] === '*'){
        const indexColumnOptions = indexData.searchIndexColumns[0];
        const entityColumnsNames = Object.keys(entity.schema.properties)
        const indexColumns = entityColumnsNames.map(colName => ({...indexColumnOptions, ...{key: [colName], }}))
        indexData = { ...indexData, searchIndexColumns: indexColumns }
    }

    return {
        ...entitiesData,
        entities: commandsHelper.set(entities, entityIndex, {
            ...entity,
            entityLevelData: {
                ...entityLevelData,
                ...indexData
            }
        })
    };
};

const renameField = (entitiesData, statementData) => {
    const { entities } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const index = commandsHelper.findEntityIndex(entities, bucket, statementData.collectionName);
    if (index === -1) {
        return entitiesData;
    }

    const entity = entities[index];
    const field = entity[statementData.nameFrom];

    return {
        ...entitiesData,
        entities: commandsHelper.set(entities, index, {
            ...entity,
            schema: {
                ...entity.schema,
                properties: {
                    ...commandsHelper.omitCaseInsensitive(entity.schema.properties, statementData.nameFrom),
                    [statementData.nameTo]: field
                }
            }
        })
    }
};

const createView = (entitiesData, statementData) => {
    const { views } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);

    return {
        ...entitiesData,
        views: [ ...views, {
            ...statementData,
            bucketName: bucket
        }]
    };
};

const addDataToBucket = (entitiesData, statementData) => {
    const { buckets } = entitiesData;
    const bucket = commandsHelper.getCurrentBucket(entitiesData, statementData);
    const bucketName = commandsHelper.getCaseInsensitiveKey(buckets, bucket);
    const { key, data } = statementData;

    return {
        ...entitiesData,
        buckets: {
            ...buckets,
            [bucketName]: {
                ...buckets[bucketName],
                [key]: [
                    ...(buckets[bucketName][key] || []),
                    data
                ]
            }
        }
    }
};

const commandActionsMap = {
    [CREATE_COLLECTION_COMMAND]: createCollection,
    [REMOVE_COLLECTION_COMMAND]: removeCollection,
    [CREATE_BUCKET_COMMAND]: createBucket,
    [UPDATE_BUCKET_COMMAND]: updateBucket,
    [REMOVE_BUCKET_COMMAND]: removeBucket,
    [USE_BUCKET_COMMAND]: useBucket,
    [CREATE_DEFINITION_COMMAND]: createDefinition,
    [ADD_FIELDS_TO_COLLECTION_COMMAND]: addFieldsToCollection,
    [UPDATE_ENTITY_LEVEL_DATA_COMMAND]: updateEntityLevelData,
    [UPDATE_VIEW_LEVEL_DATA_COMMAND]: updateViewLevelData,
    [RENAME_FIELD_COMMAND]: renameField,
    [CREATE_VIEW_COMMAND]: createView,
    [ADD_BUCKET_DATA_COMMAND]: addDataToBucket,
    [ADD_COLLECTION_LEVEL_INDEX_COMMAND]: addIndexToCollection,
    [ADD_COLLECTION_LEVEL_SEARCH_INDEX_COMMAND]: addSearchIndexToCollection,
    [ADD_FIELDS_TO_DEFINITION_COMMAND]: addFieldsToDefinition,
};

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
    UPDATE_BUCKET_COMMAND,
    ADD_COLLECTION_LEVEL_INDEX_COMMAND,
    ADD_COLLECTION_LEVEL_SEARCH_INDEX_COMMAND,
    UPDATE_ENTITY_LEVEL_DATA_COMMAND,
    UPDATE_VIEW_LEVEL_DATA_COMMAND,
    ADD_FIELDS_TO_DEFINITION_COMMAND,
};
