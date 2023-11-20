# ArchivesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebArchivesGet**](ArchivesApi.md#fotowebArchivesGet) | **GET** /fotoweb/archives/ | Get all publically available archives in the FotoWare DAM instance. To search, add the q parameter.  |
| [**fotowebArchivesGetWithHttpInfo**](ArchivesApi.md#fotowebArchivesGetWithHttpInfo) | **GET** /fotoweb/archives/ | Get all publically available archives in the FotoWare DAM instance. To search, add the q parameter.  |
| [**getArchive**](ArchivesApi.md#getArchive) | **GET** /fotoweb/archives/{id}/ | Get all information about an archive |
| [**getArchiveWithHttpInfo**](ArchivesApi.md#getArchiveWithHttpInfo) | **GET** /fotoweb/archives/{id}/ | Get all information about an archive |
| [**getPrivateArchiveList**](ArchivesApi.md#getPrivateArchiveList) | **GET** /fotoweb/me/archives/ | Lists the archives accessible by the current user/access token. |
| [**getPrivateArchiveListWithHttpInfo**](ArchivesApi.md#getPrivateArchiveListWithHttpInfo) | **GET** /fotoweb/me/archives/ | Lists the archives accessible by the current user/access token. |



## fotowebArchivesGet

> CollectionList fotowebArchivesGet(q)

Get all publically available archives in the FotoWare DAM instance. To search, add the q parameter. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ArchivesApi apiInstance = new ArchivesApi(defaultClient);
        String q = "q_example"; // String | Query for asset(s). See <a target=\"_blank\" href=\"https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\">Collection Queries</a> for more information on querying.
        try {
            CollectionList result = apiInstance.fotowebArchivesGet(q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArchivesApi#fotowebArchivesGet");
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
| **q** | **String**| Query for asset(s). See &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\&quot;&gt;Collection Queries&lt;/a&gt; for more information on querying. | [optional] |

### Return type

[**CollectionList**](CollectionList.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectionlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |

## fotowebArchivesGetWithHttpInfo

> ApiResponse<CollectionList> fotowebArchivesGet fotowebArchivesGetWithHttpInfo(q)

Get all publically available archives in the FotoWare DAM instance. To search, add the q parameter. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ArchivesApi apiInstance = new ArchivesApi(defaultClient);
        String q = "q_example"; // String | Query for asset(s). See <a target=\"_blank\" href=\"https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\">Collection Queries</a> for more information on querying.
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebArchivesGetWithHttpInfo(q);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ArchivesApi#fotowebArchivesGet");
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
| **q** | **String**| Query for asset(s). See &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\&quot;&gt;Collection Queries&lt;/a&gt; for more information on querying. | [optional] |

### Return type

ApiResponse<[**CollectionList**](CollectionList.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectionlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |


## getArchive

> Collection getArchive(id)

Get all information about an archive

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        ArchivesApi apiInstance = new ArchivesApi(defaultClient);
        Integer id = 56; // Integer | Unique ID of the archive
        try {
            Collection result = apiInstance.getArchive(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArchivesApi#getArchive");
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
| **id** | **Integer**| Unique ID of the archive | |

### Return type

[**Collection**](Collection.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collection+json, application/vnd.fotoware.collectioninfo+json, application/vnd.fotoware.collectionlist+json, application/vnd.fotoware.assetlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |

## getArchiveWithHttpInfo

> ApiResponse<Collection> getArchive getArchiveWithHttpInfo(id)

Get all information about an archive

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        ArchivesApi apiInstance = new ArchivesApi(defaultClient);
        Integer id = 56; // Integer | Unique ID of the archive
        try {
            ApiResponse<Collection> response = apiInstance.getArchiveWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ArchivesApi#getArchive");
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
| **id** | **Integer**| Unique ID of the archive | |

### Return type

ApiResponse<[**Collection**](Collection.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collection+json, application/vnd.fotoware.collectioninfo+json, application/vnd.fotoware.collectionlist+json, application/vnd.fotoware.assetlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |


## getPrivateArchiveList

> CollectionList getPrivateArchiveList()

Lists the archives accessible by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        ArchivesApi apiInstance = new ArchivesApi(defaultClient);
        try {
            CollectionList result = apiInstance.getPrivateArchiveList();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArchivesApi#getPrivateArchiveList");
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
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |

## getPrivateArchiveListWithHttpInfo

> ApiResponse<CollectionList> getPrivateArchiveList getPrivateArchiveListWithHttpInfo()

Lists the archives accessible by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ArchivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        ArchivesApi apiInstance = new ArchivesApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.getPrivateArchiveListWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ArchivesApi#getPrivateArchiveList");
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
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |

