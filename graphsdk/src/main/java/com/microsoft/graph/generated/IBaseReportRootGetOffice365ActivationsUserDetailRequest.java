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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Office365Activations User Detail Request.
 */
public interface IBaseReportRootGetOffice365ActivationsUserDetailRequest {

    /**
     * Patches the ReportRootGetOffice365ActivationsUserDetail
     *
     * @param srcReport The Report with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    void patch(Report srcReport, final ICallback<Report> callback);

    /**
     * Patches the ReportRootGetOffice365ActivationsUserDetail
     *
     * @param srcReport The Report with which to PATCH
     * @return The Report
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    Report patch(Report srcReport) throws ClientException;

    /**
     * Puts the ReportRootGetOffice365ActivationsUserDetail
     *
     * @param srcReport The Report to PUT
     * @param callback The callback to be called after success or failure
     */
    void put(Report srcReport, final ICallback<Report> callback);

    /**
     * Puts the ReportRootGetOffice365ActivationsUserDetail
     *
     * @param srcReport The Report to PUT
     * @return The Report
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     Report put(Report srcReport) throws ClientException;
    /**
     * Gets the Report
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Report> callback);

    /**
     * Gets the Report
     *
     * @return The Report
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    Report get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IReportRootGetOffice365ActivationsUserDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IReportRootGetOffice365ActivationsUserDetailRequest expand(final String value);

}
