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
import com.cominvent.fotoware.model.Taxonomy;
import com.cominvent.fotoware.model.TaxonomyCreationInfo;
import com.cominvent.fotoware.model.TaxonomyInfo;
import com.cominvent.fotoware.model.TaxonomyItem;
import com.cominvent.fotoware.model.TaxonomyItemCreationInfo;
import com.cominvent.fotoware.model.TaxonomyItemInfo;
import com.cominvent.fotoware.model.TaxonomyItemList;
import com.cominvent.fotoware.model.TaxonomyItemUpdate;
import com.cominvent.fotoware.model.TaxonomyList;
import com.cominvent.fotoware.model.TaxonomyUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for TaxonomiesApi
 */
@Ignore
public class TaxonomiesApiTest {

    private final TaxonomiesApi api = new TaxonomiesApi();

    
    /**
     * Get all the taxonomies for an archive
     *
     * Returns a list of taxonomy fields with root items for the archive id that is passed as a parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesArchivesArchiveIDGetTest() throws ApiException {
        Integer archiveID = null;
        List<Taxonomy> response = 
        api.fotowebApiTaxonomiesArchivesArchiveIDGet(archiveID);
        
        // TODO: test validations
    }
    
    /**
     * Delete a taxonomy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdDeleteTest() throws ApiException {
        Integer fieldId = null;
        
        api.fotowebApiTaxonomiesFieldIdDelete(fieldId);
        
        // TODO: test validations
    }
    
    /**
     * Get taxonomy of a metadata field, list root items
     *
     * Returns the description of the taxonomy and/or a paged list of top level items in the taxonomy.  The page URLs of this paged list can also be obtained from the paging information of each page.  If a paging parameter is specified, then this request always returns a taxonomy item list, and other content types are not acceptable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdGetTest() throws ApiException {
        Integer fieldId = null;
        String q = null;
        Taxonomy response = 
        api.fotowebApiTaxonomiesFieldIdGet(fieldId, q);
        
        // TODO: test validations
    }
    
    /**
     * Delete a taxonomy item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdItemIdDeleteTest() throws ApiException {
        Integer fieldId = null;
        String itemId = null;
        
        api.fotowebApiTaxonomiesFieldIdItemIdDelete(fieldId, itemId);
        
        // TODO: test validations
    }
    
    /**
     * Get taxonomy item and list children
     *
     * Returns the description of the taxonomy item and a paged list of child items. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdItemIdGetTest() throws ApiException {
        Integer fieldId = null;
        String itemId = null;
        TaxonomyItem response = 
        api.fotowebApiTaxonomiesFieldIdItemIdGet(fieldId, itemId);
        
        // TODO: test validations
    }
    
    /**
     * Create a new taxonomy item under an existing item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdItemIdPostTest() throws ApiException {
        Integer fieldId = null;
        String itemId = null;
        TaxonomyItemCreationInfo taxonomyItemCreationInfo = null;
        
        api.fotowebApiTaxonomiesFieldIdItemIdPost(fieldId, itemId, taxonomyItemCreationInfo);
        
        // TODO: test validations
    }
    
    /**
     * Get a taxonomy item and list its children
     *
     * Returns the description of the taxonomy item and a paged list of its child items. The URLs of this paged list can also be obtained from the paging information in the result. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdItemIdPpGetTest() throws ApiException {
        Integer fieldId = null;
        String itemId = null;
        Integer p = null;
        TaxonomyItem response = 
        api.fotowebApiTaxonomiesFieldIdItemIdPpGet(fieldId, itemId, p);
        
        // TODO: test validations
    }
    
    /**
     * Update the description of a taxonomy item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdItemIdPutTest() throws ApiException {
        Integer fieldId = null;
        String itemId = null;
        TaxonomyItemUpdate taxonomyItemUpdate = null;
        
        api.fotowebApiTaxonomiesFieldIdItemIdPut(fieldId, itemId, taxonomyItemUpdate);
        
        // TODO: test validations
    }
    
    /**
     * Create a new taxonomy item at the root of the taxonomy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdPostTest() throws ApiException {
        Integer fieldId = null;
        TaxonomyItemCreationInfo taxonomyItemCreationInfo = null;
        
        api.fotowebApiTaxonomiesFieldIdPost(fieldId, taxonomyItemCreationInfo);
        
        // TODO: test validations
    }
    
    /**
     * Get taxonomy of a metadata field, list root items
     *
     * Returns the description of the taxonomy and/or a paged list of top level items in the taxonomy.  The page URLs of this paged list can also be obtained from the paging information of each page.  If a paging parameter is specified,then this request always returns a taxonomy item list, and other content types are not acceptable. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdPpGetTest() throws ApiException {
        Integer fieldId = null;
        Integer p = null;
        String q = null;
        Taxonomy response = 
        api.fotowebApiTaxonomiesFieldIdPpGet(fieldId, p, q);
        
        // TODO: test validations
    }
    
    /**
     * Update a taxonomy field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesFieldIdPutTest() throws ApiException {
        Integer fieldId = null;
        TaxonomyUpdate taxonomyUpdate = null;
        
        api.fotowebApiTaxonomiesFieldIdPut(fieldId, taxonomyUpdate);
        
        // TODO: test validations
    }
    
    /**
     * List all fields with taxonomy enabled
     *
     * A paged list of taxononmies is returned. The list has one item for each metadata field with taxonomy enabled. The page URLs of this paged list can be obtained from the paging information in the result. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesGetTest() throws ApiException {
        TaxonomyList response = 
        api.fotowebApiTaxonomiesGet();
        
        // TODO: test validations
    }
    
    /**
     * Get a taxonomy item list by passing in an item id list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesInfoPostTest() throws ApiException {
        List<String> requestBody = null;
        List<TaxonomyItem> response = 
        api.fotowebApiTaxonomiesInfoPost(requestBody);
        
        // TODO: test validations
    }
    
    /**
     * Create a new taxonomy
     *
     * Creates a new taxonomy and enables the taxonomy for a field. The url to the new taxonomy is returned in the Location header in the response. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesPostTest() throws ApiException {
        TaxonomyCreationInfo taxonomyCreationInfo = null;
        
        api.fotowebApiTaxonomiesPost(taxonomyCreationInfo);
        
        // TODO: test validations
    }
    
    /**
     * List all fields with taxonomy enabled
     *
     * This request returns a paged list of taxonomies with one item for each metadata field for which taxonomy is enabled. The page URLs of this paged list can also be obtained from the paging information of each page. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fotowebApiTaxonomiesPpGetTest() throws ApiException {
        Integer p = null;
        TaxonomyList response = 
        api.fotowebApiTaxonomiesPpGet(p);
        
        // TODO: test validations
    }
    
}