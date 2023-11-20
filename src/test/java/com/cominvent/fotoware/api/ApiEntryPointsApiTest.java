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
import com.cominvent.fotoware.model.APIDescriptor;
import com.cominvent.fotoware.model.FullAPIDescriptor;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ApiEntryPointsApi
 */
@Ignore
public class ApiEntryPointsApiTest {

    private final ApiEntryPointsApi api = new ApiEntryPointsApi();

    
    /**
     * Public entry point
     *
     * The Public entry point is for unauthenticated, read-only guest access. It is only available if Guest access is enabled and licensed on the FotoWeb server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebGetTest() throws ApiException {
        APIDescriptor response = 
        api.fotowebGet();
        
        // TODO: test validations
    }
    
    /**
     * Private entry point
     *
     * The Private entry point allows authenticated access to the server to view and modify data. It requires authentication, either as administrator (server-to-server authentication) or as a specific user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebMeGetTest() throws ApiException {
        FullAPIDescriptor response = 
        api.fotowebMeGet();
        
        // TODO: test validations
    }
    
}
