# RenditionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebServicesRenditionsPost**](RenditionsApi.md#fotowebServicesRenditionsPost) | **POST** /fotoweb/services/renditions | Get the rendition download url |
| [**fotowebServicesRenditionsPostWithHttpInfo**](RenditionsApi.md#fotowebServicesRenditionsPostWithHttpInfo) | **POST** /fotoweb/services/renditions | Get the rendition download url |



## fotowebServicesRenditionsPost

> RenditionResponse fotowebServicesRenditionsPost(renditionRequest)

Get the rendition download url

The representation of an asset gives you a list with predefined renditions available for the asset. This request uses the url to one of those renditions to generate a download url for the asset rendition. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.RenditionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        RenditionsApi apiInstance = new RenditionsApi(defaultClient);
        RenditionRequest renditionRequest = new RenditionRequest(); // RenditionRequest | 
        try {
            RenditionResponse result = apiInstance.fotowebServicesRenditionsPost(renditionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RenditionsApi#fotowebServicesRenditionsPost");
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
| **renditionRequest** | [**RenditionRequest**](RenditionRequest.md)|  | [optional] |

### Return type

[**RenditionResponse**](RenditionResponse.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.rendition-request+json
- **Accept**: application/vnd.fotoware.rendition-response+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |
| **403** | Forbidden. The user does not have permission to download the rendition. |  -  |

## fotowebServicesRenditionsPostWithHttpInfo

> ApiResponse<RenditionResponse> fotowebServicesRenditionsPost fotowebServicesRenditionsPostWithHttpInfo(renditionRequest)

Get the rendition download url

The representation of an asset gives you a list with predefined renditions available for the asset. This request uses the url to one of those renditions to generate a download url for the asset rendition. 

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.RenditionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        RenditionsApi apiInstance = new RenditionsApi(defaultClient);
        RenditionRequest renditionRequest = new RenditionRequest(); // RenditionRequest | 
        try {
            ApiResponse<RenditionResponse> response = apiInstance.fotowebServicesRenditionsPostWithHttpInfo(renditionRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RenditionsApi#fotowebServicesRenditionsPost");
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
| **renditionRequest** | [**RenditionRequest**](RenditionRequest.md)|  | [optional] |

### Return type

ApiResponse<[**RenditionResponse**](RenditionResponse.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.rendition-request+json
- **Accept**: application/vnd.fotoware.rendition-response+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |
| **403** | Forbidden. The user does not have permission to download the rendition. |  -  |

