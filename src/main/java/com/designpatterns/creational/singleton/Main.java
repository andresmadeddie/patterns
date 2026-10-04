package com.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        // Get the single Singleton instance
        Singleton singleton = Singleton.getInstance();
        System.out.println("first: " + singleton);

        System.out.println("\n\ncalling new instance\n");

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("second: " + singleton2);

        // Cannot create a Singleton directly
        // Singleton singleton = new Singleton();
    }
}
