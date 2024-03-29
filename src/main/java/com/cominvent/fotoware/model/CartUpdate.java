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
import com.cominvent.fotoware.model.CartUpdateOrderItemsInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Used to edit the content of the cart, e.g. add or remove ordered items, change renditions for ordered assets, add custom order data or add a customer&#39;s comment to the order. 
 */
@JsonPropertyOrder({
  CartUpdate.JSON_PROPERTY_ORDER_ITEMS,
  CartUpdate.JSON_PROPERTY_USER_COMMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CartUpdate {
  public static final String JSON_PROPERTY_ORDER_ITEMS = "orderItems";
  private List<CartUpdateOrderItemsInner> orderItems;

  public static final String JSON_PROPERTY_USER_COMMENT = "userComment";
  private String userComment;

  public CartUpdate() { 
  }

  public CartUpdate orderItems(List<CartUpdateOrderItemsInner> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public CartUpdate addOrderItemsItem(CartUpdateOrderItemsInner orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Complete list of ordered items. This replaces the existing list.
   * @return orderItems
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CartUpdateOrderItemsInner> getOrderItems() {
    return orderItems;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderItems(List<CartUpdateOrderItemsInner> orderItems) {
    this.orderItems = orderItems;
  }


  public CartUpdate userComment(String userComment) {
    this.userComment = userComment;
    return this;
  }

   /**
   * Comment by the customer on the order.
   * @return userComment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserComment() {
    return userComment;
  }


  @JsonProperty(JSON_PROPERTY_USER_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }


  /**
   * Return true if this CartUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartUpdate cartUpdate = (CartUpdate) o;
    return Objects.equals(this.orderItems, cartUpdate.orderItems) &&
        Objects.equals(this.userComment, cartUpdate.userComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItems, userComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartUpdate {\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    userComment: ").append(toIndentedString(userComment)).append("\n");
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

    // add `orderItems` to the URL query string
    if (getOrderItems() != null) {
      for (int i = 0; i < getOrderItems().size(); i++) {
        if (getOrderItems().get(i) != null) {
          joiner.add(getOrderItems().get(i).toUrlQueryString(String.format("%sorderItems%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `userComment` to the URL query string
    if (getUserComment() != null) {
      joiner.add(String.format("%suserComment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

