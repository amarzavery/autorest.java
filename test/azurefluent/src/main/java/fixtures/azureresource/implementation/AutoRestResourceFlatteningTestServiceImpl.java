/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureProxy;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.Resource;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.HeaderParam;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PUT;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.Validator;
import fixtures.azureresource.ErrorException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * Initializes a new instance of the AutoRestResourceFlatteningTestServiceImpl class.
 */
public class AutoRestResourceFlatteningTestServiceImpl extends AzureServiceClient {
    /** The RestProxy service to perform REST calls. */
    private AutoRestResourceFlatteningTestServiceService service;


    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestResourceFlatteningTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(ServiceClientCredentials credentials) {
        this("http://localhost", credentials);
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AutoRestResourceFlatteningTestServiceImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestResourceFlatteningTestService client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AutoRestResourceFlatteningTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "AutoRestResourceFlatteningTestService", "1.0.0");
    }

    private void initializeService() {
        service = AzureProxy.create(AutoRestResourceFlatteningTestServiceService.class, restClient().baseURL(), httpClient(), serializerAdapter());
    }

    /**
     * The interface defining all the services for AutoRestResourceFlatteningTestService to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("http://localhost")
    interface AutoRestResourceFlatteningTestServiceService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService putArray" })
        @PUT("azure/resource-flatten/array")
        @ExpectedResponses({200})
        Single<Void> putArray(@BodyParam List<Resource> resourceArray, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService getArray" })
        @GET("azure/resource-flatten/array")
        @ExpectedResponses({200})
        Single<List<FlattenedProductInner>> getArray(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService putDictionary" })
        @PUT("azure/resource-flatten/dictionary")
        @ExpectedResponses({200})
        Single<Void> putDictionary(@BodyParam Map<String, FlattenedProductInner> resourceDictionary, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService getDictionary" })
        @GET("azure/resource-flatten/dictionary")
        @ExpectedResponses({200})
        Single<Map<String, FlattenedProductInner>> getDictionary(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService putResourceCollection" })
        @PUT("azure/resource-flatten/resourcecollection")
        @ExpectedResponses({200})
        Single<Void> putResourceCollection(@BodyParam ResourceCollectionInner resourceComplexObject, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureresource.AutoRestResourceFlatteningTestService getResourceCollection" })
        @GET("azure/resource-flatten/resourcecollection")
        @ExpectedResponses({200})
        Single<ResourceCollectionInner> getResourceCollection(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putArray() {
        putArrayAsync().toBlocking().value();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putArrayAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putArrayAsync(), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> putArrayAsync() {
        final List<Resource> resourceArray = null;
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent());
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putArray(List<Resource> resourceArray) {
        putArrayAsync(resourceArray).toBlocking().value();
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putArrayAsync(resourceArray), serviceCallback);
    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> putArrayAsync(List<Resource> resourceArray) {
        Validator.validate(resourceArray);
        return service.putArray(resourceArray, this.acceptLanguage(), this.userAgent());
    }


    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FlattenedProductInner&gt; object if successful.
     */
    public List<FlattenedProductInner> getArray() {
        return getArrayAsync().toBlocking().value();
    }

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FlattenedProductInner>> getArrayAsync(final ServiceCallback<List<FlattenedProductInner>> serviceCallback) {
        return ServiceFuture.fromBody(getArrayAsync(), serviceCallback);
    }

    /**
     * Get External Resource as an Array.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FlattenedProductInner&gt; object
     */
    public Single<List<FlattenedProductInner>> getArrayAsync() {
        return service.getArray(this.acceptLanguage(), this.userAgent());
    }


    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putDictionary() {
        putDictionaryAsync().toBlocking().value();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putDictionaryAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putDictionaryAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> putDictionaryAsync() {
        final Map<String, FlattenedProductInner> resourceDictionary = null;
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent());
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putDictionary(Map<String, FlattenedProductInner> resourceDictionary) {
        putDictionaryAsync(resourceDictionary).toBlocking().value();
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putDictionaryAsync(Map<String, FlattenedProductInner> resourceDictionary, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putDictionaryAsync(resourceDictionary), serviceCallback);
    }

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> putDictionaryAsync(Map<String, FlattenedProductInner> resourceDictionary) {
        Validator.validate(resourceDictionary);
        return service.putDictionary(resourceDictionary, this.acceptLanguage(), this.userAgent());
    }


    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, FlattenedProductInner&gt; object if successful.
     */
    public Map<String, FlattenedProductInner> getDictionary() {
        return getDictionaryAsync().toBlocking().value();
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Map<String, FlattenedProductInner>> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProductInner>> serviceCallback) {
        return ServiceFuture.fromBody(getDictionaryAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, FlattenedProductInner&gt; object
     */
    public Single<Map<String, FlattenedProductInner>> getDictionaryAsync() {
        return service.getDictionary(this.acceptLanguage(), this.userAgent());
    }


    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putResourceCollection() {
        putResourceCollectionAsync().toBlocking().value();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putResourceCollectionAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putResourceCollectionAsync(), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> putResourceCollectionAsync() {
        final ResourceCollectionInner resourceComplexObject = null;
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent());
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putResourceCollection(ResourceCollectionInner resourceComplexObject) {
        putResourceCollectionAsync(resourceComplexObject).toBlocking().value();
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putResourceCollectionAsync(ResourceCollectionInner resourceComplexObject, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putResourceCollectionAsync(resourceComplexObject), serviceCallback);
    }

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> putResourceCollectionAsync(ResourceCollectionInner resourceComplexObject) {
        Validator.validate(resourceComplexObject);
        return service.putResourceCollection(resourceComplexObject, this.acceptLanguage(), this.userAgent());
    }


    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceCollectionInner object if successful.
     */
    public ResourceCollectionInner getResourceCollection() {
        return getResourceCollectionAsync().toBlocking().value();
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceCollectionInner> getResourceCollectionAsync(final ServiceCallback<ResourceCollectionInner> serviceCallback) {
        return ServiceFuture.fromBody(getResourceCollectionAsync(), serviceCallback);
    }

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceCollectionInner object
     */
    public Single<ResourceCollectionInner> getResourceCollectionAsync() {
        return service.getResourceCollection(this.acceptLanguage(), this.userAgent());
    }


}
