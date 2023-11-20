# ApiEntryPointsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebGet**](ApiEntryPointsApi.md#fotowebGet) | **GET** /fotoweb/ | Public entry point |
| [**fotowebGetWithHttpInfo**](ApiEntryPointsApi.md#fotowebGetWithHttpInfo) | **GET** /fotoweb/ | Public entry point |
| [**fotowebMeGet**](ApiEntryPointsApi.md#fotowebMeGet) | **GET** /fotoweb/me/ | Private entry point |
| [**fotowebMeGetWithHttpInfo**](ApiEntryPointsApi.md#fotowebMeGetWithHttpInfo) | **GET** /fotoweb/me/ | Private entry point |



## fotowebGet

> APIDescriptor fotowebGet()

Public entry point

The Public entry point is for unauthenticated, read-only guest access. It is only available if Guest access is enabled and licensed on the FotoWeb server.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ApiEntryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ApiEntryPointsApi apiInstance = new ApiEntryPointsApi(defaultClient);
        try {
            APIDescriptor result = apiInstance.fotowebGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiEntryPointsApi#fotowebGet");
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

[**APIDescriptor**](APIDescriptor.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.api-descriptor+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |

## fotowebGetWithHttpInfo

> ApiResponse<APIDescriptor> fotowebGet fotowebGetWithHttpInfo()

Public entry point

The Public entry point is for unauthenticated, read-only guest access. It is only available if Guest access is enabled and licensed on the FotoWeb server.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ApiEntryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ApiEntryPointsApi apiInstance = new ApiEntryPointsApi(defaultClient);
        try {
            ApiResponse<APIDescriptor> response = apiInstance.fotowebGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiEntryPointsApi#fotowebGet");
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

ApiResponse<[**APIDescriptor**](APIDescriptor.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.api-descriptor+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |


## fotowebMeGet

> FullAPIDescriptor fotowebMeGet()

Private entry point

The Private entry point allows authenticated access to the server to view and modify data. It requires authentication, either as administrator (server-to-server authentication) or as a specific user.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ApiEntryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        ApiEntryPointsApi apiInstance = new ApiEntryPointsApi(defaultClient);
        try {
            FullAPIDescriptor result = apiInstance.fotowebMeGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiEntryPointsApi#fotowebMeGet");
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

[**FullAPIDescriptor**](FullAPIDescriptor.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.full-api-descriptor+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |

## fotowebMeGetWithHttpInfo

> ApiResponse<FullAPIDescriptor> fotowebMeGet fotowebMeGetWithHttpInfo()

Private entry point

The Private entry point allows authenticated access to the server to view and modify data. It requires authentication, either as administrator (server-to-server authentication) or as a specific user.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.ApiEntryPointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        ApiEntryPointsApi apiInstance = new ApiEntryPointsApi(defaultClient);
        try {
            ApiResponse<FullAPIDescriptor> response = apiInstance.fotowebMeGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiEntryPointsApi#fotowebMeGet");
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

ApiResponse<[**FullAPIDescriptor**](FullAPIDescriptor.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.full-api-descriptor+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. Call successfuly completed |  -  |
| **401** | Unauthorized. Access is denied due to invalid credentials |  -  |

