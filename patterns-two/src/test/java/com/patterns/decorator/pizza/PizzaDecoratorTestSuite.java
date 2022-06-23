package com.patterns.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaDecoratorTestSuite {

    @Test
    void testMyPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        pizzaOrder = new Salami(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(37), cost);
    }

    @Test
    void testMyPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheese(pizzaOrder);
        pizzaOrder = new Salami(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza with cheese + extra cheese + salami", description);

    }
}
