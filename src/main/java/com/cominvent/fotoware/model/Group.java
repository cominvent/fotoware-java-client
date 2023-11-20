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
import com.cominvent.fotoware.model.ExternalId;
import com.cominvent.fotoware.model.GroupPermissions;
import com.cominvent.fotoware.model.MemberProperty;
import com.cominvent.fotoware.model.UserLicenseSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Group properties
 */
@JsonPropertyOrder({
  Group.JSON_PROPERTY_IS_EVERYONE,
  Group.JSON_PROPERTY_IS_REGISTERED_USERS,
  Group.JSON_PROPERTY_IS_BUILT_IN,
  Group.JSON_PROPERTY_ID,
  Group.JSON_PROPERTY_CREATED,
  Group.JSON_PROPERTY_MODIFIED,
  Group.JSON_PROPERTY_REVISION,
  Group.JSON_PROPERTY_NAME,
  Group.JSON_PROPERTY_DESCRIPTION,
  Group.JSON_PROPERTY_LICENSE,
  Group.JSON_PROPERTY_PERMISSIONS,
  Group.JSON_PROPERTY_PROPERTIES,
  Group.JSON_PROPERTY_EXTERNAL_IDS,
  Group.JSON_PROPERTY_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Group {
  public static final String JSON_PROPERTY_IS_EVERYONE = "isEveryone";
  private Boolean isEveryone;

  public static final String JSON_PROPERTY_IS_REGISTERED_USERS = "isRegisteredUsers";
  private Boolean isRegisteredUsers;

  public static final String JSON_PROPERTY_IS_BUILT_IN = "isBuiltIn";
  private Boolean isBuiltIn;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private Integer revision;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LICENSE = "license";
  private UserLicenseSettings license;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private GroupPermissions permissions;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<MemberProperty> properties = new ArrayList<>();

  public static final String JSON_PROPERTY_EXTERNAL_IDS = "externalIds";
  private List<ExternalId> externalIds = new ArrayList<>();

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private OffsetDateTime deleted;

  public Group() { 
  }

  @JsonCreator
  public Group(
    @JsonProperty(JSON_PROPERTY_IS_EVERYONE) Boolean isEveryone, 
    @JsonProperty(JSON_PROPERTY_IS_REGISTERED_USERS) Boolean isRegisteredUsers, 
    @JsonProperty(JSON_PROPERTY_IS_BUILT_IN) Boolean isBuiltIn, 
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_CREATED) OffsetDateTime created, 
    @JsonProperty(JSON_PROPERTY_MODIFIED) OffsetDateTime modified, 
    @JsonProperty(JSON_PROPERTY_REVISION) Integer revision
  ) {
  this();
    this.isEveryone = isEveryone;
    this.isRegisteredUsers = isRegisteredUsers;
    this.isBuiltIn = isBuiltIn;
    this.id = id;
    this.created = created;
    this.modified = modified;
    this.revision = revision;
  }

   /**
   * Group is the built-in group of everyone (including guest)
   * @return isEveryone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_EVERYONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEveryone() {
    return isEveryone;
  }




   /**
   * Group is the built-in group of all registered users (not including guest)
   * @return isRegisteredUsers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REGISTERED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRegisteredUsers() {
    return isRegisteredUsers;
  }




   /**
   * Group is built-in
   * @return isBuiltIn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }




   /**
   * Group ID
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }




   /**
   * Timestamp when the group was created
   * @return created
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * Timestamp when the group was modified the last time
   * @return modified
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModified() {
    return modified;
  }




   /**
   * Revision
   * @return revision
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRevision() {
    return revision;
  }




  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name
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


  public Group description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Group description
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


  public Group license(UserLicenseSettings license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UserLicenseSettings getLicense() {
    return license;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLicense(UserLicenseSettings license) {
    this.license = license;
  }


  public Group permissions(GroupPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GroupPermissions getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermissions(GroupPermissions permissions) {
    this.permissions = permissions;
  }


  public Group properties(List<MemberProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Group addPropertiesItem(MemberProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Custom properties
   * @return properties
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MemberProperty> getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProperties(List<MemberProperty> properties) {
    this.properties = properties;
  }


  public Group externalIds(List<ExternalId> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public Group addExternalIdsItem(ExternalId externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new ArrayList<>();
    }
    this.externalIds.add(externalIdsItem);
    return this;
  }

   /**
   * External IDs for SSO
   * @return externalIds
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ExternalId> getExternalIds() {
    return externalIds;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalIds(List<ExternalId> externalIds) {
    this.externalIds = externalIds;
  }


  public Group deleted(OffsetDateTime deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Deletion time (if group is marked as deleted in database)
   * @return deleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(OffsetDateTime deleted) {
    this.deleted = deleted;
  }


  /**
   * Return true if this Group object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.isEveryone, group.isEveryone) &&
        Objects.equals(this.isRegisteredUsers, group.isRegisteredUsers) &&
        Objects.equals(this.isBuiltIn, group.isBuiltIn) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.created, group.created) &&
        Objects.equals(this.modified, group.modified) &&
        Objects.equals(this.revision, group.revision) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.license, group.license) &&
        Objects.equals(this.permissions, group.permissions) &&
        Objects.equals(this.properties, group.properties) &&
        Objects.equals(this.externalIds, group.externalIds) &&
        Objects.equals(this.deleted, group.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEveryone, isRegisteredUsers, isBuiltIn, id, created, modified, revision, name, description, license, permissions, properties, externalIds, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    isEveryone: ").append(toIndentedString(isEveryone)).append("\n");
    sb.append("    isRegisteredUsers: ").append(toIndentedString(isRegisteredUsers)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

    // add `isEveryone` to the URL query string
    if (getIsEveryone() != null) {
      joiner.add(String.format("%sisEveryone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsEveryone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isRegisteredUsers` to the URL query string
    if (getIsRegisteredUsers() != null) {
      joiner.add(String.format("%sisRegisteredUsers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsRegisteredUsers()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isBuiltIn` to the URL query string
    if (getIsBuiltIn() != null) {
      joiner.add(String.format("%sisBuiltIn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsBuiltIn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `modified` to the URL query string
    if (getModified() != null) {
      joiner.add(String.format("%smodified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModified()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `revision` to the URL query string
    if (getRevision() != null) {
      joiner.add(String.format("%srevision%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRevision()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `license` to the URL query string
    if (getLicense() != null) {
      joiner.add(getLicense().toUrlQueryString(prefix + "license" + suffix));
    }

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      joiner.add(getPermissions().toUrlQueryString(prefix + "permissions" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      for (int i = 0; i < getProperties().size(); i++) {
        if (getProperties().get(i) != null) {
          joiner.add(getProperties().get(i).toUrlQueryString(String.format("%sproperties%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `externalIds` to the URL query string
    if (getExternalIds() != null) {
      for (int i = 0; i < getExternalIds().size(); i++) {
        if (getExternalIds().get(i) != null) {
          joiner.add(getExternalIds().get(i).toUrlQueryString(String.format("%sexternalIds%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `deleted` to the URL query string
    if (getDeleted() != null) {
      joiner.add(String.format("%sdeleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeleted()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

