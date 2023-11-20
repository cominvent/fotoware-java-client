

# OrderSubmissionInfo

Info on submitted Order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderLocation** | **String** | URL of the order. Links to an Order representation. |  [optional] |
|**orderReference** | **String** | A human-readable string that uniquely identifies the order on the site. May be shown in notifications and used for communication with users. Same as the orderReference attribute in the Order representation.  |  [optional] |
|**checkoutPageLocation** | **String** | URL of the checkout page to show to the user. This page SHOULD be shown to the customer in a browser window in order to proceed with the ordering process. Depending on the site settings, this may be the standard FotoWeb checkout page or a custom page (which may include payment options). A native application may provide its own native checkout user interface and ignore this parameter. This is equal to the checkoutPageLocation attribute of the Order representation.  |  [optional] |



