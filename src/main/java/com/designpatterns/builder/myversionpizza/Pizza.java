package com.designpatterns.builder.myversionpizza;

// Product
class Pizza {
    private final String size; // required
    private final boolean cheese, pepperoni, mushrooms; // optional

    // private: only Builder can create a Pizza
    private Pizza(Builder b) {
        this.size = b.size;
        this.cheese = b.cheese;
        this.pepperoni = b.pepperoni;
        this.mushrooms = b.mushrooms;
    }

    // NOT REQUIRED: Added only for printing in main
    @Override
    public String toString() {
        return "Pizza{size=" + size
                + ", cheese=" + cheese
                + ", pepperoni=" + pepperoni
                + ", mushrooms=" + mushrooms + "}";
    }

    // static nested builder (Inner class)
    static class Builder {
        private final String size; // required, set in constructor
        private boolean cheese, pepperoni, mushrooms; // optional, default false

        Builder(String size) {
            this.size = size;
        } // required params here

        Builder cheese() {
            cheese = true;
            return this;
        } // return this = chaining

        Builder pepperoni() {
            pepperoni = true;
            return this;
        }

        Builder mushrooms() {
            mushrooms = true;
            return this;
        }

        Pizza build() {
            return new Pizza(this);
        } // final step (validate here if needed)
    }
}