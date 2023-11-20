

# BatchUploadStatus

API model to describe the batch upload status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | * awaitingData - Some chunks or the XMP file have not been received yet * pending - The upload is finalized and has been queued for processing * inProgress - The upload is finalized and is being processed * done - The upload has completed successfully, and result contains more information * failed - The upload has failed, and error contains more information   |  [optional] |
|**result** | [**BatchUploadStatusResult**](BatchUploadStatusResult.md) |  |  [optional] |
|**error** | [**BatchUploadStatusError**](BatchUploadStatusError.md) |  |  [optional] |



