/*
 * FotoWare API
 * This reference documents the available endpoints for FotoWare's API. <br/> Click the Authorize button at the top of the page to try the API with your own FotoWare as a Service tenant.<br/> To enable authorization and testing of the API on an on-premises server, <a target=\"_blank\" href='https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Exploring_the_FotoWare_API_with_Swagger'>please follow the instructions in our software documentation</a><br/> 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cominvent.fotoware.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Info on submitted Order
 */
@JsonPropertyOrder({
  OrderSubmissionInfo.JSON_PROPERTY_ORDER_LOCATION,
  OrderSubmissionInfo.JSON_PROPERTY_ORDER_REFERENCE,
  OrderSubmissionInfo.JSON_PROPERTY_CHECKOUT_PAGE_LOCATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class OrderSubmissionInfo {
  public static final String JSON_PROPERTY_ORDER_LOCATION = "orderLocation";
  private String orderLocation;

  public static final String JSON_PROPERTY_ORDER_REFERENCE = "orderReference";
  private String orderReference;

  public static final String JSON_PROPERTY_CHECKOUT_PAGE_LOCATION = "checkoutPageLocation";
  private String checkoutPageLocation;

  public OrderSubmissionInfo() { 
  }

  public OrderSubmissionInfo orderLocation(String orderLocation) {
    this.orderLocation = orderLocation;
    return this;
  }

   /**
   * URL of the order. Links to an Order representation.
   * @return orderLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderLocation() {
    return orderLocation;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderLocation(String orderLocation) {
    this.orderLocation = orderLocation;
  }


  public OrderSubmissionInfo orderReference(String orderReference) {
    this.orderReference = orderReference;
    return this;
  }

   /**
   * A human-readable string that uniquely identifies the order on the site. May be shown in notifications and used for communication with users. Same as the orderReference attribute in the Order representation. 
   * @return orderReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderReference() {
    return orderReference;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderReference(String orderReference) {
    this.orderReference = orderReference;
  }


  public OrderSubmissionInfo checkoutPageLocation(String checkoutPageLocation) {
    this.checkoutPageLocation = checkoutPageLocation;
    return this;
  }

   /**
   * URL of the checkout page to show to the user. This page SHOULD be shown to the customer in a browser window in order to proceed with the ordering process. Depending on the site settings, this may be the standard FotoWeb checkout page or a custom page (which may include payment options). A native application may provide its own native checkout user interface and ignore this parameter. This is equal to the checkoutPageLocation attribute of the Order representation. 
   * @return checkoutPageLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_PAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutPageLocation() {
    return checkoutPageLocation;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_PAGE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutPageLocation(String checkoutPageLocation) {
    this.checkoutPageLocation = checkoutPageLocation;
  }


  /**
   * Return true if this OrderSubmissionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSubmissionInfo orderSubmissionInfo = (OrderSubmissionInfo) o;
    return Objects.equals(this.orderLocation, orderSubmissionInfo.orderLocation) &&
        Objects.equals(this.orderReference, orderSubmissionInfo.orderReference) &&
        Objects.equals(this.checkoutPageLocation, orderSubmissionInfo.checkoutPageLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderLocation, orderReference, checkoutPageLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSubmissionInfo {\n");
    sb.append("    orderLocation: ").append(toIndentedString(orderLocation)).append("\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
    sb.append("    checkoutPageLocation: ").append(toIndentedString(checkoutPageLocation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `orderLocation` to the URL query string
    if (getOrderLocation() != null) {
      joiner.add(String.format("%sorderLocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `orderReference` to the URL query string
    if (getOrderReference() != null) {
      joiner.add(String.format("%sorderReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderReference()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `checkoutPageLocation` to the URL query string
    if (getCheckoutPageLocation() != null) {
      joiner.add(String.format("%scheckoutPageLocation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCheckoutPageLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

