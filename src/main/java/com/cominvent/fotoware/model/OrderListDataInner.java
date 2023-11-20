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
import com.cominvent.fotoware.model.OrderListDataInnerOrderItemsInner;
import com.cominvent.fotoware.model.OrderListDataInnerOwner;
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
 * OrderListDataInner
 */
@JsonPropertyOrder({
  OrderListDataInner.JSON_PROPERTY_ORDER_ITEMS,
  OrderListDataInner.JSON_PROPERTY_ADMIN_COMMENT,
  OrderListDataInner.JSON_PROPERTY_HREF,
  OrderListDataInner.JSON_PROPERTY_USER_COMMENT,
  OrderListDataInner.JSON_PROPERTY_OWNER,
  OrderListDataInner.JSON_PROPERTY_CREATED,
  OrderListDataInner.JSON_PROPERTY_ORDER_REFERENCE,
  OrderListDataInner.JSON_PROPERTY_MODIFIED,
  OrderListDataInner.JSON_PROPERTY_EXPIRES,
  OrderListDataInner.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class OrderListDataInner {
  public static final String JSON_PROPERTY_ORDER_ITEMS = "orderItems";
  private List<OrderListDataInnerOrderItemsInner> orderItems;

  public static final String JSON_PROPERTY_ADMIN_COMMENT = "adminComment";
  private String adminComment;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_USER_COMMENT = "userComment";
  private String userComment;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private OrderListDataInnerOwner owner;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_ORDER_REFERENCE = "orderReference";
  private String orderReference;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_EXPIRES = "expires";
  private String expires;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public OrderListDataInner() { 
  }

  public OrderListDataInner orderItems(List<OrderListDataInnerOrderItemsInner> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public OrderListDataInner addOrderItemsItem(OrderListDataInnerOrderItemsInner orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Ordered items. Contains the renditions ordered by the customer, but may also be modified by an administrator.
   * @return orderItems
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderListDataInnerOrderItemsInner> getOrderItems() {
    return orderItems;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderItems(List<OrderListDataInnerOrderItemsInner> orderItems) {
    this.orderItems = orderItems;
  }


  public OrderListDataInner adminComment(String adminComment) {
    this.adminComment = adminComment;
    return this;
  }

   /**
   * Comment on this order by the administrator.
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


  public OrderListDataInner href(String href) {
    this.href = href;
    return this;
  }

   /**
   * URL of the order
   * @return href
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public OrderListDataInner userComment(String userComment) {
    this.userComment = userComment;
    return this;
  }

   /**
   * Comment on this order by the customer. A customer may add a comment when submitting an order or modifying the shopping cart. 
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


  public OrderListDataInner owner(OrderListDataInnerOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderListDataInnerOwner getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(OrderListDataInnerOwner owner) {
    this.owner = owner;
  }


  public OrderListDataInner created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Time when order was created
   * @return created
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(String created) {
    this.created = created;
  }


  public OrderListDataInner orderReference(String orderReference) {
    this.orderReference = orderReference;
    return this;
  }

   /**
   * A human-readable string that uniquely identifies the order on the site. May be shown in notifications and used for communication with users. 
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


  public OrderListDataInner modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Time when order was last modified
   * @return modified
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModified() {
    return modified;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModified(String modified) {
    this.modified = modified;
  }


  public OrderListDataInner expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Time when order expires, null if it never expires. An administrator or API client may set an expiry time when approving an order. 
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


  public OrderListDataInner state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Current state of the order. Changes when an order is submitted, approved or rejected.
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  /**
   * Return true if this OrderList_data_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderListDataInner orderListDataInner = (OrderListDataInner) o;
    return Objects.equals(this.orderItems, orderListDataInner.orderItems) &&
        Objects.equals(this.adminComment, orderListDataInner.adminComment) &&
        Objects.equals(this.href, orderListDataInner.href) &&
        Objects.equals(this.userComment, orderListDataInner.userComment) &&
        Objects.equals(this.owner, orderListDataInner.owner) &&
        Objects.equals(this.created, orderListDataInner.created) &&
        Objects.equals(this.orderReference, orderListDataInner.orderReference) &&
        Objects.equals(this.modified, orderListDataInner.modified) &&
        Objects.equals(this.expires, orderListDataInner.expires) &&
        Objects.equals(this.state, orderListDataInner.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItems, adminComment, href, userComment, owner, created, orderReference, modified, expires, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListDataInner {\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    adminComment: ").append(toIndentedString(adminComment)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    userComment: ").append(toIndentedString(userComment)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `adminComment` to the URL query string
    if (getAdminComment() != null) {
      joiner.add(String.format("%sadminComment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `href` to the URL query string
    if (getHref() != null) {
      joiner.add(String.format("%shref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHref()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `userComment` to the URL query string
    if (getUserComment() != null) {
      joiner.add(String.format("%suserComment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `owner` to the URL query string
    if (getOwner() != null) {
      joiner.add(getOwner().toUrlQueryString(prefix + "owner" + suffix));
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `orderReference` to the URL query string
    if (getOrderReference() != null) {
      joiner.add(String.format("%sorderReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderReference()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `modified` to the URL query string
    if (getModified() != null) {
      joiner.add(String.format("%smodified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModified()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expires` to the URL query string
    if (getExpires() != null) {
      joiner.add(String.format("%sexpires%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpires()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
