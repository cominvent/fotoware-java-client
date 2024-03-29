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
 * AssetRenditionsInner
 */
@JsonPropertyOrder({
  AssetRenditionsInner.JSON_PROPERTY_HREF,
  AssetRenditionsInner.JSON_PROPERTY_PROFILE,
  AssetRenditionsInner.JSON_PROPERTY_WIDTH,
  AssetRenditionsInner.JSON_PROPERTY_DESCRIPTION,
  AssetRenditionsInner.JSON_PROPERTY_HEIGHT,
  AssetRenditionsInner.JSON_PROPERTY_DEFAULT,
  AssetRenditionsInner.JSON_PROPERTY_ORIGINAL,
  AssetRenditionsInner.JSON_PROPERTY_SIZE_FIXED,
  AssetRenditionsInner.JSON_PROPERTY_DISPLAY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetRenditionsInner {
  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private String profile;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Boolean _default;

  public static final String JSON_PROPERTY_ORIGINAL = "original";
  private Boolean original;

  public static final String JSON_PROPERTY_SIZE_FIXED = "sizeFixed";
  private Boolean sizeFixed;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public AssetRenditionsInner() { 
  }

  public AssetRenditionsInner href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Rendition URL
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


  public AssetRenditionsInner profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(String profile) {
    this.profile = profile;
  }


  public AssetRenditionsInner width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the rendition in pixels (if applicable).
   * @return width
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public AssetRenditionsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Human-readable detailed description of the rendition.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AssetRenditionsInner height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the rendition in pixels (if applicable).
   * @return height
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public AssetRenditionsInner _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * If true, this rendition is the default rendition that should be offered to users in a selection interface.
   * @return _default
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefault() {
    return _default;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public AssetRenditionsInner original(Boolean original) {
    this.original = original;
    return this;
  }

   /**
   * If true, this rendition is the original asset file without any processing applied.
   * @return original
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOriginal() {
    return original;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginal(Boolean original) {
    this.original = original;
  }


  public AssetRenditionsInner sizeFixed(Boolean sizeFixed) {
    this.sizeFixed = sizeFixed;
    return this;
  }

   /**
   * Get sizeFixed
   * @return sizeFixed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSizeFixed() {
    return sizeFixed;
  }


  @JsonProperty(JSON_PROPERTY_SIZE_FIXED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSizeFixed(Boolean sizeFixed) {
    this.sizeFixed = sizeFixed;
  }


  public AssetRenditionsInner displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Human readable display name of the rendition.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Return true if this Asset_renditions_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetRenditionsInner assetRenditionsInner = (AssetRenditionsInner) o;
    return Objects.equals(this.href, assetRenditionsInner.href) &&
        Objects.equals(this.profile, assetRenditionsInner.profile) &&
        Objects.equals(this.width, assetRenditionsInner.width) &&
        Objects.equals(this.description, assetRenditionsInner.description) &&
        Objects.equals(this.height, assetRenditionsInner.height) &&
        Objects.equals(this._default, assetRenditionsInner._default) &&
        Objects.equals(this.original, assetRenditionsInner.original) &&
        Objects.equals(this.sizeFixed, assetRenditionsInner.sizeFixed) &&
        Objects.equals(this.displayName, assetRenditionsInner.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, profile, width, description, height, _default, original, sizeFixed, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetRenditionsInner {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    sizeFixed: ").append(toIndentedString(sizeFixed)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

    // add `href` to the URL query string
    if (getHref() != null) {
      joiner.add(String.format("%shref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHref()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `profile` to the URL query string
    if (getProfile() != null) {
      joiner.add(String.format("%sprofile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfile()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `width` to the URL query string
    if (getWidth() != null) {
      joiner.add(String.format("%swidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWidth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `height` to the URL query string
    if (getHeight() != null) {
      joiner.add(String.format("%sheight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeight()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `default` to the URL query string
    if (getDefault() != null) {
      joiner.add(String.format("%sdefault%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefault()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `original` to the URL query string
    if (getOriginal() != null) {
      joiner.add(String.format("%soriginal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sizeFixed` to the URL query string
    if (getSizeFixed() != null) {
      joiner.add(String.format("%ssizeFixed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSizeFixed()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `display_name` to the URL query string
    if (getDisplayName() != null) {
      joiner.add(String.format("%sdisplay_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisplayName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

