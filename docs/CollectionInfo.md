

# CollectionInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ancestors** | [**List&lt;AssetAncestorsInner&gt;**](AssetAncestorsInner.md) | Lists the collection to which the asset belongs, is parent collection and the remaining ancestors in the collection hierarchy. Can be used for rendering a breadcrumb, implementing an \&quot;up\&quot; button or finding the collection to which this instance of the asset belongs.  |  [optional] |
|**alertHref** | **Object** | alertHref |  [optional] |
|**altOrders** | [**List&lt;CollectionAltOrdersInner&gt;**](CollectionAltOrdersInner.md) |  |  [optional] |
|**archived** | **String** | If not null, then the collection has been archived, and this is the date and time on which the collection was archived. Unless stated otherwise, a collection list never contains archived collections, so API clients can ignore this field.  |  [optional] |
|**canBeArchived** | **Boolean** | true if it is possible to archive the collection, false otherwise. |  [optional] |
|**canBeDeleted** | **Boolean** | true if it is possible to delete the collection, false otherwise. |  [optional] |
|**canCopyTo** | **Boolean** | true if it is possible to copy assets to this collection, false otherwise. |  [optional] |
|**canCreateFolders** | **Boolean** | true if it is possible to create new folders when copying, moving or uploading assets to this collection, false otherwise.  |  [optional] |
|**canHaveChildren** | **Boolean** | true if this collection may have sub collection, false otherwise |  [optional] |
|**canIngestToChildren** | **Boolean** | true if there may be sub collections where at least one of canCopyTo, canMoveTo or canUploadTo is true, false otherwise. |  [optional] |
|**canMoveTo** | **Boolean** | true if it is possible to move assets to this collection, false otherwise. |  [optional] |
|**canSelect** | **Boolean** | true if it is possible to select assets in user interfaces for this collection, false otherwise |  [optional] |
|**canUploadTo** | **Boolean** | true if it is possible to upload assets to this collection, false otherwise. |  [optional] |
|**clearSearch** | [**CollectionInfoClearSearch**](CollectionInfoClearSearch.md) |  |  [optional] |
|**create** | [**List&lt;CollectionCreateInner&gt;**](CollectionCreateInner.md) | create |  [optional] |
|**created** | **String** | Date and time on which the collection was created |  [optional] |
|**data** | **String** | User-specific data URL of the collection. Usually, this is the URL that the collection was requested from. In collection lists, this is the URL that should be followed in order to get assets and sub collections of the collection.  |  [optional] |
|**dataTemplate** | **String** |  |  [optional] |
|**deleted** | **String** | If not null, then the collection has been deleted, and this is the date and time on which the collection was deleted. Unless stated otherwise, a collection list never contains deleted collections, so API clients can ignore this field.  |  [optional] |
|**description** | **String** | Long description of the collection |  [optional] |
|**edit** | **Boolean** | edit |  [optional] |
|**hasChildren** | **Boolean** | true if the collection can have sub collections, false otherwise |  [optional] |
|**href** | **String** | Canonical public URL of the collection. |  [optional] |
|**isFolderNavigationEnabled** | **Boolean** | true if folder navigation is enabled in user interfaces for this collection, false otherwise |  [optional] |
|**isLinkCollection** | **Boolean** | true if this collection is a link collection (e.g., an album), false otherwise. |  [optional] |
|**isSearchable** | **Boolean** | true if the collection supports search, false otherwise |  [optional] |
|**isSelectable** | **Boolean** | true if assets in the collection can be selected in the selection widget, false otherwise |  [optional] |
|**isSmartFolderNavigationEnabled** | **Boolean** |  |  [optional] |
|**matchingHref** | **String** |  |  [optional] |
|**metadataEditor** | [**CollectionInfoMetadataEditor**](CollectionInfoMetadataEditor.md) |  |  [optional] |
|**modified** | **String** | Date and time on which the collection last modified. If the collection was never modified, then this is equal to created. |  [optional] |
|**name** | **String** | Displayable title of the collection |  [optional] |
|**orderRootHref** | **String** |  |  [optional] |
|**originalURL** | **String** | If the collection is a search result, then this is the URL of the collection the search was performed in (without any search parameters).  |  [optional] |
|**permissions** | **List&lt;Permission&gt;** | List of permissions that the requesting user has on this asset |  [optional] |
|**pin** | **Object** | pin |  [optional] |
|**posterAsset** | **String** | URL of the asset which is currently used as poster image for this collection. May be null. |  [optional] |
|**posterImages** | [**List&lt;AssetPreviewsInner&gt;**](AssetPreviewsInner.md) | posterImages |  [optional] |
|**propertyValidations** | [**List&lt;CollectionPropertyValidationsInner&gt;**](CollectionPropertyValidationsInner.md) |  |  [optional] |
|**props** | [**CollectionProps**](CollectionProps.md) |  |  [optional] |
|**reorder** | **Object** | reorder |  [optional] |
|**searchQuery** | **String** |  |  [optional] |
|**searchString** | **String** |  |  [optional] |
|**searchURL** | **String** | URL template for collection queries (searches) in the collection. By replacing the placeholders in the template with search parameters, a client can search in the collection. If this attribute is null, then the collection does not support searching.  |  [optional] |
|**smartFolderHeader** | **String** |  |  [optional] |
|**taxonomies** | [**List&lt;Taxonomy&gt;**](Taxonomy.md) | Contains top-level taxonomy nodes for all metadata fields which are enabled in the API for this collection and which have taxonomy enabled.  |  [optional] |
|**type** | **String** | Type of the collection |  [optional] |
|**uploadHref** | **String** | URL to use in upload requests |  [optional] |



