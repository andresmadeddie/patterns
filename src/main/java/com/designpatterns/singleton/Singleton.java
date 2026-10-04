package com.designpatterns.singleton;

public class Singleton {

    // Stores the single instance of the class
    private static volatile Singleton instance; // volatile ensures visibility across threads

    // Private constructor prevents creating instances with new
    private Singleton() {
    }

    // Returns the existing instance or creates one if needed
    public static Singleton getInstance() {

        // Lazy loading: create the instance only when first requested
        if (instance == null) {
            // syncronized ensures only one thread at a time can execute this method code
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    System.out.println("new instance created");
                }
            }
        }

        return instance;
    }
}