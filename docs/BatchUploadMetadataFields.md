

# BatchUploadMetadataFields

API model to describe the metadata fields updated in the upload

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Numeric ID of the destination metadata field |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | Metadata action to perform |  [optional] |
|**value** | **Object** | Metadata value(s) to set or add. This parameter is optional or required, depending on the action. Depending on the action and field type, this can be a single value (given as a string) or zero or multiple values (given as an array of strings).  |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| APPEND | &quot;append&quot; |
| PREPEND | &quot;prepend&quot; |
| ERASE | &quot;erase&quot; |



