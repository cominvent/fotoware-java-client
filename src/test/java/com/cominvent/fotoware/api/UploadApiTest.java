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


package com.cominvent.fotoware.api;

import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.model.BatchUploadCreate;
import com.cominvent.fotoware.model.BatchUploadInfo;
import com.cominvent.fotoware.model.BatchUploadStatus;
import com.cominvent.fotoware.model.CollectionList;
import java.io.File;
import com.cominvent.fotoware.model.UploadResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for UploadApi
 */
@Ignore
public class UploadApiTest {

    private final UploadApi api = new UploadApi();

    
    /**
     * Create a new upload task 
     *
     * This initial upload request begins the process for uploading a single asset by setting up an upload task with a unique Upload ID which is used in all following API requests. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiUploadsPostTest() throws ApiException {
        BatchUploadCreate batchUploadCreate = null;
        BatchUploadInfo response = 
        api.fotowebApiUploadsPost(batchUploadCreate);
        
        // TODO: test validations
    }
    
    /**
     * Upload a chunk to an upload task 
     *
     * This request uploads a chunk of the file being uploaded. The chunk size and number of chunks to upload is returned in the response to the create upload task call. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiUploadsUploadIdChunksChunkIndexPostTest() throws ApiException {
        String uploadId = null;
        Integer chunkIndex = null;
        File fileName = null;
        
        api.fotowebApiUploadsUploadIdChunksChunkIndexPost(uploadId, chunkIndex, fileName);
        
        // TODO: test validations
    }
    
    /**
     * Get the upload task status 
     *
     * This request is made to poll the status of an upload task. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiUploadsUploadIdStatusGetTest() throws ApiException {
        String uploadId = null;
        BatchUploadStatus response = 
        api.fotowebApiUploadsUploadIdStatusGet(uploadId);
        
        // TODO: test validations
    }
    
    /**
     * Upload the XMP file to an upload task 
     *
     * This is an optional request to upload an XMP sidecar file that contains the metadata of the asset file. XMP sidecars are assumed to be  small, so they can be uploaded in one request. If a file has an XMP sidecar, then the initial upload request must declare it. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiUploadsUploadIdXmpPostTest() throws ApiException {
        String uploadId = null;
        File fileName = null;
        
        api.fotowebApiUploadsUploadIdXmpPost(uploadId, fileName);
        
        // TODO: test validations
    }
    
    /**
     * Assets are uploaded by making a POST request to the URL of the archive. Each request can contain one or more assets. Upload uses HTTP Multipart requests, as defined in RFC1341. It is also possible to create a new folder (or a hierarchy of nested folders) and upload assets to the new folder. 
     *
     * Note:   * The upload location URL (upload_location_url) must be the URL found in the href attribute of the archive representation. Please do not hard-code upload location URLs.   * To get the upload request URL of an already known archive (with a known API URL), first request the archive representation of the archive, then use the value of the href-attribute for the upload request   * If the archive has a custom input folder, then assets can only be uploaded to the root URL of the archive. It is not possible to upload to a specific sub folder or to create a new sub folder during upload. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebArchivesArchiveHREFPostTest() throws ApiException {
        String archiveHREF = null;
        String contentType = null;
        UploadResponse response = 
        api.fotowebArchivesArchiveHREFPost(archiveHREF, contentType);
        
        // TODO: test validations
    }
    
    /**
     * List of collections that are available to be uploaded to
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebMeUploadToGetTest() throws ApiException {
        CollectionList response = 
        api.fotowebMeUploadToGet();
        
        // TODO: test validations
    }
    
}