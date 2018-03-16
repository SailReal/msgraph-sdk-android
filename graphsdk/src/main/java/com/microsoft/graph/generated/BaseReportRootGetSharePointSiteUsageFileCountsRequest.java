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
 * The class for the Base Report Root Get Share Point Site Usage File Counts Request.
 */
public class BaseReportRootGetSharePointSiteUsageFileCountsRequest extends BaseRequest implements IBaseReportRootGetSharePointSiteUsageFileCountsRequest {

    /**
     * The request for this ReportRootGetSharePointSiteUsageFileCounts
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseReportRootGetSharePointSiteUsageFileCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Report.class);
    }

    /**
     * Patches the ReportRootGetSharePointSiteUsageFileCounts
     * @param srcReport The Report with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(Report srcReport, final ICallback<Report> callback) {
        send(HttpMethod.PATCH, callback, srcReport);
    }

    /**
     * Patches the ReportRootGetSharePointSiteUsageFileCounts
     *
     * @param srcReport The Report with which to PATCH
     * @return The Report
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public Report patch(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PATCH, srcReport);
    }

    /**
     * Puts the ReportRootGetSharePointSiteUsageFileCounts
     *
     * @param srcReport The Report to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(Report srcReport, final ICallback<Report> callback) {
        send(HttpMethod.PUT, callback, srcReport);
    }

    /**
     * Puts the ReportRootGetSharePointSiteUsageFileCounts
     *
     * @param srcReport The Report to PUT
     * @return The Report
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public Report put(Report srcReport) throws ClientException {
        return this.send(HttpMethod.PUT, srcReport);
    }
    /**
     * Gets the Report
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Report> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Report
     *
     * @return The Report
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public Report get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IReportRootGetSharePointSiteUsageFileCountsRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ReportRootGetSharePointSiteUsageFileCountsRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IReportRootGetSharePointSiteUsageFileCountsRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ReportRootGetSharePointSiteUsageFileCountsRequest)this;
    }

}
