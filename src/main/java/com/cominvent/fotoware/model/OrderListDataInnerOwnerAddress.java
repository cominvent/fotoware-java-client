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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrderListDataInnerOwnerAddress
 */
@JsonPropertyOrder({
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_HOMEPAGE,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_BUSINESS_TYPE,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_FIRST_NAME,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_COUNTRY,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_ZIP_CODE,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_PHONE,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_STATE,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_LAST_NAME,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_ORGANIZATION,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_CITY,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_INITIAL,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_PROFESSION,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_STREET_ADDRESS,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_TITLE,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_FAX,
  OrderListDataInnerOwnerAddress.JSON_PROPERTY_EMAIL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderListDataInnerOwnerAddress {
  public static final String JSON_PROPERTY_HOMEPAGE = "homepage";
  private String homepage;

  public static final String JSON_PROPERTY_BUSINESS_TYPE = "businessType";
  private String businessType;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private String organization;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_INITIAL = "initial";
  private String initial;

  public static final String JSON_PROPERTY_PROFESSION = "profession";
  private String profession;

  public static final String JSON_PROPERTY_STREET_ADDRESS = "streetAddress";
  private List<Object> streetAddress;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_FAX = "fax";
  private String fax;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public OrderListDataInnerOwnerAddress() { 
  }

  public OrderListDataInnerOwnerAddress homepage(String homepage) {
    this.homepage = homepage;
    return this;
  }

   /**
   * Get homepage
   * @return homepage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHomepage() {
    return homepage;
  }


  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }


  public OrderListDataInnerOwnerAddress businessType(String businessType) {
    this.businessType = businessType;
    return this;
  }

   /**
   * Get businessType
   * @return businessType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessType() {
    return businessType;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public OrderListDataInnerOwnerAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public OrderListDataInnerOwnerAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public OrderListDataInnerOwnerAddress zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public OrderListDataInnerOwnerAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public OrderListDataInnerOwnerAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public OrderListDataInnerOwnerAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public OrderListDataInnerOwnerAddress organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public OrderListDataInnerOwnerAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public OrderListDataInnerOwnerAddress initial(String initial) {
    this.initial = initial;
    return this;
  }

   /**
   * Get initial
   * @return initial
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInitial() {
    return initial;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitial(String initial) {
    this.initial = initial;
  }


  public OrderListDataInnerOwnerAddress profession(String profession) {
    this.profession = profession;
    return this;
  }

   /**
   * Get profession
   * @return profession
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfession() {
    return profession;
  }


  @JsonProperty(JSON_PROPERTY_PROFESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfession(String profession) {
    this.profession = profession;
  }


  public OrderListDataInnerOwnerAddress streetAddress(List<Object> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  public OrderListDataInnerOwnerAddress addStreetAddressItem(Object streetAddressItem) {
    if (this.streetAddress == null) {
      this.streetAddress = new ArrayList<>();
    }
    this.streetAddress.add(streetAddressItem);
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getStreetAddress() {
    return streetAddress;
  }


  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetAddress(List<Object> streetAddress) {
    this.streetAddress = streetAddress;
  }


  public OrderListDataInnerOwnerAddress title(String title) {
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

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public OrderListDataInnerOwnerAddress fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFax() {
    return fax;
  }


  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFax(String fax) {
    this.fax = fax;
  }


  public OrderListDataInnerOwnerAddress email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Return true if this OrderList_data_inner_owner_address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderListDataInnerOwnerAddress orderListDataInnerOwnerAddress = (OrderListDataInnerOwnerAddress) o;
    return Objects.equals(this.homepage, orderListDataInnerOwnerAddress.homepage) &&
        Objects.equals(this.businessType, orderListDataInnerOwnerAddress.businessType) &&
        Objects.equals(this.firstName, orderListDataInnerOwnerAddress.firstName) &&
        Objects.equals(this.country, orderListDataInnerOwnerAddress.country) &&
        Objects.equals(this.zipCode, orderListDataInnerOwnerAddress.zipCode) &&
        Objects.equals(this.phone, orderListDataInnerOwnerAddress.phone) &&
        Objects.equals(this.state, orderListDataInnerOwnerAddress.state) &&
        Objects.equals(this.lastName, orderListDataInnerOwnerAddress.lastName) &&
        Objects.equals(this.organization, orderListDataInnerOwnerAddress.organization) &&
        Objects.equals(this.city, orderListDataInnerOwnerAddress.city) &&
        Objects.equals(this.initial, orderListDataInnerOwnerAddress.initial) &&
        Objects.equals(this.profession, orderListDataInnerOwnerAddress.profession) &&
        Objects.equals(this.streetAddress, orderListDataInnerOwnerAddress.streetAddress) &&
        Objects.equals(this.title, orderListDataInnerOwnerAddress.title) &&
        Objects.equals(this.fax, orderListDataInnerOwnerAddress.fax) &&
        Objects.equals(this.email, orderListDataInnerOwnerAddress.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homepage, businessType, firstName, country, zipCode, phone, state, lastName, organization, city, initial, profession, streetAddress, title, fax, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListDataInnerOwnerAddress {\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

    // add `homepage` to the URL query string
    if (getHomepage() != null) {
      joiner.add(String.format("%shomepage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHomepage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `businessType` to the URL query string
    if (getBusinessType() != null) {
      joiner.add(String.format("%sbusinessType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      joiner.add(String.format("%sfirstName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `zipCode` to the URL query string
    if (getZipCode() != null) {
      joiner.add(String.format("%szipCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getZipCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(String.format("%sphone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lastName` to the URL query string
    if (getLastName() != null) {
      joiner.add(String.format("%slastName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `organization` to the URL query string
    if (getOrganization() != null) {
      joiner.add(String.format("%sorganization%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrganization()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `city` to the URL query string
    if (getCity() != null) {
      joiner.add(String.format("%scity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `initial` to the URL query string
    if (getInitial() != null) {
      joiner.add(String.format("%sinitial%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInitial()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `profession` to the URL query string
    if (getProfession() != null) {
      joiner.add(String.format("%sprofession%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfession()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `streetAddress` to the URL query string
    if (getStreetAddress() != null) {
      for (int i = 0; i < getStreetAddress().size(); i++) {
        joiner.add(String.format("%sstreetAddress%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getStreetAddress().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fax` to the URL query string
    if (getFax() != null) {
      joiner.add(String.format("%sfax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFax()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

