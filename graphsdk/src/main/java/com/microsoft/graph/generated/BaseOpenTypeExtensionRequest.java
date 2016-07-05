// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Open Type Extension Request.
 */
public class BaseOpenTypeExtensionRequest extends BaseRequest implements IBaseOpenTypeExtensionRequest {

    /**
     * The request for the OpenTypeExtension
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseOpenTypeExtensionRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the OpenTypeExtension from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<OpenTypeExtension> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OpenTypeExtension from the service
     * @return The OpenTypeExtension from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OpenTypeExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this OpenTypeExtension with a source
     * @param sourceOpenTypeExtension The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final OpenTypeExtension sourceOpenTypeExtension, final ICallback<OpenTypeExtension> callback) {
        send(HttpMethod.PATCH, callback, sourceOpenTypeExtension);
    }

    /**
     * Patches this OpenTypeExtension with a source
     * @param sourceOpenTypeExtension The source object with updates
     * @return The updated OpenTypeExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OpenTypeExtension patch(final OpenTypeExtension sourceOpenTypeExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourceOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     * @param newOpenTypeExtension The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final OpenTypeExtension newOpenTypeExtension, final ICallback<OpenTypeExtension> callback) {
        send(HttpMethod.POST, callback, newOpenTypeExtension);
    }

    /**
     * Creates a OpenTypeExtension with a new object
     * @param newOpenTypeExtension The new object to create
     * @return The created OpenTypeExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OpenTypeExtension post(final OpenTypeExtension newOpenTypeExtension) throws ClientException {
        return send(HttpMethod.POST, newOpenTypeExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOpenTypeExtensionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (OpenTypeExtensionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOpenTypeExtensionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (OpenTypeExtensionRequest)this;
     }

}