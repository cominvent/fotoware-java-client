

# TaxonomyItemInfo

Properties of a taxonomy item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Display name |  |
|**description** | **String** | Description |  [optional] |
|**hasChildren** | **Boolean** | To know if the item has children |  [optional] |
|**field** | **Integer** | Numeric ID of metadata field |  [optional] |
|**href** | **String** | URL of this taxonomy item |  [optional] |
|**taxonomyHref** | **String** | URL of the root of this taxonomy |  [optional] |
|**acl** | **List&lt;String&gt;** | Capabilities / access list:   * &#x60;Set&#x60; - The value of this item can be assigned to a field   * &#x60;Query&#x60; - This item can be used in search queries   * &#x60;Navigate&#x60; - Users can browse children of this item   * &#x60;Hint&#x60; - (currently unused)  |  [optional] |
|**value** | **String** | Metadata value (for search) |  [optional] |
|**customSearch** | **String** | Custom search expression |  [optional] |



