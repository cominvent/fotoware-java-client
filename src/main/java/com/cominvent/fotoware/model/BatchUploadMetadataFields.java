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
 * API model to describe the metadata fields updated in the upload
 */
@JsonPropertyOrder({
  BatchUploadMetadataFields.JSON_PROPERTY_ID,
  BatchUploadMetadataFields.JSON_PROPERTY_ACTION,
  BatchUploadMetadataFields.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class BatchUploadMetadataFields {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  /**
   * Metadata action to perform
   */
  public enum ActionEnum {
    ADD("add"),
    
    APPEND("append"),
    
    PREPEND("prepend"),
    
    ERASE("erase");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action = ActionEnum.ADD;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public BatchUploadMetadataFields() { 
  }

  public BatchUploadMetadataFields id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Numeric ID of the destination metadata field
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public BatchUploadMetadataFields action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Metadata action to perform
   * @return action
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public BatchUploadMetadataFields value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Metadata value(s) to set or add. This parameter is optional or required, depending on the action. Depending on the action and field type, this can be a single value (given as a string) or zero or multiple values (given as an array of strings). 
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * Return true if this BatchUploadMetadataFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUploadMetadataFields batchUploadMetadataFields = (BatchUploadMetadataFields) o;
    return Objects.equals(this.id, batchUploadMetadataFields.id) &&
        Objects.equals(this.action, batchUploadMetadataFields.action) &&
        Objects.equals(this.value, batchUploadMetadataFields.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUploadMetadataFields {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `action` to the URL query string
    if (getAction() != null) {
      joiner.add(String.format("%saction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAction()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
