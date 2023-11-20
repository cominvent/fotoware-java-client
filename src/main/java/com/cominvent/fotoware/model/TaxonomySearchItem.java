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
import com.cominvent.fotoware.model.TaxonomyAncestors;
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
 * Paged list of taxonomy items with Ancestorrs
 */
@JsonPropertyOrder({
  TaxonomySearchItem.JSON_PROPERTY_NAME,
  TaxonomySearchItem.JSON_PROPERTY_DESCRIPTION,
  TaxonomySearchItem.JSON_PROPERTY_HAS_CHILDREN,
  TaxonomySearchItem.JSON_PROPERTY_FIELD,
  TaxonomySearchItem.JSON_PROPERTY_HREF,
  TaxonomySearchItem.JSON_PROPERTY_TAXONOMY_HREF,
  TaxonomySearchItem.JSON_PROPERTY_ACL,
  TaxonomySearchItem.JSON_PROPERTY_VALUE,
  TaxonomySearchItem.JSON_PROPERTY_CUSTOM_SEARCH,
  TaxonomySearchItem.JSON_PROPERTY_ANCESTORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class TaxonomySearchItem {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

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

  public static final String JSON_PROPERTY_ACL = "acl";
  private List<String> acl;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_CUSTOM_SEARCH = "customSearch";
  private String customSearch;

  public static final String JSON_PROPERTY_ANCESTORS = "ancestors";
  private List<TaxonomyAncestors> ancestors;

  public TaxonomySearchItem() { 
  }

  public TaxonomySearchItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TaxonomySearchItem description(String description) {
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


  public TaxonomySearchItem hasChildren(Boolean hasChildren) {
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


  public TaxonomySearchItem field(Integer field) {
    this.field = field;
    return this;
  }

   /**
   * Numeric ID of metadata field
   * @return field
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(Integer field) {
    this.field = field;
  }


  public TaxonomySearchItem href(String href) {
    this.href = href;
    return this;
  }

   /**
   * URL of this taxonomy item
   * @return href
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public TaxonomySearchItem taxonomyHref(String taxonomyHref) {
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


  public TaxonomySearchItem acl(List<String> acl) {
    this.acl = acl;
    return this;
  }

  public TaxonomySearchItem addAclItem(String aclItem) {
    if (this.acl == null) {
      this.acl = new ArrayList<>();
    }
    this.acl.add(aclItem);
    return this;
  }

   /**
   * Capabilities / access list:   * &#x60;Set&#x60; - The value of this item can be assigned to a field   * &#x60;Query&#x60; - This item can be used in search queries   * &#x60;Navigate&#x60; - Users can browse children of this item   * &#x60;Hint&#x60; - (currently unused) 
   * @return acl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAcl() {
    return acl;
  }


  @JsonProperty(JSON_PROPERTY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcl(List<String> acl) {
    this.acl = acl;
  }


  public TaxonomySearchItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Metadata value (for search)
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public TaxonomySearchItem customSearch(String customSearch) {
    this.customSearch = customSearch;
    return this;
  }

   /**
   * Custom search expression
   * @return customSearch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomSearch() {
    return customSearch;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomSearch(String customSearch) {
    this.customSearch = customSearch;
  }


  public TaxonomySearchItem ancestors(List<TaxonomyAncestors> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  public TaxonomySearchItem addAncestorsItem(TaxonomyAncestors ancestorsItem) {
    if (this.ancestors == null) {
      this.ancestors = new ArrayList<>();
    }
    this.ancestors.add(ancestorsItem);
    return this;
  }

   /**
   * Taxonomy parents of the taxonomy item
   * @return ancestors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANCESTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaxonomyAncestors> getAncestors() {
    return ancestors;
  }


  @JsonProperty(JSON_PROPERTY_ANCESTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAncestors(List<TaxonomyAncestors> ancestors) {
    this.ancestors = ancestors;
  }


  /**
   * Return true if this TaxonomySearchItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxonomySearchItem taxonomySearchItem = (TaxonomySearchItem) o;
    return Objects.equals(this.name, taxonomySearchItem.name) &&
        Objects.equals(this.description, taxonomySearchItem.description) &&
        Objects.equals(this.hasChildren, taxonomySearchItem.hasChildren) &&
        Objects.equals(this.field, taxonomySearchItem.field) &&
        Objects.equals(this.href, taxonomySearchItem.href) &&
        Objects.equals(this.taxonomyHref, taxonomySearchItem.taxonomyHref) &&
        Objects.equals(this.acl, taxonomySearchItem.acl) &&
        Objects.equals(this.value, taxonomySearchItem.value) &&
        Objects.equals(this.customSearch, taxonomySearchItem.customSearch) &&
        Objects.equals(this.ancestors, taxonomySearchItem.ancestors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, hasChildren, field, href, taxonomyHref, acl, value, customSearch, ancestors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxonomySearchItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    taxonomyHref: ").append(toIndentedString(taxonomyHref)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    customSearch: ").append(toIndentedString(customSearch)).append("\n");
    sb.append("    ancestors: ").append(toIndentedString(ancestors)).append("\n");
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

    // add `acl` to the URL query string
    if (getAcl() != null) {
      for (int i = 0; i < getAcl().size(); i++) {
        joiner.add(String.format("%sacl%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAcl().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `customSearch` to the URL query string
    if (getCustomSearch() != null) {
      joiner.add(String.format("%scustomSearch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomSearch()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ancestors` to the URL query string
    if (getAncestors() != null) {
      for (int i = 0; i < getAncestors().size(); i++) {
        if (getAncestors().get(i) != null) {
          joiner.add(getAncestors().get(i).toUrlQueryString(String.format("%sancestors%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}
