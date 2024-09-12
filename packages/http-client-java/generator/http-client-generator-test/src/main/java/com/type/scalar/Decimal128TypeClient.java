// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.scalar;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.type.scalar.implementation.Decimal128TypesImpl;
import java.math.BigDecimal;

/**
 * Initializes a new instance of the synchronous ScalarClient type.
 */
@ServiceClient(builder = ScalarClientBuilder.class)
public final class Decimal128TypeClient {
    @Generated
    private final Decimal128TypesImpl serviceClient;

    /**
     * Initializes an instance of Decimal128TypeClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    Decimal128TypeClient(Decimal128TypesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The responseBody operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * BigDecimal
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a 128-bit decimal number along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> responseBodyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.responseBodyWithResponse(requestOptions);
    }

    /**
     * The requestBody operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BigDecimal
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> requestBodyWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.requestBodyWithResponse(body, requestOptions);
    }

    /**
     * The requestParameter operation.
     * 
     * @param value The value parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> requestParameterWithResponse(BigDecimal value, RequestOptions requestOptions) {
        return this.serviceClient.requestParameterWithResponse(value, requestOptions);
    }

    /**
     * The responseBody operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a 128-bit decimal number.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BigDecimal responseBody() {
        // Generated convenience method for responseBodyWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return responseBodyWithResponse(requestOptions).getValue().toObject(BigDecimal.class);
    }

    /**
     * The requestBody operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void requestBody(BigDecimal body) {
        // Generated convenience method for requestBodyWithResponse
        RequestOptions requestOptions = new RequestOptions();
        requestBodyWithResponse(BinaryData.fromObject(body), requestOptions).getValue();
    }

    /**
     * The requestParameter operation.
     * 
     * @param value The value parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void requestParameter(BigDecimal value) {
        // Generated convenience method for requestParameterWithResponse
        RequestOptions requestOptions = new RequestOptions();
        requestParameterWithResponse(value, requestOptions).getValue();
    }
}
