# GroupManagementBetaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**groupAddGroupGroupMembers**](GroupManagementBetaApi.md#groupAddGroupGroupMembers) | **POST** /fotoweb/api/groups/{id}/groups | Add groups to the given group |
| [**groupAddGroupGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupAddGroupGroupMembersWithHttpInfo) | **POST** /fotoweb/api/groups/{id}/groups | Add groups to the given group |
| [**groupAddGroupMembers**](GroupManagementBetaApi.md#groupAddGroupMembers) | **POST** /fotoweb/api/groups/{id}/members | Add users to the given group |
| [**groupAddGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupAddGroupMembersWithHttpInfo) | **POST** /fotoweb/api/groups/{id}/members | Add users to the given group |
| [**groupAddGroupMemberships**](GroupManagementBetaApi.md#groupAddGroupMemberships) | **POST** /fotoweb/api/groups/{id}/member-of | Add the group to one or more groups |
| [**groupAddGroupMembershipsWithHttpInfo**](GroupManagementBetaApi.md#groupAddGroupMembershipsWithHttpInfo) | **POST** /fotoweb/api/groups/{id}/member-of | Add the group to one or more groups |
| [**groupAddGroupUserMembers**](GroupManagementBetaApi.md#groupAddGroupUserMembers) | **POST** /fotoweb/api/groups/{id}/users | Add users to the given group |
| [**groupAddGroupUserMembersWithHttpInfo**](GroupManagementBetaApi.md#groupAddGroupUserMembersWithHttpInfo) | **POST** /fotoweb/api/groups/{id}/users | Add users to the given group |
| [**groupCountAllGroups**](GroupManagementBetaApi.md#groupCountAllGroups) | **GET** /fotoweb/api/groups/count | Count all groups on the site |
| [**groupCountAllGroupsWithHttpInfo**](GroupManagementBetaApi.md#groupCountAllGroupsWithHttpInfo) | **GET** /fotoweb/api/groups/count | Count all groups on the site |
| [**groupCountDirectGroupMemberships**](GroupManagementBetaApi.md#groupCountDirectGroupMemberships) | **GET** /fotoweb/api/groups/{id}/member-of/count | Count all groups that the group is a direct member of |
| [**groupCountDirectGroupMembershipsWithHttpInfo**](GroupManagementBetaApi.md#groupCountDirectGroupMembershipsWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/member-of/count | Count all groups that the group is a direct member of |
| [**groupCountGroupDirectGroupMembers**](GroupManagementBetaApi.md#groupCountGroupDirectGroupMembers) | **GET** /fotoweb/api/groups/{id}/groups/count | Count all groups that are direct members of the given group |
| [**groupCountGroupDirectGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupCountGroupDirectGroupMembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/groups/count | Count all groups that are direct members of the given group |
| [**groupCountGroupDirectUserMembers**](GroupManagementBetaApi.md#groupCountGroupDirectUserMembers) | **GET** /fotoweb/api/groups/{id}/users/count | Count all users that are direct members of the given group |
| [**groupCountGroupDirectUserMembersWithHttpInfo**](GroupManagementBetaApi.md#groupCountGroupDirectUserMembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/users/count | Count all users that are direct members of the given group |
| [**groupCountGroupRecursiveGroupMembers**](GroupManagementBetaApi.md#groupCountGroupRecursiveGroupMembers) | **GET** /fotoweb/api/groups/{id}/groups-recursive/count | Count all groups that are direct or indirect members of the given group |
| [**groupCountGroupRecursiveGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupCountGroupRecursiveGroupMembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/groups-recursive/count | Count all groups that are direct or indirect members of the given group |
| [**groupCountGroupRecursiveUserMembers**](GroupManagementBetaApi.md#groupCountGroupRecursiveUserMembers) | **GET** /fotoweb/api/groups/{id}/users-recursive/count | Count all users that are direct or indirect members of the given group |
| [**groupCountGroupRecursiveUserMembersWithHttpInfo**](GroupManagementBetaApi.md#groupCountGroupRecursiveUserMembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/users-recursive/count | Count all users that are direct or indirect members of the given group |
| [**groupCountRecursiveUserMemberships**](GroupManagementBetaApi.md#groupCountRecursiveUserMemberships) | **GET** /fotoweb/api/groups/{id}/member-of-recursive/count | Count all distinct groups that the group is a direct or indirect member of |
| [**groupCountRecursiveUserMembershipsWithHttpInfo**](GroupManagementBetaApi.md#groupCountRecursiveUserMembershipsWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/member-of-recursive/count | Count all distinct groups that the group is a direct or indirect member of |
| [**groupCreateNewGroup**](GroupManagementBetaApi.md#groupCreateNewGroup) | **POST** /fotoweb/api/groups | Create a new group |
| [**groupCreateNewGroupWithHttpInfo**](GroupManagementBetaApi.md#groupCreateNewGroupWithHttpInfo) | **POST** /fotoweb/api/groups | Create a new group |
| [**groupDeleteAllGroupGroupMembers**](GroupManagementBetaApi.md#groupDeleteAllGroupGroupMembers) | **DELETE** /fotoweb/api/groups/{id}/groups | Remove all groups from the given group |
| [**groupDeleteAllGroupGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteAllGroupGroupMembersWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/groups | Remove all groups from the given group |
| [**groupDeleteAllGroupMembers**](GroupManagementBetaApi.md#groupDeleteAllGroupMembers) | **DELETE** /fotoweb/api/groups/{id}/members | Remove all members from the given group |
| [**groupDeleteAllGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteAllGroupMembersWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/members | Remove all members from the given group |
| [**groupDeleteAllGroupMemberships**](GroupManagementBetaApi.md#groupDeleteAllGroupMemberships) | **DELETE** /fotoweb/api/groups/{id}/member-of | Remove the group from all groups |
| [**groupDeleteAllGroupMembershipsWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteAllGroupMembershipsWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/member-of | Remove the group from all groups |
| [**groupDeleteAllGroupProperties**](GroupManagementBetaApi.md#groupDeleteAllGroupProperties) | **DELETE** /fotoweb/api/groups/{id}/properties | Delete all custom properties of a group |
| [**groupDeleteAllGroupPropertiesWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteAllGroupPropertiesWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/properties | Delete all custom properties of a group |
| [**groupDeleteAllGroupUserMembers**](GroupManagementBetaApi.md#groupDeleteAllGroupUserMembers) | **DELETE** /fotoweb/api/groups/{id}/users | Remove all users from the given group |
| [**groupDeleteAllGroupUserMembersWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteAllGroupUserMembersWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/users | Remove all users from the given group |
| [**groupDeleteGroup**](GroupManagementBetaApi.md#groupDeleteGroup) | **DELETE** /fotoweb/api/groups/{id} | Delete a group |
| [**groupDeleteGroupWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteGroupWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id} | Delete a group |
| [**groupDeleteGroupExternalIds**](GroupManagementBetaApi.md#groupDeleteGroupExternalIds) | **DELETE** /fotoweb/api/groups/{id}/external-ids | Delete all external IDs of a group |
| [**groupDeleteGroupExternalIdsWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteGroupExternalIdsWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/external-ids | Delete all external IDs of a group |
| [**groupDeleteGroupExternalIdsFromProvider**](GroupManagementBetaApi.md#groupDeleteGroupExternalIdsFromProvider) | **DELETE** /fotoweb/api/groups/{id}/external-ids/{provider} | Delete the external ID of a group from a provider |
| [**groupDeleteGroupExternalIdsFromProviderWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteGroupExternalIdsFromProviderWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/external-ids/{provider} | Delete the external ID of a group from a provider |
| [**groupDeleteGroupGroupMember**](GroupManagementBetaApi.md#groupDeleteGroupGroupMember) | **DELETE** /fotoweb/api/groups/{id}/groups/{member} | Remove a group from the given group |
| [**groupDeleteGroupGroupMemberWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteGroupGroupMemberWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/groups/{member} | Remove a group from the given group |
| [**groupDeleteGroupMembership**](GroupManagementBetaApi.md#groupDeleteGroupMembership) | **DELETE** /fotoweb/api/groups/{id}/member-of/{group} | Remove the group from a single group |
| [**groupDeleteGroupMembershipWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteGroupMembershipWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/member-of/{group} | Remove the group from a single group |
| [**groupDeleteGroupProperties**](GroupManagementBetaApi.md#groupDeleteGroupProperties) | **DELETE** /fotoweb/api/groups/{id}/properties/{key} | Delete a custom property of a group |
| [**groupDeleteGroupPropertiesWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteGroupPropertiesWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/properties/{key} | Delete a custom property of a group |
| [**groupDeleteGroupUserMember**](GroupManagementBetaApi.md#groupDeleteGroupUserMember) | **DELETE** /fotoweb/api/groups/{id}/users/{member} | Remove a user from the given group |
| [**groupDeleteGroupUserMemberWithHttpInfo**](GroupManagementBetaApi.md#groupDeleteGroupUserMemberWithHttpInfo) | **DELETE** /fotoweb/api/groups/{id}/users/{member} | Remove a user from the given group |
| [**groupGetAllGroups**](GroupManagementBetaApi.md#groupGetAllGroups) | **GET** /fotoweb/api/groups | Get all groups on the site |
| [**groupGetAllGroupsWithHttpInfo**](GroupManagementBetaApi.md#groupGetAllGroupsWithHttpInfo) | **GET** /fotoweb/api/groups | Get all groups on the site |
| [**groupGetDirectGroupMemberships**](GroupManagementBetaApi.md#groupGetDirectGroupMemberships) | **GET** /fotoweb/api/groups/{id}/member-of | Get all groups that the group is a direct member of |
| [**groupGetDirectGroupMembershipsWithHttpInfo**](GroupManagementBetaApi.md#groupGetDirectGroupMembershipsWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/member-of | Get all groups that the group is a direct member of |
| [**groupGetGroupById**](GroupManagementBetaApi.md#groupGetGroupById) | **GET** /fotoweb/api/groups/{id} | Get group by ID |
| [**groupGetGroupByIdWithHttpInfo**](GroupManagementBetaApi.md#groupGetGroupByIdWithHttpInfo) | **GET** /fotoweb/api/groups/{id} | Get group by ID |
| [**groupGetGroupDirectGroupMembers**](GroupManagementBetaApi.md#groupGetGroupDirectGroupMembers) | **GET** /fotoweb/api/groups/{id}/groups | Get all groups that are direct members of the given group |
| [**groupGetGroupDirectGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupGetGroupDirectGroupMembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/groups | Get all groups that are direct members of the given group |
| [**groupGetGroupDirectUserMembers**](GroupManagementBetaApi.md#groupGetGroupDirectUserMembers) | **GET** /fotoweb/api/groups/{id}/users | Get all users that are direct members of the given group |
| [**groupGetGroupDirectUserMembersWithHttpInfo**](GroupManagementBetaApi.md#groupGetGroupDirectUserMembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/users | Get all users that are direct members of the given group |
| [**groupGetGroupExternalIds**](GroupManagementBetaApi.md#groupGetGroupExternalIds) | **GET** /fotoweb/api/groups/{id}/external-ids | Get all external IDs of a group |
| [**groupGetGroupExternalIdsWithHttpInfo**](GroupManagementBetaApi.md#groupGetGroupExternalIdsWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/external-ids | Get all external IDs of a group |
| [**groupGetGroupPropertyBag**](GroupManagementBetaApi.md#groupGetGroupPropertyBag) | **GET** /fotoweb/api/groups/{id}/properties | Get all custom properties of a group |
| [**groupGetGroupPropertyBagWithHttpInfo**](GroupManagementBetaApi.md#groupGetGroupPropertyBagWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/properties | Get all custom properties of a group |
| [**groupGetGroupRecursiveGroupembers**](GroupManagementBetaApi.md#groupGetGroupRecursiveGroupembers) | **GET** /fotoweb/api/groups/{id}/groups-recursive | Get all groups that are direct or indirect members of the given group |
| [**groupGetGroupRecursiveGroupembersWithHttpInfo**](GroupManagementBetaApi.md#groupGetGroupRecursiveGroupembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/groups-recursive | Get all groups that are direct or indirect members of the given group |
| [**groupGetGroupRecursiveUserMembers**](GroupManagementBetaApi.md#groupGetGroupRecursiveUserMembers) | **GET** /fotoweb/api/groups/{id}/users-recursive | Get all users that are direct or indirect members of the given group |
| [**groupGetGroupRecursiveUserMembersWithHttpInfo**](GroupManagementBetaApi.md#groupGetGroupRecursiveUserMembersWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/users-recursive | Get all users that are direct or indirect members of the given group |
| [**groupGetRecursiveGroupMemberships**](GroupManagementBetaApi.md#groupGetRecursiveGroupMemberships) | **GET** /fotoweb/api/groups/{id}/member-of-recursive | Get all distinct groups that the group is a direct or indirect member of |
| [**groupGetRecursiveGroupMembershipsWithHttpInfo**](GroupManagementBetaApi.md#groupGetRecursiveGroupMembershipsWithHttpInfo) | **GET** /fotoweb/api/groups/{id}/member-of-recursive | Get all distinct groups that the group is a direct or indirect member of |
| [**groupSetGroupGroupMembers**](GroupManagementBetaApi.md#groupSetGroupGroupMembers) | **PUT** /fotoweb/api/groups/{id}/groups | Replace all groups that are direct members of a group |
| [**groupSetGroupGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupSetGroupGroupMembersWithHttpInfo) | **PUT** /fotoweb/api/groups/{id}/groups | Replace all groups that are direct members of a group |
| [**groupSetGroupMembers**](GroupManagementBetaApi.md#groupSetGroupMembers) | **PUT** /fotoweb/api/groups/{id}/members | Replace all direct members of a group |
| [**groupSetGroupMembersWithHttpInfo**](GroupManagementBetaApi.md#groupSetGroupMembersWithHttpInfo) | **PUT** /fotoweb/api/groups/{id}/members | Replace all direct members of a group |
| [**groupSetGroupMemberships**](GroupManagementBetaApi.md#groupSetGroupMemberships) | **PUT** /fotoweb/api/groups/{id}/member-of | Set the groups that the group is a direct member of |
| [**groupSetGroupMembershipsWithHttpInfo**](GroupManagementBetaApi.md#groupSetGroupMembershipsWithHttpInfo) | **PUT** /fotoweb/api/groups/{id}/member-of | Set the groups that the group is a direct member of |
| [**groupSetGroupUserMembers**](GroupManagementBetaApi.md#groupSetGroupUserMembers) | **PUT** /fotoweb/api/groups/{id}/users | Replace all users that are direct members of a group |
| [**groupSetGroupUserMembersWithHttpInfo**](GroupManagementBetaApi.md#groupSetGroupUserMembersWithHttpInfo) | **PUT** /fotoweb/api/groups/{id}/users | Replace all users that are direct members of a group |
| [**groupUpdateGroup**](GroupManagementBetaApi.md#groupUpdateGroup) | **PUT** /fotoweb/api/groups/{id} | Update a group |
| [**groupUpdateGroupWithHttpInfo**](GroupManagementBetaApi.md#groupUpdateGroupWithHttpInfo) | **PUT** /fotoweb/api/groups/{id} | Update a group |



## groupAddGroupGroupMembers

> void groupAddGroupGroupMembers(id, members)

Add groups to the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of members
        try {
            apiInstance.groupAddGroupGroupMembers(id, members);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of members | |

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

## groupAddGroupGroupMembersWithHttpInfo

> ApiResponse<Void> groupAddGroupGroupMembers groupAddGroupGroupMembersWithHttpInfo(id, members)

Add groups to the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of members
        try {
            ApiResponse<Void> response = apiInstance.groupAddGroupGroupMembersWithHttpInfo(id, members);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of members | |

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


## groupAddGroupMembers

> void groupAddGroupMembers(id, members)

Add users to the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of members
        try {
            apiInstance.groupAddGroupMembers(id, members);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of members | |

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

## groupAddGroupMembersWithHttpInfo

> ApiResponse<Void> groupAddGroupMembers groupAddGroupMembersWithHttpInfo(id, members)

Add users to the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of members
        try {
            ApiResponse<Void> response = apiInstance.groupAddGroupMembersWithHttpInfo(id, members);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of members | |

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


## groupAddGroupMemberships

> void groupAddGroupMemberships(id, groups)

Add the group to one or more groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            apiInstance.groupAddGroupMemberships(id, groups);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupMemberships");
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
| **id** | **Integer**| ID of group | |
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

## groupAddGroupMembershipsWithHttpInfo

> ApiResponse<Void> groupAddGroupMemberships groupAddGroupMembershipsWithHttpInfo(id, groups)

Add the group to one or more groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            ApiResponse<Void> response = apiInstance.groupAddGroupMembershipsWithHttpInfo(id, groups);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupMemberships");
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
| **id** | **Integer**| ID of group | |
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


## groupAddGroupUserMembers

> void groupAddGroupUserMembers(id, members)

Add users to the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of members
        try {
            apiInstance.groupAddGroupUserMembers(id, members);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupUserMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of members | |

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

## groupAddGroupUserMembersWithHttpInfo

> ApiResponse<Void> groupAddGroupUserMembers groupAddGroupUserMembersWithHttpInfo(id, members)

Add users to the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of members
        try {
            ApiResponse<Void> response = apiInstance.groupAddGroupUserMembersWithHttpInfo(id, members);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupAddGroupUserMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of members | |

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


## groupCountAllGroups

> ValueModelInteger groupCountAllGroups(isSso, ssoProvider)

Count all groups on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Boolean isSso = true; // Boolean | Count only SSO groups
        String ssoProvider = "ssoProvider_example"; // String | Count only groups from the given SSO provider
        try {
            ValueModelInteger result = apiInstance.groupCountAllGroups(isSso, ssoProvider);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountAllGroups");
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
| **isSso** | **Boolean**| Count only SSO groups | [optional] |
| **ssoProvider** | **String**| Count only groups from the given SSO provider | [optional] |

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

## groupCountAllGroupsWithHttpInfo

> ApiResponse<ValueModelInteger> groupCountAllGroups groupCountAllGroupsWithHttpInfo(isSso, ssoProvider)

Count all groups on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Boolean isSso = true; // Boolean | Count only SSO groups
        String ssoProvider = "ssoProvider_example"; // String | Count only groups from the given SSO provider
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.groupCountAllGroupsWithHttpInfo(isSso, ssoProvider);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountAllGroups");
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
| **isSso** | **Boolean**| Count only SSO groups | [optional] |
| **ssoProvider** | **String**| Count only groups from the given SSO provider | [optional] |

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


## groupCountDirectGroupMemberships

> ValueModelInteger groupCountDirectGroupMemberships(id)

Count all groups that the group is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ValueModelInteger result = apiInstance.groupCountDirectGroupMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountDirectGroupMemberships");
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

## groupCountDirectGroupMembershipsWithHttpInfo

> ApiResponse<ValueModelInteger> groupCountDirectGroupMemberships groupCountDirectGroupMembershipsWithHttpInfo(id)

Count all groups that the group is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the user
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.groupCountDirectGroupMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountDirectGroupMemberships");
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


## groupCountGroupDirectGroupMembers

> ValueModelInteger groupCountGroupDirectGroupMembers(id)

Count all groups that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ValueModelInteger result = apiInstance.groupCountGroupDirectGroupMembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupDirectGroupMembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupCountGroupDirectGroupMembersWithHttpInfo

> ApiResponse<ValueModelInteger> groupCountGroupDirectGroupMembers groupCountGroupDirectGroupMembersWithHttpInfo(id)

Count all groups that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.groupCountGroupDirectGroupMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupDirectGroupMembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupCountGroupDirectUserMembers

> ValueModelInteger groupCountGroupDirectUserMembers(id)

Count all users that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ValueModelInteger result = apiInstance.groupCountGroupDirectUserMembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupDirectUserMembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupCountGroupDirectUserMembersWithHttpInfo

> ApiResponse<ValueModelInteger> groupCountGroupDirectUserMembers groupCountGroupDirectUserMembersWithHttpInfo(id)

Count all users that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.groupCountGroupDirectUserMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupDirectUserMembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupCountGroupRecursiveGroupMembers

> ValueModelInteger groupCountGroupRecursiveGroupMembers(id)

Count all groups that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ValueModelInteger result = apiInstance.groupCountGroupRecursiveGroupMembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupRecursiveGroupMembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupCountGroupRecursiveGroupMembersWithHttpInfo

> ApiResponse<ValueModelInteger> groupCountGroupRecursiveGroupMembers groupCountGroupRecursiveGroupMembersWithHttpInfo(id)

Count all groups that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.groupCountGroupRecursiveGroupMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupRecursiveGroupMembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupCountGroupRecursiveUserMembers

> ValueModelInteger groupCountGroupRecursiveUserMembers(id)

Count all users that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ValueModelInteger result = apiInstance.groupCountGroupRecursiveUserMembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupRecursiveUserMembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupCountGroupRecursiveUserMembersWithHttpInfo

> ApiResponse<ValueModelInteger> groupCountGroupRecursiveUserMembers groupCountGroupRecursiveUserMembersWithHttpInfo(id)

Count all users that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.groupCountGroupRecursiveUserMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountGroupRecursiveUserMembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupCountRecursiveUserMemberships

> ValueModelInteger groupCountRecursiveUserMemberships(id)

Count all distinct groups that the group is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ValueModelInteger result = apiInstance.groupCountRecursiveUserMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountRecursiveUserMemberships");
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
| **id** | **Integer**| ID of the group | |

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

## groupCountRecursiveUserMembershipsWithHttpInfo

> ApiResponse<ValueModelInteger> groupCountRecursiveUserMemberships groupCountRecursiveUserMembershipsWithHttpInfo(id)

Count all distinct groups that the group is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<ValueModelInteger> response = apiInstance.groupCountRecursiveUserMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCountRecursiveUserMemberships");
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
| **id** | **Integer**| ID of the group | |

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


## groupCreateNewGroup

> Group groupCreateNewGroup(group)

Create a new group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Group group = new Group(); // Group | Group properties
        try {
            Group result = apiInstance.groupCreateNewGroup(group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCreateNewGroup");
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
| **group** | [**Group**](Group.md)| Group properties | |

### Return type

[**Group**](Group.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## groupCreateNewGroupWithHttpInfo

> ApiResponse<Group> groupCreateNewGroup groupCreateNewGroupWithHttpInfo(group)

Create a new group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Group group = new Group(); // Group | Group properties
        try {
            ApiResponse<Group> response = apiInstance.groupCreateNewGroupWithHttpInfo(group);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupCreateNewGroup");
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
| **group** | [**Group**](Group.md)| Group properties | |

### Return type

ApiResponse<[**Group**](Group.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## groupDeleteAllGroupGroupMembers

> void groupDeleteAllGroupGroupMembers(id)

Remove all groups from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            apiInstance.groupDeleteAllGroupGroupMembers(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupGroupMembers");
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
| **id** | **Integer**| ID of group | |

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

## groupDeleteAllGroupGroupMembersWithHttpInfo

> ApiResponse<Void> groupDeleteAllGroupGroupMembers groupDeleteAllGroupGroupMembersWithHttpInfo(id)

Remove all groups from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteAllGroupGroupMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupGroupMembers");
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
| **id** | **Integer**| ID of group | |

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


## groupDeleteAllGroupMembers

> void groupDeleteAllGroupMembers(id)

Remove all members from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            apiInstance.groupDeleteAllGroupMembers(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupMembers");
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
| **id** | **Integer**| ID of group | |

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

## groupDeleteAllGroupMembersWithHttpInfo

> ApiResponse<Void> groupDeleteAllGroupMembers groupDeleteAllGroupMembersWithHttpInfo(id)

Remove all members from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteAllGroupMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupMembers");
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
| **id** | **Integer**| ID of group | |

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


## groupDeleteAllGroupMemberships

> void groupDeleteAllGroupMemberships(id)

Remove the group from all groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            apiInstance.groupDeleteAllGroupMemberships(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupMemberships");
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
| **id** | **Integer**| ID of group | |

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

## groupDeleteAllGroupMembershipsWithHttpInfo

> ApiResponse<Void> groupDeleteAllGroupMemberships groupDeleteAllGroupMembershipsWithHttpInfo(id)

Remove the group from all groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteAllGroupMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupMemberships");
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
| **id** | **Integer**| ID of group | |

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


## groupDeleteAllGroupProperties

> void groupDeleteAllGroupProperties(id)

Delete all custom properties of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            apiInstance.groupDeleteAllGroupProperties(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupProperties");
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
| **id** | **Integer**| ID of the group | |

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

## groupDeleteAllGroupPropertiesWithHttpInfo

> ApiResponse<Void> groupDeleteAllGroupProperties groupDeleteAllGroupPropertiesWithHttpInfo(id)

Delete all custom properties of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteAllGroupPropertiesWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupProperties");
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
| **id** | **Integer**| ID of the group | |

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


## groupDeleteAllGroupUserMembers

> void groupDeleteAllGroupUserMembers(id)

Remove all users from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            apiInstance.groupDeleteAllGroupUserMembers(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupUserMembers");
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
| **id** | **Integer**| ID of group | |

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

## groupDeleteAllGroupUserMembersWithHttpInfo

> ApiResponse<Void> groupDeleteAllGroupUserMembers groupDeleteAllGroupUserMembersWithHttpInfo(id)

Remove all users from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteAllGroupUserMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteAllGroupUserMembers");
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
| **id** | **Integer**| ID of group | |

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


## groupDeleteGroup

> void groupDeleteGroup(id)

Delete a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            apiInstance.groupDeleteGroup(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroup");
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
| **id** | **Integer**| ID of the group | |

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

## groupDeleteGroupWithHttpInfo

> ApiResponse<Void> groupDeleteGroup groupDeleteGroupWithHttpInfo(id)

Delete a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteGroupWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroup");
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
| **id** | **Integer**| ID of the group | |

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


## groupDeleteGroupExternalIds

> void groupDeleteGroupExternalIds(id)

Delete all external IDs of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            apiInstance.groupDeleteGroupExternalIds(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupExternalIds");
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
| **id** | **Integer**| ID of the group | |

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

## groupDeleteGroupExternalIdsWithHttpInfo

> ApiResponse<Void> groupDeleteGroupExternalIds groupDeleteGroupExternalIdsWithHttpInfo(id)

Delete all external IDs of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteGroupExternalIdsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupExternalIds");
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
| **id** | **Integer**| ID of the group | |

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


## groupDeleteGroupExternalIdsFromProvider

> void groupDeleteGroupExternalIdsFromProvider(id, provider)

Delete the external ID of a group from a provider

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        UUID provider = UUID.randomUUID(); // UUID | ID of the SSO provider
        try {
            apiInstance.groupDeleteGroupExternalIdsFromProvider(id, provider);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupExternalIdsFromProvider");
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
| **id** | **Integer**| ID of the group | |
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

## groupDeleteGroupExternalIdsFromProviderWithHttpInfo

> ApiResponse<Void> groupDeleteGroupExternalIdsFromProvider groupDeleteGroupExternalIdsFromProviderWithHttpInfo(id, provider)

Delete the external ID of a group from a provider

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        UUID provider = UUID.randomUUID(); // UUID | ID of the SSO provider
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteGroupExternalIdsFromProviderWithHttpInfo(id, provider);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupExternalIdsFromProvider");
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
| **id** | **Integer**| ID of the group | |
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


## groupDeleteGroupGroupMember

> void groupDeleteGroupGroupMember(id, member)

Remove a group from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group to remove from
        Integer member = 56; // Integer | ID of member to remove
        try {
            apiInstance.groupDeleteGroupGroupMember(id, member);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupGroupMember");
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
| **id** | **Integer**| ID of group to remove from | |
| **member** | **Integer**| ID of member to remove | |

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

## groupDeleteGroupGroupMemberWithHttpInfo

> ApiResponse<Void> groupDeleteGroupGroupMember groupDeleteGroupGroupMemberWithHttpInfo(id, member)

Remove a group from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group to remove from
        Integer member = 56; // Integer | ID of member to remove
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteGroupGroupMemberWithHttpInfo(id, member);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupGroupMember");
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
| **id** | **Integer**| ID of group to remove from | |
| **member** | **Integer**| ID of member to remove | |

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


## groupDeleteGroupMembership

> void groupDeleteGroupMembership(id, group)

Remove the group from a single group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        Integer group = 56; // Integer | ID of group
        try {
            apiInstance.groupDeleteGroupMembership(id, group);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupMembership");
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
| **id** | **Integer**| ID of group | |
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

## groupDeleteGroupMembershipWithHttpInfo

> ApiResponse<Void> groupDeleteGroupMembership groupDeleteGroupMembershipWithHttpInfo(id, group)

Remove the group from a single group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        Integer group = 56; // Integer | ID of group
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteGroupMembershipWithHttpInfo(id, group);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupMembership");
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
| **id** | **Integer**| ID of group | |
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


## groupDeleteGroupProperties

> void groupDeleteGroupProperties(id, key)

Delete a custom property of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        String key = "key_example"; // String | Property key
        try {
            apiInstance.groupDeleteGroupProperties(id, key);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupProperties");
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
| **id** | **Integer**| ID of the group | |
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

## groupDeleteGroupPropertiesWithHttpInfo

> ApiResponse<Void> groupDeleteGroupProperties groupDeleteGroupPropertiesWithHttpInfo(id, key)

Delete a custom property of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        String key = "key_example"; // String | Property key
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteGroupPropertiesWithHttpInfo(id, key);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupProperties");
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
| **id** | **Integer**| ID of the group | |
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


## groupDeleteGroupUserMember

> void groupDeleteGroupUserMember(id, member)

Remove a user from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group to remove from
        Integer member = 56; // Integer | ID of member to remove
        try {
            apiInstance.groupDeleteGroupUserMember(id, member);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupUserMember");
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
| **id** | **Integer**| ID of group to remove from | |
| **member** | **Integer**| ID of member to remove | |

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

## groupDeleteGroupUserMemberWithHttpInfo

> ApiResponse<Void> groupDeleteGroupUserMember groupDeleteGroupUserMemberWithHttpInfo(id, member)

Remove a user from the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group to remove from
        Integer member = 56; // Integer | ID of member to remove
        try {
            ApiResponse<Void> response = apiInstance.groupDeleteGroupUserMemberWithHttpInfo(id, member);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupDeleteGroupUserMember");
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
| **id** | **Integer**| ID of group to remove from | |
| **member** | **Integer**| ID of member to remove | |

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


## groupGetAllGroups

> List<Group> groupGetAllGroups()

Get all groups on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        try {
            List<Group> result = apiInstance.groupGetAllGroups();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetAllGroups");
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

## groupGetAllGroupsWithHttpInfo

> ApiResponse<List<Group>> groupGetAllGroups groupGetAllGroupsWithHttpInfo()

Get all groups on the site

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        try {
            ApiResponse<List<Group>> response = apiInstance.groupGetAllGroupsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetAllGroups");
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


## groupGetDirectGroupMemberships

> List<Group> groupGetDirectGroupMemberships(id)

Get all groups that the group is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<Group> result = apiInstance.groupGetDirectGroupMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetDirectGroupMemberships");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetDirectGroupMembershipsWithHttpInfo

> ApiResponse<List<Group>> groupGetDirectGroupMemberships groupGetDirectGroupMembershipsWithHttpInfo(id)

Get all groups that the group is a direct member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<Group>> response = apiInstance.groupGetDirectGroupMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetDirectGroupMemberships");
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
| **id** | **Integer**| ID of the group | |

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


## groupGetGroupById

> Group groupGetGroupById(id)

Get group by ID

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            Group result = apiInstance.groupGetGroupById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupById");
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
| **id** | **Integer**| ID of the group | |

### Return type

[**Group**](Group.md)


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

## groupGetGroupByIdWithHttpInfo

> ApiResponse<Group> groupGetGroupById groupGetGroupByIdWithHttpInfo(id)

Get group by ID

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<Group> response = apiInstance.groupGetGroupByIdWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupById");
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
| **id** | **Integer**| ID of the group | |

### Return type

ApiResponse<[**Group**](Group.md)>


### Authorization

[FotoWareAccessToken](../README.md#FotoWareAccessToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## groupGetGroupDirectGroupMembers

> List<Group> groupGetGroupDirectGroupMembers(id)

Get all groups that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<Group> result = apiInstance.groupGetGroupDirectGroupMembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupDirectGroupMembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetGroupDirectGroupMembersWithHttpInfo

> ApiResponse<List<Group>> groupGetGroupDirectGroupMembers groupGetGroupDirectGroupMembersWithHttpInfo(id)

Get all groups that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<Group>> response = apiInstance.groupGetGroupDirectGroupMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupDirectGroupMembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupGetGroupDirectUserMembers

> List<User> groupGetGroupDirectUserMembers(id)

Get all users that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<User> result = apiInstance.groupGetGroupDirectUserMembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupDirectUserMembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetGroupDirectUserMembersWithHttpInfo

> ApiResponse<List<User>> groupGetGroupDirectUserMembers groupGetGroupDirectUserMembersWithHttpInfo(id)

Get all users that are direct members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<User>> response = apiInstance.groupGetGroupDirectUserMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupDirectUserMembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupGetGroupExternalIds

> List<ExternalId> groupGetGroupExternalIds(id)

Get all external IDs of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<ExternalId> result = apiInstance.groupGetGroupExternalIds(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupExternalIds");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetGroupExternalIdsWithHttpInfo

> ApiResponse<List<ExternalId>> groupGetGroupExternalIds groupGetGroupExternalIdsWithHttpInfo(id)

Get all external IDs of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<ExternalId>> response = apiInstance.groupGetGroupExternalIdsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupExternalIds");
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
| **id** | **Integer**| ID of the group | |

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


## groupGetGroupPropertyBag

> List<MemberProperty> groupGetGroupPropertyBag(id)

Get all custom properties of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<MemberProperty> result = apiInstance.groupGetGroupPropertyBag(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupPropertyBag");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetGroupPropertyBagWithHttpInfo

> ApiResponse<List<MemberProperty>> groupGetGroupPropertyBag groupGetGroupPropertyBagWithHttpInfo(id)

Get all custom properties of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<MemberProperty>> response = apiInstance.groupGetGroupPropertyBagWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupPropertyBag");
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
| **id** | **Integer**| ID of the group | |

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


## groupGetGroupRecursiveGroupembers

> List<Group> groupGetGroupRecursiveGroupembers(id)

Get all groups that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<Group> result = apiInstance.groupGetGroupRecursiveGroupembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupRecursiveGroupembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetGroupRecursiveGroupembersWithHttpInfo

> ApiResponse<List<Group>> groupGetGroupRecursiveGroupembers groupGetGroupRecursiveGroupembersWithHttpInfo(id)

Get all groups that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<Group>> response = apiInstance.groupGetGroupRecursiveGroupembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupRecursiveGroupembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupGetGroupRecursiveUserMembers

> List<User> groupGetGroupRecursiveUserMembers(id)

Get all users that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<User> result = apiInstance.groupGetGroupRecursiveUserMembers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupRecursiveUserMembers");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetGroupRecursiveUserMembersWithHttpInfo

> ApiResponse<List<User>> groupGetGroupRecursiveUserMembers groupGetGroupRecursiveUserMembersWithHttpInfo(id)

Get all users that are direct or indirect members of the given group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<User>> response = apiInstance.groupGetGroupRecursiveUserMembersWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetGroupRecursiveUserMembers");
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
| **id** | **Integer**| ID of the group | |

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


## groupGetRecursiveGroupMemberships

> List<Group> groupGetRecursiveGroupMemberships(id)

Get all distinct groups that the group is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            List<Group> result = apiInstance.groupGetRecursiveGroupMemberships(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetRecursiveGroupMemberships");
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
| **id** | **Integer**| ID of the group | |

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

## groupGetRecursiveGroupMembershipsWithHttpInfo

> ApiResponse<List<Group>> groupGetRecursiveGroupMemberships groupGetRecursiveGroupMembershipsWithHttpInfo(id)

Get all distinct groups that the group is a direct or indirect member of

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        try {
            ApiResponse<List<Group>> response = apiInstance.groupGetRecursiveGroupMembershipsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupGetRecursiveGroupMemberships");
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
| **id** | **Integer**| ID of the group | |

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


## groupSetGroupGroupMembers

> void groupSetGroupGroupMembers(id, members)

Replace all groups that are direct members of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of new members
        try {
            apiInstance.groupSetGroupGroupMembers(id, members);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of new members | |

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

## groupSetGroupGroupMembersWithHttpInfo

> ApiResponse<Void> groupSetGroupGroupMembers groupSetGroupGroupMembersWithHttpInfo(id, members)

Replace all groups that are direct members of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of new members
        try {
            ApiResponse<Void> response = apiInstance.groupSetGroupGroupMembersWithHttpInfo(id, members);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of new members | |

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


## groupSetGroupMembers

> void groupSetGroupMembers(id, members)

Replace all direct members of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of new members
        try {
            apiInstance.groupSetGroupMembers(id, members);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of new members | |

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

## groupSetGroupMembersWithHttpInfo

> ApiResponse<Void> groupSetGroupMembers groupSetGroupMembersWithHttpInfo(id, members)

Replace all direct members of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of new members
        try {
            ApiResponse<Void> response = apiInstance.groupSetGroupMembersWithHttpInfo(id, members);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of new members | |

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


## groupSetGroupMemberships

> void groupSetGroupMemberships(id, groups)

Set the groups that the group is a direct member of

The group is removed from all other groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            apiInstance.groupSetGroupMemberships(id, groups);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupMemberships");
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
| **id** | **Integer**| ID of group | |
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

## groupSetGroupMembershipsWithHttpInfo

> ApiResponse<Void> groupSetGroupMemberships groupSetGroupMembershipsWithHttpInfo(id, groups)

Set the groups that the group is a direct member of

The group is removed from all other groups

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of group
        MembershipIdListModel groups = new MembershipIdListModel(); // MembershipIdListModel | IDs of groups
        try {
            ApiResponse<Void> response = apiInstance.groupSetGroupMembershipsWithHttpInfo(id, groups);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupMemberships");
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
| **id** | **Integer**| ID of group | |
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


## groupSetGroupUserMembers

> void groupSetGroupUserMembers(id, members)

Replace all users that are direct members of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of new members
        try {
            apiInstance.groupSetGroupUserMembers(id, members);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupUserMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of new members | |

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

## groupSetGroupUserMembersWithHttpInfo

> ApiResponse<Void> groupSetGroupUserMembers groupSetGroupUserMembersWithHttpInfo(id, members)

Replace all users that are direct members of a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        MemberIdListModel members = new MemberIdListModel(); // MemberIdListModel | IDs of new members
        try {
            ApiResponse<Void> response = apiInstance.groupSetGroupUserMembersWithHttpInfo(id, members);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupSetGroupUserMembers");
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
| **id** | **Integer**| ID of the group | |
| **members** | [**MemberIdListModel**](MemberIdListModel.md)| IDs of new members | |

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


## groupUpdateGroup

> void groupUpdateGroup(id, properties)

Update a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        Group properties = new Group(); // Group | New group properties
        try {
            apiInstance.groupUpdateGroup(id, properties);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupUpdateGroup");
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
| **id** | **Integer**| ID of the group | |
| **properties** | [**Group**](Group.md)| New group properties | |

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

## groupUpdateGroupWithHttpInfo

> ApiResponse<Void> groupUpdateGroup groupUpdateGroupWithHttpInfo(id, properties)

Update a group

### Example

```java
// Import classes:
import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Configuration;
import com.cominvent.fotoware.client.auth.*;
import com.cominvent.fotoware.client.models.*;
import com.cominvent.fotoware.api.GroupManagementBetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: FotoWareAccessToken
        HttpBearerAuth FotoWareAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("FotoWareAccessToken");
        FotoWareAccessToken.setBearerToken("BEARER TOKEN");

        GroupManagementBetaApi apiInstance = new GroupManagementBetaApi(defaultClient);
        Integer id = 56; // Integer | ID of the group
        Group properties = new Group(); // Group | New group properties
        try {
            ApiResponse<Void> response = apiInstance.groupUpdateGroupWithHttpInfo(id, properties);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupManagementBetaApi#groupUpdateGroup");
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
| **id** | **Integer**| ID of the group | |
| **properties** | [**Group**](Group.md)| New group properties | |

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

