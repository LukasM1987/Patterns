package com.patterns.decorator.pizza;

import java.math.BigDecimal;

public class Salami extends AbstractPizzaOrderDecorator {

    protected Salami(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        // hardcoded stub cost = 2
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + salami";
    }
}
