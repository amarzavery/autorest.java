/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.implementation;

import com.microsoft.rest.RestProxy;
import fixtures.http.HttpServerFailures;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.DELETE;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.HEAD;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.POST;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.http.models.Error;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpServerFailures.
 */
public class HttpServerFailuresImpl implements HttpServerFailures {
    /** The RestProxy service to perform REST calls. */
    private HttpServerFailuresService service;
    /** The service client containing this operation class. */
    private AutoRestHttpInfrastructureTestServiceImpl client;

    /**
     * Initializes an instance of HttpServerFailures.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpServerFailuresImpl(AutoRestHttpInfrastructureTestServiceImpl client) {
        this.service = RestProxy.create(HttpServerFailuresService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpServerFailures to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface HttpServerFailuresService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpServerFailures head501" })
        @HEAD("http/failure/server/501")
        @ExpectedResponses({})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Error> head501();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpServerFailures get501" })
        @GET("http/failure/server/501")
        @ExpectedResponses({})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Error> get501();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpServerFailures post505" })
        @POST("http/failure/server/505")
        @ExpectedResponses({})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Error> post505(@BodyParam Boolean booleanValue);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpServerFailures delete505" })
        @DELETE("http/failure/server/505")
        @ExpectedResponses({})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Error> delete505(@BodyParam Boolean booleanValue);

    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    public Error head501() {
        return head501Async().toBlocking().value();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Error> head501Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(head501Async(), serviceCallback);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    public Single<Error> head501Async() {
        return service.head501();
    }


    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    public Error get501() {
        return get501Async().toBlocking().value();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Error> get501Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(get501Async(), serviceCallback);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    public Single<Error> get501Async() {
        return service.get501();
    }


    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    public Error post505() {
        return post505Async().toBlocking().value();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Error> post505Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(post505Async(), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    public Single<Error> post505Async() {
        final Boolean booleanValue = null;
        return service.post505(booleanValue);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    public Error post505(Boolean booleanValue) {
        return post505Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Error> post505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(post505Async(booleanValue), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    public Single<Error> post505Async(Boolean booleanValue) {
        return service.post505(booleanValue);
    }


    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    public Error delete505() {
        return delete505Async().toBlocking().value();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Error> delete505Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(delete505Async(), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    public Single<Error> delete505Async() {
        final Boolean booleanValue = null;
        return service.delete505(booleanValue);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    public Error delete505(Boolean booleanValue) {
        return delete505Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Error> delete505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(delete505Async(booleanValue), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    public Single<Error> delete505Async(Boolean booleanValue) {
        return service.delete505(booleanValue);
    }


}
