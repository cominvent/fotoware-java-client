

# MetadataViewBuiltinFieldsTags

Description of the built-in tags field

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**MetadataViewBuiltinFieldsTagsField**](MetadataViewBuiltinFieldsTagsField.md) |  |  [optional] |
|**taxonomyOnly** | **Boolean** | true if input masks should only allow users to select values from a taxonomy associated with the field. false if users should be allowed to enter arbitrary values that conform with the remaining specifications  |  [optional] |
|**isWritable** | **Boolean** | true if the field may be edited in metadata update and upload requests. false if the field is read-only |  [optional] |
|**required** | **Boolean** | true if the field must have a non-empty value (or at least one value if multi-instance is true). false if the field may be empty  |  [optional] |



