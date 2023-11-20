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
import com.cominvent.fotoware.model.TaxonomyItemList;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A taxonomy (including properties and root items)
 */
@JsonPropertyOrder({
  Taxonomy.JSON_PROPERTY_NAME,
  Taxonomy.JSON_PROPERTY_PLURAL_NAME,
  Taxonomy.JSON_PROPERTY_DESCRIPTION,
  Taxonomy.JSON_PROPERTY_HAS_CHILDREN,
  Taxonomy.JSON_PROPERTY_FIELD,
  Taxonomy.JSON_PROPERTY_HREF,
  Taxonomy.JSON_PROPERTY_TAXONOMY_HREF,
  Taxonomy.JSON_PROPERTY_ITEMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class Taxonomy {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLURAL_NAME = "pluralName";
  private String pluralName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HAS_CHILDREN = "hasChildren";
  private Boolean hasChildren;

  public static final String JSON_PROPERTY_FIELD = "field";
  private Integer field;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_TAXONOMY_HREF = "taxonomyHref";
  private String taxonomyHref;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private TaxonomyItemList items;

  public Taxonomy() { 
  }

  public Taxonomy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name
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


  public Taxonomy pluralName(String pluralName) {
    this.pluralName = pluralName;
    return this;
  }

   /**
   * Plural Name
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


  public Taxonomy description(String description) {
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


  public Taxonomy hasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * To know if the item has children
   * @return hasChildren
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasChildren() {
    return hasChildren;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }


  public Taxonomy field(Integer field) {
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


  public Taxonomy href(String href) {
    this.href = href;
    return this;
  }

   /**
   * URL of this taxonomy item
   * @return href
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHref(String href) {
    this.href = href;
  }


  public Taxonomy taxonomyHref(String taxonomyHref) {
    this.taxonomyHref = taxonomyHref;
    return this;
  }

   /**
   * URL of the root of this taxonomy
   * @return taxonomyHref
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXONOMY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxonomyHref() {
    return taxonomyHref;
  }


  @JsonProperty(JSON_PROPERTY_TAXONOMY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxonomyHref(String taxonomyHref) {
    this.taxonomyHref = taxonomyHref;
  }


  public Taxonomy items(TaxonomyItemList items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxonomyItemList getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(TaxonomyItemList items) {
    this.items = items;
  }


  /**
   * Return true if this Taxonomy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Taxonomy taxonomy = (Taxonomy) o;
    return Objects.equals(this.name, taxonomy.name) &&
        Objects.equals(this.pluralName, taxonomy.pluralName) &&
        Objects.equals(this.description, taxonomy.description) &&
        Objects.equals(this.hasChildren, taxonomy.hasChildren) &&
        Objects.equals(this.field, taxonomy.field) &&
        Objects.equals(this.href, taxonomy.href) &&
        Objects.equals(this.taxonomyHref, taxonomy.taxonomyHref) &&
        Objects.equals(this.items, taxonomy.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pluralName, description, hasChildren, field, href, taxonomyHref, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taxonomy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pluralName: ").append(toIndentedString(pluralName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    taxonomyHref: ").append(toIndentedString(taxonomyHref)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

    // add `hasChildren` to the URL query string
    if (getHasChildren() != null) {
      joiner.add(String.format("%shasChildren%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasChildren()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `field` to the URL query string
    if (getField() != null) {
      joiner.add(String.format("%sfield%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getField()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `href` to the URL query string
    if (getHref() != null) {
      joiner.add(String.format("%shref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHref()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `taxonomyHref` to the URL query string
    if (getTaxonomyHref() != null) {
      joiner.add(String.format("%staxonomyHref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxonomyHref()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `items` to the URL query string
    if (getItems() != null) {
      joiner.add(String.format("%sitems%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getItems()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

