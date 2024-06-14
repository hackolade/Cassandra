class ModificationScript {
	/**
	 * @type string
	 * */
	script;

	/**
	 * @type boolean
	 * */
	isDropScript;

	/**
	 * @type boolean
	 * */
	isModifyScript;

	/**
	 * @type boolean
	 * */
	isAddScript;
}

class AlterScriptDto {
	/**
	 * @type {boolean | undefined}
	 * */
	isActivated;

	/**
	 * @type {Array<ModificationScript>}
	 * */
	scripts;

	/**
	 * @param scripts {Array<string>}
	 * @param isActivated {!boolean}
	 * @param scriptPurpose {string}  'deletion' | 'add' | 'modify'
	 * @param modelLevel {?string} 'index' | 'field' | 'udt' | 'renewal' | 'udf' | 'keySpaces' | 'table' | 'view'
	 * @return {Array<AlterScriptDto>}
	 * */
	static getInstances(scripts, isActivated, scriptPurpose, modelLevel) {
		return (scripts || [])
			.filter(Boolean)
			.map(script => this.getInstance([script], isActivated, scriptPurpose, modelLevel));
	}

	/**
	 * @param scripts {Array<string>}
	 * @param isActivated {!boolean}
	 * @param scriptPurpose {string}  'deletion' | 'add' | 'modify'
	 * @param modelLevel {?string} 'index' | 'field' | 'udt' | 'renewal' | 'udf' | 'keySpaces' | 'table' | 'view'
	 * @return {AlterScriptDto | undefined}
	 * */
	static getInstance(scripts, isActivated, scriptPurpose, modelLevel) {
		if (!scripts?.filter(Boolean)?.length) {
			return undefined;
		}
		const scriptPurposes = {
			deletion: false,
			add: false,
			modify: false,
		};

		if (scriptPurposes[scriptPurpose] === undefined) {
			throw new Error(`Unsupported scriptPurpose provided: ${scriptPurpose}`);
		}

		scriptPurposes[scriptPurpose] = true;

		return {
			isActivated,
			scripts: scripts.filter(Boolean).map(script => ({
				isDropScript: scriptPurposes.deletion,
				script,
				isModifyScript: scriptPurposes.modify,
				isAddScript: scriptPurposes.add,
				modelLevel,
			})),
		};
	}
}

module.exports = {
	ModificationScript,
	AlterScriptDto,
};
