package com.zosterops.ionicbeam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zosterops.ionicbeam.data.Packet;

import java.io.IOException;

/**
 * Created by magicmicky on 17/03/15.
 */
public class JSonMessageFactory extends MessageFactory {
    private final ObjectMapper mapper = new ObjectMapper();
    public JSonMessageFactory() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    public Packet read(String data) {
        try {
            return mapper.readValue(data, Packet.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String write(Packet data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
