package com.patterns.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {

    protected MyTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        // hardcoded stub cost = 40
        return super.getCost().add(new BigDecimal(40));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by My Taxi Network";
    }
}
