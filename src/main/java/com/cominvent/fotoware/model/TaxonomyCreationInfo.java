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
 * Properties to create a taxonomy field
 */
@JsonPropertyOrder({
  TaxonomyCreationInfo.JSON_PROPERTY_FIELD,
  TaxonomyCreationInfo.JSON_PROPERTY_NAME,
  TaxonomyCreationInfo.JSON_PROPERTY_PLURAL_NAME,
  TaxonomyCreationInfo.JSON_PROPERTY_DESCRIPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaxonomyCreationInfo {
  public static final String JSON_PROPERTY_FIELD = "field";
  private Integer field;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLURAL_NAME = "pluralName";
  private String pluralName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public TaxonomyCreationInfo() { 
  }

  public TaxonomyCreationInfo field(Integer field) {
    this.field = field;
    return this;
  }

   /**
   * Numeric ID of metadata field
   * @return field
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setField(Integer field) {
    this.field = field;
  }


  public TaxonomyCreationInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Taxonomy Name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TaxonomyCreationInfo pluralName(String pluralName) {
    this.pluralName = pluralName;
    return this;
  }

   /**
   * Display name
   * @return pluralName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLURAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPluralName() {
    return pluralName;
  }


  @JsonProperty(JSON_PROPERTY_PLURAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPluralName(String pluralName) {
    this.pluralName = pluralName;
  }


  public TaxonomyCreationInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this TaxonomyCreationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxonomyCreationInfo taxonomyCreationInfo = (TaxonomyCreationInfo) o;
    return Objects.equals(this.field, taxonomyCreationInfo.field) &&
        Objects.equals(this.name, taxonomyCreationInfo.name) &&
        Objects.equals(this.pluralName, taxonomyCreationInfo.pluralName) &&
        Objects.equals(this.description, taxonomyCreationInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, name, pluralName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxonomyCreationInfo {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pluralName: ").append(toIndentedString(pluralName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `field` to the URL query string
    if (getField() != null) {
      joiner.add(String.format("%sfield%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getField()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pluralName` to the URL query string
    if (getPluralName() != null) {
      joiner.add(String.format("%spluralName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPluralName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

