

# OrderListDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderItems** | [**List&lt;OrderListDataInnerOrderItemsInner&gt;**](OrderListDataInnerOrderItemsInner.md) | Ordered items. Contains the renditions ordered by the customer, but may also be modified by an administrator. |  [optional] |
|**adminComment** | **String** | Comment on this order by the administrator. |  [optional] |
|**href** | **String** | URL of the order |  [optional] |
|**userComment** | **String** | Comment on this order by the customer. A customer may add a comment when submitting an order or modifying the shopping cart.  |  [optional] |
|**owner** | [**OrderListDataInnerOwner**](OrderListDataInnerOwner.md) |  |  [optional] |
|**created** | **String** | Time when order was created |  [optional] |
|**orderReference** | **String** | A human-readable string that uniquely identifies the order on the site. May be shown in notifications and used for communication with users.  |  [optional] |
|**modified** | **String** | Time when order was last modified |  [optional] |
|**expires** | **String** | Time when order expires, null if it never expires. An administrator or API client may set an expiry time when approving an order.  |  [optional] |
|**state** | **String** | Current state of the order. Changes when an order is submitted, approved or rejected. |  [optional] |



