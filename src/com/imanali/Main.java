package com.imanali;

import java.io.*;
import com.imanali.factory.pattern.*;

public class Main {

    public static void main(String[] args) throws IOException {
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
    }
}
