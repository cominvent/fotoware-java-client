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
import com.cominvent.fotoware.model.MetadataViewBuiltinFieldsDescription;
import com.cominvent.fotoware.model.MetadataViewBuiltinFieldsNotes;
import com.cominvent.fotoware.model.MetadataViewBuiltinFieldsRating;
import com.cominvent.fotoware.model.MetadataViewBuiltinFieldsStatus;
import com.cominvent.fotoware.model.MetadataViewBuiltinFieldsTags;
import com.cominvent.fotoware.model.MetadataViewBuiltinFieldsTitle;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes metadata fields with special semantic roles, such as the title or description of an asset.
 */
@JsonPropertyOrder({
  MetadataViewBuiltinFields.JSON_PROPERTY_NOTES,
  MetadataViewBuiltinFields.JSON_PROPERTY_TAGS,
  MetadataViewBuiltinFields.JSON_PROPERTY_STATUS,
  MetadataViewBuiltinFields.JSON_PROPERTY_RATING,
  MetadataViewBuiltinFields.JSON_PROPERTY_DESCRIPTION,
  MetadataViewBuiltinFields.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetadataViewBuiltinFields {
  public static final String JSON_PROPERTY_NOTES = "notes";
  private MetadataViewBuiltinFieldsNotes notes;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private MetadataViewBuiltinFieldsTags tags;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MetadataViewBuiltinFieldsStatus status;

  public static final String JSON_PROPERTY_RATING = "rating";
  private MetadataViewBuiltinFieldsRating rating;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private MetadataViewBuiltinFieldsDescription description;

  public static final String JSON_PROPERTY_TITLE = "title";
  private MetadataViewBuiltinFieldsTitle title;

  public MetadataViewBuiltinFields() { 
  }

  public MetadataViewBuiltinFields notes(MetadataViewBuiltinFieldsNotes notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewBuiltinFieldsNotes getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(MetadataViewBuiltinFieldsNotes notes) {
    this.notes = notes;
  }


  public MetadataViewBuiltinFields tags(MetadataViewBuiltinFieldsTags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewBuiltinFieldsTags getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(MetadataViewBuiltinFieldsTags tags) {
    this.tags = tags;
  }


  public MetadataViewBuiltinFields status(MetadataViewBuiltinFieldsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewBuiltinFieldsStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(MetadataViewBuiltinFieldsStatus status) {
    this.status = status;
  }


  public MetadataViewBuiltinFields rating(MetadataViewBuiltinFieldsRating rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewBuiltinFieldsRating getRating() {
    return rating;
  }


  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRating(MetadataViewBuiltinFieldsRating rating) {
    this.rating = rating;
  }


  public MetadataViewBuiltinFields description(MetadataViewBuiltinFieldsDescription description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewBuiltinFieldsDescription getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(MetadataViewBuiltinFieldsDescription description) {
    this.description = description;
  }


  public MetadataViewBuiltinFields title(MetadataViewBuiltinFieldsTitle title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetadataViewBuiltinFieldsTitle getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(MetadataViewBuiltinFieldsTitle title) {
    this.title = title;
  }


  /**
   * Return true if this MetadataView_builtinFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataViewBuiltinFields metadataViewBuiltinFields = (MetadataViewBuiltinFields) o;
    return Objects.equals(this.notes, metadataViewBuiltinFields.notes) &&
        Objects.equals(this.tags, metadataViewBuiltinFields.tags) &&
        Objects.equals(this.status, metadataViewBuiltinFields.status) &&
        Objects.equals(this.rating, metadataViewBuiltinFields.rating) &&
        Objects.equals(this.description, metadataViewBuiltinFields.description) &&
        Objects.equals(this.title, metadataViewBuiltinFields.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, tags, status, rating, description, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataViewBuiltinFields {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

    // add `notes` to the URL query string
    if (getNotes() != null) {
      joiner.add(getNotes().toUrlQueryString(prefix + "notes" + suffix));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(getTags().toUrlQueryString(prefix + "tags" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(getStatus().toUrlQueryString(prefix + "status" + suffix));
    }

    // add `rating` to the URL query string
    if (getRating() != null) {
      joiner.add(getRating().toUrlQueryString(prefix + "rating" + suffix));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(getDescription().toUrlQueryString(prefix + "description" + suffix));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(getTitle().toUrlQueryString(prefix + "title" + suffix));
    }

    return joiner.toString();
  }
}

