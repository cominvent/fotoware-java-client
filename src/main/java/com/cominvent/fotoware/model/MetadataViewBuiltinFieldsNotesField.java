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
 * MetadataViewBuiltinFieldsNotesField
 */
@JsonPropertyOrder({
  MetadataViewBuiltinFieldsNotesField.JSON_PROPERTY_MULTI_INSTANCE,
  MetadataViewBuiltinFieldsNotesField.JSON_PROPERTY_MAX_SIZE,
  MetadataViewBuiltinFieldsNotesField.JSON_PROPERTY_MULTILINE,
  MetadataViewBuiltinFieldsNotesField.JSON_PROPERTY_DATA_TYPE,
  MetadataViewBuiltinFieldsNotesField.JSON_PROPERTY_VALIDATION,
  MetadataViewBuiltinFieldsNotesField.JSON_PROPERTY_ID,
  MetadataViewBuiltinFieldsNotesField.JSON_PROPERTY_LABEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class MetadataViewBuiltinFieldsNotesField {
  public static final String JSON_PROPERTY_MULTI_INSTANCE = "multi-instance";
  private Boolean multiInstance;

  public static final String JSON_PROPERTY_MAX_SIZE = "max-size";
  private Integer maxSize;

  public static final String JSON_PROPERTY_MULTILINE = "multiline";
  private Boolean multiline;

  public static final String JSON_PROPERTY_DATA_TYPE = "data-type";
  private String dataType;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private Object validation;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public MetadataViewBuiltinFieldsNotesField() { 
  }

  public MetadataViewBuiltinFieldsNotesField multiInstance(Boolean multiInstance) {
    this.multiInstance = multiInstance;
    return this;
  }

   /**
   * true if field has zero or more values (bag field). false if field has exactly one value
   * @return multiInstance
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiInstance() {
    return multiInstance;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiInstance(Boolean multiInstance) {
    this.multiInstance = multiInstance;
  }


  public MetadataViewBuiltinFieldsNotesField maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Maximum length of a field of type text.
   * @return maxSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSize() {
    return maxSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  public MetadataViewBuiltinFieldsNotesField multiline(Boolean multiline) {
    this.multiline = multiline;
    return this;
  }

   /**
   * For fields of type text, indicates that input masks should allow multi-line text input
   * @return multiline
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTILINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiline() {
    return multiline;
  }


  @JsonProperty(JSON_PROPERTY_MULTILINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiline(Boolean multiline) {
    this.multiline = multiline;
  }


  public MetadataViewBuiltinFieldsNotesField dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Type of allowed values of the field.
   * @return dataType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public MetadataViewBuiltinFieldsNotesField validation(Object validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValidation() {
    return validation;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidation(Object validation) {
    this.validation = validation;
  }


  public MetadataViewBuiltinFieldsNotesField id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public MetadataViewBuiltinFieldsNotesField label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Localized human-readable display name of the metadata field
   * @return label
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Return true if this MetadataView_builtinFields_notes_field object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataViewBuiltinFieldsNotesField metadataViewBuiltinFieldsNotesField = (MetadataViewBuiltinFieldsNotesField) o;
    return Objects.equals(this.multiInstance, metadataViewBuiltinFieldsNotesField.multiInstance) &&
        Objects.equals(this.maxSize, metadataViewBuiltinFieldsNotesField.maxSize) &&
        Objects.equals(this.multiline, metadataViewBuiltinFieldsNotesField.multiline) &&
        Objects.equals(this.dataType, metadataViewBuiltinFieldsNotesField.dataType) &&
        Objects.equals(this.validation, metadataViewBuiltinFieldsNotesField.validation) &&
        Objects.equals(this.id, metadataViewBuiltinFieldsNotesField.id) &&
        Objects.equals(this.label, metadataViewBuiltinFieldsNotesField.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiInstance, maxSize, multiline, dataType, validation, id, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataViewBuiltinFieldsNotesField {\n");
    sb.append("    multiInstance: ").append(toIndentedString(multiInstance)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    multiline: ").append(toIndentedString(multiline)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

    // add `multi-instance` to the URL query string
    if (getMultiInstance() != null) {
      joiner.add(String.format("%smulti-instance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMultiInstance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max-size` to the URL query string
    if (getMaxSize() != null) {
      joiner.add(String.format("%smax-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `multiline` to the URL query string
    if (getMultiline() != null) {
      joiner.add(String.format("%smultiline%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMultiline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `data-type` to the URL query string
    if (getDataType() != null) {
      joiner.add(String.format("%sdata-type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDataType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `validation` to the URL query string
    if (getValidation() != null) {
      joiner.add(String.format("%svalidation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValidation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format("%slabel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLabel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

