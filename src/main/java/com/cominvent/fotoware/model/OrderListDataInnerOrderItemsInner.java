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
import com.cominvent.fotoware.model.OrderListDataInnerOrderItemsInnerRendition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrderListDataInnerOrderItemsInner
 */
@JsonPropertyOrder({
  OrderListDataInnerOrderItemsInner.JSON_PROPERTY_EXPIRES,
  OrderListDataInnerOrderItemsInner.JSON_PROPERTY_ADMIN_COMMENT,
  OrderListDataInnerOrderItemsInner.JSON_PROPERTY_ASSET,
  OrderListDataInnerOrderItemsInner.JSON_PROPERTY_RENDITION,
  OrderListDataInnerOrderItemsInner.JSON_PROPERTY_EXPIRED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class OrderListDataInnerOrderItemsInner {
  public static final String JSON_PROPERTY_EXPIRES = "expires";
  private String expires;

  public static final String JSON_PROPERTY_ADMIN_COMMENT = "adminComment";
  private String adminComment;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_RENDITION = "rendition";
  private OrderListDataInnerOrderItemsInnerRendition rendition;

  public static final String JSON_PROPERTY_EXPIRED = "expired";
  private Boolean expired;

  public OrderListDataInnerOrderItemsInner() { 
  }

  public OrderListDataInnerOrderItemsInner expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Time when item expires, null if it never expires.
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


  public OrderListDataInnerOrderItemsInner adminComment(String adminComment) {
    this.adminComment = adminComment;
    return this;
  }

   /**
   * Comment on this item by the administrator.
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


  public OrderListDataInnerOrderItemsInner asset(String asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Asset whose rendition is ordered
   * @return asset
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsset(String asset) {
    this.asset = asset;
  }


  public OrderListDataInnerOrderItemsInner rendition(OrderListDataInnerOrderItemsInnerRendition rendition) {
    this.rendition = rendition;
    return this;
  }

   /**
   * Get rendition
   * @return rendition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderListDataInnerOrderItemsInnerRendition getRendition() {
    return rendition;
  }


  @JsonProperty(JSON_PROPERTY_RENDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRendition(OrderListDataInnerOrderItemsInnerRendition rendition) {
    this.rendition = rendition;
  }


  public OrderListDataInnerOrderItemsInner expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * true if item has expired, false otherwise
   * @return expired
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpired() {
    return expired;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpired(Boolean expired) {
    this.expired = expired;
  }


  /**
   * Return true if this OrderList_data_inner_orderItems_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderListDataInnerOrderItemsInner orderListDataInnerOrderItemsInner = (OrderListDataInnerOrderItemsInner) o;
    return Objects.equals(this.expires, orderListDataInnerOrderItemsInner.expires) &&
        Objects.equals(this.adminComment, orderListDataInnerOrderItemsInner.adminComment) &&
        Objects.equals(this.asset, orderListDataInnerOrderItemsInner.asset) &&
        Objects.equals(this.rendition, orderListDataInnerOrderItemsInner.rendition) &&
        Objects.equals(this.expired, orderListDataInnerOrderItemsInner.expired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires, adminComment, asset, rendition, expired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListDataInnerOrderItemsInner {\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    adminComment: ").append(toIndentedString(adminComment)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    rendition: ").append(toIndentedString(rendition)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
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

    // add `expires` to the URL query string
    if (getExpires() != null) {
      joiner.add(String.format("%sexpires%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpires()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `adminComment` to the URL query string
    if (getAdminComment() != null) {
      joiner.add(String.format("%sadminComment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `asset` to the URL query string
    if (getAsset() != null) {
      joiner.add(String.format("%sasset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAsset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rendition` to the URL query string
    if (getRendition() != null) {
      joiner.add(getRendition().toUrlQueryString(prefix + "rendition" + suffix));
    }

    // add `expired` to the URL query string
    if (getExpired() != null) {
      joiner.add(String.format("%sexpired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpired()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

