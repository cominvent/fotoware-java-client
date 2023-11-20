

# UploadStatusJob

Job info

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | * pending - The task is queued for processing * inProgress - Processing is still in progress * done - Processing has finished, and a result is available * failed - Processing has failed, and a result is available  |  [optional] |
|**result** | **List&lt;String&gt;** | Result of the background task. List of uploaded files, their status, and their location in FotoWeb.  |  [optional] |



