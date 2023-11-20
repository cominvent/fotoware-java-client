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
 * FullAPIDescriptorPermissionsAlbums
 */
@JsonPropertyOrder({
  FullAPIDescriptorPermissionsAlbums.JSON_PROPERTY_CREATE,
  FullAPIDescriptorPermissionsAlbums.JSON_PROPERTY_COMMENT,
  FullAPIDescriptorPermissionsAlbums.JSON_PROPERTY_SHARE_WITH_GUESTS,
  FullAPIDescriptorPermissionsAlbums.JSON_PROPERTY_SHOW_ON_HOMEPAGE,
  FullAPIDescriptorPermissionsAlbums.JSON_PROPERTY_ADD_ASSETS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class FullAPIDescriptorPermissionsAlbums {
  public static final String JSON_PROPERTY_CREATE = "create";
  private Boolean create;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private Boolean comment;

  public static final String JSON_PROPERTY_SHARE_WITH_GUESTS = "shareWithGuests";
  private Boolean shareWithGuests;

  public static final String JSON_PROPERTY_SHOW_ON_HOMEPAGE = "showOnHomepage";
  private Boolean showOnHomepage;

  public static final String JSON_PROPERTY_ADD_ASSETS = "addAssets";
  private Boolean addAssets;

  public FullAPIDescriptorPermissionsAlbums() { 
  }

  public FullAPIDescriptorPermissionsAlbums create(Boolean create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreate() {
    return create;
  }


  @JsonProperty(JSON_PROPERTY_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreate(Boolean create) {
    this.create = create;
  }


  public FullAPIDescriptorPermissionsAlbums comment(Boolean comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(Boolean comment) {
    this.comment = comment;
  }


  public FullAPIDescriptorPermissionsAlbums shareWithGuests(Boolean shareWithGuests) {
    this.shareWithGuests = shareWithGuests;
    return this;
  }

   /**
   * Get shareWithGuests
   * @return shareWithGuests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_WITH_GUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShareWithGuests() {
    return shareWithGuests;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_WITH_GUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareWithGuests(Boolean shareWithGuests) {
    this.shareWithGuests = shareWithGuests;
  }


  public FullAPIDescriptorPermissionsAlbums showOnHomepage(Boolean showOnHomepage) {
    this.showOnHomepage = showOnHomepage;
    return this;
  }

   /**
   * Get showOnHomepage
   * @return showOnHomepage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_ON_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowOnHomepage() {
    return showOnHomepage;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_ON_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowOnHomepage(Boolean showOnHomepage) {
    this.showOnHomepage = showOnHomepage;
  }


  public FullAPIDescriptorPermissionsAlbums addAssets(Boolean addAssets) {
    this.addAssets = addAssets;
    return this;
  }

   /**
   * Get addAssets
   * @return addAssets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddAssets() {
    return addAssets;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddAssets(Boolean addAssets) {
    this.addAssets = addAssets;
  }


  /**
   * Return true if this FullAPIDescriptor_permissions_albums object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIDescriptorPermissionsAlbums fullAPIDescriptorPermissionsAlbums = (FullAPIDescriptorPermissionsAlbums) o;
    return Objects.equals(this.create, fullAPIDescriptorPermissionsAlbums.create) &&
        Objects.equals(this.comment, fullAPIDescriptorPermissionsAlbums.comment) &&
        Objects.equals(this.shareWithGuests, fullAPIDescriptorPermissionsAlbums.shareWithGuests) &&
        Objects.equals(this.showOnHomepage, fullAPIDescriptorPermissionsAlbums.showOnHomepage) &&
        Objects.equals(this.addAssets, fullAPIDescriptorPermissionsAlbums.addAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, comment, shareWithGuests, showOnHomepage, addAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIDescriptorPermissionsAlbums {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    shareWithGuests: ").append(toIndentedString(shareWithGuests)).append("\n");
    sb.append("    showOnHomepage: ").append(toIndentedString(showOnHomepage)).append("\n");
    sb.append("    addAssets: ").append(toIndentedString(addAssets)).append("\n");
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

    // add `create` to the URL query string
    if (getCreate() != null) {
      joiner.add(String.format("%screate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `shareWithGuests` to the URL query string
    if (getShareWithGuests() != null) {
      joiner.add(String.format("%sshareWithGuests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShareWithGuests()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `showOnHomepage` to the URL query string
    if (getShowOnHomepage() != null) {
      joiner.add(String.format("%sshowOnHomepage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShowOnHomepage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addAssets` to the URL query string
    if (getAddAssets() != null) {
      joiner.add(String.format("%saddAssets%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddAssets()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
