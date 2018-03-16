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
 * The class for the Base Report Root Get Office365Groups Activity Group Counts Request Builder.
 */
public class BaseReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365GroupsActivityGroupCounts
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetOffice365GroupsActivityGroupCountsRequest
     *
     * @return The IReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    public IReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetOffice365GroupsActivityGroupCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    public IReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest(final java.util.List<Option> requestOptions) {
        ReportRootGetOffice365GroupsActivityGroupCountsRequest request = new ReportRootGetOffice365GroupsActivityGroupCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
