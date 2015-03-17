package com.zosterops.ionicbeam.test;

import com.zosterops.ionicbeam.MessageFactory;
import com.zosterops.ionicbeam.data.TrackingState;
import com.zosterops.ionicbeam.data.Packet;

/**
 * Created by rusty on 10/03/2015.
 */
public class BasicTest {

    public static void main(String argv[])
    {
        Packet p = new TrackingState(true);
        MessageFactory fact = MessageFactory.getFactory(MessageFactory.Type.JSON);
        String s = fact.write(p);
        System.out.println("Packet: " + p.toString());

    }

}
