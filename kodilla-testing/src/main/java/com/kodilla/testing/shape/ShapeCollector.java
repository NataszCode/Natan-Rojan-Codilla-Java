package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector {
    private final ArrayList<Shape> shapes;

    public ShapeCollector() {
        shapes = new ArrayList<>();
    }

    // Metoda dodająca figurę do kolekcji
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // Metoda usuwająca figurę z kolekcji
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    // Metoda pobierająca z kolekcji figurę z pozycji n listy
    public Shape getShape(int index) {
        if (index >= 0 && index < shapes.size()) {
            return shapes.get(index);
        }
        return null;
    }

    // Metoda zwracająca nazwy wszystkich figur w postaci jednego Stringa
    public String getAllShapes() {
        StringBuilder result = new StringBuilder();
        for (Shape shape : shapes) {
            result.append(shape.getShapeName()).append(", ");
        }
        // Usunięcie ostatniego przecinka i spacji
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }
}
