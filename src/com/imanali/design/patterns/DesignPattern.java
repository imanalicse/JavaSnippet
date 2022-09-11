package com.imanali.design.patterns;

public class DesignPattern {
    public static void singleTon() {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.printMessage("This is first message");
        Singleton singleton2 = Singleton.getInstance();
        singleton2.printMessage("This is second message");
    }
}
