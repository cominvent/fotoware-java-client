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
 * OrderUpdateOrderItemsInner
 */
@JsonPropertyOrder({
  OrderUpdateOrderItemsInner.JSON_PROPERTY_ADMIN_COMMENT,
  OrderUpdateOrderItemsInner.JSON_PROPERTY_RENDITION,
  OrderUpdateOrderItemsInner.JSON_PROPERTY_EXPIRES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class OrderUpdateOrderItemsInner {
  public static final String JSON_PROPERTY_ADMIN_COMMENT = "adminComment";
  private String adminComment;

  public static final String JSON_PROPERTY_RENDITION = "rendition";
  private String rendition;

  public static final String JSON_PROPERTY_EXPIRES = "expires";
  private String expires;

  public OrderUpdateOrderItemsInner() { 
  }

  public OrderUpdateOrderItemsInner adminComment(String adminComment) {
    this.adminComment = adminComment;
    return this;
  }

   /**
   * Comment by the administrator on the order item
   * @return adminComment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminComment() {
    return adminComment;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminComment(String adminComment) {
    this.adminComment = adminComment;
  }


  public OrderUpdateOrderItemsInner rendition(String rendition) {
    this.rendition = rendition;
    return this;
  }

   /**
   * Rendition URL of rendition to order. This also identifies the asset. The rendition URL can be obtained from an Asset representation. 
   * @return rendition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRendition() {
    return rendition;
  }


  @JsonProperty(JSON_PROPERTY_RENDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRendition(String rendition) {
    this.rendition = rendition;
  }


  public OrderUpdateOrderItemsInner expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Time when order item expires, null if it never expires. After the expiration time, the customer cannot download this rendition any more. 
   * @return expires
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpires() {
    return expires;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpires(String expires) {
    this.expires = expires;
  }


  /**
   * Return true if this OrderUpdate_orderItems_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderUpdateOrderItemsInner orderUpdateOrderItemsInner = (OrderUpdateOrderItemsInner) o;
    return Objects.equals(this.adminComment, orderUpdateOrderItemsInner.adminComment) &&
        Objects.equals(this.rendition, orderUpdateOrderItemsInner.rendition) &&
        Objects.equals(this.expires, orderUpdateOrderItemsInner.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminComment, rendition, expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderUpdateOrderItemsInner {\n");
    sb.append("    adminComment: ").append(toIndentedString(adminComment)).append("\n");
    sb.append("    rendition: ").append(toIndentedString(rendition)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

    // add `adminComment` to the URL query string
    if (getAdminComment() != null) {
      joiner.add(String.format("%sadminComment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rendition` to the URL query string
    if (getRendition() != null) {
      joiner.add(String.format("%srendition%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRendition()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expires` to the URL query string
    if (getExpires() != null) {
      joiner.add(String.format("%sexpires%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpires()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

