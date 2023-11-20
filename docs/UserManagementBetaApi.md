# UserManagementBetaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userAddUserMemberships**](UserManagementBetaApi.md#userAddUserMemberships) | **POST** /fotoweb/api/users/{id}/member-of | Add the user to one or more groups |
| [**userAddUserMembershipsWithHttpInfo**](UserManagementBetaApi.md#userAddUserMembershipsWithHttpInfo) | **POST** /fotoweb/api/users/{id}/member-of | Add the user to one or more groups |
| [**userCountAllUsers**](UserManagementBetaApi.md#userCountAllUsers) | **GET** /fotoweb/api/users/count | Count all users on the site |
| [**userCountAllUsersWithHttpInfo**](UserManagementBetaApi.md#userCountAllUsersWithHttpInfo) | **GET** /fotoweb/api/users/count | Count all users on the site |
| [**userCountRecursiveUserMemberships**](UserManagementBetaApi.md#userCountRecursiveUserMemberships) | **GET** /fotoweb/api/users/{id}/member-of-recursive/count | Count all distinct groups that the user is a direct or indirect member of |
| [**userCountRecursiveUserMembershipsWithHttpInfo**](UserManagementBetaApi.md#userCountRecursiveUserMembershipsWithHttpInfo) | **GET** /fotoweb/api/users/{id}/member-of-recursive/count | Count all distinct groups that the user is a direct or indirect member of |
| [**userCountUserDirectMemberships**](UserManagementBetaApi.md#userCountUserDirectMemberships) | **GET** /fotoweb/api/users/{id}/member-of/count | Count all groups that the user is a direct member of |
| [**userCountUserDirectMembershipsWithHttpInfo**](UserManagementBetaApi.md#userCountUserDirectMembershipsWithHttpInfo) | **GET** /fotoweb/api/users/{id}/member-of/count | Count all groups that the user is a direct member of |
| [**userCreateNewUser**](UserManagementBetaApi.md#userCreateNewUser) | **POST** /fotoweb/api/users | Create a new user |
| [**userCreateNewUserWithHttpInfo**](UserManagementBetaApi.md#userCreateNewUserWithHttpInfo) | **POST** /fotoweb/api/users | Create a new user |
| [**userDeleteAllUserMemberships**](UserManagementBetaApi.md#userDeleteAllUserMemberships) | **DELETE** /fotoweb/api/users/{id}/member-of | Remove the user from all groups |
| [**userDeleteAllUserMembershipsWithHttpInfo**](UserManagementBetaApi.md#userDeleteAllUserMembershipsWithHttpInfo) | **DELETE** /fotoweb/api/users/{id}/member-of | Remove the user from all groups |
| [**userDeleteAllUserProperties**](UserManagementBetaApi.md#userDeleteAllUserProperties) | **DELETE** /fotoweb/api/users/{id}/properties | Delete all custom properties of a user |
| [**userDeleteAllUserPropertiesWithHttpInfo**](UserManagementBetaApi.md#userDeleteAllUserPropertiesWithHttpInfo) | **DELETE** /fotoweb/api/users/{id}/properties | Delete all custom properties of a user |
| [**userDeleteUser**](UserManagementBetaApi.md#userDeleteUser) | **DELETE** /fotoweb/api/users/{id} | Delete a user |
| [**userDeleteUserWithHttpInfo**](UserManagementBetaApi.md#userDeleteUserWithHttpInfo) | **DELETE** /fotoweb/api/users/{id} | Delete a user |
| [**userDeleteUserExternalIds**](UserManagementBetaApi.md#userDeleteUserExternalIds) | **DELETE** /fotoweb/api/users/{id}/external-ids | Delete all external IDs of a user |
| [**userDeleteUserExternalIdsWithHttpInfo**](UserManagementBetaApi.md#userDeleteUserExternalIdsWithHttpInfo) | **DELETE** /fotoweb/api/users/{id}/external-ids | Delete all external IDs of a user |
| [**userDeleteUserExternalIdsFromProvider**](UserManagementBetaApi.md#userDeleteUserExternalIdsFromProvider) | **DELETE** /fotoweb/api/users/{id}/external-ids/{provider} | Delete the external ID of a user from a provider |
| [**userDeleteUserExternalIdsFromProviderWithHttpInfo**](UserManagementBetaApi.md#userDeleteUserExternalIdsFromProviderWithHttpInfo) | **DELETE** /fotoweb/api/users/{id}/external-ids/{provider} | Delete the external ID of a user from a provider |
| [**userDeleteUserMembership**](UserManagementBetaApi.md#userDeleteUserMembership) | **DELETE** /fotoweb/api/users/{id}/member-of/{group} | Remove the user from a single group |
| [**userDeleteUserMembershipWithHttpInfo**](UserManagementBetaApi.md#userDeleteUserMembershipWithHttpInfo) | **DELETE** /fotoweb/api/users/{id}/member-of/{group} | Remove the user from a single group |
| [**userDeleteUserPassword**](UserManagementBetaApi.md#userDeleteUserPassword) | **DELETE** /fotoweb/api/users/{id}/password | Delete the password of a user |
| [**userDeleteUserPasswordWithHttpInfo**](UserManagementBetaApi.md#userDeleteUserPasswordWithHttpInfo) | **DELETE** /fotoweb/api/users/{id}/password | Delete the password of a user |
| [**userDeleteUserProperties**](UserManagementBetaApi.md#userDeleteUserProperties) | **DELETE** /fotoweb/api/users/{id}/properties/{key} | Delete a custom property of a user |
| [**userDeleteUserPropertiesWithHttpInfo**](UserManagementBetaApi.md#userDeleteUserPropertiesWithHttpInfo) | **DELETE** /fotoweb/api/users/{id}/properties/{key} | Delete a custom property of a user |
| [**userGetAllUsers**](UserManagementBetaApi.md#userGetAllUsers) | **GET** /fotoweb/api/users | Get all users on the site |
| [**userGetAllUsersWithHttpInfo**](UserManagementBetaApi.md#userGetAllUsersWithHttpInfo) | **GET** /fotoweb/api/users | Get all users on the site |
| [**userGetRecursiveUserMemberships**](UserManagementBetaApi.md#userGetRecursiveUserMemberships) | **GET** /fotoweb/api/users/{id}/member-of-recursive | Get all distinct groups that the user is a direct or indirect member of |
| [**userGetRecursiveUserMembershipsWithHttpInfo**](UserManagementBetaApi.md#userGetRecursiveUserMembershipsWithHttpInfo) | **GET** /fotoweb/api/users/{id}/member-of-recursive | Get all distinct groups that the user is a direct or indirect member of |
| [**userGetUserById**](UserManagementBetaApi.md#userGetUserById) | **GET** /fotoweb/api/users/{id} | Get user by ID |
| [**userGetUserByIdWithHttpInfo**](UserManagementBetaApi.md#userGetUserByIdWithHttpInfo) | **GET** /fotoweb/api/users/{id} | Get user by ID |
| [**userGetUserDirectMemberships**](UserManagementBetaApi.md#userGetUserDirectMemberships) | **GET** /fotoweb/api/users/{id}/member-of | Get all groups that the user is a direct member of |
| [**userGetUserDirectMembershipsWithHttpInfo**](UserManagementBetaApi.md#userGetUserDirectMembershipsWithHttpInfo) | **GET** /fotoweb/api/users/{id}/member-of | Get all groups that the user is a direct member of |
| [**userGetUserExternalIds**](UserManagementBetaApi.md#userGetUserExternalIds) | **GET** /fotoweb/api/users/{id}/external-ids | Get all external IDs of a user |
| [**userGetUserExternalIdsWithHttpInfo**](UserManagementBetaApi.md#userGetUserExternalIdsWithHttpInfo) | **GET** /fotoweb/api/users/{id}/external-ids | Get all external IDs of a user |
| [**userGetUserPropertyBag**](UserManagementBetaApi.md#userGetUserPropertyBag) | **GET** /fotoweb/api/users/{id}/properties | Get all custom properties of a user |
| [**userGetUserPropertyBagWithHttpInfo**](UserManagementBetaApi.md#userGetUserPropertyBagWithHttpInfo) | **GET** /fotoweb/api/users/{id}/properties | Get all custom properties of a user |
| [**userSetUserEnabled**](UserManagementBetaApi.md#userSetUserEnabled) | **PUT** /fotoweb/api/users/{id}/enabled | Enable or disable user |
| [**userSetUserEnabledWithHttpInfo**](UserManagementBetaApi.md#userSetUserEnabledWithHttpInfo) | **PUT** /fotoweb/api/users/{id}/enabled | Enable or disable user |
| [**userSetUserMemberships**](UserManagementBetaApi.md#userSetUserMemberships) | **PUT** /fotoweb/api/users/{id}/member-of | Set the groups that the user is a direct member of |
| [**userSetUserMembershipsWithHttpInfo**](UserManagementBetaApi.md#userSetUserMembershipsWithHttpInfo) | **PUT** /fotoweb/api/users/{id}/member-of | Set the groups that the user is a direct member of |
| [**userUpdateUser**](UserManagementBetaApi.md#userUpdateUser) | **PUT** /fotoweb/api/users/{id} | Update a user |
| [**userUpdateUserWithHttpInfo**](UserManagementBetaApi.md#userUpdateUserWithHttpInfo) | **PUT** /fotoweb/api/users/{id} | Update a user |



## userAddUserMemberships

> void userAddUserMemberships(id, groups)

Add the user to one or more groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            apiInstance.userAddUserMemberships(id, groups);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userAddUserMemberships");
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
| **id** | **Integer**| ID of user | |
| **groups** | [**MembershipIdListModel**](MembershipIdListModel.md)| IDs of groups | |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

## userAddUserMembershipsWithHttpInfo

> ApiResponse<Void> userAddUserMemberships userAddUserMembershipsWithHttpInfo(id, groups)

Add the user to one or more groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            ApiResponse<Void> response = apiInstance.userAddUserMembershipsWithHttpInfo(id, groups);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userAddUserMemberships");
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
| **id** | **Integer**| ID of user | |
| **groups** | [**MembershipIdListModel**](MembershipIdListModel.md)| IDs of groups | |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## userCountAllUsers

> ValueModelInteger userCountAllUsers(licenseLevel, licenseMode, isSso, ssoProvider)

Count all users on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        String licenseLevel = "None"; // String | Count only users with the given license level
        String licenseMode = "Named"; // String | Count only users with the given license concurrency mode
        Boolean isSso = true; // Boolean | Count only SSO users
        String ssoProvider = "ssoProvider_example"; // String | Count only users from the given SSO provider
        try {
            ValueModelInteger result = apiInstance.userCountAllUsers(licenseLevel, licenseMode, isSso, ssoProvider);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCountAllUsers");
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
| **licenseLevel** | **String**| Count only users with the given license level | [optional] [enum: None, Portal, Consumer, Contributor, Standard, Plus, Main, Editor, Pro] |
| **licenseMode** | **String**| Count only users with the given license concurrency mode | [optional] [enum: Named, Concurrent] |
| **isSso** | **Boolean**| Count only SSO users | [optional] |
| **ssoProvider** | **String**| Count only users from the given SSO provider | [optional] |

### Return type

[**ValueModelInteger**](ValueModelInteger.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userCountAllUsersWithHttpInfo

> ApiResponse<ValueModelInteger> userCountAllUsers userCountAllUsersWithHttpInfo(licenseLevel, licenseMode, isSso, ssoProvider)

Count all users on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        String licenseLevel = "None"; // String | Count only users with the given license level
        String licenseMode = "Named"; // String | Count only users with the given license concurrency mode
        Boolean isSso = true; // Boolean | Count only SSO users
        String ssoProvider = "ssoProvider_example"; // String | Count only users from the given SSO provider
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.userCountAllUsersWithHttpInfo(licenseLevel, licenseMode, isSso, ssoProvider);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCountAllUsers");
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
| **licenseLevel** | **String**| Count only users with the given license level | [optional] [enum: None, Portal, Consumer, Contributor, Standard, Plus, Main, Editor, Pro] |
| **licenseMode** | **String**| Count only users with the given license concurrency mode | [optional] [enum: Named, Concurrent] |
| **isSso** | **Boolean**| Count only SSO users | [optional] |
| **ssoProvider** | **String**| Count only users from the given SSO provider | [optional] |

### Return type

ApiResponse<[**ValueModelInteger**](ValueModelInteger.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userCountRecursiveUserMemberships

> ValueModelInteger userCountRecursiveUserMemberships(id)

Count all distinct groups that the user is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ValueModelInteger result = apiInstance.userCountRecursiveUserMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCountRecursiveUserMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

[**ValueModelInteger**](ValueModelInteger.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userCountRecursiveUserMembershipsWithHttpInfo

> ApiResponse<ValueModelInteger> userCountRecursiveUserMemberships userCountRecursiveUserMembershipsWithHttpInfo(id)

Count all distinct groups that the user is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.userCountRecursiveUserMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCountRecursiveUserMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

ApiResponse<[**ValueModelInteger**](ValueModelInteger.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userCountUserDirectMemberships

> ValueModelInteger userCountUserDirectMemberships(id)

Count all groups that the user is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ValueModelInteger result = apiInstance.userCountUserDirectMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCountUserDirectMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

[**ValueModelInteger**](ValueModelInteger.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userCountUserDirectMembershipsWithHttpInfo

> ApiResponse<ValueModelInteger> userCountUserDirectMemberships userCountUserDirectMembershipsWithHttpInfo(id)

Count all groups that the user is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.userCountUserDirectMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCountUserDirectMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

ApiResponse<[**ValueModelInteger**](ValueModelInteger.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userCreateNewUser

> User userCreateNewUser(user)

Create a new user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        User user = new User(); // User | User properties
        try {
            User result = apiInstance.userCreateNewUser(user);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCreateNewUser");
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
| **user** | [**User**](User.md)| User properties | |

### Return type

[**User**](User.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userCreateNewUserWithHttpInfo

> ApiResponse<User> userCreateNewUser userCreateNewUserWithHttpInfo(user)

Create a new user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        User user = new User(); // User | User properties
        try {
            ApiResponse<User> response = apiInstance.userCreateNewUserWithHttpInfo(user);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userCreateNewUser");
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
| **user** | [**User**](User.md)| User properties | |

### Return type

ApiResponse<[**User**](User.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userDeleteAllUserMemberships

> void userDeleteAllUserMemberships(id)

Remove the user from all groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        try {
            apiInstance.userDeleteAllUserMemberships(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteAllUserMemberships");
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
| **id** | **Integer**| ID of user | |

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
| **204** | No Content |  -  |

## userDeleteAllUserMembershipsWithHttpInfo

> ApiResponse<Void> userDeleteAllUserMemberships userDeleteAllUserMembershipsWithHttpInfo(id)

Remove the user from all groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        try {
            ApiResponse<Void> response = apiInstance.userDeleteAllUserMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteAllUserMemberships");
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
| **id** | **Integer**| ID of user | |

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
| **204** | No Content |  -  |


## userDeleteAllUserProperties

> void userDeleteAllUserProperties(id)

Delete all custom properties of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            apiInstance.userDeleteAllUserProperties(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteAllUserProperties");
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
| **id** | **Integer**| ID of the user | |

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
| **204** | No Content |  -  |

## userDeleteAllUserPropertiesWithHttpInfo

> ApiResponse<Void> userDeleteAllUserProperties userDeleteAllUserPropertiesWithHttpInfo(id)

Delete all custom properties of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<Void> response = apiInstance.userDeleteAllUserPropertiesWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteAllUserProperties");
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
| **id** | **Integer**| ID of the user | |

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
| **204** | No Content |  -  |


## userDeleteUser

> void userDeleteUser(id)

Delete a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            apiInstance.userDeleteUser(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUser");
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
| **id** | **Integer**| ID of the user | |

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
| **204** | No Content |  -  |

## userDeleteUserWithHttpInfo

> ApiResponse<Void> userDeleteUser userDeleteUserWithHttpInfo(id)

Delete a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<Void> response = apiInstance.userDeleteUserWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUser");
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
| **id** | **Integer**| ID of the user | |

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
| **204** | No Content |  -  |


## userDeleteUserExternalIds

> void userDeleteUserExternalIds(id)

Delete all external IDs of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            apiInstance.userDeleteUserExternalIds(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserExternalIds");
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
| **id** | **Integer**| ID of the user | |

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
| **204** | No Content |  -  |

## userDeleteUserExternalIdsWithHttpInfo

> ApiResponse<Void> userDeleteUserExternalIds userDeleteUserExternalIdsWithHttpInfo(id)

Delete all external IDs of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<Void> response = apiInstance.userDeleteUserExternalIdsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserExternalIds");
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
| **id** | **Integer**| ID of the user | |

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
| **204** | No Content |  -  |


## userDeleteUserExternalIdsFromProvider

> void userDeleteUserExternalIdsFromProvider(id, provider)

Delete the external ID of a user from a provider

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        UUID provider = UUID.randomUUID(); // UUID | ID of the SSO provider
        try {
            apiInstance.userDeleteUserExternalIdsFromProvider(id, provider);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserExternalIdsFromProvider");
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
| **id** | **Integer**| ID of the user | |
| **provider** | **UUID**| ID of the SSO provider | |

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
| **204** | No Content |  -  |

## userDeleteUserExternalIdsFromProviderWithHttpInfo

> ApiResponse<Void> userDeleteUserExternalIdsFromProvider userDeleteUserExternalIdsFromProviderWithHttpInfo(id, provider)

Delete the external ID of a user from a provider

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        UUID provider = UUID.randomUUID(); // UUID | ID of the SSO provider
        try {
            ApiResponse<Void> response = apiInstance.userDeleteUserExternalIdsFromProviderWithHttpInfo(id, provider);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserExternalIdsFromProvider");
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
| **id** | **Integer**| ID of the user | |
| **provider** | **UUID**| ID of the SSO provider | |

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
| **204** | No Content |  -  |


## userDeleteUserMembership

> void userDeleteUserMembership(id, group)

Remove the user from a single group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        Integer group = 56; // Integer | ID of group
        try {
            apiInstance.userDeleteUserMembership(id, group);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserMembership");
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
| **id** | **Integer**| ID of user | |
| **group** | **Integer**| ID of group | |

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
| **204** | No Content |  -  |

## userDeleteUserMembershipWithHttpInfo

> ApiResponse<Void> userDeleteUserMembership userDeleteUserMembershipWithHttpInfo(id, group)

Remove the user from a single group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        Integer group = 56; // Integer | ID of group
        try {
            ApiResponse<Void> response = apiInstance.userDeleteUserMembershipWithHttpInfo(id, group);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserMembership");
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
| **id** | **Integer**| ID of user | |
| **group** | **Integer**| ID of group | |

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
| **204** | No Content |  -  |


## userDeleteUserPassword

> void userDeleteUserPassword(id)

Delete the password of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        try {
            apiInstance.userDeleteUserPassword(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserPassword");
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
| **id** | **Integer**| ID of user | |

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
| **204** | No Content |  -  |

## userDeleteUserPasswordWithHttpInfo

> ApiResponse<Void> userDeleteUserPassword userDeleteUserPasswordWithHttpInfo(id)

Delete the password of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        try {
            ApiResponse<Void> response = apiInstance.userDeleteUserPasswordWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserPassword");
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
| **id** | **Integer**| ID of user | |

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
| **204** | No Content |  -  |


## userDeleteUserProperties

> void userDeleteUserProperties(id, key)

Delete a custom property of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        String key = "key_example"; // String | Property key
        try {
            apiInstance.userDeleteUserProperties(id, key);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserProperties");
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
| **id** | **Integer**| ID of the user | |
| **key** | **String**| Property key | |

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
| **204** | No Content |  -  |

## userDeleteUserPropertiesWithHttpInfo

> ApiResponse<Void> userDeleteUserProperties userDeleteUserPropertiesWithHttpInfo(id, key)

Delete a custom property of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        String key = "key_example"; // String | Property key
        try {
            ApiResponse<Void> response = apiInstance.userDeleteUserPropertiesWithHttpInfo(id, key);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userDeleteUserProperties");
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
| **id** | **Integer**| ID of the user | |
| **key** | **String**| Property key | |

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
| **204** | No Content |  -  |


## userGetAllUsers

> List<User> userGetAllUsers()

Get all users on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        try {
            List<User> result = apiInstance.userGetAllUsers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetAllUsers");
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

[**List&lt;User&gt;**](User.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userGetAllUsersWithHttpInfo

> ApiResponse<List<User>> userGetAllUsers userGetAllUsersWithHttpInfo()

Get all users on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        try {
            ApiResponse<List<User>> response = apiInstance.userGetAllUsersWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetAllUsers");
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

ApiResponse<[**List&lt;User&gt;**](User.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userGetRecursiveUserMemberships

> List<Group> userGetRecursiveUserMemberships(id)

Get all distinct groups that the user is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            List<Group> result = apiInstance.userGetRecursiveUserMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetRecursiveUserMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

[**List&lt;Group&gt;**](Group.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userGetRecursiveUserMembershipsWithHttpInfo

> ApiResponse<List<Group>> userGetRecursiveUserMemberships userGetRecursiveUserMembershipsWithHttpInfo(id)

Get all distinct groups that the user is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<List<Group>> response = apiInstance.userGetRecursiveUserMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetRecursiveUserMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

ApiResponse<[**List&lt;Group&gt;**](Group.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userGetUserById

> User userGetUserById(id)

Get user by ID

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            User result = apiInstance.userGetUserById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserById");
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
| **id** | **Integer**| ID of the user | |

### Return type

[**User**](User.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userGetUserByIdWithHttpInfo

> ApiResponse<User> userGetUserById userGetUserByIdWithHttpInfo(id)

Get user by ID

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<User> response = apiInstance.userGetUserByIdWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserById");
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
| **id** | **Integer**| ID of the user | |

### Return type

ApiResponse<[**User**](User.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userGetUserDirectMemberships

> List<Group> userGetUserDirectMemberships(id)

Get all groups that the user is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            List<Group> result = apiInstance.userGetUserDirectMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserDirectMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

[**List&lt;Group&gt;**](Group.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userGetUserDirectMembershipsWithHttpInfo

> ApiResponse<List<Group>> userGetUserDirectMemberships userGetUserDirectMembershipsWithHttpInfo(id)

Get all groups that the user is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<List<Group>> response = apiInstance.userGetUserDirectMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserDirectMemberships");
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
| **id** | **Integer**| ID of the user | |

### Return type

ApiResponse<[**List&lt;Group&gt;**](Group.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userGetUserExternalIds

> List<ExternalId> userGetUserExternalIds(id)

Get all external IDs of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            List<ExternalId> result = apiInstance.userGetUserExternalIds(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserExternalIds");
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
| **id** | **Integer**| ID of the user | |

### Return type

[**List&lt;ExternalId&gt;**](ExternalId.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userGetUserExternalIdsWithHttpInfo

> ApiResponse<List<ExternalId>> userGetUserExternalIds userGetUserExternalIdsWithHttpInfo(id)

Get all external IDs of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<List<ExternalId>> response = apiInstance.userGetUserExternalIdsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserExternalIds");
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
| **id** | **Integer**| ID of the user | |

### Return type

ApiResponse<[**List&lt;ExternalId&gt;**](ExternalId.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userGetUserPropertyBag

> List<MemberProperty> userGetUserPropertyBag(id)

Get all custom properties of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            List<MemberProperty> result = apiInstance.userGetUserPropertyBag(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserPropertyBag");
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
| **id** | **Integer**| ID of the user | |

### Return type

[**List&lt;MemberProperty&gt;**](MemberProperty.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## userGetUserPropertyBagWithHttpInfo

> ApiResponse<List<MemberProperty>> userGetUserPropertyBag userGetUserPropertyBagWithHttpInfo(id)

Get all custom properties of a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<List<MemberProperty>> response = apiInstance.userGetUserPropertyBagWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userGetUserPropertyBag");
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
| **id** | **Integer**| ID of the user | |

### Return type

ApiResponse<[**List&lt;MemberProperty&gt;**](MemberProperty.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## userSetUserEnabled

> void userSetUserEnabled(id, value)

Enable or disable user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | User ID
        ValueModelBoolean value = new ValueModelBoolean(); // ValueModelBoolean | true to enable, false to disable user
        try {
            apiInstance.userSetUserEnabled(id, value);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userSetUserEnabled");
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
| **id** | **Integer**| User ID | |
| **value** | [**ValueModelBoolean**](ValueModelBoolean.md)| true to enable, false to disable user | |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

## userSetUserEnabledWithHttpInfo

> ApiResponse<Void> userSetUserEnabled userSetUserEnabledWithHttpInfo(id, value)

Enable or disable user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | User ID
        ValueModelBoolean value = new ValueModelBoolean(); // ValueModelBoolean | true to enable, false to disable user
        try {
            ApiResponse<Void> response = apiInstance.userSetUserEnabledWithHttpInfo(id, value);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userSetUserEnabled");
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
| **id** | **Integer**| User ID | |
| **value** | [**ValueModelBoolean**](ValueModelBoolean.md)| true to enable, false to disable user | |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## userSetUserMemberships

> void userSetUserMemberships(id, groups)

Set the groups that the user is a direct member of

The user is removed from all other groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            apiInstance.userSetUserMemberships(id, groups);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userSetUserMemberships");
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
| **id** | **Integer**| ID of user | |
| **groups** | [**MembershipIdListModel**](MembershipIdListModel.md)| IDs of groups | |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

## userSetUserMembershipsWithHttpInfo

> ApiResponse<Void> userSetUserMemberships userSetUserMembershipsWithHttpInfo(id, groups)

Set the groups that the user is a direct member of

The user is removed from all other groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of user
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            ApiResponse<Void> response = apiInstance.userSetUserMembershipsWithHttpInfo(id, groups);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userSetUserMemberships");
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
| **id** | **Integer**| ID of user | |
| **groups** | [**MembershipIdListModel**](MembershipIdListModel.md)| IDs of groups | |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## userUpdateUser

> void userUpdateUser(id, properties)

Update a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        User properties = new User(); // User | New user properties
        try {
            apiInstance.userUpdateUser(id, properties);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userUpdateUser");
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
| **id** | **Integer**| ID of the user | |
| **properties** | [**User**](User.md)| New user properties | |

### Return type


null (empty response body)

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

## userUpdateUserWithHttpInfo

> ApiResponse<Void> userUpdateUser userUpdateUserWithHttpInfo(id, properties)

Update a user

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.UserManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        UserManagementBetaApi apiInstance = new UserManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        User properties = new User(); // User | New user properties
        try {
            ApiResponse<Void> response = apiInstance.userUpdateUserWithHttpInfo(id, properties);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementBetaApi#userUpdateUser");
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
| **id** | **Integer**| ID of the user | |
| **properties** | [**User**](User.md)| New user properties | |

### Return type


ApiResponse<Void>

### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

