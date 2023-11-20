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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents a complete value of a metadata field
 */
@JsonPropertyOrder({
  MetadataValue.JSON_PROPERTY_S,
  MetadataValue.JSON_PROPERTY_N,
  MetadataValue.JSON_PROPERTY_DT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class MetadataValue {
  public static final String JSON_PROPERTY_S = "s";
  private JsonNullable<String> s = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_N = "n";
  private JsonNullable<Integer> n = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DT = "dt";
  private JsonNullable<String> dt = JsonNullable.<String>undefined();

  public MetadataValue() { 
  }

  public MetadataValue s(String s) {
    this.s = JsonNullable.<String>of(s);
    return this;
  }

   /**
   * String representation of the raw value of the metadata field. It is always present, except for bag fields.
   * @return s
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getS() {
        return s.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getS_JsonNullable() {
    return s;
  }
  
  @JsonProperty(JSON_PROPERTY_S)
  public void setS_JsonNullable(JsonNullable<String> s) {
    this.s = s;
  }

  public void setS(String s) {
    this.s = JsonNullable.<String>of(s);
  }


  public MetadataValue n(Integer n) {
    this.n = JsonNullable.<Integer>of(n);
    return this;
  }

   /**
   * Numeric representation of the value. It is only present if the field is a number field.
   * @return n
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getN() {
        return n.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getN_JsonNullable() {
    return n;
  }
  
  @JsonProperty(JSON_PROPERTY_N)
  public void setN_JsonNullable(JsonNullable<Integer> n) {
    this.n = n;
  }

  public void setN(Integer n) {
    this.n = JsonNullable.<Integer>of(n);
  }


  public MetadataValue dt(String dt) {
    this.dt = JsonNullable.<String>of(dt);
    return this;
  }

   /**
   * Date/time representation of the value. It is only present if the field is a date/time field.
   * @return dt
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDt() {
        return dt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDt_JsonNullable() {
    return dt;
  }
  
  @JsonProperty(JSON_PROPERTY_DT)
  public void setDt_JsonNullable(JsonNullable<String> dt) {
    this.dt = dt;
  }

  public void setDt(String dt) {
    this.dt = JsonNullable.<String>of(dt);
  }


  /**
   * Return true if this MetadataValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataValue metadataValue = (MetadataValue) o;
    return equalsNullable(this.s, metadataValue.s) &&
        equalsNullable(this.n, metadataValue.n) &&
        equalsNullable(this.dt, metadataValue.dt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(s), hashCodeNullable(n), hashCodeNullable(dt));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataValue {\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    dt: ").append(toIndentedString(dt)).append("\n");
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

    // add `s` to the URL query string
    if (getS() != null) {
      joiner.add(String.format("%ss%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getS()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `n` to the URL query string
    if (getN() != null) {
      joiner.add(String.format("%sn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getN()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dt` to the URL query string
    if (getDt() != null) {
      joiner.add(String.format("%sdt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
