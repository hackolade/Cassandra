class PersistenceSchemaChild {
    /**
     * JSON Schema version
     * @type string
     * */
    $schema

    /**
     * Type of PersistenceSchemaChild
     * @type string
     * */
    type

    /**
     *
     * @type string
     * */
    title

    /**
     *
     * @type object
     * */
    properties
    
    /**
     * @type boolean
     * */
    isActivated

    /**
     * @type boolean
     * */
    additionalProperties

    /**
     * @type boolean
     * */
    tableIfNotExist

    /**
     * @type boolean
     * */
    searchIndexIfNotExist

    /**
     * @type string
     * */
    GUID
}