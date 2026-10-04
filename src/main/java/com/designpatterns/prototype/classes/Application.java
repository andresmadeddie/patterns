package com.designpatterns.prototype.classes;

import java.util.ArrayList;
import java.util.List;

import com.designpatterns.prototype.interfaces.Shape;

// ---------- CLIENT ----------
// Only knows the Shape type, never Circle or Rectangle.
public class Application {
    // Holds the original shapes. Typed as the base class, so it accepts any Shape.
    private final List<Shape> shapes = new ArrayList<>();

    // Stores an already-created shape. It could be a Circle, a Rectangle, or any
    // future Shape.
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // The Prototype logic: returns a copy of every stored shape.
    public List<Shape> cloneAllShapes() {
        List<Shape> shapesCopy = new ArrayList<>();

        // Each element is only known as a Shape. Polymorphism makes each one
        // run its own clone(), so Circles stay Circles and Rectangles stay Rectangles.
        for (Shape s : shapes) {
            shapesCopy.add(s.clone());
        }
        return shapesCopy;
    }
}