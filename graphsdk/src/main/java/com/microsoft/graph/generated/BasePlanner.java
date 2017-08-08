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
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner.
 */
public class BasePlanner extends Entity implements IJsonBackedObject {


    public BasePlanner() {
        oDataType = "microsoft.graph.planner";
    }

    /**
     * The Tasks.
	 * Read-only. Nullable. Returns a collection of the specified tasks
     */
    public transient PlannerTaskCollectionPage tasks;

    /**
     * The Plans.
	 * Read-only. Nullable. Returns a collection of the specified plans
     */
    public transient PlannerPlanCollectionPage plans;

    /**
     * The Buckets.
	 * Read-only. Nullable. Returns a collection of the specified buckets
     */
    public transient PlannerBucketCollectionPage buckets;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("tasks")) {
            final BasePlannerTaskCollectionResponse response = new BasePlannerTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final PlannerTask[] array = new PlannerTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new PlannerTaskCollectionPage(response, null);
        }

        if (json.has("plans")) {
            final BasePlannerPlanCollectionResponse response = new BasePlannerPlanCollectionResponse();
            if (json.has("plans@odata.nextLink")) {
                response.nextLink = json.get("plans@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("plans").toString(), JsonObject[].class);
            final PlannerPlan[] array = new PlannerPlan[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerPlan.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            plans = new PlannerPlanCollectionPage(response, null);
        }

        if (json.has("buckets")) {
            final BasePlannerBucketCollectionResponse response = new BasePlannerBucketCollectionResponse();
            if (json.has("buckets@odata.nextLink")) {
                response.nextLink = json.get("buckets@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("buckets").toString(), JsonObject[].class);
            final PlannerBucket[] array = new PlannerBucket[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerBucket.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            buckets = new PlannerBucketCollectionPage(response, null);
        }
    }
}
