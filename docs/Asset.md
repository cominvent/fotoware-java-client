

# Asset


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveHREF** | **String** | Links to Archive. URL of the archive which contains the asset. Each asset is contained in only one archive. If the asset was discovered in a different kind of collection (such as an album, a search result or a folder), then this attribute can be used for finding the root URL of the original archive.  |  [optional] |
|**ancestors** | [**List&lt;AssetAncestorsInner&gt;**](AssetAncestorsInner.md) |  |  [optional] |
|**attributes** | [**AssetAttributes**](AssetAttributes.md) |  |  [optional] |
|**builtinFields** | [**List&lt;AssetBuiltinFieldsInner&gt;**](AssetBuiltinFieldsInner.md) |  |  [optional] |
|**capabilities** | [**AssetCapabilities**](AssetCapabilities.md) |  |  [optional] |
|**created** | **String** | The date and time on which the asset was created |  [optional] |
|**createdBy** | **String** |  |  [optional] |
|**doctype** | **String** | Type of this asset. For possible values, please see document types. This attribute determines which sub sections of the attributes section are present.  |  [optional] |
|**downloadcount** | **Integer** |  |  [optional] |
|**dropHREF** | **String** |  |  [optional] |
|**filesize** | **Integer** | Size of the file in bytes |  [optional] |
|**filename** | **String** | Name of the file without path |  [optional] |
|**href** | **String** | Links to asset. Original URL of the asset within the originating archive. This URL is used for most workflow operations.  |  [optional] |
|**linkstance** | **String** | Links to asset. The asset is then said to have multiple instances, one instance per distinct collection. For archives and folders, linkstance is always identical to href, which is called the original instance of the asset. Use linkstance to follow links from asset lists to individual assets  |  [optional] |
|**consentStatus** | [**ConsentStatus**](ConsentStatus.md) |  |  [optional] |
|**physicalFileId** | **String** | A physical file is a distinct representation of an asset in a single storage location with its own state (metadata, file properties, etc.). A physical file ID is a string of the form &lt;POOL_ID&gt;&lt;RELATIVE_PATH&gt; where &lt;POOL_ID&gt; is the pool ID as returned by the /fotoweb/api/config/pools API today. A hash-based pseudo ID is used on-premises. &lt;RELATIVE_PATH&gt; is the canonical path to the file within the pool starting with /, same as in its FWP URL.  |  [optional] |
|**metadata** | **Object** | Contains values of metadata fields of this asset which are exposed by the API. Usually, the metadata set associated with the archive to which the asset belongs controls which fields are available.  |  [optional] |
|**metadataeditcount** | **Integer** |  |  [optional] |
|**metadataEditor** | [**AssetMetadataEditor**](AssetMetadataEditor.md) |  |  [optional] |
|**modified** | **String** | The date and time on which the asset was last modified |  [optional] |
|**modifiedBy** | **String** |  |  [optional] |
|**permissions** | **List&lt;Object&gt;** | List of permissions that the requesting user has on this asset. For possible values, please see permissions. |  [optional] |
|**pincount** | **Integer** |  |  [optional] |
|**previewcount** | **Integer** |  |  [optional] |
|**previews** | [**List&lt;AssetPreviewsInner&gt;**](AssetPreviewsInner.md) | List of available thumbnail and preview images of this asset. For details, please see preview lists |  [optional] |
|**previewToken** | **String** |  |  [optional] |
|**props** | [**AssetProps**](AssetProps.md) |  |  [optional] |
|**quickRenditions** | [**List&lt;AssetQuickRenditionsInner&gt;**](AssetQuickRenditionsInner.md) |  |  [optional] |
|**renditions** | [**List&lt;AssetRenditionsInner&gt;**](AssetRenditionsInner.md) | List of available renditions of this asset. Renditions are used for downloading assets, either original or processed. |  [optional] |
|**revisioncount** | **Integer** |  |  [optional] |
|**thumbnailFields** | [**AssetThumbnailFields**](AssetThumbnailFields.md) |  |  [optional] |
|**uniqueid** | **String** | Unique ID of the asset. This ID is globally unique and created by IndexManager upon indexing |  [optional] |
|**workflowcount** | **Integer** |  |  [optional] |



