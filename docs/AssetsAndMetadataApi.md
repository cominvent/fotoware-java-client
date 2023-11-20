# AssetsAndMetadataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebEditorsViewidGet**](AssetsAndMetadataApi.md#fotowebEditorsViewidGet) | **GET** /fotoweb/editors/{viewid} | Get a metadata view representation |
| [**fotowebEditorsViewidGetWithHttpInfo**](AssetsAndMetadataApi.md#fotowebEditorsViewidGetWithHttpInfo) | **GET** /fotoweb/editors/{viewid} | Get a metadata view representation |
| [**getAssetDetails**](AssetsAndMetadataApi.md#getAssetDetails) | **GET** /fotoweb/archives/{archiveid}/{folderid}/{asset} | Get the json representation of an asset |
| [**getAssetDetailsWithHttpInfo**](AssetsAndMetadataApi.md#getAssetDetailsWithHttpInfo) | **GET** /fotoweb/archives/{archiveid}/{folderid}/{asset} | Get the json representation of an asset |
| [**patchMetadata**](AssetsAndMetadataApi.md#patchMetadata) | **PATCH** /fotoweb/archives/{archiveid}/{folderid}/{asset} | Update metadata on an asset |
| [**patchMetadataWithHttpInfo**](AssetsAndMetadataApi.md#patchMetadataWithHttpInfo) | **PATCH** /fotoweb/archives/{archiveid}/{folderid}/{asset} | Update metadata on an asset |



## fotowebEditorsViewidGet

> MetadataView fotowebEditorsViewidGet(viewid)

Get a metadata view representation

Pass in the metadata view id to get the full representation of the view

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AssetsAndMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AssetsAndMetadataApi apiInstance = new AssetsAndMetadataApi(defaultClient);
        String viewid = "viewid_example"; // String | Unique ID of the metadata view
        try {
            MetadataView result = apiInstance.fotowebEditorsViewidGet(viewid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetsAndMetadataApi#fotowebEditorsViewidGet");
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
| **viewid** | **String**| Unique ID of the metadata view | |

### Return type

[**MetadataView**](MetadataView.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.metadata-set+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |
| **403** | Forbidden. The authenticated user do not have access to get the metadata view representation |  -  |

## fotowebEditorsViewidGetWithHttpInfo

> ApiResponse<MetadataView> fotowebEditorsViewidGet fotowebEditorsViewidGetWithHttpInfo(viewid)

Get a metadata view representation

Pass in the metadata view id to get the full representation of the view

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AssetsAndMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AssetsAndMetadataApi apiInstance = new AssetsAndMetadataApi(defaultClient);
        String viewid = "viewid_example"; // String | Unique ID of the metadata view
        try {
            ApiResponse<MetadataView> response = apiInstance.fotowebEditorsViewidGetWithHttpInfo(viewid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetsAndMetadataApi#fotowebEditorsViewidGet");
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
| **viewid** | **String**| Unique ID of the metadata view | |

### Return type

ApiResponse<[**MetadataView**](MetadataView.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.metadata-set+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |
| **403** | Forbidden. The authenticated user do not have access to get the metadata view representation |  -  |


## getAssetDetails

> Asset getAssetDetails(archiveid, folderid, asset)

Get the json representation of an asset

All asset resources have this representation. This includes assets in all kinds of collections, such as archives, albums and search results. Information returned about an asset may vary depending on the user that is making the request. In particular, the permissions and previews fields may contain different values for different users. They reflect the permissions that the requesting user has on the asset and the types of previews (size, watermarked or not watermarked, etc.) that are available to that user. The doctype field determines what subsections are present in the attributes section. For example, if the doctype is \&quot;image\&quot;, then attributes.imageattributes is always present. However, it is recommended to explicitly check for presence of these subsections instead whenever they are used 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AssetsAndMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AssetsAndMetadataApi apiInstance = new AssetsAndMetadataApi(defaultClient);
        String archiveid = "archiveid_example"; // String | Unique ID of the archive
        String folderid = "folderid_example"; // String | Unique ID of the folder
        String asset = "asset_example"; // String | Unique asset
        try {
            Asset result = apiInstance.getAssetDetails(archiveid, folderid, asset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetsAndMetadataApi#getAssetDetails");
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
| **archiveid** | **String**| Unique ID of the archive | |
| **folderid** | **String**| Unique ID of the folder | |
| **asset** | **String**| Unique asset | |

### Return type

[**Asset**](Asset.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.asset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## getAssetDetailsWithHttpInfo

> ApiResponse<Asset> getAssetDetails getAssetDetailsWithHttpInfo(archiveid, folderid, asset)

Get the json representation of an asset

All asset resources have this representation. This includes assets in all kinds of collections, such as archives, albums and search results. Information returned about an asset may vary depending on the user that is making the request. In particular, the permissions and previews fields may contain different values for different users. They reflect the permissions that the requesting user has on the asset and the types of previews (size, watermarked or not watermarked, etc.) that are available to that user. The doctype field determines what subsections are present in the attributes section. For example, if the doctype is \&quot;image\&quot;, then attributes.imageattributes is always present. However, it is recommended to explicitly check for presence of these subsections instead whenever they are used 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AssetsAndMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AssetsAndMetadataApi apiInstance = new AssetsAndMetadataApi(defaultClient);
        String archiveid = "archiveid_example"; // String | Unique ID of the archive
        String folderid = "folderid_example"; // String | Unique ID of the folder
        String asset = "asset_example"; // String | Unique asset
        try {
            ApiResponse<Asset> response = apiInstance.getAssetDetailsWithHttpInfo(archiveid, folderid, asset);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetsAndMetadataApi#getAssetDetails");
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
| **archiveid** | **String**| Unique ID of the archive | |
| **folderid** | **String**| Unique ID of the folder | |
| **asset** | **String**| Unique asset | |

### Return type

ApiResponse<[**Asset**](Asset.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.asset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchMetadata

> Asset patchMetadata(archiveid, folderid, asset, body)

Update metadata on an asset

Use patch on an asset to update the metadata. The metadata to update is defined in the request body. Required permissions - Edit Metadata on the archive containing the asset.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AssetsAndMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AssetsAndMetadataApi apiInstance = new AssetsAndMetadataApi(defaultClient);
        String archiveid = "archiveid_example"; // String | Unique ID of the archive
        String folderid = "folderid_example"; // String | Unique ID of the folder
        String asset = "asset_example"; // String | Unique asset
        Object body = null; // Object | 
        try {
            Asset result = apiInstance.patchMetadata(archiveid, folderid, asset, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetsAndMetadataApi#patchMetadata");
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
| **archiveid** | **String**| Unique ID of the archive | |
| **folderid** | **String**| Unique ID of the folder | |
| **asset** | **String**| Unique asset | |
| **body** | **Object**|  | [optional] |

### Return type

[**Asset**](Asset.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.assetupdate+json
- **Accept**: application/json, application/vnd.fotoware.asset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **400** | Bad Request. For instance if the metadata object is formatted wrong |  -  |

## patchMetadataWithHttpInfo

> ApiResponse<Asset> patchMetadata patchMetadataWithHttpInfo(archiveid, folderid, asset, body)

Update metadata on an asset

Use patch on an asset to update the metadata. The metadata to update is defined in the request body. Required permissions - Edit Metadata on the archive containing the asset.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.AssetsAndMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        AssetsAndMetadataApi apiInstance = new AssetsAndMetadataApi(defaultClient);
        String archiveid = "archiveid_example"; // String | Unique ID of the archive
        String folderid = "folderid_example"; // String | Unique ID of the folder
        String asset = "asset_example"; // String | Unique asset
        Object body = null; // Object | 
        try {
            ApiResponse<Asset> response = apiInstance.patchMetadataWithHttpInfo(archiveid, folderid, asset, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetsAndMetadataApi#patchMetadata");
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
| **archiveid** | **String**| Unique ID of the archive | |
| **folderid** | **String**| Unique ID of the folder | |
| **asset** | **String**| Unique asset | |
| **body** | **Object**|  | [optional] |

### Return type

ApiResponse<[**Asset**](Asset.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.assetupdate+json
- **Accept**: application/json, application/vnd.fotoware.asset+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **400** | Bad Request. For instance if the metadata object is formatted wrong |  -  |

