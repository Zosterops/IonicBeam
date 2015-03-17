package com.zosterops.ionicbeam;

import com.zosterops.ionicbeam.data.Packet;

/**
 * Created by magicmicky on 17/03/15.
 */
public abstract class MessageFactory {
    public static MessageFactory getFactory(Type type) {
        switch(type) {
            case JSON:
                return new JSonMessageFactory();
        }
        return null;
    }
    public abstract Packet read(String data);
    public abstract String write(Packet data);

        public enum Type {
        JSON
    }
}
