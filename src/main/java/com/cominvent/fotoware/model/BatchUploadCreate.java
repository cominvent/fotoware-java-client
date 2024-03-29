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
import com.cominvent.fotoware.model.BatchUploadMetadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * API model to create a new batch upload task used to upload a file
 */
@JsonPropertyOrder({
  BatchUploadCreate.JSON_PROPERTY_DESTINATION,
  BatchUploadCreate.JSON_PROPERTY_FOLDER,
  BatchUploadCreate.JSON_PROPERTY_FILENAME,
  BatchUploadCreate.JSON_PROPERTY_HAS_XMP,
  BatchUploadCreate.JSON_PROPERTY_FILE_SIZE,
  BatchUploadCreate.JSON_PROPERTY_CHECKOUT_ID,
  BatchUploadCreate.JSON_PROPERTY_METADATA,
  BatchUploadCreate.JSON_PROPERTY_COMMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchUploadCreate {
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private String destination;

  public static final String JSON_PROPERTY_FOLDER = "folder";
  private String folder;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_HAS_XMP = "hasXmp";
  private Boolean hasXmp;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private Integer fileSize;

  public static final String JSON_PROPERTY_CHECKOUT_ID = "checkoutId";
  private String checkoutId;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private BatchUploadMetadata metadata;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public BatchUploadCreate() { 
  }

  public BatchUploadCreate destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * * URL of the collection (e.g. archive or folder) to upload to OR * URL of the asset to upload a new revision 
   * @return destination
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestination(String destination) {
    this.destination = destination;
  }


  public BatchUploadCreate folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * A folder path relative to the destination (when it is a collection URL).  The folder may or may not exist, and it is created if it does not exist. 
   * @return folder
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFolder() {
    return folder;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolder(String folder) {
    this.folder = folder;
  }


  public BatchUploadCreate filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Filename of the file being uploaded. It must be given when uploading to a folder. 
   * @return filename
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public BatchUploadCreate hasXmp(Boolean hasXmp) {
    this.hasXmp = hasXmp;
    return this;
  }

   /**
   * * true: An XMP sidecar file with metadata is uploaded along with the master file * false: No XMP sidecar file is uploaded 
   * @return hasXmp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_XMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasXmp() {
    return hasXmp;
  }


  @JsonProperty(JSON_PROPERTY_HAS_XMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasXmp(Boolean hasXmp) {
    this.hasXmp = hasXmp;
  }


  public BatchUploadCreate fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The exact size of the file (in bytes) 
   * @return fileSize
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public BatchUploadCreate checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

   /**
   * This parameter must be set to null. It is used by internal FotoWare plug-ins to upload a new version of a checked-out file. 
   * @return checkoutId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutId() {
    return checkoutId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }


  public BatchUploadCreate metadata(BatchUploadMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BatchUploadMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(BatchUploadMetadata metadata) {
    this.metadata = metadata;
  }


  public BatchUploadCreate comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment to add to the revision. Set comment to null when not required. When uploading a new revision of a file that already exists, this becomes the comment of the new revision.  
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  /**
   * Return true if this BatchUploadCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUploadCreate batchUploadCreate = (BatchUploadCreate) o;
    return Objects.equals(this.destination, batchUploadCreate.destination) &&
        Objects.equals(this.folder, batchUploadCreate.folder) &&
        Objects.equals(this.filename, batchUploadCreate.filename) &&
        Objects.equals(this.hasXmp, batchUploadCreate.hasXmp) &&
        Objects.equals(this.fileSize, batchUploadCreate.fileSize) &&
        Objects.equals(this.checkoutId, batchUploadCreate.checkoutId) &&
        Objects.equals(this.metadata, batchUploadCreate.metadata) &&
        Objects.equals(this.comment, batchUploadCreate.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, folder, filename, hasXmp, fileSize, checkoutId, metadata, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUploadCreate {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    hasXmp: ").append(toIndentedString(hasXmp)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

    // add `destination` to the URL query string
    if (getDestination() != null) {
      joiner.add(String.format("%sdestination%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestination()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `folder` to the URL query string
    if (getFolder() != null) {
      joiner.add(String.format("%sfolder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolder()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `filename` to the URL query string
    if (getFilename() != null) {
      joiner.add(String.format("%sfilename%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFilename()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hasXmp` to the URL query string
    if (getHasXmp() != null) {
      joiner.add(String.format("%shasXmp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHasXmp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fileSize` to the URL query string
    if (getFileSize() != null) {
      joiner.add(String.format("%sfileSize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `checkoutId` to the URL query string
    if (getCheckoutId() != null) {
      joiner.add(String.format("%scheckoutId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCheckoutId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      joiner.add(getMetadata().toUrlQueryString(prefix + "metadata" + suffix));
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

