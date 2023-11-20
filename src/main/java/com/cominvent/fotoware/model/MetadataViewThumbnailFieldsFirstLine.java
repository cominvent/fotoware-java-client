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
import com.cominvent.fotoware.model.MetadataViewThumbnailFieldsFirstLineField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Description of the metadata field that provides the first line of the long description of a thumbnail
 */
@JsonPropertyOrder({
  MetadataViewThumbnailFieldsFirstLine.JSON_PROPERTY_REQUIRED,
  MetadataViewThumbnailFieldsFirstLine.JSON_PROPERTY_FIELD,
  MetadataViewThumbnailFieldsFirstLine.JSON_PROPERTY_VALUE_STORE,
  MetadataViewThumbnailFieldsFirstLine.JSON_PROPERTY_TAXONOMY_ONLY,
  MetadataViewThumbnailFieldsFirstLine.JSON_PROPERTY_IS_WRITABLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class MetadataViewThumbnailFieldsFirstLine {
  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_FIELD = "field";
  private MetadataViewThumbnailFieldsFirstLineField field;

  public static final String JSON_PROPERTY_VALUE_STORE = "valueStore";
  private String valueStore;

  public static final String JSON_PROPERTY_TAXONOMY_ONLY = "taxonomy-only";
  private Boolean taxonomyOnly;

  public static final String JSON_PROPERTY_IS_WRITABLE = "isWritable";
  private Boolean isWritable;

  public MetadataViewThumbnailFieldsFirstLine() { 
  }

  public MetadataViewThumbnailFieldsFirstLine required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public MetadataViewThumbnailFieldsFirstLine field(MetadataViewThumbnailFieldsFirstLineField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewThumbnailFieldsFirstLineField getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(MetadataViewThumbnailFieldsFirstLineField field) {
    this.field = field;
  }


  public MetadataViewThumbnailFieldsFirstLine valueStore(String valueStore) {
    this.valueStore = valueStore;
    return this;
  }

   /**
   * Get valueStore
   * @return valueStore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueStore() {
    return valueStore;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueStore(String valueStore) {
    this.valueStore = valueStore;
  }


  public MetadataViewThumbnailFieldsFirstLine taxonomyOnly(Boolean taxonomyOnly) {
    this.taxonomyOnly = taxonomyOnly;
    return this;
  }

   /**
   * Get taxonomyOnly
   * @return taxonomyOnly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXONOMY_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTaxonomyOnly() {
    return taxonomyOnly;
  }


  @JsonProperty(JSON_PROPERTY_TAXONOMY_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxonomyOnly(Boolean taxonomyOnly) {
    this.taxonomyOnly = taxonomyOnly;
  }


  public MetadataViewThumbnailFieldsFirstLine isWritable(Boolean isWritable) {
    this.isWritable = isWritable;
    return this;
  }

   /**
   * Get isWritable
   * @return isWritable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_WRITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsWritable() {
    return isWritable;
  }


  @JsonProperty(JSON_PROPERTY_IS_WRITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsWritable(Boolean isWritable) {
    this.isWritable = isWritable;
  }


  /**
   * Return true if this MetadataView_thumbnailFields_firstLine object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataViewThumbnailFieldsFirstLine metadataViewThumbnailFieldsFirstLine = (MetadataViewThumbnailFieldsFirstLine) o;
    return Objects.equals(this.required, metadataViewThumbnailFieldsFirstLine.required) &&
        Objects.equals(this.field, metadataViewThumbnailFieldsFirstLine.field) &&
        Objects.equals(this.valueStore, metadataViewThumbnailFieldsFirstLine.valueStore) &&
        Objects.equals(this.taxonomyOnly, metadataViewThumbnailFieldsFirstLine.taxonomyOnly) &&
        Objects.equals(this.isWritable, metadataViewThumbnailFieldsFirstLine.isWritable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, field, valueStore, taxonomyOnly, isWritable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataViewThumbnailFieldsFirstLine {\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    valueStore: ").append(toIndentedString(valueStore)).append("\n");
    sb.append("    taxonomyOnly: ").append(toIndentedString(taxonomyOnly)).append("\n");
    sb.append("    isWritable: ").append(toIndentedString(isWritable)).append("\n");
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

    // add `required` to the URL query string
    if (getRequired() != null) {
      joiner.add(String.format("%srequired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequired()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `field` to the URL query string
    if (getField() != null) {
      joiner.add(getField().toUrlQueryString(prefix + "field" + suffix));
    }

    // add `valueStore` to the URL query string
    if (getValueStore() != null) {
      joiner.add(String.format("%svalueStore%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValueStore()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `taxonomy-only` to the URL query string
    if (getTaxonomyOnly() != null) {
      joiner.add(String.format("%staxonomy-only%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxonomyOnly()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isWritable` to the URL query string
    if (getIsWritable() != null) {
      joiner.add(String.format("%sisWritable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsWritable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
