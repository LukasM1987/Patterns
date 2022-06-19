package com.patterns.factory;

public class ShapeFactory {

    public static final String CIRCLE = "Circle";
    public static final String SQUARE = "Square";
    public static final String RECTANGLE = "Rectangle";

    public final Shape makeShape(final String shapeClass) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("Circle", 2.0);
            case SQUARE:
                return new Square("Square", 4.0);
            case RECTANGLE:
                return new Rectangle("Rectangle", 5.0, 3.0);
            default:
                return null;
        }
    }
}
