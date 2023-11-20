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
import com.cominvent.fotoware.model.FullAPIDescriptorWidgetsFwdtWinInstaller;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FullAPIDescriptorWidgetsFwdtWin
 */
@JsonPropertyOrder({
  FullAPIDescriptorWidgetsFwdtWin.JSON_PROPERTY_INSTALLER,
  FullAPIDescriptorWidgetsFwdtWin.JSON_PROPERTY_MIN_VERSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FullAPIDescriptorWidgetsFwdtWin {
  public static final String JSON_PROPERTY_INSTALLER = "installer";
  private FullAPIDescriptorWidgetsFwdtWinInstaller installer;

  public static final String JSON_PROPERTY_MIN_VERSION = "minVersion";
  private String minVersion;

  public FullAPIDescriptorWidgetsFwdtWin() { 
  }

  public FullAPIDescriptorWidgetsFwdtWin installer(FullAPIDescriptorWidgetsFwdtWinInstaller installer) {
    this.installer = installer;
    return this;
  }

   /**
   * Get installer
   * @return installer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullAPIDescriptorWidgetsFwdtWinInstaller getInstaller() {
    return installer;
  }


  @JsonProperty(JSON_PROPERTY_INSTALLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstaller(FullAPIDescriptorWidgetsFwdtWinInstaller installer) {
    this.installer = installer;
  }


  public FullAPIDescriptorWidgetsFwdtWin minVersion(String minVersion) {
    this.minVersion = minVersion;
    return this;
  }

   /**
   * Get minVersion
   * @return minVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinVersion() {
    return minVersion;
  }


  @JsonProperty(JSON_PROPERTY_MIN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinVersion(String minVersion) {
    this.minVersion = minVersion;
  }


  /**
   * Return true if this FullAPIDescriptor_widgets_fwdt_win object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIDescriptorWidgetsFwdtWin fullAPIDescriptorWidgetsFwdtWin = (FullAPIDescriptorWidgetsFwdtWin) o;
    return Objects.equals(this.installer, fullAPIDescriptorWidgetsFwdtWin.installer) &&
        Objects.equals(this.minVersion, fullAPIDescriptorWidgetsFwdtWin.minVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installer, minVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIDescriptorWidgetsFwdtWin {\n");
    sb.append("    installer: ").append(toIndentedString(installer)).append("\n");
    sb.append("    minVersion: ").append(toIndentedString(minVersion)).append("\n");
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

    // add `installer` to the URL query string
    if (getInstaller() != null) {
      joiner.add(getInstaller().toUrlQueryString(prefix + "installer" + suffix));
    }

    // add `minVersion` to the URL query string
    if (getMinVersion() != null) {
      joiner.add(String.format("%sminVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

