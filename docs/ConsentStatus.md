

# ConsentStatus

Consent status of an asset

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetConsentState** | **ConsentFormAssetConsentState** |  |  [optional] |
|**approvedConsents** | [**List&lt;AssetConsentCategoryApiModel&gt;**](AssetConsentCategoryApiModel.md) | An intersection of valid and approved consent categories from the linked consent forms |  [optional] |
|**declinedConsents** | [**List&lt;AssetConsentCategoryApiModel&gt;**](AssetConsentCategoryApiModel.md) | An sum of declined consent categories from the linked consent forms |  [optional] |
|**consentFlags** | **Set&lt;AssetConsentFlag&gt;** | A collection of consent flags for the asset |  [optional] |
|**consentFormCount** | **Integer** | The number of consent forms linked to the asset |  [optional] |
|**countByConsentFormState** | [**List&lt;ConsentFormStateCount&gt;**](ConsentFormStateCount.md) | A collection of information about the count of consent form per state |  [optional] [readonly] |



