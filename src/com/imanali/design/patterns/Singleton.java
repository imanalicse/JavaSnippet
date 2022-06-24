package com.imanali.design.patterns;

public class Singleton {
    private static int counter = 0;
    private static Singleton instance = null;

    private Singleton() {
        counter++;
        System.out.println("Counter value = " + counter);
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
