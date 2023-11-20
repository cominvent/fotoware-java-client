# AnnotationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete) | **DELETE** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/{annotationid} | Delete an annotation from an asset |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDeleteWithHttpInfo**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDeleteWithHttpInfo) | **DELETE** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/{annotationid} | Delete an annotation from an asset |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet) | **GET** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/{annotationid} | Get the annotation for an asset based on the annotation id |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGetWithHttpInfo**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGetWithHttpInfo) | **GET** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/{annotationid} | Get the annotation for an asset based on the annotation id |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch) | **PATCH** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/{annotationid} | Edit an annotation on an asset |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatchWithHttpInfo**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatchWithHttpInfo) | **PATCH** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/{annotationid} | Edit an annotation on an asset |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsGet**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsGet) | **GET** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/ | Get all the annotations for an asset |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsGetWithHttpInfo**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsGetWithHttpInfo) | **GET** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/ | Get all the annotations for an asset |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsPost**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsPost) | **POST** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/ | Add a new annotation for an asset |
| [**fotowebArchivesArchiveidFolderpathAssetAnnotationsPostWithHttpInfo**](AnnotationsApi.md#fotowebArchivesArchiveidFolderpathAssetAnnotationsPostWithHttpInfo) | **POST** /fotoweb/archives/{archiveid}/{folderpath}/{asset}.annotations/ | Add a new annotation for an asset |



## fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete

> void fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete(archiveid, folderpath, asset, annotationid)

Delete an annotation from an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        String annotationid = "annotationid_example"; // String | The unique id of the annotation.
        try {
            apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete(archiveid, folderpath, asset, annotationid);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotationid** | **String**| The unique id of the annotation. | |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **404** | Annotation not found |  -  |

## fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDeleteWithHttpInfo

> ApiResponse<Void> fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDeleteWithHttpInfo(archiveid, folderpath, asset, annotationid)

Delete an annotation from an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        String annotationid = "annotationid_example"; // String | The unique id of the annotation.
        try {
            ApiResponse<Void> response = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDeleteWithHttpInfo(archiveid, folderpath, asset, annotationid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidDelete");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotationid** | **String**| The unique id of the annotation. | |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **404** | Annotation not found |  -  |


## fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet

> Annotation fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet(archiveid, folderpath, asset, annotationid)

Get the annotation for an asset based on the annotation id

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        String annotationid = "annotationid_example"; // String | The unique id of the annotation.
        try {
            Annotation result = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet(archiveid, folderpath, asset, annotationid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotationid** | **String**| The unique id of the annotation. | |

### Return type

[**Annotation**](Annotation.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.annotation+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGetWithHttpInfo

> ApiResponse<Annotation> fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGetWithHttpInfo(archiveid, folderpath, asset, annotationid)

Get the annotation for an asset based on the annotation id

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        String annotationid = "annotationid_example"; // String | The unique id of the annotation.
        try {
            ApiResponse<Annotation> response = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGetWithHttpInfo(archiveid, folderpath, asset, annotationid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidGet");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotationid** | **String**| The unique id of the annotation. | |

### Return type

ApiResponse<[**Annotation**](Annotation.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.annotation+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch

> void fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch(archiveid, folderpath, asset, annotationid, annotation)

Edit an annotation on an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        String annotationid = "annotationid_example"; // String | The unique id of the annotation.
        Annotation annotation = new Annotation(); // Annotation | 
        try {
            apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch(archiveid, folderpath, asset, annotationid, annotation);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotationid** | **String**| The unique id of the annotation. | |
| **annotation** | [**Annotation**](Annotation.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.annotation+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |

## fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatchWithHttpInfo

> ApiResponse<Void> fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatchWithHttpInfo(archiveid, folderpath, asset, annotationid, annotation)

Edit an annotation on an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        String annotationid = "annotationid_example"; // String | The unique id of the annotation.
        Annotation annotation = new Annotation(); // Annotation | 
        try {
            ApiResponse<Void> response = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatchWithHttpInfo(archiveid, folderpath, asset, annotationid, annotation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsAnnotationidPatch");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotationid** | **String**| The unique id of the annotation. | |
| **annotation** | [**Annotation**](Annotation.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.annotation+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |


## fotowebArchivesArchiveidFolderpathAssetAnnotationsGet

> AnnotationList fotowebArchivesArchiveidFolderpathAssetAnnotationsGet(archiveid, folderpath, asset)

Get all the annotations for an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        try {
            AnnotationList result = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsGet(archiveid, folderpath, asset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsGet");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |

### Return type

[**AnnotationList**](AnnotationList.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.annotation-list+json, application/vnd.fotoware.count+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebArchivesArchiveidFolderpathAssetAnnotationsGetWithHttpInfo

> ApiResponse<AnnotationList> fotowebArchivesArchiveidFolderpathAssetAnnotationsGet fotowebArchivesArchiveidFolderpathAssetAnnotationsGetWithHttpInfo(archiveid, folderpath, asset)

Get all the annotations for an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        try {
            ApiResponse<AnnotationList> response = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsGetWithHttpInfo(archiveid, folderpath, asset);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsGet");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |

### Return type

ApiResponse<[**AnnotationList**](AnnotationList.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.annotation-list+json, application/vnd.fotoware.count+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebArchivesArchiveidFolderpathAssetAnnotationsPost

> Annotation fotowebArchivesArchiveidFolderpathAssetAnnotationsPost(archiveid, folderpath, asset, annotation)

Add a new annotation for an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        Annotation annotation = new Annotation(); // Annotation | 
        try {
            Annotation result = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsPost(archiveid, folderpath, asset, annotation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsPost");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotation** | [**Annotation**](Annotation.md)|  | [optional] |

### Return type

[**Annotation**](Annotation.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.annotation+json
- **Accept**: application/json, application/vnd.fotoware.annotation+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebArchivesArchiveidFolderpathAssetAnnotationsPostWithHttpInfo

> ApiResponse<Annotation> fotowebArchivesArchiveidFolderpathAssetAnnotationsPost fotowebArchivesArchiveidFolderpathAssetAnnotationsPostWithHttpInfo(archiveid, folderpath, asset, annotation)

Add a new annotation for an asset

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AnnotationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);
        String archiveid = "archiveid_example"; // String | The id of the archive.
        String folderpath = "folderpath_example"; // String | The folder path to where the asset is found.
        String asset = "asset_example"; // String | Asset reference. Note that the reference is without the .info postfix.
        Annotation annotation = new Annotation(); // Annotation | 
        try {
            ApiResponse<Annotation> response = apiInstance.fotowebArchivesArchiveidFolderpathAssetAnnotationsPostWithHttpInfo(archiveid, folderpath, asset, annotation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnotationsApi#fotowebArchivesArchiveidFolderpathAssetAnnotationsPost");
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
| **archiveid** | **String**| The id of the archive. | |
| **folderpath** | **String**| The folder path to where the asset is found. | |
| **asset** | **String**| Asset reference. Note that the reference is without the .info postfix. | |
| **annotation** | [**Annotation**](Annotation.md)|  | [optional] |

### Return type

ApiResponse<[**Annotation**](Annotation.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.annotation+json
- **Accept**: application/json, application/vnd.fotoware.annotation+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

