package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {
    @Test
    public void testRemoveShape () {
        ShapeCollector collector = new ShapeCollector();

        collector.addShape(new Square(5));
        Circle circle = new Circle(3);
        collector.addShape(circle);
        collector.addShape(new Triangle(4, 6));

        System.out.println("Figury w kolekcji: " + collector.getAllShapes());
        assertEquals("Square, Circle, Triangle", collector.getAllShapes());

        collector.removeShape(circle);
        assertEquals("Square, Triangle", collector.getAllShapes());

        System.out.println("Figury po usunięciu koła: " + collector.getAllShapes());
    }
}
