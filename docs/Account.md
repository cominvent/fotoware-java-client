

# Account

User account information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**password** | **String** | The password hash stored in MongoDB |  [optional] |
|**hasPassword** | **Boolean** | User has a password |  [optional] [readonly] |
|**deletePassword** | **Boolean** | Delete password |  [optional] |
|**forcePasswordChange** | **Boolean** | Force password change on next login |  [optional] |
|**allowPasswordChange** | **Boolean** | Allow user to change password |  [optional] |
|**lastLoginDate** | **OffsetDateTime** | Last login date |  [optional] [readonly] |
|**expires** | **OffsetDateTime** | Expiry time |  [optional] |
|**isEnabled** | **Boolean** | User is enabled (not locked out) |  [optional] |
|**externalIds** | [**List&lt;ExternalId&gt;**](ExternalId.md) | External IDs for SSO |  |
|**isSsoUser** | **Boolean** | User is SSO user (has external IDs) |  [optional] [readonly] |



