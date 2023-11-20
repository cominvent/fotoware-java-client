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
import com.cominvent.fotoware.model.CollectionAltOrdersInnerAsc;
import com.cominvent.fotoware.model.CollectionAltOrdersInnerDesc;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CollectionAltOrdersInner
 */
@JsonPropertyOrder({
  CollectionAltOrdersInner.JSON_PROPERTY_NAME,
  CollectionAltOrdersInner.JSON_PROPERTY_KEY,
  CollectionAltOrdersInner.JSON_PROPERTY_ASC,
  CollectionAltOrdersInner.JSON_PROPERTY_DESC
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class CollectionAltOrdersInner {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_ASC = "asc";
  private CollectionAltOrdersInnerAsc asc;

  public static final String JSON_PROPERTY_DESC = "desc";
  private CollectionAltOrdersInnerDesc desc;

  public CollectionAltOrdersInner() { 
  }

  public CollectionAltOrdersInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
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


  public CollectionAltOrdersInner key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public CollectionAltOrdersInner asc(CollectionAltOrdersInnerAsc asc) {
    this.asc = asc;
    return this;
  }

   /**
   * Get asc
   * @return asc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CollectionAltOrdersInnerAsc getAsc() {
    return asc;
  }


  @JsonProperty(JSON_PROPERTY_ASC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsc(CollectionAltOrdersInnerAsc asc) {
    this.asc = asc;
  }


  public CollectionAltOrdersInner desc(CollectionAltOrdersInnerDesc desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CollectionAltOrdersInnerDesc getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(CollectionAltOrdersInnerDesc desc) {
    this.desc = desc;
  }


  /**
   * Return true if this Collection_alt_orders_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionAltOrdersInner collectionAltOrdersInner = (CollectionAltOrdersInner) o;
    return Objects.equals(this.name, collectionAltOrdersInner.name) &&
        Objects.equals(this.key, collectionAltOrdersInner.key) &&
        Objects.equals(this.asc, collectionAltOrdersInner.asc) &&
        Objects.equals(this.desc, collectionAltOrdersInner.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, asc, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionAltOrdersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `asc` to the URL query string
    if (getAsc() != null) {
      joiner.add(getAsc().toUrlQueryString(prefix + "asc" + suffix));
    }

    // add `desc` to the URL query string
    if (getDesc() != null) {
      joiner.add(getDesc().toUrlQueryString(prefix + "desc" + suffix));
    }

    return joiner.toString();
  }
}

