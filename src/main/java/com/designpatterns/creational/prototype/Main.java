package com.designpatterns.creational.prototype;

import java.util.List;

import com.designpatterns.creational.prototype.classes.Application;
import com.designpatterns.creational.prototype.classes.Circle;
import com.designpatterns.creational.prototype.classes.Rectangle;
import com.designpatterns.creational.prototype.interfaces.Shape;

// ---------- ENTRY POINT ----------
// The only place that creates the originals with "new", so it is the only
// class that names Circle and Rectangle.
public class Main {
    public static void main(String[] args) {
        Application app = new Application();

        // Create an original circle with the normal "new"
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.color = "red";
        circle.radius = 20;
        app.addShape(circle);

        // Create an original rectangle with the normal "new"
        Rectangle rectangle = new Rectangle();
        rectangle.color = "blue";
        rectangle.width = 10;
        rectangle.height = 20;
        app.addShape(rectangle);

        // Clone everything already stored. No "new Circle()" or "new Rectangle()" here.
        List<Shape> copies = app.cloneAllShapes();

        // Visualize Originals vs Clones
        System.out.println("--- Originals ---");
        System.out.println(circle);
        System.out.println(rectangle);

        System.out.println("--- Clones ---");
        for (Shape copy : copies) {
            System.out.println(copy);
        }

        // Prove the clone is a separate object:
        copies.get(0).x = 99; // Change x on the cloned circle only
        // Compare the original, which remains 10, with the clone, which was changed to
        // 99
        System.out.println(
                "\nPROVE CLONE IS A SEPARATE OBJECT: The X value for the cloned circle was changed to 99"
                        + "\nOriginal Circle x value: " + circle.x
                        + "\nClone Circle x value: " + copies.get(0).x);
    }
}