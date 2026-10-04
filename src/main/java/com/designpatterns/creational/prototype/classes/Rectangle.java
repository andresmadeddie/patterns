package com.designpatterns.creational.prototype.classes;

import com.designpatterns.creational.prototype.interfaces.Shape;

// ---------- CONCRETE PROTOTYPE: Rectangle ----------
public class Rectangle extends Shape {
    // Fields specific to Rectangle
    public int width;
    public int height;

    // Regular constructor
    public Rectangle() {
    }

    // Copy constructor: super(source) copies the fields defined in
    // Shape (x, y, color), then Rectangle copies its own.
    // All copying happens here, so no one can hold a reference to a
    // partially built clone.
    public Rectangle(Rectangle source) {
        super(source); // copies x, y and color from source
        this.width = source.width;
        this.height = source.height;
    }

    // Creates a new Rectangle by passing the current object to the
    // copy constructor.
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle[x=" + x + ", y=" + y + ", color=" + color
                + ", width=" + width + ", height=" + height + "]";
    }
}