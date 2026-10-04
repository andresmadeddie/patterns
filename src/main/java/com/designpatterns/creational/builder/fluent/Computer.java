package com.designpatterns.creational.builder.fluent;

// Product: immutable, constructed only through its Builder
class Computer {
    private final String cpu; // required
    private final String ram; // optional
    private final String storage; // optional

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:\n"
                + "CPU: " + cpu + "\n"
                + "RAM: " + ram + "\n"
                + "Storage: " + storage + "\n");
    }

    // Static nested builder
    public static class Builder {
        private String cpu; // required, no default
        private String ram = "8GB DDR4"; // optional, default
        private String storage = "256GB SSD"; // optional, default

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            if (cpu == null) {
                throw new IllegalStateException("cpu is required");
            }
            return new Computer(this);
        }
    }
}