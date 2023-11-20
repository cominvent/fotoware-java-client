

# Paging

Paging information. If null, then the list is not paged, i.e., the representation contains the entire list.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**prev** | **String** | URL of previous page. If null, then there is no previous page, and the current representation is the first page. |  [optional] |
|**next** | **String** | URL of next page. If null, then there is no next page, and the current representation is the last page. |  [optional] |
|**first** | **String** | URL of first page. This attribute is never null and can be used for restarting navigation at the beginning of the list.  |  [optional] |
|**last** | **String** | URL of last page. If null, then the last page is not known, because it is not known how many pages there are. The last page (if the list has finite length) can be �discovered� by following paging.next repeatedly  |  [optional] |



