

# User

User properties

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | User ID |  [optional] [readonly] |
|**created** | **OffsetDateTime** | Timestamp when the user was created |  [optional] [readonly] |
|**modified** | **OffsetDateTime** | Timestamp when the user was modified the last time |  [optional] [readonly] |
|**revision** | **Integer** | Revision |  [optional] [readonly] |
|**username** | **String** | Username |  |
|**description** | **String** | Description |  [optional] |
|**address** | [**Address**](Address.md) |  |  |
|**license** | [**UserLicenseSettings**](UserLicenseSettings.md) |  |  |
|**commerce** | [**CommerceInfo**](CommerceInfo.md) |  |  |
|**account** | [**Account**](Account.md) |  |  |
|**permissions** | [**UserPermissions**](UserPermissions.md) |  |  |
|**properties** | [**List&lt;MemberProperty&gt;**](MemberProperty.md) | Custom properties |  |
|**fullName** | **String** | Full real name |  [optional] [readonly] |
|**isGuest** | **Boolean** | User is guest |  [optional] [readonly] |
|**isBuiltInAdministrator** | **Boolean** | User is built-in Administrator |  [optional] [readonly] |
|**isBuiltIn** | **Boolean** | User is built-in |  [optional] [readonly] |
|**deleted** | **OffsetDateTime** | Deletion time (if user is marked as deleted in database) |  [optional] |



