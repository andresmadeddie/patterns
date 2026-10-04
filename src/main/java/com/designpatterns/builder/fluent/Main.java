package com.designpatterns.builder.fluent;

// Client
public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
                .cpu("Gaming CPU (8-core, high clock)")
                .ram("32GB DDR5")
                .storage("2TB NVMe SSD")
                .build();

        // ram and storage use their defaults
        Computer officeComputer = new Computer.Builder()
                .cpu("Office CPU (4-core, low power)")
                .build();

        gamingComputer.displayInfo();
        officeComputer.displayInfo();
    }
}