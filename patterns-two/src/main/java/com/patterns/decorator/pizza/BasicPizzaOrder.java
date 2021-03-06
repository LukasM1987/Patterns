package com.patterns.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {


    @Override
    public BigDecimal getCost() {
        return new BigDecimal(30);
    }

    @Override
    public String getDescription() {
        return "Pizza with cheese";
    }
}
