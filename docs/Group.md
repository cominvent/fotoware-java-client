

# Group

Group properties

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isEveryone** | **Boolean** | Group is the built-in group of everyone (including guest) |  [optional] [readonly] |
|**isRegisteredUsers** | **Boolean** | Group is the built-in group of all registered users (not including guest) |  [optional] [readonly] |
|**isBuiltIn** | **Boolean** | Group is built-in |  [optional] [readonly] |
|**id** | **Integer** | Group ID |  [optional] [readonly] |
|**created** | **OffsetDateTime** | Timestamp when the group was created |  [optional] [readonly] |
|**modified** | **OffsetDateTime** | Timestamp when the group was modified the last time |  [optional] [readonly] |
|**revision** | **Integer** | Revision |  [optional] [readonly] |
|**name** | **String** | Group name |  |
|**description** | **String** | Group description |  [optional] |
|**license** | [**UserLicenseSettings**](UserLicenseSettings.md) |  |  |
|**permissions** | [**GroupPermissions**](GroupPermissions.md) |  |  |
|**properties** | [**List&lt;MemberProperty&gt;**](MemberProperty.md) | Custom properties |  |
|**externalIds** | [**List&lt;ExternalId&gt;**](ExternalId.md) | External IDs for SSO |  |
|**deleted** | **OffsetDateTime** | Deletion time (if group is marked as deleted in database) |  [optional] |



