package com.zosterops.ionicbeam.data;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by rusty on 10/03/2015.
 */

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")

@JsonSubTypes({
        @JsonSubTypes.Type(value = Movement.class, name = "movement"),
        @JsonSubTypes.Type(value = StreamState.class, name = "stream_state"),
        @JsonSubTypes.Type(value = TrackingState.class, name = "tracking_state")})
public interface Packet {
}
