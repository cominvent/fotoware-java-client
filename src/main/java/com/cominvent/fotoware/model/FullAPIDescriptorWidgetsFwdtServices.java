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
 * FullAPIDescriptorWidgetsFwdtServices
 */
@JsonPropertyOrder({
  FullAPIDescriptorWidgetsFwdtServices.JSON_PROPERTY_OPEN,
  FullAPIDescriptorWidgetsFwdtServices.JSON_PROPERTY_EDIT,
  FullAPIDescriptorWidgetsFwdtServices.JSON_PROPERTY_CROP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class FullAPIDescriptorWidgetsFwdtServices {
  public static final String JSON_PROPERTY_OPEN = "open";
  private String open;

  public static final String JSON_PROPERTY_EDIT = "edit";
  private String edit;

  public static final String JSON_PROPERTY_CROP = "crop";
  private String crop;

  public FullAPIDescriptorWidgetsFwdtServices() { 
  }

  public FullAPIDescriptorWidgetsFwdtServices open(String open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOpen() {
    return open;
  }


  @JsonProperty(JSON_PROPERTY_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpen(String open) {
    this.open = open;
  }


  public FullAPIDescriptorWidgetsFwdtServices edit(String edit) {
    this.edit = edit;
    return this;
  }

   /**
   * Get edit
   * @return edit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEdit() {
    return edit;
  }


  @JsonProperty(JSON_PROPERTY_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdit(String edit) {
    this.edit = edit;
  }


  public FullAPIDescriptorWidgetsFwdtServices crop(String crop) {
    this.crop = crop;
    return this;
  }

   /**
   * Get crop
   * @return crop
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrop() {
    return crop;
  }


  @JsonProperty(JSON_PROPERTY_CROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrop(String crop) {
    this.crop = crop;
  }


  /**
   * Return true if this FullAPIDescriptor_widgets_fwdt_services object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIDescriptorWidgetsFwdtServices fullAPIDescriptorWidgetsFwdtServices = (FullAPIDescriptorWidgetsFwdtServices) o;
    return Objects.equals(this.open, fullAPIDescriptorWidgetsFwdtServices.open) &&
        Objects.equals(this.edit, fullAPIDescriptorWidgetsFwdtServices.edit) &&
        Objects.equals(this.crop, fullAPIDescriptorWidgetsFwdtServices.crop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(open, edit, crop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIDescriptorWidgetsFwdtServices {\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    crop: ").append(toIndentedString(crop)).append("\n");
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

    // add `open` to the URL query string
    if (getOpen() != null) {
      joiner.add(String.format("%sopen%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpen()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `edit` to the URL query string
    if (getEdit() != null) {
      joiner.add(String.format("%sedit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEdit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `crop` to the URL query string
    if (getCrop() != null) {
      joiner.add(String.format("%scrop%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCrop()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
