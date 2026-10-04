package com.designpatterns.creational.builder.myversionpizza;

// Client
public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza.Builder("large") // required value
                .cheese() // optional toppings
                .pepperoni()
                .build(); // create the Pizza

        System.out.println(p);
    }
}
