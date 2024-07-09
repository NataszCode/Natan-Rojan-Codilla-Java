package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy groceries", "Milk", 2.0);
            case PAINTING:
                return new PaintingTask("Paint room", "Blue", "Living room wall");
            case DRIVING:
                return new DrivingTask("Drive to work", "Office", "Car");
            default:
                return null;
        }
    }
}
