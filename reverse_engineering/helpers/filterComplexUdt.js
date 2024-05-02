module.exports = (_) => {
	const handleItem = (properties, record, propertyValue) => {
		if (_.isUndefined(propertyValue)) {
			return record;
		}
		if (propertyValue?.type === 'reference') {
			return;
		}
		if (Array.isArray(record) && propertyValue.items) {
			const handler = propertyValue?.type === 'tuple' ? handleTuple : handleItems;
			return handler(propertyValue.items, record);
		}

		return _.isPlainObject(record) ? filterUdt(propertyValue.properties || {}, record) : record;
	};
	const handleItems = (properties, records) => {
		return records.map((record) => handleItem(properties, record, properties?.[0])).filter(record => {
			return !_.isBoolean(record) && !_.isEmpty(record);
		});
	};

	const handleTuple = (properties, records) => {
		const handlerRecords = records.map((record, index) => handleItem(properties, record, properties?.[index]));

		return handlerRecords.some(record => record === undefined) ? [] : handlerRecords; 
	};

	const handleMap = ({ properties, records }) => {
		return Object.entries(properties).reduce((result, [propertyName, propertyValue]) => {
			return {
				...result,
				[propertyName]: filterUdt(propertyValue?.properties, records?.[propertyName])
			}
		}, {});
	};
	
	const filterUdt = (properties, records) => {
		if (!_.isPlainObject(records)) {
			return records;
		};
		return Object.entries(records).reduce((records, [recordName, recordValues]) => {
			const propertyValue = properties?.[recordName];
			const type = propertyValue?.type;
			if ((type === 'list' || type === 'set') && propertyValue.items) {
				return {
					...records,
					[recordName]: handleItems(propertyValue.items, recordValues),
				};
			} else if (type === 'tuple' && propertyValue.items) {
				return {
					...records,
					[recordName]: handleTuple(propertyValue.items, recordValues),
				}
			} else if (type === 'map' && propertyValue.properties) {
				return {
					...records,
					[recordName]: handleMap({ properties: propertyValue.properties, records: recordValues }),
				}
			}
	
			return {
				...records,
				[recordName]: recordValues,
			};
		}, {});
	};
	
	const filterUdts = (properties, records) => {
		return records.map(record => filterUdt(properties, record));
	};

	return {
		filterUdts,
	}
};
