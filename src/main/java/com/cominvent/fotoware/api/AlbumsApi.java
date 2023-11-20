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

import com.cominvent.fotoware.client.ApiClient;
import com.cominvent.fotoware.client.ApiException;
import com.cominvent.fotoware.client.ApiResponse;
import com.cominvent.fotoware.client.Pair;

import com.cominvent.fotoware.model.CollectionList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T14:14:21.267957+01:00[Europe/Oslo]")
public class AlbumsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AlbumsApi() {
    this(new ApiClient());
  }

  public AlbumsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Lists the public albums in the DAM. The list contains albums which are shared in Fotoware. 
   * 
   * @return CollectionList
   * @throws ApiException if fails to make API call
   */
  public CollectionList fotowebAlbumsGet() throws ApiException {
    ApiResponse<CollectionList> localVarResponse = fotowebAlbumsGetWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists the public albums in the DAM. The list contains albums which are shared in Fotoware. 
   * 
   * @return ApiResponse&lt;CollectionList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CollectionList> fotowebAlbumsGetWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = fotowebAlbumsGetRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("fotowebAlbumsGet", localVarResponse);
        }
        return new ApiResponse<CollectionList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CollectionList>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder fotowebAlbumsGetRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fotoweb/albums/";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, application/vnd.fotoware.collectionlist+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List the archived albums owned by the current user/access token.
   * 
   * @return CollectionList
   * @throws ApiException if fails to make API call
   */
  public CollectionList fotowebMeAlbumsArchivedGet() throws ApiException {
    ApiResponse<CollectionList> localVarResponse = fotowebMeAlbumsArchivedGetWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List the archived albums owned by the current user/access token.
   * 
   * @return ApiResponse&lt;CollectionList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CollectionList> fotowebMeAlbumsArchivedGetWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = fotowebMeAlbumsArchivedGetRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("fotowebMeAlbumsArchivedGet", localVarResponse);
        }
        return new ApiResponse<CollectionList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CollectionList>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder fotowebMeAlbumsArchivedGetRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fotoweb/me/albums/archived/";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, application/vnd.fotoware.collectionlist+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List the albums contributed to by the current user/access token.
   * 
   * @return CollectionList
   * @throws ApiException if fails to make API call
   */
  public CollectionList fotowebMeAlbumsContributeGet() throws ApiException {
    ApiResponse<CollectionList> localVarResponse = fotowebMeAlbumsContributeGetWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List the albums contributed to by the current user/access token.
   * 
   * @return ApiResponse&lt;CollectionList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CollectionList> fotowebMeAlbumsContributeGetWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = fotowebMeAlbumsContributeGetRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("fotowebMeAlbumsContributeGet", localVarResponse);
        }
        return new ApiResponse<CollectionList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CollectionList>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder fotowebMeAlbumsContributeGetRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fotoweb/me/albums/contribute/";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, application/vnd.fotoware.collectionlist+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List the deleted albums owned by the current user/access token.
   * 
   * @return CollectionList
   * @throws ApiException if fails to make API call
   */
  public CollectionList fotowebMeAlbumsDeletedGet() throws ApiException {
    ApiResponse<CollectionList> localVarResponse = fotowebMeAlbumsDeletedGetWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List the deleted albums owned by the current user/access token.
   * 
   * @return ApiResponse&lt;CollectionList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CollectionList> fotowebMeAlbumsDeletedGetWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = fotowebMeAlbumsDeletedGetRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("fotowebMeAlbumsDeletedGet", localVarResponse);
        }
        return new ApiResponse<CollectionList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CollectionList>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder fotowebMeAlbumsDeletedGetRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fotoweb/me/albums/deleted/";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, application/vnd.fotoware.collectionlist+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Lists the albums accessible by the current user/access token. This list contains all albums that the user can access. Use the q parameter to search in multiple albums/collections (search in name, description and tags elements). 
   * 
   * @param q Query for asset(s). See &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\&quot;&gt;Collection Queries&lt;/a&gt; for more information on querying. (optional)
   * @return CollectionList
   * @throws ApiException if fails to make API call
   */
  public CollectionList fotowebMeAlbumsGet(String q) throws ApiException {
    ApiResponse<CollectionList> localVarResponse = fotowebMeAlbumsGetWithHttpInfo(q);
    return localVarResponse.getData();
  }

  /**
   * Lists the albums accessible by the current user/access token. This list contains all albums that the user can access. Use the q parameter to search in multiple albums/collections (search in name, description and tags elements). 
   * 
   * @param q Query for asset(s). See &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://learn.fotoware.com/Integrations_and_APIs/001_The_FotoWare_API/FotoWare_API_Overview/Collection_Queries\&quot;&gt;Collection Queries&lt;/a&gt; for more information on querying. (optional)
   * @return ApiResponse&lt;CollectionList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CollectionList> fotowebMeAlbumsGetWithHttpInfo(String q) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = fotowebMeAlbumsGetRequestBuilder(q);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("fotowebMeAlbumsGet", localVarResponse);
        }
        return new ApiResponse<CollectionList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CollectionList>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder fotowebMeAlbumsGetRequestBuilder(String q) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fotoweb/me/albums/";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "q";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("q", q));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json, application/vnd.fotoware.collectionlist+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Lists the albums owned by the current user/access token.
   * 
   * @return CollectionList
   * @throws ApiException if fails to make API call
   */
  public CollectionList fotowebMeAlbumsMineGet() throws ApiException {
    ApiResponse<CollectionList> localVarResponse = fotowebMeAlbumsMineGetWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists the albums owned by the current user/access token.
   * 
   * @return ApiResponse&lt;CollectionList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CollectionList> fotowebMeAlbumsMineGetWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = fotowebMeAlbumsMineGetRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("fotowebMeAlbumsMineGet", localVarResponse);
        }
        return new ApiResponse<CollectionList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CollectionList>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder fotowebMeAlbumsMineGetRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fotoweb/me/albums/mine/";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, application/vnd.fotoware.collectionlist+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List the albums shared with the current user/access token.
   * 
   * @return CollectionList
   * @throws ApiException if fails to make API call
   */
  public CollectionList fotowebMeAlbumsSharedWithMeGet() throws ApiException {
    ApiResponse<CollectionList> localVarResponse = fotowebMeAlbumsSharedWithMeGetWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List the albums shared with the current user/access token.
   * 
   * @return ApiResponse&lt;CollectionList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CollectionList> fotowebMeAlbumsSharedWithMeGetWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = fotowebMeAlbumsSharedWithMeGetRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("fotowebMeAlbumsSharedWithMeGet", localVarResponse);
        }
        return new ApiResponse<CollectionList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CollectionList>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder fotowebMeAlbumsSharedWithMeGetRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/fotoweb/me/albums/shared-with-me/";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json, application/vnd.fotoware.collectionlist+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
