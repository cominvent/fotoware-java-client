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
 * If present, contains information specific to image assets, such as resolution and color space.
 */
@JsonPropertyOrder({
  AssetAttributesImageattributes.JSON_PROPERTY_PIXELHEIGHT,
  AssetAttributesImageattributes.JSON_PROPERTY_RESOLUTION,
  AssetAttributesImageattributes.JSON_PROPERTY_FLIPMIRROR,
  AssetAttributesImageattributes.JSON_PROPERTY_ROTATION,
  AssetAttributesImageattributes.JSON_PROPERTY_COLORSPACE,
  AssetAttributesImageattributes.JSON_PROPERTY_PIXELWIDTH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetAttributesImageattributes {
  public static final String JSON_PROPERTY_PIXELHEIGHT = "pixelheight";
  private Integer pixelheight;

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private Integer resolution;

  public static final String JSON_PROPERTY_FLIPMIRROR = "flipmirror";
  private Integer flipmirror;

  public static final String JSON_PROPERTY_ROTATION = "rotation";
  private Integer rotation;

  public static final String JSON_PROPERTY_COLORSPACE = "colorspace";
  private String colorspace;

  public static final String JSON_PROPERTY_PIXELWIDTH = "pixelwidth";
  private Integer pixelwidth;

  public AssetAttributesImageattributes() { 
  }

  public AssetAttributesImageattributes pixelheight(Integer pixelheight) {
    this.pixelheight = pixelheight;
    return this;
  }

   /**
   * Get pixelheight
   * @return pixelheight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIXELHEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPixelheight() {
    return pixelheight;
  }


  @JsonProperty(JSON_PROPERTY_PIXELHEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPixelheight(Integer pixelheight) {
    this.pixelheight = pixelheight;
  }


  public AssetAttributesImageattributes resolution(Integer resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResolution() {
    return resolution;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolution(Integer resolution) {
    this.resolution = resolution;
  }


  public AssetAttributesImageattributes flipmirror(Integer flipmirror) {
    this.flipmirror = flipmirror;
    return this;
  }

   /**
   * Get flipmirror
   * @return flipmirror
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLIPMIRROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFlipmirror() {
    return flipmirror;
  }


  @JsonProperty(JSON_PROPERTY_FLIPMIRROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlipmirror(Integer flipmirror) {
    this.flipmirror = flipmirror;
  }


  public AssetAttributesImageattributes rotation(Integer rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Get rotation
   * @return rotation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRotation() {
    return rotation;
  }


  @JsonProperty(JSON_PROPERTY_ROTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }


  public AssetAttributesImageattributes colorspace(String colorspace) {
    this.colorspace = colorspace;
    return this;
  }

   /**
   * Get colorspace
   * @return colorspace
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLORSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColorspace() {
    return colorspace;
  }


  @JsonProperty(JSON_PROPERTY_COLORSPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColorspace(String colorspace) {
    this.colorspace = colorspace;
  }


  public AssetAttributesImageattributes pixelwidth(Integer pixelwidth) {
    this.pixelwidth = pixelwidth;
    return this;
  }

   /**
   * Get pixelwidth
   * @return pixelwidth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIXELWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPixelwidth() {
    return pixelwidth;
  }


  @JsonProperty(JSON_PROPERTY_PIXELWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPixelwidth(Integer pixelwidth) {
    this.pixelwidth = pixelwidth;
  }


  /**
   * Return true if this Asset_attributes_imageattributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetAttributesImageattributes assetAttributesImageattributes = (AssetAttributesImageattributes) o;
    return Objects.equals(this.pixelheight, assetAttributesImageattributes.pixelheight) &&
        Objects.equals(this.resolution, assetAttributesImageattributes.resolution) &&
        Objects.equals(this.flipmirror, assetAttributesImageattributes.flipmirror) &&
        Objects.equals(this.rotation, assetAttributesImageattributes.rotation) &&
        Objects.equals(this.colorspace, assetAttributesImageattributes.colorspace) &&
        Objects.equals(this.pixelwidth, assetAttributesImageattributes.pixelwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pixelheight, resolution, flipmirror, rotation, colorspace, pixelwidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetAttributesImageattributes {\n");
    sb.append("    pixelheight: ").append(toIndentedString(pixelheight)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    flipmirror: ").append(toIndentedString(flipmirror)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    colorspace: ").append(toIndentedString(colorspace)).append("\n");
    sb.append("    pixelwidth: ").append(toIndentedString(pixelwidth)).append("\n");
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

    // add `pixelheight` to the URL query string
    if (getPixelheight() != null) {
      joiner.add(String.format("%spixelheight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPixelheight()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `resolution` to the URL query string
    if (getResolution() != null) {
      joiner.add(String.format("%sresolution%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResolution()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `flipmirror` to the URL query string
    if (getFlipmirror() != null) {
      joiner.add(String.format("%sflipmirror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFlipmirror()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rotation` to the URL query string
    if (getRotation() != null) {
      joiner.add(String.format("%srotation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRotation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `colorspace` to the URL query string
    if (getColorspace() != null) {
      joiner.add(String.format("%scolorspace%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getColorspace()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pixelwidth` to the URL query string
    if (getPixelwidth() != null) {
      joiner.add(String.format("%spixelwidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPixelwidth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

