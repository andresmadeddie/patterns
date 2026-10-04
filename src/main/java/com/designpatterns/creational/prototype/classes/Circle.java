package com.designpatterns.creational.prototype.classes;

import com.designpatterns.creational.prototype.interfaces.Shape;

// ---------- CONCRETE PROTOTYPE: Circle ----------
public class Circle extends Shape {
    // Field specific to Circle
    public int radius;

    // Regular constructor
    public Circle() {
    }

    // Copy constructor: copies the Shape fields via super(source),
    // then its own radius
    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    // Creates a new Circle through the copy constructor
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle[x=" + x + ", y=" + y + ", color=" + color + ", radius=" + radius + "]";
    }
}