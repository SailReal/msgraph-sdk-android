// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Group Lifecycle Policy Collection Page.
 */
public class GroupLifecyclePolicyCollectionPage extends BaseGroupLifecyclePolicyCollectionPage implements IGroupLifecyclePolicyCollectionPage {

    /**
     * A collection page for GroupLifecyclePolicy.
     *
     * @param response The serialized BaseGroupLifecyclePolicyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public GroupLifecyclePolicyCollectionPage(final BaseGroupLifecyclePolicyCollectionResponse response, final IGroupLifecyclePolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
