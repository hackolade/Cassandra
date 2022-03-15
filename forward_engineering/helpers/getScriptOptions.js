const getScriptOptions = data => {
	return {
		containers: {
			skipModified: data.options?.additionalOptions?.find(item => item.id === 'excludeContainerAlterStatements')
				?.value,
		},
	};
};

module.exports = {
	getScriptOptions,
};
