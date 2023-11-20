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
import com.cominvent.fotoware.model.AssetList;
import com.cominvent.fotoware.model.Collection;
import com.cominvent.fotoware.model.CollectionInfo;
import com.cominvent.fotoware.model.CollectionList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ArchivesApi
 */
@Ignore
public class ArchivesApiTest {

    private final ArchivesApi api = new ArchivesApi();

    
    /**
     * Get all publically available archives in the FotoWare DAM instance. To search, add the q parameter. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebArchivesGetTest() throws ApiException {
        String q = null;
        CollectionList response = 
        api.fotowebArchivesGet(q);
        
        // TODO: test validations
    }
    
    /**
     * Get all information about an archive
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArchiveTest() throws ApiException {
        Integer id = null;
        Collection response = 
        api.getArchive(id);
        
        // TODO: test validations
    }
    
    /**
     * Lists the archives accessible by the current user/access token.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrivateArchiveListTest() throws ApiException {
        CollectionList response = 
        api.getPrivateArchiveList();
        
        // TODO: test validations
    }
    
}
