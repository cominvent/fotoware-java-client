# AlbumsSharingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebMePeopleGet**](AlbumsSharingApi.md#fotowebMePeopleGet) | **GET** /fotoweb/me/people/ | Search among the users and groups you have permission to share albums with |
| [**fotowebMePeopleGetWithHttpInfo**](AlbumsSharingApi.md#fotowebMePeopleGetWithHttpInfo) | **GET** /fotoweb/me/people/ | Search among the users and groups you have permission to share albums with |
| [**fotowebUsersUseridAlbumsAlbumidGet**](AlbumsSharingApi.md#fotowebUsersUseridAlbumsAlbumidGet) | **GET** /fotoweb/users/{userid}/albums/{albumid}/ | Get all information for an album for a specfic user; including properties, assets in the album etc. |
| [**fotowebUsersUseridAlbumsAlbumidGetWithHttpInfo**](AlbumsSharingApi.md#fotowebUsersUseridAlbumsAlbumidGetWithHttpInfo) | **GET** /fotoweb/users/{userid}/albums/{albumid}/ | Get all information for an album for a specfic user; including properties, assets in the album etc. |
| [**fotowebUsersUseridAlbumsAlbumidSharesGet**](AlbumsSharingApi.md#fotowebUsersUseridAlbumsAlbumidSharesGet) | **GET** /fotoweb/users/{userid}/albums/{albumid}/.shares/ | Gets sharing details for an album for a specfic user; including any shares, public link and user/groups shares |
| [**fotowebUsersUseridAlbumsAlbumidSharesGetWithHttpInfo**](AlbumsSharingApi.md#fotowebUsersUseridAlbumsAlbumidSharesGetWithHttpInfo) | **GET** /fotoweb/users/{userid}/albums/{albumid}/.shares/ | Gets sharing details for an album for a specfic user; including any shares, public link and user/groups shares |
| [**fotowebUsersUseridAlbumsAlbumidSharesPatch**](AlbumsSharingApi.md#fotowebUsersUseridAlbumsAlbumidSharesPatch) | **PATCH** /fotoweb/users/{userid}/albums/{albumid}/.shares/ | Make updates to album sharing for an album. |
| [**fotowebUsersUseridAlbumsAlbumidSharesPatchWithHttpInfo**](AlbumsSharingApi.md#fotowebUsersUseridAlbumsAlbumidSharesPatchWithHttpInfo) | **PATCH** /fotoweb/users/{userid}/albums/{albumid}/.shares/ | Make updates to album sharing for an album. |



## fotowebMePeopleGet

> PeopleList fotowebMePeopleGet(q)

Search among the users and groups you have permission to share albums with

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String q = "q_example"; // String | Query for user(s) and group(s), e.g. q=consumer 
        try {
            PeopleList result = apiInstance.fotowebMePeopleGet(q);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebMePeopleGet");
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
| **q** | **String**| Query for user(s) and group(s), e.g. q&#x3D;consumer  | |

### Return type

[**PeopleList**](PeopleList.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.people-list+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | 400 Bad request |  -  |
| **401** | 401 Unauthorized |  -  |

## fotowebMePeopleGetWithHttpInfo

> ApiResponse<PeopleList> fotowebMePeopleGet fotowebMePeopleGetWithHttpInfo(q)

Search among the users and groups you have permission to share albums with

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String q = "q_example"; // String | Query for user(s) and group(s), e.g. q=consumer 
        try {
            ApiResponse<PeopleList> response = apiInstance.fotowebMePeopleGetWithHttpInfo(q);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebMePeopleGet");
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
| **q** | **String**| Query for user(s) and group(s), e.g. q&#x3D;consumer  | |

### Return type

ApiResponse<[**PeopleList**](PeopleList.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.people-list+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | 400 Bad request |  -  |
| **401** | 401 Unauthorized |  -  |


## fotowebUsersUseridAlbumsAlbumidGet

> CollectionInfo fotowebUsersUseridAlbumsAlbumidGet(userid, albumid)

Get all information for an album for a specfic user; including properties, assets in the album etc.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String userid = "userid_example"; // String | Unique ID of the user
        String albumid = "albumid_example"; // String | Unique ID of the album
        try {
            CollectionInfo result = apiInstance.fotowebUsersUseridAlbumsAlbumidGet(userid, albumid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebUsersUseridAlbumsAlbumidGet");
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
| **userid** | **String**| Unique ID of the user | |
| **albumid** | **String**| Unique ID of the album | |

### Return type

[**CollectionInfo**](CollectionInfo.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectioninfo+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  -  |

## fotowebUsersUseridAlbumsAlbumidGetWithHttpInfo

> ApiResponse<CollectionInfo> fotowebUsersUseridAlbumsAlbumidGet fotowebUsersUseridAlbumsAlbumidGetWithHttpInfo(userid, albumid)

Get all information for an album for a specfic user; including properties, assets in the album etc.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String userid = "userid_example"; // String | Unique ID of the user
        String albumid = "albumid_example"; // String | Unique ID of the album
        try {
            ApiResponse<CollectionInfo> response = apiInstance.fotowebUsersUseridAlbumsAlbumidGetWithHttpInfo(userid, albumid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebUsersUseridAlbumsAlbumidGet");
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
| **userid** | **String**| Unique ID of the user | |
| **albumid** | **String**| Unique ID of the album | |

### Return type

ApiResponse<[**CollectionInfo**](CollectionInfo.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.collectioninfo+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  -  |


## fotowebUsersUseridAlbumsAlbumidSharesGet

> Sharing fotowebUsersUseridAlbumsAlbumidSharesGet(userid, albumid)

Gets sharing details for an album for a specfic user; including any shares, public link and user/groups shares

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String userid = "userid_example"; // String | Unique ID of the user
        String albumid = "albumid_example"; // String | Unique ID of the album
        try {
            Sharing result = apiInstance.fotowebUsersUseridAlbumsAlbumidSharesGet(userid, albumid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebUsersUseridAlbumsAlbumidSharesGet");
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
| **userid** | **String**| Unique ID of the user | |
| **albumid** | **String**| Unique ID of the album | |

### Return type

[**Sharing**](Sharing.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.sharing+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  -  |

## fotowebUsersUseridAlbumsAlbumidSharesGetWithHttpInfo

> ApiResponse<Sharing> fotowebUsersUseridAlbumsAlbumidSharesGet fotowebUsersUseridAlbumsAlbumidSharesGetWithHttpInfo(userid, albumid)

Gets sharing details for an album for a specfic user; including any shares, public link and user/groups shares

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String userid = "userid_example"; // String | Unique ID of the user
        String albumid = "albumid_example"; // String | Unique ID of the album
        try {
            ApiResponse<Sharing> response = apiInstance.fotowebUsersUseridAlbumsAlbumidSharesGetWithHttpInfo(userid, albumid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebUsersUseridAlbumsAlbumidSharesGet");
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
| **userid** | **String**| Unique ID of the user | |
| **albumid** | **String**| Unique ID of the album | |

### Return type

ApiResponse<[**Sharing**](Sharing.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.sharing+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  -  |


## fotowebUsersUseridAlbumsAlbumidSharesPatch

> SharingLinkList fotowebUsersUseridAlbumsAlbumidSharesPatch(userid, albumid, sharingUpdate)

Make updates to album sharing for an album.

This is mainly used for enabling/disabling Download permissions on public sharing link 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String userid = "userid_example"; // String | Unique ID of the user
        String albumid = "albumid_example"; // String | Unique ID of the album
        SharingUpdate sharingUpdate = new SharingUpdate(); // SharingUpdate | 
        try {
            SharingLinkList result = apiInstance.fotowebUsersUseridAlbumsAlbumidSharesPatch(userid, albumid, sharingUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebUsersUseridAlbumsAlbumidSharesPatch");
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
| **userid** | **String**| Unique ID of the user | |
| **albumid** | **String**| Unique ID of the album | |
| **sharingUpdate** | [**SharingUpdate**](SharingUpdate.md)|  | [optional] |

### Return type

[**SharingLinkList**](SharingLinkList.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.sharing-update+json
- **Accept**: application/json, application/vnd.fotoware.sharing-link-list+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  -  |

## fotowebUsersUseridAlbumsAlbumidSharesPatchWithHttpInfo

> ApiResponse<SharingLinkList> fotowebUsersUseridAlbumsAlbumidSharesPatch fotowebUsersUseridAlbumsAlbumidSharesPatchWithHttpInfo(userid, albumid, sharingUpdate)

Make updates to album sharing for an album.

This is mainly used for enabling/disabling Download permissions on public sharing link 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AlbumsSharingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AlbumsSharingApi apiInstance = new AlbumsSharingApi(defaultClient);
        String userid = "userid_example"; // String | Unique ID of the user
        String albumid = "albumid_example"; // String | Unique ID of the album
        SharingUpdate sharingUpdate = new SharingUpdate(); // SharingUpdate | 
        try {
            ApiResponse<SharingLinkList> response = apiInstance.fotowebUsersUseridAlbumsAlbumidSharesPatchWithHttpInfo(userid, albumid, sharingUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlbumsSharingApi#fotowebUsersUseridAlbumsAlbumidSharesPatch");
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
| **userid** | **String**| Unique ID of the user | |
| **albumid** | **String**| Unique ID of the album | |
| **sharingUpdate** | [**SharingUpdate**](SharingUpdate.md)|  | [optional] |

### Return type

ApiResponse<[**SharingLinkList**](SharingLinkList.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.sharing-update+json
- **Accept**: application/json, application/vnd.fotoware.sharing-link-list+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 OK |  -  |

