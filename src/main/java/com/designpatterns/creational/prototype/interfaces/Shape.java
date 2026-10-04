package com.designpatterns.creational.prototype.interfaces;

// ---------- BASE PROTOTYPE ----------
// Abstract base class: declares the shared fields and the clone contract.
public abstract class Shape {
    // Fields common to all shapes (public only to mirror the pseudocode)
    public int x; // X shape position in canvas
    public int y; // Y shape position in canvas
    public String color;

    // Regular constructor: creates a blank shape, needed due super() use in
    // subclasses
    public Shape() {
    }

    // Prototype (copy) constructor: builds a new shape initialized
    // with the values of an existing one. It is protected so only
    // subclasses can call it through super(source).
    protected Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    // The clone operation. Each subclass returns a copy of itself,
    // so callers get the real type without knowing it.
    public abstract Shape clone();
}