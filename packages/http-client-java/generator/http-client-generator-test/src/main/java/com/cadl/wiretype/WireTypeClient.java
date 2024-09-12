// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.wiretype;

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
import com.cadl.wiretype.implementation.WireTypeOpsImpl;
import com.cadl.wiretype.models.SubClass;
import com.cadl.wiretype.models.SubClassBothMismatch;
import com.cadl.wiretype.models.SubClassMismatch;

/**
 * Initializes a new instance of the synchronous WireTypeClient type.
 */
@ServiceClient(builder = WireTypeClientBuilder.class)
public final class WireTypeClient {
    @Generated
    private final WireTypeOpsImpl serviceClient;

    /**
     * Initializes an instance of WireTypeClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    WireTypeClient(WireTypeOpsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The superClassMismatch operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     dateTimeRfc7231: DateTimeRfc1123 (Required)
     *     dateTime: OffsetDateTime (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     dateTimeRfc7231: DateTimeRfc1123 (Required)
     *     dateTime: OffsetDateTime (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> superClassMismatchWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.superClassMismatchWithResponse(body, requestOptions);
    }

    /**
     * The subClassMismatch operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     dateTime: OffsetDateTime (Required)
     *     dateTimeRfc7231: DateTimeRfc1123 (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     dateTime: OffsetDateTime (Required)
     *     dateTimeRfc7231: DateTimeRfc1123 (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> subClassMismatchWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.subClassMismatchWithResponse(body, requestOptions);
    }

    /**
     * The bothClassMismatch operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     dateTimeRfc7231: DateTimeRfc1123 (Required)
     *     base64url: Base64Url (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     dateTimeRfc7231: DateTimeRfc1123 (Required)
     *     base64url: Base64Url (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> bothClassMismatchWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.bothClassMismatchWithResponse(body, requestOptions);
    }

    /**
     * The superClassMismatch operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubClass superClassMismatch(SubClass body) {
        // Generated convenience method for superClassMismatchWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return superClassMismatchWithResponse(BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(SubClass.class);
    }

    /**
     * The subClassMismatch operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubClassMismatch subClassMismatch(SubClassMismatch body) {
        // Generated convenience method for subClassMismatchWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return subClassMismatchWithResponse(BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(SubClassMismatch.class);
    }

    /**
     * The bothClassMismatch operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubClassBothMismatch bothClassMismatch(SubClassBothMismatch body) {
        // Generated convenience method for bothClassMismatchWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return bothClassMismatchWithResponse(BinaryData.fromObject(body), requestOptions).getValue()
            .toObject(SubClassBothMismatch.class);
    }
}
