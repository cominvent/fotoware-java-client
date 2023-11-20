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
import com.cominvent.fotoware.model.FullAPIDescriptorPermissionsAlbums;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FullAPIDescriptorPermissions
 */
@JsonPropertyOrder({
  FullAPIDescriptorPermissions.JSON_PROPERTY_DELEGATE_DOWNLOAD,
  FullAPIDescriptorPermissions.JSON_PROPERTY_MODERATE_COMMENTS,
  FullAPIDescriptorPermissions.JSON_PROPERTY_CAN_TOGGLE_POSITIONED_MARKERS,
  FullAPIDescriptorPermissions.JSON_PROPERTY_CAN_MANAGE_EXPORTS,
  FullAPIDescriptorPermissions.JSON_PROPERTY_HAS_ADVANCED_VIDEO_CONTROLS,
  FullAPIDescriptorPermissions.JSON_PROPERTY_HAS_MANAGE_ARCHIVES_PERMISSION,
  FullAPIDescriptorPermissions.JSON_PROPERTY_HAS_MANAGE_SERVICES_PERMISSION,
  FullAPIDescriptorPermissions.JSON_PROPERTY_HAS_MANAGE_SETTINGS_PERMISSION,
  FullAPIDescriptorPermissions.JSON_PROPERTY_ALLOW_RETRANSCODE,
  FullAPIDescriptorPermissions.JSON_PROPERTY_SHOW_ADVANCED_BREADCRUMB,
  FullAPIDescriptorPermissions.JSON_PROPERTY_SHARE_CROP_AND_DOWNLOAD_PRESETS,
  FullAPIDescriptorPermissions.JSON_PROPERTY_PRINT,
  FullAPIDescriptorPermissions.JSON_PROPERTY_HAS_AUDIT_PERMISSION,
  FullAPIDescriptorPermissions.JSON_PROPERTY_ALBUMS,
  FullAPIDescriptorPermissions.JSON_PROPERTY_CAN_LINK_IN_ADOBE_C_C,
  FullAPIDescriptorPermissions.JSON_PROPERTY_ALLOW_TAXONOMY_EDITING,
  FullAPIDescriptorPermissions.JSON_PROPERTY_ALLOW_SHARE_BOOKMARK,
  FullAPIDescriptorPermissions.JSON_PROPERTY_HAS_MANAGE_WORKFLOWS_PERMISSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class FullAPIDescriptorPermissions {
  public static final String JSON_PROPERTY_DELEGATE_DOWNLOAD = "delegateDownload";
  private Boolean delegateDownload;

  public static final String JSON_PROPERTY_MODERATE_COMMENTS = "moderateComments";
  private Boolean moderateComments;

  public static final String JSON_PROPERTY_CAN_TOGGLE_POSITIONED_MARKERS = "canTogglePositionedMarkers";
  private Boolean canTogglePositionedMarkers;

  public static final String JSON_PROPERTY_CAN_MANAGE_EXPORTS = "canManageExports";
  private Boolean canManageExports;

  public static final String JSON_PROPERTY_HAS_ADVANCED_VIDEO_CONTROLS = "hasAdvancedVideoControls";
  private Boolean hasAdvancedVideoControls;

  public static final String JSON_PROPERTY_HAS_MANAGE_ARCHIVES_PERMISSION = "hasManageArchivesPermission";
  private Boolean hasManageArchivesPermission;

  public static final String JSON_PROPERTY_HAS_MANAGE_SERVICES_PERMISSION = "hasManageServicesPermission";
  private Boolean hasManageServicesPermission;

  public static final String JSON_PROPERTY_HAS_MANAGE_SETTINGS_PERMISSION = "hasManageSettingsPermission";
  private Boolean hasManageSettingsPermission;

  public static final String JSON_PROPERTY_ALLOW_RETRANSCODE = "allowRetranscode";
  private Boolean allowRetranscode;

  public static final String JSON_PROPERTY_SHOW_ADVANCED_BREADCRUMB = "showAdvancedBreadcrumb";
  private Boolean showAdvancedBreadcrumb;

  public static final String JSON_PROPERTY_SHARE_CROP_AND_DOWNLOAD_PRESETS = "shareCropAndDownloadPresets";
  private Boolean shareCropAndDownloadPresets;

  public static final String JSON_PROPERTY_PRINT = "print";
  private Boolean print;

  public static final String JSON_PROPERTY_HAS_AUDIT_PERMISSION = "hasAuditPermission";
  private Boolean hasAuditPermission;

  public static final String JSON_PROPERTY_ALBUMS = "albums";
  private FullAPIDescriptorPermissionsAlbums albums;

  public static final String JSON_PROPERTY_CAN_LINK_IN_ADOBE_C_C = "canLinkInAdobeCC";
  private Boolean canLinkInAdobeCC;

  public static final String JSON_PROPERTY_ALLOW_TAXONOMY_EDITING = "allowTaxonomyEditing";
  private Boolean allowTaxonomyEditing;

  public static final String JSON_PROPERTY_ALLOW_SHARE_BOOKMARK = "allowShareBookmark";
  private Boolean allowShareBookmark;

  public static final String JSON_PROPERTY_HAS_MANAGE_WORKFLOWS_PERMISSION = "hasManageWorkflowsPermission";
  private Boolean hasManageWorkflowsPermission;

  public FullAPIDescriptorPermissions() { 
  }

  public FullAPIDescriptorPermissions delegateDownload(Boolean delegateDownload) {
    this.delegateDownload = delegateDownload;
    return this;
  }

   /**
   * User has permission to share an album with download permissions
   * @return delegateDownload
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELEGATE_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDelegateDownload() {
    return delegateDownload;
  }


  @JsonProperty(JSON_PROPERTY_DELEGATE_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelegateDownload(Boolean delegateDownload) {
    this.delegateDownload = delegateDownload;
  }


  public FullAPIDescriptorPermissions moderateComments(Boolean moderateComments) {
    this.moderateComments = moderateComments;
    return this;
  }

   /**
   * Get moderateComments
   * @return moderateComments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODERATE_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getModerateComments() {
    return moderateComments;
  }


  @JsonProperty(JSON_PROPERTY_MODERATE_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModerateComments(Boolean moderateComments) {
    this.moderateComments = moderateComments;
  }


  public FullAPIDescriptorPermissions canTogglePositionedMarkers(Boolean canTogglePositionedMarkers) {
    this.canTogglePositionedMarkers = canTogglePositionedMarkers;
    return this;
  }

   /**
   * Get canTogglePositionedMarkers
   * @return canTogglePositionedMarkers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_TOGGLE_POSITIONED_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanTogglePositionedMarkers() {
    return canTogglePositionedMarkers;
  }


  @JsonProperty(JSON_PROPERTY_CAN_TOGGLE_POSITIONED_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanTogglePositionedMarkers(Boolean canTogglePositionedMarkers) {
    this.canTogglePositionedMarkers = canTogglePositionedMarkers;
  }


  public FullAPIDescriptorPermissions canManageExports(Boolean canManageExports) {
    this.canManageExports = canManageExports;
    return this;
  }

   /**
   * Get canManageExports
   * @return canManageExports
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_MANAGE_EXPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanManageExports() {
    return canManageExports;
  }


  @JsonProperty(JSON_PROPERTY_CAN_MANAGE_EXPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanManageExports(Boolean canManageExports) {
    this.canManageExports = canManageExports;
  }


  public FullAPIDescriptorPermissions hasAdvancedVideoControls(Boolean hasAdvancedVideoControls) {
    this.hasAdvancedVideoControls = hasAdvancedVideoControls;
    return this;
  }

   /**
   * Get hasAdvancedVideoControls
   * @return hasAdvancedVideoControls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ADVANCED_VIDEO_CONTROLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasAdvancedVideoControls() {
    return hasAdvancedVideoControls;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ADVANCED_VIDEO_CONTROLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAdvancedVideoControls(Boolean hasAdvancedVideoControls) {
    this.hasAdvancedVideoControls = hasAdvancedVideoControls;
  }


  public FullAPIDescriptorPermissions hasManageArchivesPermission(Boolean hasManageArchivesPermission) {
    this.hasManageArchivesPermission = hasManageArchivesPermission;
    return this;
  }

   /**
   * Get hasManageArchivesPermission
   * @return hasManageArchivesPermission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_ARCHIVES_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasManageArchivesPermission() {
    return hasManageArchivesPermission;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_ARCHIVES_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasManageArchivesPermission(Boolean hasManageArchivesPermission) {
    this.hasManageArchivesPermission = hasManageArchivesPermission;
  }


  public FullAPIDescriptorPermissions hasManageServicesPermission(Boolean hasManageServicesPermission) {
    this.hasManageServicesPermission = hasManageServicesPermission;
    return this;
  }

   /**
   * Get hasManageServicesPermission
   * @return hasManageServicesPermission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_SERVICES_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasManageServicesPermission() {
    return hasManageServicesPermission;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_SERVICES_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasManageServicesPermission(Boolean hasManageServicesPermission) {
    this.hasManageServicesPermission = hasManageServicesPermission;
  }


  public FullAPIDescriptorPermissions hasManageSettingsPermission(Boolean hasManageSettingsPermission) {
    this.hasManageSettingsPermission = hasManageSettingsPermission;
    return this;
  }

   /**
   * Get hasManageSettingsPermission
   * @return hasManageSettingsPermission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_SETTINGS_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasManageSettingsPermission() {
    return hasManageSettingsPermission;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_SETTINGS_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasManageSettingsPermission(Boolean hasManageSettingsPermission) {
    this.hasManageSettingsPermission = hasManageSettingsPermission;
  }


  public FullAPIDescriptorPermissions allowRetranscode(Boolean allowRetranscode) {
    this.allowRetranscode = allowRetranscode;
    return this;
  }

   /**
   * Get allowRetranscode
   * @return allowRetranscode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_RETRANSCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowRetranscode() {
    return allowRetranscode;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_RETRANSCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowRetranscode(Boolean allowRetranscode) {
    this.allowRetranscode = allowRetranscode;
  }


  public FullAPIDescriptorPermissions showAdvancedBreadcrumb(Boolean showAdvancedBreadcrumb) {
    this.showAdvancedBreadcrumb = showAdvancedBreadcrumb;
    return this;
  }

   /**
   * Get showAdvancedBreadcrumb
   * @return showAdvancedBreadcrumb
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_ADVANCED_BREADCRUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowAdvancedBreadcrumb() {
    return showAdvancedBreadcrumb;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_ADVANCED_BREADCRUMB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowAdvancedBreadcrumb(Boolean showAdvancedBreadcrumb) {
    this.showAdvancedBreadcrumb = showAdvancedBreadcrumb;
  }


  public FullAPIDescriptorPermissions shareCropAndDownloadPresets(Boolean shareCropAndDownloadPresets) {
    this.shareCropAndDownloadPresets = shareCropAndDownloadPresets;
    return this;
  }

   /**
   * Get shareCropAndDownloadPresets
   * @return shareCropAndDownloadPresets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_CROP_AND_DOWNLOAD_PRESETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShareCropAndDownloadPresets() {
    return shareCropAndDownloadPresets;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_CROP_AND_DOWNLOAD_PRESETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareCropAndDownloadPresets(Boolean shareCropAndDownloadPresets) {
    this.shareCropAndDownloadPresets = shareCropAndDownloadPresets;
  }


  public FullAPIDescriptorPermissions print(Boolean print) {
    this.print = print;
    return this;
  }

   /**
   * Get print
   * @return print
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrint() {
    return print;
  }


  @JsonProperty(JSON_PROPERTY_PRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrint(Boolean print) {
    this.print = print;
  }


  public FullAPIDescriptorPermissions hasAuditPermission(Boolean hasAuditPermission) {
    this.hasAuditPermission = hasAuditPermission;
    return this;
  }

   /**
   * Get hasAuditPermission
   * @return hasAuditPermission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_AUDIT_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasAuditPermission() {
    return hasAuditPermission;
  }


  @JsonProperty(JSON_PROPERTY_HAS_AUDIT_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAuditPermission(Boolean hasAuditPermission) {
    this.hasAuditPermission = hasAuditPermission;
  }


  public FullAPIDescriptorPermissions albums(FullAPIDescriptorPermissionsAlbums albums) {
    this.albums = albums;
    return this;
  }

   /**
   * Get albums
   * @return albums
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FullAPIDescriptorPermissionsAlbums getAlbums() {
    return albums;
  }


  @JsonProperty(JSON_PROPERTY_ALBUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlbums(FullAPIDescriptorPermissionsAlbums albums) {
    this.albums = albums;
  }


  public FullAPIDescriptorPermissions canLinkInAdobeCC(Boolean canLinkInAdobeCC) {
    this.canLinkInAdobeCC = canLinkInAdobeCC;
    return this;
  }

   /**
   * Get canLinkInAdobeCC
   * @return canLinkInAdobeCC
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_LINK_IN_ADOBE_C_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanLinkInAdobeCC() {
    return canLinkInAdobeCC;
  }


  @JsonProperty(JSON_PROPERTY_CAN_LINK_IN_ADOBE_C_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanLinkInAdobeCC(Boolean canLinkInAdobeCC) {
    this.canLinkInAdobeCC = canLinkInAdobeCC;
  }


  public FullAPIDescriptorPermissions allowTaxonomyEditing(Boolean allowTaxonomyEditing) {
    this.allowTaxonomyEditing = allowTaxonomyEditing;
    return this;
  }

   /**
   * User has permission to modify taxonomies
   * @return allowTaxonomyEditing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_TAXONOMY_EDITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowTaxonomyEditing() {
    return allowTaxonomyEditing;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_TAXONOMY_EDITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowTaxonomyEditing(Boolean allowTaxonomyEditing) {
    this.allowTaxonomyEditing = allowTaxonomyEditing;
  }


  public FullAPIDescriptorPermissions allowShareBookmark(Boolean allowShareBookmark) {
    this.allowShareBookmark = allowShareBookmark;
    return this;
  }

   /**
   * Get allowShareBookmark
   * @return allowShareBookmark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_SHARE_BOOKMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowShareBookmark() {
    return allowShareBookmark;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_SHARE_BOOKMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowShareBookmark(Boolean allowShareBookmark) {
    this.allowShareBookmark = allowShareBookmark;
  }


  public FullAPIDescriptorPermissions hasManageWorkflowsPermission(Boolean hasManageWorkflowsPermission) {
    this.hasManageWorkflowsPermission = hasManageWorkflowsPermission;
    return this;
  }

   /**
   * Get hasManageWorkflowsPermission
   * @return hasManageWorkflowsPermission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_WORKFLOWS_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasManageWorkflowsPermission() {
    return hasManageWorkflowsPermission;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MANAGE_WORKFLOWS_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasManageWorkflowsPermission(Boolean hasManageWorkflowsPermission) {
    this.hasManageWorkflowsPermission = hasManageWorkflowsPermission;
  }


  /**
   * Return true if this FullAPIDescriptor_permissions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIDescriptorPermissions fullAPIDescriptorPermissions = (FullAPIDescriptorPermissions) o;
    return Objects.equals(this.delegateDownload, fullAPIDescriptorPermissions.delegateDownload) &&
        Objects.equals(this.moderateComments, fullAPIDescriptorPermissions.moderateComments) &&
        Objects.equals(this.canTogglePositionedMarkers, fullAPIDescriptorPermissions.canTogglePositionedMarkers) &&
        Objects.equals(this.canManageExports, fullAPIDescriptorPermissions.canManageExports) &&
        Objects.equals(this.hasAdvancedVideoControls, fullAPIDescriptorPermissions.hasAdvancedVideoControls) &&
        Objects.equals(this.hasManageArchivesPermission, fullAPIDescriptorPermissions.hasManageArchivesPermission) &&
        Objects.equals(this.hasManageServicesPermission, fullAPIDescriptorPermissions.hasManageServicesPermission) &&
        Objects.equals(this.hasManageSettingsPermission, fullAPIDescriptorPermissions.hasManageSettingsPermission) &&
        Objects.equals(this.allowRetranscode, fullAPIDescriptorPermissions.allowRetranscode) &&
        Objects.equals(this.showAdvancedBreadcrumb, fullAPIDescriptorPermissions.showAdvancedBreadcrumb) &&
        Objects.equals(this.shareCropAndDownloadPresets, fullAPIDescriptorPermissions.shareCropAndDownloadPresets) &&
        Objects.equals(this.print, fullAPIDescriptorPermissions.print) &&
        Objects.equals(this.hasAuditPermission, fullAPIDescriptorPermissions.hasAuditPermission) &&
        Objects.equals(this.albums, fullAPIDescriptorPermissions.albums) &&
        Objects.equals(this.canLinkInAdobeCC, fullAPIDescriptorPermissions.canLinkInAdobeCC) &&
        Objects.equals(this.allowTaxonomyEditing, fullAPIDescriptorPermissions.allowTaxonomyEditing) &&
        Objects.equals(this.allowShareBookmark, fullAPIDescriptorPermissions.allowShareBookmark) &&
        Objects.equals(this.hasManageWorkflowsPermission, fullAPIDescriptorPermissions.hasManageWorkflowsPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegateDownload, moderateComments, canTogglePositionedMarkers, canManageExports, hasAdvancedVideoControls, hasManageArchivesPermission, hasManageServicesPermission, hasManageSettingsPermission, allowRetranscode, showAdvancedBreadcrumb, shareCropAndDownloadPresets, print, hasAuditPermission, albums, canLinkInAdobeCC, allowTaxonomyEditing, allowShareBookmark, hasManageWorkflowsPermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIDescriptorPermissions {\n");
    sb.append("    delegateDownload: ").append(toIndentedString(delegateDownload)).append("\n");
    sb.append("    moderateComments: ").append(toIndentedString(moderateComments)).append("\n");
    sb.append("    canTogglePositionedMarkers: ").append(toIndentedString(canTogglePositionedMarkers)).append("\n");
    sb.append("    canManageExports: ").append(toIndentedString(canManageExports)).append("\n");
    sb.append("    hasAdvancedVideoControls: ").append(toIndentedString(hasAdvancedVideoControls)).append("\n");
    sb.append("    hasManageArchivesPermission: ").append(toIndentedString(hasManageArchivesPermission)).append("\n");
    sb.append("    hasManageServicesPermission: ").append(toIndentedString(hasManageServicesPermission)).append("\n");
    sb.append("    hasManageSettingsPermission: ").append(toIndentedString(hasManageSettingsPermission)).append("\n");
    sb.append("    allowRetranscode: ").append(toIndentedString(allowRetranscode)).append("\n");
    sb.append("    showAdvancedBreadcrumb: ").append(toIndentedString(showAdvancedBreadcrumb)).append("\n");
    sb.append("    shareCropAndDownloadPresets: ").append(toIndentedString(shareCropAndDownloadPresets)).append("\n");
    sb.append("    print: ").append(toIndentedString(print)).append("\n");
    sb.append("    hasAuditPermission: ").append(toIndentedString(hasAuditPermission)).append("\n");
    sb.append("    albums: ").append(toIndentedString(albums)).append("\n");
    sb.append("    canLinkInAdobeCC: ").append(toIndentedString(canLinkInAdobeCC)).append("\n");
    sb.append("    allowTaxonomyEditing: ").append(toIndentedString(allowTaxonomyEditing)).append("\n");
    sb.append("    allowShareBookmark: ").append(toIndentedString(allowShareBookmark)).append("\n");
    sb.append("    hasManageWorkflowsPermission: ").append(toIndentedString(hasManageWorkflowsPermission)).append("\n");
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

    // add `delegateDownload` to the URL query string
    if (getDelegateDownload() != null) {
      joiner.add(String.format("%sdelegateDownload%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelegateDownload()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `moderateComments` to the URL query string
    if (getModerateComments() != null) {
      joiner.add(String.format("%smoderateComments%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModerateComments()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `canTogglePositionedMarkers` to the URL query string
    if (getCanTogglePositionedMarkers() != null) {
      joiner.add(String.format("%scanTogglePositionedMarkers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanTogglePositionedMarkers()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `canManageExports` to the URL query string
    if (getCanManageExports() != null) {
      joiner.add(String.format("%scanManageExports%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanManageExports()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasAdvancedVideoControls` to the URL query string
    if (getHasAdvancedVideoControls() != null) {
      joiner.add(String.format("%shasAdvancedVideoControls%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasAdvancedVideoControls()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasManageArchivesPermission` to the URL query string
    if (getHasManageArchivesPermission() != null) {
      joiner.add(String.format("%shasManageArchivesPermission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasManageArchivesPermission()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasManageServicesPermission` to the URL query string
    if (getHasManageServicesPermission() != null) {
      joiner.add(String.format("%shasManageServicesPermission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasManageServicesPermission()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasManageSettingsPermission` to the URL query string
    if (getHasManageSettingsPermission() != null) {
      joiner.add(String.format("%shasManageSettingsPermission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasManageSettingsPermission()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `allowRetranscode` to the URL query string
    if (getAllowRetranscode() != null) {
      joiner.add(String.format("%sallowRetranscode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowRetranscode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `showAdvancedBreadcrumb` to the URL query string
    if (getShowAdvancedBreadcrumb() != null) {
      joiner.add(String.format("%sshowAdvancedBreadcrumb%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShowAdvancedBreadcrumb()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `shareCropAndDownloadPresets` to the URL query string
    if (getShareCropAndDownloadPresets() != null) {
      joiner.add(String.format("%sshareCropAndDownloadPresets%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShareCropAndDownloadPresets()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `print` to the URL query string
    if (getPrint() != null) {
      joiner.add(String.format("%sprint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasAuditPermission` to the URL query string
    if (getHasAuditPermission() != null) {
      joiner.add(String.format("%shasAuditPermission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasAuditPermission()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `albums` to the URL query string
    if (getAlbums() != null) {
      joiner.add(getAlbums().toUrlQueryString(prefix + "albums" + suffix));
    }

    // add `canLinkInAdobeCC` to the URL query string
    if (getCanLinkInAdobeCC() != null) {
      joiner.add(String.format("%scanLinkInAdobeCC%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanLinkInAdobeCC()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `allowTaxonomyEditing` to the URL query string
    if (getAllowTaxonomyEditing() != null) {
      joiner.add(String.format("%sallowTaxonomyEditing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowTaxonomyEditing()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `allowShareBookmark` to the URL query string
    if (getAllowShareBookmark() != null) {
      joiner.add(String.format("%sallowShareBookmark%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowShareBookmark()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasManageWorkflowsPermission` to the URL query string
    if (getHasManageWorkflowsPermission() != null) {
      joiner.add(String.format("%shasManageWorkflowsPermission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasManageWorkflowsPermission()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

