package com.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Fruits", 3.0);
            case PAINTING:
                return new PaintingTask("Painting", "Blue", "Garage");
            case DRIVING:
                return new DrivingTask("Driving", "Train Station", "Car");
            default:
                return null;
        }
    }
}
