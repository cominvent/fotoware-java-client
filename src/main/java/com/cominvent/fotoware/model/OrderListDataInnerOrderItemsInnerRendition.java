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
 * Rendition that is ordered.
 */
@JsonPropertyOrder({
  OrderListDataInnerOrderItemsInnerRendition.JSON_PROPERTY_DOWNLOAD,
  OrderListDataInnerOrderItemsInnerRendition.JSON_PROPERTY_HREF,
  OrderListDataInnerOrderItemsInnerRendition.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderListDataInnerOrderItemsInnerRendition {
  public static final String JSON_PROPERTY_DOWNLOAD = "download";
  private String download;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public OrderListDataInnerOrderItemsInnerRendition() { 
  }

  public OrderListDataInnerOrderItemsInnerRendition download(String download) {
    this.download = download;
    return this;
  }

   /**
   * Download URL of the ordered rendition or null. If not null, then this rendition can be downloaded (usually in approved orders only). This is not a direct download URL. The URL does not accept any requests. 
   * @return download
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownload() {
    return download;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownload(String download) {
    this.download = download;
  }


  public OrderListDataInnerOrderItemsInnerRendition href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Original URL of the ordered rendition. This is the same as the rendition attribute in a cart update or order update request. Can be used to match against renditions.href in an Asset representation. 
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


  public OrderListDataInnerOrderItemsInnerRendition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human-readable display name of the rendition.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this OrderList_data_inner_orderItems_inner_rendition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderListDataInnerOrderItemsInnerRendition orderListDataInnerOrderItemsInnerRendition = (OrderListDataInnerOrderItemsInnerRendition) o;
    return Objects.equals(this.download, orderListDataInnerOrderItemsInnerRendition.download) &&
        Objects.equals(this.href, orderListDataInnerOrderItemsInnerRendition.href) &&
        Objects.equals(this.name, orderListDataInnerOrderItemsInnerRendition.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(download, href, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListDataInnerOrderItemsInnerRendition {\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `download` to the URL query string
    if (getDownload() != null) {
      joiner.add(String.format("%sdownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDownload()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `href` to the URL query string
    if (getHref() != null) {
      joiner.add(String.format("%shref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHref()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

