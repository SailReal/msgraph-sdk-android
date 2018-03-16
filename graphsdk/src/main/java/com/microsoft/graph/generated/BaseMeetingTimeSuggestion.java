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
 * The class for the Base Meeting Time Suggestion.
 */
public class BaseMeetingTimeSuggestion implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Meeting Time Slot.
     * A time period suggested for the meeting.
     */
    @SerializedName("meetingTimeSlot")
    @Expose
    public TimeSlot meetingTimeSlot;

    /**
     * The Confidence.
     * A percentage that represents the likelhood of all the attendees attending.
     */
    @SerializedName("confidence")
    @Expose
    public Double confidence;

    /**
     * The Organizer Availability.
     * Availability of the meeting organizer for this meeting suggestion. Possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    @SerializedName("organizerAvailability")
    @Expose
    public FreeBusyStatus organizerAvailability;

    /**
     * The Attendee Availability.
     * An array that shows the availability status of each attendee for this meeting suggestion.
     */
    @SerializedName("attendeeAvailability")
    @Expose
    public java.util.List<AttendeeAvailability> attendeeAvailability;

    /**
     * The Locations.
     * An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
     */
    @SerializedName("locations")
    @Expose
    public java.util.List<Location> locations;

    /**
     * The Suggestion Reason.
     * Reason for suggesting the meeting time.
     */
    @SerializedName("suggestionReason")
    @Expose
    public String suggestionReason;


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

    }
}
