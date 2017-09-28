/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head.implementation;

import fixtures.head.HttpSuccess;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.HEAD;
import com.microsoft.rest.annotations.HeaderParam;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public class HttpSuccessImpl implements HttpSuccess {
    /** The RestProxy service to perform REST calls. */
    private HttpSuccessService service;
    /** The service client containing this operation class. */
    private AutoRestHeadTestServiceImpl client;

    /**
     * Initializes an instance of HttpSuccessImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpSuccessImpl(AutoRestHeadTestServiceImpl client) {
        this.service = AzureProxy.create(HttpSuccessService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpSuccess to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("http://localhost")
    interface HttpSuccessService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.head.HttpSuccess head200" })
        @HEAD("http/success/200")
        @ExpectedResponses({200, 404})
        Single<Boolean> head200(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.head.HttpSuccess head204" })
        @HEAD("http/success/204")
        @ExpectedResponses({204, 404})
        Single<Boolean> head204(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.head.HttpSuccess head404" })
        @HEAD("http/success/404")
        @ExpectedResponses({204, 404})
        Single<Boolean> head404(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head200() {
        return head200Async().toBlocking().value();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head200Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Single<Boolean> head200Async() {
        return service.head200(this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head204() {
        return head204Async().toBlocking().value();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head204Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Single<Boolean> head204Async() {
        return service.head204(this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head404() {
        return head404Async().toBlocking().value();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head404Async(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Single<Boolean> head404Async() {
        return service.head404(this.client.acceptLanguage(), this.client.userAgent());
    }


}
