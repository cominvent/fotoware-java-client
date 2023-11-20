# OrdersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fotowebMeCartGet**](OrdersApi.md#fotowebMeCartGet) | **GET** /fotoweb/me/cart | Get the count of items in the users cart |
| [**fotowebMeCartGetWithHttpInfo**](OrdersApi.md#fotowebMeCartGetWithHttpInfo) | **GET** /fotoweb/me/cart | Get the count of items in the users cart |
| [**fotowebMeCartPost**](OrdersApi.md#fotowebMeCartPost) | **POST** /fotoweb/me/cart | Add item(s) to users personal cart |
| [**fotowebMeCartPostWithHttpInfo**](OrdersApi.md#fotowebMeCartPostWithHttpInfo) | **POST** /fotoweb/me/cart | Add item(s) to users personal cart |
| [**fotowebMeCartPut**](OrdersApi.md#fotowebMeCartPut) | **PUT** /fotoweb/me/cart | Edit the content of a cart |
| [**fotowebMeCartPutWithHttpInfo**](OrdersApi.md#fotowebMeCartPutWithHttpInfo) | **PUT** /fotoweb/me/cart | Edit the content of a cart |
| [**fotowebMeOrdersGet**](OrdersApi.md#fotowebMeOrdersGet) | **GET** /fotoweb/me/orders/ | Users personal order list |
| [**fotowebMeOrdersGetWithHttpInfo**](OrdersApi.md#fotowebMeOrdersGetWithHttpInfo) | **GET** /fotoweb/me/orders/ | Users personal order list |
| [**fotowebMeOrdersPost**](OrdersApi.md#fotowebMeOrdersPost) | **POST** /fotoweb/me/orders/ | Submit the shopping cart to an order |
| [**fotowebMeOrdersPostWithHttpInfo**](OrdersApi.md#fotowebMeOrdersPostWithHttpInfo) | **POST** /fotoweb/me/orders/ | Submit the shopping cart to an order |
| [**fotowebOrdersApprovedGet**](OrdersApi.md#fotowebOrdersApprovedGet) | **GET** /fotoweb/orders/approved/ | Site&#39;s global list of approved orders |
| [**fotowebOrdersApprovedGetWithHttpInfo**](OrdersApi.md#fotowebOrdersApprovedGetWithHttpInfo) | **GET** /fotoweb/orders/approved/ | Site&#39;s global list of approved orders |
| [**fotowebOrdersGet**](OrdersApi.md#fotowebOrdersGet) | **GET** /fotoweb/orders/ | Site&#39;s global order history |
| [**fotowebOrdersGetWithHttpInfo**](OrdersApi.md#fotowebOrdersGetWithHttpInfo) | **GET** /fotoweb/orders/ | Site&#39;s global order history |
| [**fotowebOrdersOrderhrefPatch**](OrdersApi.md#fotowebOrdersOrderhrefPatch) | **PATCH** /fotoweb/orders/{orderhref} | This request can be used to modify an existing order that is in pending or created state |
| [**fotowebOrdersOrderhrefPatchWithHttpInfo**](OrdersApi.md#fotowebOrdersOrderhrefPatchWithHttpInfo) | **PATCH** /fotoweb/orders/{orderhref} | This request can be used to modify an existing order that is in pending or created state |
| [**fotowebOrdersPendingGet**](OrdersApi.md#fotowebOrdersPendingGet) | **GET** /fotoweb/orders/pending/ | Site&#39;s global list of pending orders |
| [**fotowebOrdersPendingGetWithHttpInfo**](OrdersApi.md#fotowebOrdersPendingGetWithHttpInfo) | **GET** /fotoweb/orders/pending/ | Site&#39;s global list of pending orders |
| [**fotowebOrdersRejectedGet**](OrdersApi.md#fotowebOrdersRejectedGet) | **GET** /fotoweb/orders/rejected/ | Site&#39;s global list of rejected orders |
| [**fotowebOrdersRejectedGetWithHttpInfo**](OrdersApi.md#fotowebOrdersRejectedGetWithHttpInfo) | **GET** /fotoweb/orders/rejected/ | Site&#39;s global list of rejected orders |



## fotowebMeCartGet

> Count fotowebMeCartGet()

Get the count of items in the users cart

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            Count result = apiInstance.fotowebMeCartGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeCartGet");
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

[**Count**](Count.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.order+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |

## fotowebMeCartGetWithHttpInfo

> ApiResponse<Count> fotowebMeCartGet fotowebMeCartGetWithHttpInfo()

Get the count of items in the users cart

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            ApiResponse<Count> response = apiInstance.fotowebMeCartGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeCartGet");
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

ApiResponse<[**Count**](Count.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.order+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |


## fotowebMeCartPost

> void fotowebMeCartPost(assetLinkList)

Add item(s) to users personal cart

Add one or more items to the users shopping cart by using the assets url.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        AssetLinkList assetLinkList = new AssetLinkList(); // AssetLinkList | 
        try {
            apiInstance.fotowebMeCartPost(assetLinkList);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeCartPost");
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
| **assetLinkList** | [**AssetLinkList**](AssetLinkList.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.assetlinklist+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **403** | Forbidden. No access to add items to the users cart. |  -  |
| **400** | Bad request. For instance malformed url to asset. |  -  |

## fotowebMeCartPostWithHttpInfo

> ApiResponse<Void> fotowebMeCartPost fotowebMeCartPostWithHttpInfo(assetLinkList)

Add item(s) to users personal cart

Add one or more items to the users shopping cart by using the assets url.

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        AssetLinkList assetLinkList = new AssetLinkList(); // AssetLinkList | 
        try {
            ApiResponse<Void> response = apiInstance.fotowebMeCartPostWithHttpInfo(assetLinkList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeCartPost");
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
| **assetLinkList** | [**AssetLinkList**](AssetLinkList.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.assetlinklist+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **403** | Forbidden. No access to add items to the users cart. |  -  |
| **400** | Bad request. For instance malformed url to asset. |  -  |


## fotowebMeCartPut

> void fotowebMeCartPut(cartUpdate)

Edit the content of a cart

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        CartUpdate cartUpdate = new CartUpdate(); // CartUpdate | 
        try {
            apiInstance.fotowebMeCartPut(cartUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeCartPut");
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
| **cartUpdate** | [**CartUpdate**](CartUpdate.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.cart-update+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad request |  -  |

## fotowebMeCartPutWithHttpInfo

> ApiResponse<Void> fotowebMeCartPut fotowebMeCartPutWithHttpInfo(cartUpdate)

Edit the content of a cart

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        CartUpdate cartUpdate = new CartUpdate(); // CartUpdate | 
        try {
            ApiResponse<Void> response = apiInstance.fotowebMeCartPutWithHttpInfo(cartUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeCartPut");
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
| **cartUpdate** | [**CartUpdate**](CartUpdate.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.cart-update+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **403** | Forbidden |  -  |
| **400** | Bad request |  -  |


## fotowebMeOrdersGet

> OrderList fotowebMeOrdersGet()

Users personal order list

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            OrderList result = apiInstance.fotowebMeOrdersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeOrdersGet");
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

[**OrderList**](OrderList.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebMeOrdersGetWithHttpInfo

> ApiResponse<OrderList> fotowebMeOrdersGet fotowebMeOrdersGetWithHttpInfo()

Users personal order list

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            ApiResponse<OrderList> response = apiInstance.fotowebMeOrdersGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeOrdersGet");
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

ApiResponse<[**OrderList**](OrderList.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebMeOrdersPost

> OrderSubmissionInfo fotowebMeOrdersPost(cartUpdate)

Submit the shopping cart to an order

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        CartUpdate cartUpdate = new CartUpdate(); // CartUpdate | 
        try {
            OrderSubmissionInfo result = apiInstance.fotowebMeOrdersPost(cartUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeOrdersPost");
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
| **cartUpdate** | [**CartUpdate**](CartUpdate.md)|  | [optional] |

### Return type

[**OrderSubmissionInfo**](OrderSubmissionInfo.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.cart-update+json
- **Accept**: application/json, application/vnd.fotoware.order-submission-info+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden. The user does not have \&quot;Order\&quot; permission in the archives of any of the assets in the request |  -  |
| **400** | Bad request |  -  |

## fotowebMeOrdersPostWithHttpInfo

> ApiResponse<OrderSubmissionInfo> fotowebMeOrdersPost fotowebMeOrdersPostWithHttpInfo(cartUpdate)

Submit the shopping cart to an order

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        CartUpdate cartUpdate = new CartUpdate(); // CartUpdate | 
        try {
            ApiResponse<OrderSubmissionInfo> response = apiInstance.fotowebMeOrdersPostWithHttpInfo(cartUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebMeOrdersPost");
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
| **cartUpdate** | [**CartUpdate**](CartUpdate.md)|  | [optional] |

### Return type

ApiResponse<[**OrderSubmissionInfo**](OrderSubmissionInfo.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/vnd.fotoware.cart-update+json
- **Accept**: application/json, application/vnd.fotoware.order-submission-info+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden. The user does not have \&quot;Order\&quot; permission in the archives of any of the assets in the request |  -  |
| **400** | Bad request |  -  |


## fotowebOrdersApprovedGet

> Count fotowebOrdersApprovedGet()

Site&#39;s global list of approved orders

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            Count result = apiInstance.fotowebOrdersApprovedGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersApprovedGet");
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

[**Count**](Count.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebOrdersApprovedGetWithHttpInfo

> ApiResponse<Count> fotowebOrdersApprovedGet fotowebOrdersApprovedGetWithHttpInfo()

Site&#39;s global list of approved orders

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            ApiResponse<Count> response = apiInstance.fotowebOrdersApprovedGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersApprovedGet");
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

ApiResponse<[**Count**](Count.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebOrdersGet

> Count fotowebOrdersGet()

Site&#39;s global order history

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            Count result = apiInstance.fotowebOrdersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersGet");
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

[**Count**](Count.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebOrdersGetWithHttpInfo

> ApiResponse<Count> fotowebOrdersGet fotowebOrdersGetWithHttpInfo()

Site&#39;s global order history

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            ApiResponse<Count> response = apiInstance.fotowebOrdersGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersGet");
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

ApiResponse<[**Count**](Count.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebOrdersOrderhrefPatch

> Order fotowebOrdersOrderhrefPatch(orderhref, orderUpdate)

This request can be used to modify an existing order that is in pending or created state

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String orderhref = "orderhref_example"; // String | Unique ID of the order
        OrderUpdate orderUpdate = new OrderUpdate(); // OrderUpdate | 
        try {
            Order result = apiInstance.fotowebOrdersOrderhrefPatch(orderhref, orderUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersOrderhrefPatch");
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
| **orderhref** | **String**| Unique ID of the order | |
| **orderUpdate** | [**OrderUpdate**](OrderUpdate.md)|  | [optional] |

### Return type

[**Order**](Order.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.orderupdate+json
- **Accept**: application/vnd.fotoware.order+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebOrdersOrderhrefPatchWithHttpInfo

> ApiResponse<Order> fotowebOrdersOrderhrefPatch fotowebOrdersOrderhrefPatchWithHttpInfo(orderhref, orderUpdate)

This request can be used to modify an existing order that is in pending or created state

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String orderhref = "orderhref_example"; // String | Unique ID of the order
        OrderUpdate orderUpdate = new OrderUpdate(); // OrderUpdate | 
        try {
            ApiResponse<Order> response = apiInstance.fotowebOrdersOrderhrefPatchWithHttpInfo(orderhref, orderUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersOrderhrefPatch");
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
| **orderhref** | **String**| Unique ID of the order | |
| **orderUpdate** | [**OrderUpdate**](OrderUpdate.md)|  | [optional] |

### Return type

ApiResponse<[**Order**](Order.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.fotoware.orderupdate+json
- **Accept**: application/vnd.fotoware.order+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebOrdersPendingGet

> Count fotowebOrdersPendingGet()

Site&#39;s global list of pending orders

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            Count result = apiInstance.fotowebOrdersPendingGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersPendingGet");
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

[**Count**](Count.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## fotowebOrdersPendingGetWithHttpInfo

> ApiResponse<Count> fotowebOrdersPendingGet fotowebOrdersPendingGetWithHttpInfo()

Site&#39;s global list of pending orders

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            ApiResponse<Count> response = apiInstance.fotowebOrdersPendingGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersPendingGet");
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

ApiResponse<[**Count**](Count.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## fotowebOrdersRejectedGet

> Count fotowebOrdersRejectedGet()

Site&#39;s global list of rejected orders

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            Count result = apiInstance.fotowebOrdersRejectedGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersRejectedGet");
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

[**Count**](Count.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | 401 Unauthorized |  -  |

## fotowebOrdersRejectedGetWithHttpInfo

> ApiResponse<Count> fotowebOrdersRejectedGet fotowebOrdersRejectedGetWithHttpInfo()

Site&#39;s global list of rejected orders

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        try {
            ApiResponse<Count> response = apiInstance.fotowebOrdersRejectedGetWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#fotowebOrdersRejectedGet");
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

ApiResponse<[**Count**](Count.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.fotoware.count+json, application/vnd.fotoware.orderlist+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | 401 Unauthorized |  -  |

