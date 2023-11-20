

# BatchUploadCreate

API model to create a new batch upload task used to upload a file

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | * URL of the collection (e.g. archive or folder) to upload to OR * URL of the asset to upload a new revision  |  |
|**folder** | **String** | A folder path relative to the destination (when it is a collection URL).  The folder may or may not exist, and it is created if it does not exist.  |  [optional] |
|**filename** | **String** | Filename of the file being uploaded. It must be given when uploading to a folder.  |  [optional] |
|**hasXmp** | **Boolean** | * true: An XMP sidecar file with metadata is uploaded along with the master file * false: No XMP sidecar file is uploaded  |  [optional] |
|**fileSize** | **Integer** | The exact size of the file (in bytes)  |  |
|**checkoutId** | **String** | This parameter must be set to null. It is used by internal FotoWare plug-ins to upload a new version of a checked-out file.  |  [optional] |
|**metadata** | [**BatchUploadMetadata**](BatchUploadMetadata.md) |  |  [optional] |
|**comment** | **String** | Comment to add to the revision. Set comment to null when not required. When uploading a new revision of a file that already exists, this becomes the comment of the new revision.   |  [optional] |



