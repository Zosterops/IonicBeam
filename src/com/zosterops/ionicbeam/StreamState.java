package com.zosterops.ionicbeam;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rusty on 10/03/2015.
 */
public class StreamState implements Packet{

    private boolean status;

    public StreamState(@JsonProperty(value = "status", required = true) boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
