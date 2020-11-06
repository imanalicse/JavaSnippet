package com.imanali;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.printMessage("This is first message");
        Singleton singleton2 = Singleton.getInstance();
        singleton2.printMessage("This is second message");
    }
}
