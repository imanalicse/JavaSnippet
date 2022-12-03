package com.imanali.learning.oop;

/**
 * Multiple methods can have the same name with different parameters:
 */
public class Overloading {

    public static int add(int a, int b) {
        System.out.println("Overloading method #1");
        return a + b;
    }

    public static float add(int a, float b) {
        System.out.println("Overloading method #2");
         return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("Overloading method #3");
        return a + b + c;
    }
}
