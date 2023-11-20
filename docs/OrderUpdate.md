

# OrderUpdate

Updating an order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderItems** | [**List&lt;OrderUpdateOrderItemsInner&gt;**](OrderUpdateOrderItemsInner.md) | Complete list of ordered items. This replaces the existing list. (Set to [] to empty the order.) |  [optional] |
|**expires** | **String** | Time when this order expires, null if if never expires. After the expiration time, the customer cannot download any renditions from this order any more.  |  [optional] |
|**adminComment** | **String** | Comment by the administrator on the order. |  [optional] |
|**orderData** | **List&lt;Order&gt;** | Custom order data for the order. Completely replaces existing custom order data. |  [optional] |



