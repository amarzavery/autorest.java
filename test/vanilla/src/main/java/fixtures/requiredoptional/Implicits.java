/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.requiredoptional.models.Error;
import fixtures.requiredoptional.models.ErrorException;
import java.io.IOException;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Implicits.
 */
public interface Implicits {
    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getRequiredPath(String pathParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> getRequiredPathAsync(String pathParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Single<Error> getRequiredPathAsync(String pathParameter);


    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalQuery();

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putOptionalQueryAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> putOptionalQueryAsync();
    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalQuery(String queryParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putOptionalQueryAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> putOptionalQueryAsync(String queryParameter);


    /**
     * Test implicitly optional header parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalHeader();

    /**
     * Test implicitly optional header parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putOptionalHeaderAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional header parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> putOptionalHeaderAsync();
    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalHeader(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putOptionalHeaderAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> putOptionalHeaderAsync(String queryParameter);


    /**
     * Test implicitly optional body parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalBody();

    /**
     * Test implicitly optional body parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putOptionalBodyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional body parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> putOptionalBodyAsync();
    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalBody(String bodyParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putOptionalBodyAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> putOptionalBodyAsync(String bodyParameter);


    /**
     * Test implicitly required path parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getRequiredGlobalPath();

    /**
     * Test implicitly required path parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> getRequiredGlobalPathAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required path parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Single<Error> getRequiredGlobalPathAsync();


    /**
     * Test implicitly required query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getRequiredGlobalQuery();

    /**
     * Test implicitly required query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> getRequiredGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Single<Error> getRequiredGlobalQueryAsync();


    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getOptionalGlobalQuery();

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Error> getOptionalGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Error object
     */
    Single<Error> getOptionalGlobalQueryAsync();


}
