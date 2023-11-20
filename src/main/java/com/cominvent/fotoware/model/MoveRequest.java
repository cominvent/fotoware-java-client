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
import com.cominvent.fotoware.model.ActionRequestAssetsInner;
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
 * Receive a list of available destinations using the move-to endpoint from the API descriptor
 */
@JsonPropertyOrder({
  MoveRequest.JSON_PROPERTY_ASSETS,
  MoveRequest.JSON_PROPERTY_JOB_DESTINATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class MoveRequest {
  public static final String JSON_PROPERTY_ASSETS = "assets";
  private List<ActionRequestAssetsInner> assets;

  public static final String JSON_PROPERTY_JOB_DESTINATION = "job-destination";
  private String jobDestination;

  public MoveRequest() { 
  }

  public MoveRequest assets(List<ActionRequestAssetsInner> assets) {
    this.assets = assets;
    return this;
  }

  public MoveRequest addAssetsItem(ActionRequestAssetsInner assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ActionRequestAssetsInner> getAssets() {
    return assets;
  }


  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssets(List<ActionRequestAssetsInner> assets) {
    this.assets = assets;
  }


  public MoveRequest jobDestination(String jobDestination) {
    this.jobDestination = jobDestination;
    return this;
  }

   /**
   * Get jobDestination
   * @return jobDestination
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobDestination() {
    return jobDestination;
  }


  @JsonProperty(JSON_PROPERTY_JOB_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobDestination(String jobDestination) {
    this.jobDestination = jobDestination;
  }


  /**
   * Return true if this MoveRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveRequest moveRequest = (MoveRequest) o;
    return Objects.equals(this.assets, moveRequest.assets) &&
        Objects.equals(this.jobDestination, moveRequest.jobDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, jobDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveRequest {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    jobDestination: ").append(toIndentedString(jobDestination)).append("\n");
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

    // add `assets` to the URL query string
    if (getAssets() != null) {
      for (int i = 0; i < getAssets().size(); i++) {
        if (getAssets().get(i) != null) {
          joiner.add(getAssets().get(i).toUrlQueryString(String.format("%sassets%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `job-destination` to the URL query string
    if (getJobDestination() != null) {
      joiner.add(String.format("%sjob-destination%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJobDestination()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

