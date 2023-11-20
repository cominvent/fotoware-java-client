

# BatchUploadInfo

API model for the response from creating a batch upload task.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Random 128-bit GUID encoded as BASE64URL.  |  [optional] |
|**chunkSize** | **Integer** | The upload chunk size in bytes.  |  [optional] |
|**numChunks** | **Integer** | Total number of chunks to upload.  |  [optional] |
|**hasXmp** | **Boolean** | Specifies if an XMP sidecar file with metadata is to be uploaded along with the master file.  |  [optional] |



