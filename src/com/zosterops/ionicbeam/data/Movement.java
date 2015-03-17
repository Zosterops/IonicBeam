package com.zosterops.ionicbeam.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rusty on 10/03/2015.
 */
public class Movement implements Packet {

    private Integer x;
    private Integer y;

    public Movement(@JsonProperty(value = "x", required = true) Integer x,
                    @JsonProperty(value = "y", required = true) Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
