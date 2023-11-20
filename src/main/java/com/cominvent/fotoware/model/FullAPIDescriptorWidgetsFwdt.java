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
import com.cominvent.fotoware.model.FullAPIDescriptorWidgetsFwdtOsx;
import com.cominvent.fotoware.model.FullAPIDescriptorWidgetsFwdtServices;
import com.cominvent.fotoware.model.FullAPIDescriptorWidgetsFwdtViews;
import com.cominvent.fotoware.model.FullAPIDescriptorWidgetsFwdtWin;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FullAPIDescriptorWidgetsFwdt
 */
@JsonPropertyOrder({
  FullAPIDescriptorWidgetsFwdt.JSON_PROPERTY_VIEWS,
  FullAPIDescriptorWidgetsFwdt.JSON_PROPERTY_SERVICES,
  FullAPIDescriptorWidgetsFwdt.JSON_PROPERTY_WIN,
  FullAPIDescriptorWidgetsFwdt.JSON_PROPERTY_OSX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class FullAPIDescriptorWidgetsFwdt {
  public static final String JSON_PROPERTY_VIEWS = "views";
  private FullAPIDescriptorWidgetsFwdtViews views;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private FullAPIDescriptorWidgetsFwdtServices services;

  public static final String JSON_PROPERTY_WIN = "win";
  private FullAPIDescriptorWidgetsFwdtWin win;

  public static final String JSON_PROPERTY_OSX = "osx";
  private FullAPIDescriptorWidgetsFwdtOsx osx;

  public FullAPIDescriptorWidgetsFwdt() { 
  }

  public FullAPIDescriptorWidgetsFwdt views(FullAPIDescriptorWidgetsFwdtViews views) {
    this.views = views;
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullAPIDescriptorWidgetsFwdtViews getViews() {
    return views;
  }


  @JsonProperty(JSON_PROPERTY_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViews(FullAPIDescriptorWidgetsFwdtViews views) {
    this.views = views;
  }


  public FullAPIDescriptorWidgetsFwdt services(FullAPIDescriptorWidgetsFwdtServices services) {
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullAPIDescriptorWidgetsFwdtServices getServices() {
    return services;
  }


  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServices(FullAPIDescriptorWidgetsFwdtServices services) {
    this.services = services;
  }


  public FullAPIDescriptorWidgetsFwdt win(FullAPIDescriptorWidgetsFwdtWin win) {
    this.win = win;
    return this;
  }

   /**
   * Get win
   * @return win
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullAPIDescriptorWidgetsFwdtWin getWin() {
    return win;
  }


  @JsonProperty(JSON_PROPERTY_WIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWin(FullAPIDescriptorWidgetsFwdtWin win) {
    this.win = win;
  }


  public FullAPIDescriptorWidgetsFwdt osx(FullAPIDescriptorWidgetsFwdtOsx osx) {
    this.osx = osx;
    return this;
  }

   /**
   * Get osx
   * @return osx
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OSX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullAPIDescriptorWidgetsFwdtOsx getOsx() {
    return osx;
  }


  @JsonProperty(JSON_PROPERTY_OSX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsx(FullAPIDescriptorWidgetsFwdtOsx osx) {
    this.osx = osx;
  }


  /**
   * Return true if this FullAPIDescriptor_widgets_fwdt object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIDescriptorWidgetsFwdt fullAPIDescriptorWidgetsFwdt = (FullAPIDescriptorWidgetsFwdt) o;
    return Objects.equals(this.views, fullAPIDescriptorWidgetsFwdt.views) &&
        Objects.equals(this.services, fullAPIDescriptorWidgetsFwdt.services) &&
        Objects.equals(this.win, fullAPIDescriptorWidgetsFwdt.win) &&
        Objects.equals(this.osx, fullAPIDescriptorWidgetsFwdt.osx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(views, services, win, osx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIDescriptorWidgetsFwdt {\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    win: ").append(toIndentedString(win)).append("\n");
    sb.append("    osx: ").append(toIndentedString(osx)).append("\n");
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

    // add `views` to the URL query string
    if (getViews() != null) {
      joiner.add(getViews().toUrlQueryString(prefix + "views" + suffix));
    }

    // add `services` to the URL query string
    if (getServices() != null) {
      joiner.add(getServices().toUrlQueryString(prefix + "services" + suffix));
    }

    // add `win` to the URL query string
    if (getWin() != null) {
      joiner.add(getWin().toUrlQueryString(prefix + "win" + suffix));
    }

    // add `osx` to the URL query string
    if (getOsx() != null) {
      joiner.add(getOsx().toUrlQueryString(prefix + "osx" + suffix));
    }

    return joiner.toString();
  }
}
