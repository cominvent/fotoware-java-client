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
import com.cominvent.fotoware.model.ActionRequest;
import com.cominvent.fotoware.model.ActionResponse;
import com.cominvent.fotoware.model.CopyRequest;
import com.cominvent.fotoware.model.CopyResponse;
import com.cominvent.fotoware.model.DeleteRequest;
import com.cominvent.fotoware.model.DeleteResponse;
import com.cominvent.fotoware.model.DuplicateRequest;
import com.cominvent.fotoware.model.DuplicateResponse;
import com.cominvent.fotoware.model.ErrorMessage;
import com.cominvent.fotoware.model.MarkerRequest;
import com.cominvent.fotoware.model.MarkerResponse;
import com.cominvent.fotoware.model.MetadataEditRequest;
import com.cominvent.fotoware.model.MetadataEditResponse;
import com.cominvent.fotoware.model.MoveRequest;
import com.cominvent.fotoware.model.MoveResponse;
import com.cominvent.fotoware.model.RenameRequest;
import com.cominvent.fotoware.model.RenameResponse;
import com.cominvent.fotoware.model.RotateRequest;
import com.cominvent.fotoware.model.RotateResponse;
import com.cominvent.fotoware.model.TaskStatus;
import com.cominvent.fotoware.model.UploadStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for BackgroundTasksApi
 */
@Ignore
public class BackgroundTasksApiTest {

    private final BackgroundTasksApi api = new BackgroundTasksApi();

    
    /**
     * Polls the status of a tasks
     *
     * Gives you the status and info of a submitted background task
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebMeBackgroundTasksIdGetTest() throws ApiException {
        String id = null;
        UploadStatus response = 
        api.fotowebMeBackgroundTasksIdGet(id);
        
        // TODO: test validations
    }
    
    /**
     * Triggers a background task that runs an operation on an asset
     *
     * FotoWeb uses a system of background tasks for some user-triggered operations. These operations cannot be run in a normal request handler as they would take too long time to finish. These operations include: Download | Metadata updates | Actions and marker actions | General File operations (move, copy, rotate etc) | Upload 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebMeBackgroundTasksPostTest() throws ApiException {
        MetadataEditRequest metadataEditRequest = null;
        MetadataEditResponse response = 
        api.fotowebMeBackgroundTasksPost(metadataEditRequest);
        
        // TODO: test validations
    }
    
}