package com.imanali.learning;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void demo() {
        String[] cars = new String[4];
        cars[0] = "Tesla";

        String[] fruitsArray = { "Apple", "Banana" }; // fixed size 2. Cannot increase size.
        ArrayList<String> fruitsArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana")); // Dynamic size array

        // Accessing element
        System.out.println(fruitsArray[1]);
        System.out.println(fruitsArrayList.get(1));

        // get Size
        System.out.println(fruitsArray.length);
        System.out.println(fruitsArrayList.size());

        //Add an element
        //Arrays - Cannot add an element to the end of the array due to it having a fixed size
        fruitsArrayList.add("Papaya");

        //Set an element
        fruitsArray[0] = "Guava";
        fruitsArrayList.set(0, "Guava");

        // Remove an element
        //Arrays - Cannot remove elements, due to its fixed size
        // fruitsArrayList.remove(1);
        fruitsArrayList.remove("Banana");

        // Print
        System.out.println(fruitsArray); // Print memory address of an array
        System.out.println(fruitsArrayList); // Print
        // Printing Arrays is pretty useless, Printing ArrayLists works perfectly
    }
}
