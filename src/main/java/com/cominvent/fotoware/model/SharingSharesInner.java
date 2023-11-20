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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SharingSharesInner
 */
@JsonPropertyOrder({
  SharingSharesInner.JSON_PROPERTY_TYPE,
  SharingSharesInner.JSON_PROPERTY_HREF,
  SharingSharesInner.JSON_PROPERTY_NAME,
  SharingSharesInner.JSON_PROPERTY_ACL,
  SharingSharesInner.JSON_PROPERTY_SHARED_H_R_E_F
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class SharingSharesInner {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ACL = "acl";
  private List<Object> acl;

  public static final String JSON_PROPERTY_SHARED_H_R_E_F = "sharedHREF";
  private String sharedHREF;

  public SharingSharesInner() { 
  }

  public SharingSharesInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public SharingSharesInner href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
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


  public SharingSharesInner name(String name) {
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


  public SharingSharesInner acl(List<Object> acl) {
    this.acl = acl;
    return this;
  }

  public SharingSharesInner addAclItem(Object aclItem) {
    if (this.acl == null) {
      this.acl = new ArrayList<>();
    }
    this.acl.add(aclItem);
    return this;
  }

   /**
   * Get acl
   * @return acl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAcl() {
    return acl;
  }


  @JsonProperty(JSON_PROPERTY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcl(List<Object> acl) {
    this.acl = acl;
  }


  public SharingSharesInner sharedHREF(String sharedHREF) {
    this.sharedHREF = sharedHREF;
    return this;
  }

   /**
   * Get sharedHREF
   * @return sharedHREF
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_H_R_E_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSharedHREF() {
    return sharedHREF;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_H_R_E_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedHREF(String sharedHREF) {
    this.sharedHREF = sharedHREF;
  }


  /**
   * Return true if this Sharing_shares_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingSharesInner sharingSharesInner = (SharingSharesInner) o;
    return Objects.equals(this.type, sharingSharesInner.type) &&
        Objects.equals(this.href, sharingSharesInner.href) &&
        Objects.equals(this.name, sharingSharesInner.name) &&
        Objects.equals(this.acl, sharingSharesInner.acl) &&
        Objects.equals(this.sharedHREF, sharingSharesInner.sharedHREF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, href, name, acl, sharedHREF);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingSharesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    sharedHREF: ").append(toIndentedString(sharedHREF)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `href` to the URL query string
    if (getHref() != null) {
      joiner.add(String.format("%shref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHref()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `acl` to the URL query string
    if (getAcl() != null) {
      for (int i = 0; i < getAcl().size(); i++) {
        joiner.add(String.format("%sacl%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAcl().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `sharedHREF` to the URL query string
    if (getSharedHREF() != null) {
      joiner.add(String.format("%ssharedHREF%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedHREF()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

