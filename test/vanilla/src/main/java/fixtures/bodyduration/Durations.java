/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.bodyduration.models.ErrorException;
import java.io.IOException;
import org.joda.time.Period;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Durations.
 */
public interface Durations {
    /**
     * Get null duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Period object if successful.
     */
    Period getNull();

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Period> getNullAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Get null duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Period object
     */
    Single<Period> getNullAsync();


    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putPositiveDuration(Period durationBody);

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> putPositiveDurationAsync(Period durationBody);


    /**
     * Get a positive duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Period object if successful.
     */
    Period getPositiveDuration();

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Period> getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Get a positive duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Period object
     */
    Single<Period> getPositiveDurationAsync();


    /**
     * Get an invalid duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Period object if successful.
     */
    Period getInvalid();

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Period> getInvalidAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Get an invalid duration value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Period object
     */
    Single<Period> getInvalidAsync();


}
