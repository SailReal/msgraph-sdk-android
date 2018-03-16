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
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Education User Reference Request.
 */
public interface IBaseEducationUserReferenceRequest extends IHttpRequest {

    void delete(final ICallback<EducationUser> callback);

    EducationUser delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseEducationUserReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseEducationUserReferenceRequest expand(final String value);

    /**
     * Puts the EducationUser
     *
     * @param srcEducationUser The EducationUser to PUT
     * @param callback The callback to be called after success or failure
     */
    void put(EducationUser srcEducationUser, final ICallback<EducationUser> callback);

    /**
     * Puts the EducationUser
     *
     * @param srcEducationUser The EducationUser to PUT
     * @return The EducationUser
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    EducationUser put(EducationUser srcEducationUser) throws ClientException;
}
