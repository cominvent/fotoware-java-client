# UploadApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebApiUploadsPost**](UploadApi.md#fotowebApiUploadsPost) | **POST** /fotoweb/api/uploads | Create a new upload task  |
| [**fotowebApiUploadsPostWithHttpInfo**](UploadApi.md#fotowebApiUploadsPostWithHttpInfo) | **POST** /fotoweb/api/uploads | Create a new upload task  |
| [**fotowebApiUploadsUploadIdChunksChunkIndexPost**](UploadApi.md#fotowebApiUploadsUploadIdChunksChunkIndexPost) | **POST** /fotoweb/api/uploads/{uploadId}/chunks/{chunkIndex} | Upload a chunk to an upload task  |
| [**fotowebApiUploadsUploadIdChunksChunkIndexPostWithHttpInfo**](UploadApi.md#fotowebApiUploadsUploadIdChunksChunkIndexPostWithHttpInfo) | **POST** /fotoweb/api/uploads/{uploadId}/chunks/{chunkIndex} | Upload a chunk to an upload task  |
| [**fotowebApiUploadsUploadIdStatusGet**](UploadApi.md#fotowebApiUploadsUploadIdStatusGet) | **GET** /fotoweb/api/uploads/{uploadId}/status | Get the upload task status  |
| [**fotowebApiUploadsUploadIdStatusGetWithHttpInfo**](UploadApi.md#fotowebApiUploadsUploadIdStatusGetWithHttpInfo) | **GET** /fotoweb/api/uploads/{uploadId}/status | Get the upload task status  |
| [**fotowebApiUploadsUploadIdXmpPost**](UploadApi.md#fotowebApiUploadsUploadIdXmpPost) | **POST** /fotoweb/api/uploads/{uploadId}/xmp | Upload the XMP file to an upload task  |
| [**fotowebApiUploadsUploadIdXmpPostWithHttpInfo**](UploadApi.md#fotowebApiUploadsUploadIdXmpPostWithHttpInfo) | **POST** /fotoweb/api/uploads/{uploadId}/xmp | Upload the XMP file to an upload task  |
| [**fotowebArchivesArchiveHREFPost**](UploadApi.md#fotowebArchivesArchiveHREFPost) | **POST** /fotoweb/archives/{archiveHREF}/ | Assets are uploaded by making a POST request to the URL of the archive. Each request can contain one or more assets. Upload uses HTTP Multipart requests, as defined in RFC1341. It is also possible to create a new folder (or a hierarchy of nested folders) and upload assets to the new folder.  |
| [**fotowebArchivesArchiveHREFPostWithHttpInfo**](UploadApi.md#fotowebArchivesArchiveHREFPostWithHttpInfo) | **POST** /fotoweb/archives/{archiveHREF}/ | Assets are uploaded by making a POST request to the URL of the archive. Each request can contain one or more assets. Upload uses HTTP Multipart requests, as defined in RFC1341. It is also possible to create a new folder (or a hierarchy of nested folders) and upload assets to the new folder.  |
| [**fotowebMeUploadToGet**](UploadApi.md#fotowebMeUploadToGet) | **GET** /fotoweb/me/upload-to/ | List of collections that are available to be uploaded to |
| [**fotowebMeUploadToGetWithHttpInfo**](UploadApi.md#fotowebMeUploadToGetWithHttpInfo) | **GET** /fotoweb/me/upload-to/ | List of collections that are available to be uploaded to |



## fotowebApiUploadsPost

> BatchUploadInfo fotowebApiUploadsPost(batchUploadCreate)

Create a new upload task 

This initial upload request begins the process for uploading a single asset by setting up an upload task with a unique Upload ID which is used in all following API requests. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        BatchUploadCreate batchUploadCreate = new BatchUploadCreate(); // BatchUploadCreate | 
        try {
            BatchUploadInfo result = apiInstance.fotowebApiUploadsPost(batchUploadCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsPost");
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
| **batchUploadCreate** | [**BatchUploadCreate**](BatchUploadCreate.md)|  | [optional] |

### Return type

[**BatchUploadInfo**](BatchUploadInfo.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed  |  -  |
| **400** | Bad Request. For instance if a parameter is invalid or the destination url is invalid  |  -  |
| **403** | Forbidden. If the user does not have permission to upload, or the checkoutId exists but does not belong to the user  |  -  |

## fotowebApiUploadsPostWithHttpInfo

> ApiResponse<BatchUploadInfo> fotowebApiUploadsPost fotowebApiUploadsPostWithHttpInfo(batchUploadCreate)

Create a new upload task 

This initial upload request begins the process for uploading a single asset by setting up an upload task with a unique Upload ID which is used in all following API requests. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        BatchUploadCreate batchUploadCreate = new BatchUploadCreate(); // BatchUploadCreate | 
        try {
            ApiResponse<BatchUploadInfo> response = apiInstance.fotowebApiUploadsPostWithHttpInfo(batchUploadCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsPost");
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
| **batchUploadCreate** | [**BatchUploadCreate**](BatchUploadCreate.md)|  | [optional] |

### Return type

ApiResponse<[**BatchUploadInfo**](BatchUploadInfo.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed  |  -  |
| **400** | Bad Request. For instance if a parameter is invalid or the destination url is invalid  |  -  |
| **403** | Forbidden. If the user does not have permission to upload, or the checkoutId exists but does not belong to the user  |  -  |


## fotowebApiUploadsUploadIdChunksChunkIndexPost

> void fotowebApiUploadsUploadIdChunksChunkIndexPost(uploadId, chunkIndex, fileName)

Upload a chunk to an upload task 

This request uploads a chunk of the file being uploaded. The chunk size and number of chunks to upload is returned in the response to the create upload task call. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String uploadId = "uploadId_example"; // String | Unique ID of the upload task
        Integer chunkIndex = 56; // Integer | Numeric index of the uploaded chunk
        File fileName = new File("/path/to/file"); // File | 
        try {
            apiInstance.fotowebApiUploadsUploadIdChunksChunkIndexPost(uploadId, chunkIndex, fileName);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsUploadIdChunksChunkIndexPost");
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
| **uploadId** | **String**| Unique ID of the upload task | |
| **chunkIndex** | **Integer**| Numeric index of the uploaded chunk | |
| **fileName** | **File**|  | [optional] |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content. Call successfuly completed  |  -  |
| **400** | Bad Request. For instance if the chunk index is invalid or the chunk size is wrong  |  -  |
| **404** | Not Found. There is no upload task with ID &lt;UPLOAD_ID&gt; that belongs to the requesting user  |  -  |
| **409** | Conflict. A chunk with the same index has already been received successfully or the same chunk is already being uploaded by another process  |  -  |
| **415** | Unsupported Media Type. The request body is not multipart/form-data  |  -  |

## fotowebApiUploadsUploadIdChunksChunkIndexPostWithHttpInfo

> ApiResponse<Void> fotowebApiUploadsUploadIdChunksChunkIndexPost fotowebApiUploadsUploadIdChunksChunkIndexPostWithHttpInfo(uploadId, chunkIndex, fileName)

Upload a chunk to an upload task 

This request uploads a chunk of the file being uploaded. The chunk size and number of chunks to upload is returned in the response to the create upload task call. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String uploadId = "uploadId_example"; // String | Unique ID of the upload task
        Integer chunkIndex = 56; // Integer | Numeric index of the uploaded chunk
        File fileName = new File("/path/to/file"); // File | 
        try {
            ApiResponse<Void> response = apiInstance.fotowebApiUploadsUploadIdChunksChunkIndexPostWithHttpInfo(uploadId, chunkIndex, fileName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsUploadIdChunksChunkIndexPost");
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
| **uploadId** | **String**| Unique ID of the upload task | |
| **chunkIndex** | **Integer**| Numeric index of the uploaded chunk | |
| **fileName** | **File**|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content. Call successfuly completed  |  -  |
| **400** | Bad Request. For instance if the chunk index is invalid or the chunk size is wrong  |  -  |
| **404** | Not Found. There is no upload task with ID &lt;UPLOAD_ID&gt; that belongs to the requesting user  |  -  |
| **409** | Conflict. A chunk with the same index has already been received successfully or the same chunk is already being uploaded by another process  |  -  |
| **415** | Unsupported Media Type. The request body is not multipart/form-data  |  -  |


## fotowebApiUploadsUploadIdStatusGet

> BatchUploadStatus fotowebApiUploadsUploadIdStatusGet(uploadId)

Get the upload task status 

This request is made to poll the status of an upload task. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String uploadId = "uploadId_example"; // String | Unique ID of the upload task
        try {
            BatchUploadStatus result = apiInstance.fotowebApiUploadsUploadIdStatusGet(uploadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsUploadIdStatusGet");
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
| **uploadId** | **String**| Unique ID of the upload task | |

### Return type

[**BatchUploadStatus**](BatchUploadStatus.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed  |  -  |
| **403** | Forbidden. The &lt;UPLOAD_ID&gt; does not exist OR belongs to a different user  |  -  |

## fotowebApiUploadsUploadIdStatusGetWithHttpInfo

> ApiResponse<BatchUploadStatus> fotowebApiUploadsUploadIdStatusGet fotowebApiUploadsUploadIdStatusGetWithHttpInfo(uploadId)

Get the upload task status 

This request is made to poll the status of an upload task. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String uploadId = "uploadId_example"; // String | Unique ID of the upload task
        try {
            ApiResponse<BatchUploadStatus> response = apiInstance.fotowebApiUploadsUploadIdStatusGetWithHttpInfo(uploadId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsUploadIdStatusGet");
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
| **uploadId** | **String**| Unique ID of the upload task | |

### Return type

ApiResponse<[**BatchUploadStatus**](BatchUploadStatus.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed  |  -  |
| **403** | Forbidden. The &lt;UPLOAD_ID&gt; does not exist OR belongs to a different user  |  -  |


## fotowebApiUploadsUploadIdXmpPost

> void fotowebApiUploadsUploadIdXmpPost(uploadId, fileName)

Upload the XMP file to an upload task 

This is an optional request to upload an XMP sidecar file that contains the metadata of the asset file. XMP sidecars are assumed to be  small, so they can be uploaded in one request. If a file has an XMP sidecar, then the initial upload request must declare it. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String uploadId = "uploadId_example"; // String | Unique ID of the upload task
        File fileName = new File("/path/to/file"); // File | 
        try {
            apiInstance.fotowebApiUploadsUploadIdXmpPost(uploadId, fileName);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsUploadIdXmpPost");
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
| **uploadId** | **String**| Unique ID of the upload task | |
| **fileName** | **File**|  | [optional] |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content. Call successfuly completed  |  -  |
| **400** | Bad Request. For instance if metadata is invalid or metadata was not expected for the upload  |  -  |
| **404** | Not Found. There is no upload task with ID &lt;UPLOAD_ID&gt; that belongs to the requesting user  |  -  |
| **409** | Conflict. There was a conflict, either XMP was already uploaded or the upload already finished  |  -  |
| **415** | Unsupported Media Type. The request body is not multipart/form-data  |  -  |

## fotowebApiUploadsUploadIdXmpPostWithHttpInfo

> ApiResponse<Void> fotowebApiUploadsUploadIdXmpPost fotowebApiUploadsUploadIdXmpPostWithHttpInfo(uploadId, fileName)

Upload the XMP file to an upload task 

This is an optional request to upload an XMP sidecar file that contains the metadata of the asset file. XMP sidecars are assumed to be  small, so they can be uploaded in one request. If a file has an XMP sidecar, then the initial upload request must declare it. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String uploadId = "uploadId_example"; // String | Unique ID of the upload task
        File fileName = new File("/path/to/file"); // File | 
        try {
            ApiResponse<Void> response = apiInstance.fotowebApiUploadsUploadIdXmpPostWithHttpInfo(uploadId, fileName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebApiUploadsUploadIdXmpPost");
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
| **uploadId** | **String**| Unique ID of the upload task | |
| **fileName** | **File**|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content. Call successfuly completed  |  -  |
| **400** | Bad Request. For instance if metadata is invalid or metadata was not expected for the upload  |  -  |
| **404** | Not Found. There is no upload task with ID &lt;UPLOAD_ID&gt; that belongs to the requesting user  |  -  |
| **409** | Conflict. There was a conflict, either XMP was already uploaded or the upload already finished  |  -  |
| **415** | Unsupported Media Type. The request body is not multipart/form-data  |  -  |


## fotowebArchivesArchiveHREFPost

> UploadResponse fotowebArchivesArchiveHREFPost(archiveHREF, contentType)

Assets are uploaded by making a POST request to the URL of the archive. Each request can contain one or more assets. Upload uses HTTP Multipart requests, as defined in RFC1341. It is also possible to create a new folder (or a hierarchy of nested folders) and upload assets to the new folder. 

Note:   * The upload location URL (upload_location_url) must be the URL found in the href attribute of the archive representation. Please do not hard-code upload location URLs.   * To get the upload request URL of an already known archive (with a known API URL), first request the archive representation of the archive, then use the value of the href-attribute for the upload request   * If the archive has a custom input folder, then assets can only be uploaded to the root URL of the archive. It is not possible to upload to a specific sub folder or to create a new sub folder during upload. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String archiveHREF = "archiveHREF_example"; // String | The url to the archive
        String contentType = "contentType_example"; // String | Ignored by FotoWeb. Should match the MIME type of the file, but can safely be set to application/octet-stream regardless of file type. 
        try {
            UploadResponse result = apiInstance.fotowebArchivesArchiveHREFPost(archiveHREF, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebArchivesArchiveHREFPost");
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
| **archiveHREF** | **String**| The url to the archive | |
| **contentType** | **String**| Ignored by FotoWeb. Should match the MIME type of the file, but can safely be set to application/octet-stream regardless of file type.  | [optional] |

### Return type

[**UploadResponse**](UploadResponse.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.fotoware.upload-response+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 Accepted. Once the file transfer has finished, the API returns a response with status code 202 Accepted. At this time, the upload is not finished. The server has to do further processing, such as applying metadata, doing consistency and security checks, copying the file to its storage location, and generating renditions. It is not guaranteed that all of these operations will complete successfully. Clients should not attempt to make any API requests that rely on the existence of the uploaded assets before the upload has finished successfully. The response includes a URL which can be used for polling the status of the upload. Use the background-tasks endpoint.  |  -  |

## fotowebArchivesArchiveHREFPostWithHttpInfo

> ApiResponse<UploadResponse> fotowebArchivesArchiveHREFPost fotowebArchivesArchiveHREFPostWithHttpInfo(archiveHREF, contentType)

Assets are uploaded by making a POST request to the URL of the archive. Each request can contain one or more assets. Upload uses HTTP Multipart requests, as defined in RFC1341. It is also possible to create a new folder (or a hierarchy of nested folders) and upload assets to the new folder. 

Note:   * The upload location URL (upload_location_url) must be the URL found in the href attribute of the archive representation. Please do not hard-code upload location URLs.   * To get the upload request URL of an already known archive (with a known API URL), first request the archive representation of the archive, then use the value of the href-attribute for the upload request   * If the archive has a custom input folder, then assets can only be uploaded to the root URL of the archive. It is not possible to upload to a specific sub folder or to create a new sub folder during upload. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String archiveHREF = "archiveHREF_example"; // String | The url to the archive
        String contentType = "contentType_example"; // String | Ignored by FotoWeb. Should match the MIME type of the file, but can safely be set to application/octet-stream regardless of file type. 
        try {
            ApiResponse<UploadResponse> response = apiInstance.fotowebArchivesArchiveHREFPostWithHttpInfo(archiveHREF, contentType);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebArchivesArchiveHREFPost");
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
| **archiveHREF** | **String**| The url to the archive | |
| **contentType** | **String**| Ignored by FotoWeb. Should match the MIME type of the file, but can safely be set to application/octet-stream regardless of file type.  | [optional] |

### Return type

ApiResponse<[**UploadResponse**](UploadResponse.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.fotoware.upload-response+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 Accepted. Once the file transfer has finished, the API returns a response with status code 202 Accepted. At this time, the upload is not finished. The server has to do further processing, such as applying metadata, doing consistency and security checks, copying the file to its storage location, and generating renditions. It is not guaranteed that all of these operations will complete successfully. Clients should not attempt to make any API requests that rely on the existence of the uploaded assets before the upload has finished successfully. The response includes a URL which can be used for polling the status of the upload. Use the background-tasks endpoint.  |  -  |


## fotowebMeUploadToGet

> CollectionList fotowebMeUploadToGet()

List of collections that are available to be uploaded to

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        try {
            CollectionList result = apiInstance.fotowebMeUploadToGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebMeUploadToGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**CollectionList**](CollectionList.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectionlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection List |  -  |

## fotowebMeUploadToGetWithHttpInfo

> ApiResponse<CollectionList> fotowebMeUploadToGet fotowebMeUploadToGetWithHttpInfo()

List of collections that are available to be uploaded to

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UploadApi apiInstance = new UploadApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebMeUploadToGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#fotowebMeUploadToGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**CollectionList**](CollectionList.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectionlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collection List |  -  |

