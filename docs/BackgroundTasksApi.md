# BackgroundTasksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebMeBackgroundTasksIdGet**](BackgroundTasksApi.md#fotowebMeBackgroundTasksIdGet) | **GET** /fotoweb/me/background-tasks/{id} | Polls the status of a tasks |
| [**fotowebMeBackgroundTasksIdGetWithHttpInfo**](BackgroundTasksApi.md#fotowebMeBackgroundTasksIdGetWithHttpInfo) | **GET** /fotoweb/me/background-tasks/{id} | Polls the status of a tasks |
| [**fotowebMeBackgroundTasksPost**](BackgroundTasksApi.md#fotowebMeBackgroundTasksPost) | **POST** /fotoweb/me/background-tasks/ | Triggers a background task that runs an operation on an asset |
| [**fotowebMeBackgroundTasksPostWithHttpInfo**](BackgroundTasksApi.md#fotowebMeBackgroundTasksPostWithHttpInfo) | **POST** /fotoweb/me/background-tasks/ | Triggers a background task that runs an operation on an asset |



## fotowebMeBackgroundTasksIdGet

> UploadStatus fotowebMeBackgroundTasksIdGet(id)

Polls the status of a tasks

Gives you the status and info of a submitted background task

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.BackgroundTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        BackgroundTasksApi apiInstance = new BackgroundTasksApi(defaultClient);
        String id = "id_example"; // String | Unique id of the background tasks
        try {
            UploadStatus result = apiInstance.fotowebMeBackgroundTasksIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundTasksApi#fotowebMeBackgroundTasksIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Unique id of the background tasks | |

### Return type

[**UploadStatus**](UploadStatus.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.task-status+json, application/vnd.fotoware.upload-status+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

## fotowebMeBackgroundTasksIdGetWithHttpInfo

> ApiResponse<UploadStatus> fotowebMeBackgroundTasksIdGet fotowebMeBackgroundTasksIdGetWithHttpInfo(id)

Polls the status of a tasks

Gives you the status and info of a submitted background task

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.BackgroundTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        BackgroundTasksApi apiInstance = new BackgroundTasksApi(defaultClient);
        String id = "id_example"; // String | Unique id of the background tasks
        try {
            ApiResponse<UploadStatus> response = apiInstance.fotowebMeBackgroundTasksIdGetWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundTasksApi#fotowebMeBackgroundTasksIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Unique id of the background tasks | |

### Return type

ApiResponse<[**UploadStatus**](UploadStatus.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.task-status+json, application/vnd.fotoware.upload-status+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## fotowebMeBackgroundTasksPost

> MetadataEditResponse fotowebMeBackgroundTasksPost(metadataEditRequest)

Triggers a background task that runs an operation on an asset

FotoWeb uses a system of background tasks for some user-triggered operations. These operations cannot be run in a normal request handler as they would take too long time to finish. These operations include: Download | Metadata updates | Actions and marker actions | General File operations (move, copy, rotate etc) | Upload 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.BackgroundTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        BackgroundTasksApi apiInstance = new BackgroundTasksApi(defaultClient);
        MetadataEditRequest metadataEditRequest = new MetadataEditRequest(); // MetadataEditRequest | 
        try {
            MetadataEditResponse result = apiInstance.fotowebMeBackgroundTasksPost(metadataEditRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundTasksApi#fotowebMeBackgroundTasksPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metadataEditRequest** | [**MetadataEditRequest**](MetadataEditRequest.md)|  | [optional] |

### Return type

[**MetadataEditResponse**](MetadataEditResponse.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.metadata-edit-request+json, application/vnd.fotoware.action-request+json, application/vnd.fotoware.marker-request+json, application/vnd.fotoware.duplicate-request+json, application/vnd.fotoware.delete-request+json, application/vnd.fotoware.rename-request+json, application/vnd.fotoware.move-request+json, application/vnd.fotoware.copy-request+json, application/vnd.fotoware.rotate-request+json
- **Accept**: application/vnd.fotoware.metadata-edit-response+json, application/vnd.fotoware.action-response+json, application/vnd.fotoware.marker-response+json, application/vnd.fotoware.duplicate-response+json, application/vnd.fotoware.delete-response+json, application/vnd.fotoware.rename-response+json, application/vnd.fotoware.move-response+json, application/vnd.fotoware.copy-response+json, application/vnd.fotoware.rotate-response+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Background task created, returns reference to polling url |  -  |

## fotowebMeBackgroundTasksPostWithHttpInfo

> ApiResponse<MetadataEditResponse> fotowebMeBackgroundTasksPost fotowebMeBackgroundTasksPostWithHttpInfo(metadataEditRequest)

Triggers a background task that runs an operation on an asset

FotoWeb uses a system of background tasks for some user-triggered operations. These operations cannot be run in a normal request handler as they would take too long time to finish. These operations include: Download | Metadata updates | Actions and marker actions | General File operations (move, copy, rotate etc) | Upload 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.BackgroundTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        BackgroundTasksApi apiInstance = new BackgroundTasksApi(defaultClient);
        MetadataEditRequest metadataEditRequest = new MetadataEditRequest(); // MetadataEditRequest | 
        try {
            ApiResponse<MetadataEditResponse> response = apiInstance.fotowebMeBackgroundTasksPostWithHttpInfo(metadataEditRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundTasksApi#fotowebMeBackgroundTasksPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metadataEditRequest** | [**MetadataEditRequest**](MetadataEditRequest.md)|  | [optional] |

### Return type

ApiResponse<[**MetadataEditResponse**](MetadataEditResponse.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.metadata-edit-request+json, application/vnd.fotoware.action-request+json, application/vnd.fotoware.marker-request+json, application/vnd.fotoware.duplicate-request+json, application/vnd.fotoware.delete-request+json, application/vnd.fotoware.rename-request+json, application/vnd.fotoware.move-request+json, application/vnd.fotoware.copy-request+json, application/vnd.fotoware.rotate-request+json
- **Accept**: application/vnd.fotoware.metadata-edit-response+json, application/vnd.fotoware.action-response+json, application/vnd.fotoware.marker-response+json, application/vnd.fotoware.duplicate-response+json, application/vnd.fotoware.delete-response+json, application/vnd.fotoware.rename-response+json, application/vnd.fotoware.move-response+json, application/vnd.fotoware.copy-response+json, application/vnd.fotoware.rotate-response+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Background task created, returns reference to polling url |  -  |

