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
import com.cominvent.fotoware.model.MetadataViewThumbnailFieldsFirstLine;
import com.cominvent.fotoware.model.MetadataViewThumbnailFieldsLabel;
import com.cominvent.fotoware.model.MetadataViewThumbnailFieldsSecondLine;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes metadata fields that are shown in thumbnails
 */
@JsonPropertyOrder({
  MetadataViewThumbnailFields.JSON_PROPERTY_SECOND_LINE,
  MetadataViewThumbnailFields.JSON_PROPERTY_FIRST_LINE,
  MetadataViewThumbnailFields.JSON_PROPERTY_LABEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class MetadataViewThumbnailFields {
  public static final String JSON_PROPERTY_SECOND_LINE = "secondLine";
  private MetadataViewThumbnailFieldsSecondLine secondLine;

  public static final String JSON_PROPERTY_FIRST_LINE = "firstLine";
  private MetadataViewThumbnailFieldsFirstLine firstLine;

  public static final String JSON_PROPERTY_LABEL = "label";
  private MetadataViewThumbnailFieldsLabel label;

  public MetadataViewThumbnailFields() { 
  }

  public MetadataViewThumbnailFields secondLine(MetadataViewThumbnailFieldsSecondLine secondLine) {
    this.secondLine = secondLine;
    return this;
  }

   /**
   * Get secondLine
   * @return secondLine
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECOND_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewThumbnailFieldsSecondLine getSecondLine() {
    return secondLine;
  }


  @JsonProperty(JSON_PROPERTY_SECOND_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondLine(MetadataViewThumbnailFieldsSecondLine secondLine) {
    this.secondLine = secondLine;
  }


  public MetadataViewThumbnailFields firstLine(MetadataViewThumbnailFieldsFirstLine firstLine) {
    this.firstLine = firstLine;
    return this;
  }

   /**
   * Get firstLine
   * @return firstLine
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewThumbnailFieldsFirstLine getFirstLine() {
    return firstLine;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstLine(MetadataViewThumbnailFieldsFirstLine firstLine) {
    this.firstLine = firstLine;
  }


  public MetadataViewThumbnailFields label(MetadataViewThumbnailFieldsLabel label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewThumbnailFieldsLabel getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(MetadataViewThumbnailFieldsLabel label) {
    this.label = label;
  }


  /**
   * Return true if this MetadataView_thumbnailFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataViewThumbnailFields metadataViewThumbnailFields = (MetadataViewThumbnailFields) o;
    return Objects.equals(this.secondLine, metadataViewThumbnailFields.secondLine) &&
        Objects.equals(this.firstLine, metadataViewThumbnailFields.firstLine) &&
        Objects.equals(this.label, metadataViewThumbnailFields.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondLine, firstLine, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataViewThumbnailFields {\n");
    sb.append("    secondLine: ").append(toIndentedString(secondLine)).append("\n");
    sb.append("    firstLine: ").append(toIndentedString(firstLine)).append("\n");
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

    // add `secondLine` to the URL query string
    if (getSecondLine() != null) {
      joiner.add(getSecondLine().toUrlQueryString(prefix + "secondLine" + suffix));
    }

    // add `firstLine` to the URL query string
    if (getFirstLine() != null) {
      joiner.add(getFirstLine().toUrlQueryString(prefix + "firstLine" + suffix));
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(getLabel().toUrlQueryString(prefix + "label" + suffix));
    }

    return joiner.toString();
  }
}

