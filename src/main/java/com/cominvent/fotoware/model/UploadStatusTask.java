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
 * Task info
 */
@JsonPropertyOrder({
  UploadStatusTask.JSON_PROPERTY_CREATED,
  UploadStatusTask.JSON_PROPERTY_MODIFIED,
  UploadStatusTask.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class UploadStatusTask {
  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public UploadStatusTask() { 
  }

  public UploadStatusTask created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Time when task was created. Date/time (ISO 8601 string)
   * @return created
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(String created) {
    this.created = created;
  }


  public UploadStatusTask modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Time when task was modified. Date/time (ISO 8601 string)
   * @return modified
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModified() {
    return modified;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModified(String modified) {
    this.modified = modified;
  }


  public UploadStatusTask type(String type) {
    this.type = type;
    return this;
  }

   /**
   * For upload status this will always be upload
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


  /**
   * Return true if this UploadStatus_task object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadStatusTask uploadStatusTask = (UploadStatusTask) o;
    return Objects.equals(this.created, uploadStatusTask.created) &&
        Objects.equals(this.modified, uploadStatusTask.modified) &&
        Objects.equals(this.type, uploadStatusTask.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, modified, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadStatusTask {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `modified` to the URL query string
    if (getModified() != null) {
      joiner.add(String.format("%smodified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModified()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
