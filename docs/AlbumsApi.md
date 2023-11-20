# AlbumsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebAlbumsGet**](AlbumsApi.md#fotowebAlbumsGet) | **GET** /fotoweb/albums/ | Lists the public albums in the DAM. The list contains albums which are shared in Fotoware.  |
| [**fotowebAlbumsGetWithHttpInfo**](AlbumsApi.md#fotowebAlbumsGetWithHttpInfo) | **GET** /fotoweb/albums/ | Lists the public albums in the DAM. The list contains albums which are shared in Fotoware.  |
| [**fotowebMeAlbumsArchivedGet**](AlbumsApi.md#fotowebMeAlbumsArchivedGet) | **GET** /fotoweb/me/albums/archived/ | List the archived albums owned by the current user/access token. |
| [**fotowebMeAlbumsArchivedGetWithHttpInfo**](AlbumsApi.md#fotowebMeAlbumsArchivedGetWithHttpInfo) | **GET** /fotoweb/me/albums/archived/ | List the archived albums owned by the current user/access token. |
| [**fotowebMeAlbumsContributeGet**](AlbumsApi.md#fotowebMeAlbumsContributeGet) | **GET** /fotoweb/me/albums/contribute/ | List the albums contributed to by the current user/access token. |
| [**fotowebMeAlbumsContributeGetWithHttpInfo**](AlbumsApi.md#fotowebMeAlbumsContributeGetWithHttpInfo) | **GET** /fotoweb/me/albums/contribute/ | List the albums contributed to by the current user/access token. |
| [**fotowebMeAlbumsDeletedGet**](AlbumsApi.md#fotowebMeAlbumsDeletedGet) | **GET** /fotoweb/me/albums/deleted/ | List the deleted albums owned by the current user/access token. |
| [**fotowebMeAlbumsDeletedGetWithHttpInfo**](AlbumsApi.md#fotowebMeAlbumsDeletedGetWithHttpInfo) | **GET** /fotoweb/me/albums/deleted/ | List the deleted albums owned by the current user/access token. |
| [**fotowebMeAlbumsGet**](AlbumsApi.md#fotowebMeAlbumsGet) | **GET** /fotoweb/me/albums/ | Lists the albums accessible by the current user/access token. This list contains all albums that the user can access. Use the q parameter to search in multiple albums/collections (search in name, description and tags elements).  |
| [**fotowebMeAlbumsGetWithHttpInfo**](AlbumsApi.md#fotowebMeAlbumsGetWithHttpInfo) | **GET** /fotoweb/me/albums/ | Lists the albums accessible by the current user/access token. This list contains all albums that the user can access. Use the q parameter to search in multiple albums/collections (search in name, description and tags elements).  |
| [**fotowebMeAlbumsMineGet**](AlbumsApi.md#fotowebMeAlbumsMineGet) | **GET** /fotoweb/me/albums/mine/ | Lists the albums owned by the current user/access token. |
| [**fotowebMeAlbumsMineGetWithHttpInfo**](AlbumsApi.md#fotowebMeAlbumsMineGetWithHttpInfo) | **GET** /fotoweb/me/albums/mine/ | Lists the albums owned by the current user/access token. |
| [**fotowebMeAlbumsSharedWithMeGet**](AlbumsApi.md#fotowebMeAlbumsSharedWithMeGet) | **GET** /fotoweb/me/albums/shared-with-me/ | List the albums shared with the current user/access token. |
| [**fotowebMeAlbumsSharedWithMeGetWithHttpInfo**](AlbumsApi.md#fotowebMeAlbumsSharedWithMeGetWithHttpInfo) | **GET** /fotoweb/me/albums/shared-with-me/ | List the albums shared with the current user/access token. |



## fotowebAlbumsGet

> CollectionList fotowebAlbumsGet()

Lists the public albums in the DAM. The list contains albums which are shared in Fotoware. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            CollectionList result = apiInstance.fotowebAlbumsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebAlbumsGet");
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
| **200** | OK |  -  |

## fotowebAlbumsGetWithHttpInfo

> ApiResponse<CollectionList> fotowebAlbumsGet fotowebAlbumsGetWithHttpInfo()

Lists the public albums in the DAM. The list contains albums which are shared in Fotoware. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebAlbumsGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebAlbumsGet");
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
| **200** | OK |  -  |


## fotowebMeAlbumsArchivedGet

> CollectionList fotowebMeAlbumsArchivedGet()

List the archived albums owned by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            CollectionList result = apiInstance.fotowebMeAlbumsArchivedGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsArchivedGet");
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
| **200** | OK |  -  |

## fotowebMeAlbumsArchivedGetWithHttpInfo

> ApiResponse<CollectionList> fotowebMeAlbumsArchivedGet fotowebMeAlbumsArchivedGetWithHttpInfo()

List the archived albums owned by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebMeAlbumsArchivedGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsArchivedGet");
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
| **200** | OK |  -  |


## fotowebMeAlbumsContributeGet

> CollectionList fotowebMeAlbumsContributeGet()

List the albums contributed to by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            CollectionList result = apiInstance.fotowebMeAlbumsContributeGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsContributeGet");
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
| **200** | OK |  -  |

## fotowebMeAlbumsContributeGetWithHttpInfo

> ApiResponse<CollectionList> fotowebMeAlbumsContributeGet fotowebMeAlbumsContributeGetWithHttpInfo()

List the albums contributed to by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebMeAlbumsContributeGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsContributeGet");
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
| **200** | OK |  -  |


## fotowebMeAlbumsDeletedGet

> CollectionList fotowebMeAlbumsDeletedGet()

List the deleted albums owned by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            CollectionList result = apiInstance.fotowebMeAlbumsDeletedGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsDeletedGet");
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
| **200** | OK |  -  |

## fotowebMeAlbumsDeletedGetWithHttpInfo

> ApiResponse<CollectionList> fotowebMeAlbumsDeletedGet fotowebMeAlbumsDeletedGetWithHttpInfo()

List the deleted albums owned by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebMeAlbumsDeletedGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsDeletedGet");
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
| **200** | OK |  -  |


## fotowebMeAlbumsGet

> CollectionList fotowebMeAlbumsGet(q)

Lists the albums accessible by the current user/access token. This list contains all albums that the user can access. Use the q parameter to search in multiple albums/collections (search in name, description and tags elements). 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        String q = "q_example"; // String | Query for asset(s). See <a target=\"_blank\" href=\"https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\">Collection Queries</a> for more information on querying.
        try {
            CollectionList result = apiInstance.fotowebMeAlbumsGet(q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsGet");
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

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectionlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebMeAlbumsGetWithHttpInfo

> ApiResponse<CollectionList> fotowebMeAlbumsGet fotowebMeAlbumsGetWithHttpInfo(q)

Lists the albums accessible by the current user/access token. This list contains all albums that the user can access. Use the q parameter to search in multiple albums/collections (search in name, description and tags elements). 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        String q = "q_example"; // String | Query for asset(s). See <a target=\"_blank\" href=\"https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\">Collection Queries</a> for more information on querying.
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebMeAlbumsGetWithHttpInfo(q);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsGet");
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

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectionlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebMeAlbumsMineGet

> CollectionList fotowebMeAlbumsMineGet()

Lists the albums owned by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            CollectionList result = apiInstance.fotowebMeAlbumsMineGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsMineGet");
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
| **200** | OK |  -  |

## fotowebMeAlbumsMineGetWithHttpInfo

> ApiResponse<CollectionList> fotowebMeAlbumsMineGet fotowebMeAlbumsMineGetWithHttpInfo()

Lists the albums owned by the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebMeAlbumsMineGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsMineGet");
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
| **200** | OK |  -  |


## fotowebMeAlbumsSharedWithMeGet

> CollectionList fotowebMeAlbumsSharedWithMeGet()

List the albums shared with the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            CollectionList result = apiInstance.fotowebMeAlbumsSharedWithMeGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsSharedWithMeGet");
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
| **200** | OK |  -  |

## fotowebMeAlbumsSharedWithMeGetWithHttpInfo

> ApiResponse<CollectionList> fotowebMeAlbumsSharedWithMeGet fotowebMeAlbumsSharedWithMeGetWithHttpInfo()

List the albums shared with the current user/access token.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsApi apiInstance = new AlbumsApi(defaultClient);
        try {
            ApiResponse<CollectionList> response = apiInstance.fotowebMeAlbumsSharedWithMeGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsApi#fotowebMeAlbumsSharedWithMeGet");
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
| **200** | OK |  -  |

