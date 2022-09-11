package com.imanali;

import com.imanali.learning.MapAndHashMap;

import java.time.Instant;
import java.time.LocalDateTime;

import java.io.*;
import com.imanali.factory.pattern.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Factory
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Enter the name of plan which the bill will be generated:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.println("Enter the number of units for the bill be calculated: ");
        int units = Integer.parseInt(br.readLine());

         Plan plan = planFactory.getPlan(planName);
        System.out.println("Bill amount for " + planName + " of " + units + " units is: ");
        plan.getRate();
        plan.calculateBill(units);

        // Observer patern
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
