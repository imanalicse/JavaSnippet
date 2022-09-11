package com.imanali;

import com.imanali.learning.MapAndHashMap;

import java.time.Instant;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Channel iman = new Channel();

        Subscriber s1 = new Subscriber("Mukta");
        Subscriber s2 = new Subscriber("Ishak");
        Subscriber s3 = new Subscriber("Iman");

        iman.subscribe(s1);
        iman.subscribe(s2);
        iman.subscribe(s3);

        iman.unSubscribe(s1);

        s1.subscribeChannel(iman);
        s2.subscribeChannel(iman);
        s3.subscribeChannel(iman);

        iman.upload("How to learn programming?");
        System.out.println("JavaSnippet Started");
    }
}
