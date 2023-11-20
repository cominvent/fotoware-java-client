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
import com.cominvent.fotoware.model.FullAPIDescriptorOrderAdminViews;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FullAPIDescriptorOrderAdmin
 */
@JsonPropertyOrder({
  FullAPIDescriptorOrderAdmin.JSON_PROPERTY_HISTORY,
  FullAPIDescriptorOrderAdmin.JSON_PROPERTY_PENDING,
  FullAPIDescriptorOrderAdmin.JSON_PROPERTY_APPROVED,
  FullAPIDescriptorOrderAdmin.JSON_PROPERTY_REJECTED,
  FullAPIDescriptorOrderAdmin.JSON_PROPERTY_VIEWS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class FullAPIDescriptorOrderAdmin {
  public static final String JSON_PROPERTY_HISTORY = "history";
  private String history;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private String pending;

  public static final String JSON_PROPERTY_APPROVED = "approved";
  private String approved;

  public static final String JSON_PROPERTY_REJECTED = "rejected";
  private String rejected;

  public static final String JSON_PROPERTY_VIEWS = "views";
  private FullAPIDescriptorOrderAdminViews views;

  public FullAPIDescriptorOrderAdmin() { 
  }

  public FullAPIDescriptorOrderAdmin history(String history) {
    this.history = history;
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHistory() {
    return history;
  }


  @JsonProperty(JSON_PROPERTY_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHistory(String history) {
    this.history = history;
  }


  public FullAPIDescriptorOrderAdmin pending(String pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPending() {
    return pending;
  }


  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPending(String pending) {
    this.pending = pending;
  }


  public FullAPIDescriptorOrderAdmin approved(String approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApproved() {
    return approved;
  }


  @JsonProperty(JSON_PROPERTY_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApproved(String approved) {
    this.approved = approved;
  }


  public FullAPIDescriptorOrderAdmin rejected(String rejected) {
    this.rejected = rejected;
    return this;
  }

   /**
   * Get rejected
   * @return rejected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRejected() {
    return rejected;
  }


  @JsonProperty(JSON_PROPERTY_REJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejected(String rejected) {
    this.rejected = rejected;
  }


  public FullAPIDescriptorOrderAdmin views(FullAPIDescriptorOrderAdminViews views) {
    this.views = views;
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullAPIDescriptorOrderAdminViews getViews() {
    return views;
  }


  @JsonProperty(JSON_PROPERTY_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViews(FullAPIDescriptorOrderAdminViews views) {
    this.views = views;
  }


  /**
   * Return true if this FullAPIDescriptor_order_admin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIDescriptorOrderAdmin fullAPIDescriptorOrderAdmin = (FullAPIDescriptorOrderAdmin) o;
    return Objects.equals(this.history, fullAPIDescriptorOrderAdmin.history) &&
        Objects.equals(this.pending, fullAPIDescriptorOrderAdmin.pending) &&
        Objects.equals(this.approved, fullAPIDescriptorOrderAdmin.approved) &&
        Objects.equals(this.rejected, fullAPIDescriptorOrderAdmin.rejected) &&
        Objects.equals(this.views, fullAPIDescriptorOrderAdmin.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, pending, approved, rejected, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIDescriptorOrderAdmin {\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

    // add `history` to the URL query string
    if (getHistory() != null) {
      joiner.add(String.format("%shistory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHistory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pending` to the URL query string
    if (getPending() != null) {
      joiner.add(String.format("%spending%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPending()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `approved` to the URL query string
    if (getApproved() != null) {
      joiner.add(String.format("%sapproved%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApproved()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rejected` to the URL query string
    if (getRejected() != null) {
      joiner.add(String.format("%srejected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRejected()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `views` to the URL query string
    if (getViews() != null) {
      joiner.add(getViews().toUrlQueryString(prefix + "views" + suffix));
    }

    return joiner.toString();
  }
}
