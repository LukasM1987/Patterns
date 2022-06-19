package com.patterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTestSuite {

    @Test
    void testFactoryCircle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();

        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);

        //Then
        assertEquals(Math.PI * Math.pow(2.0, 2.0), circle.getArea(), 0);
        assertEquals("Circle", circle.getName());
    }

    @Test
    void testFactoryRectangle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();

        //When
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);

        //Then
        assertEquals(16.0, rectangle.getCircumference());
        assertEquals("Rectangle", rectangle.getName());

    }
}
