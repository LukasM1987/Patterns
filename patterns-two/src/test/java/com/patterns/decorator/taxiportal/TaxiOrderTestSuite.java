package com.patterns.decorator.taxiportal;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxiOrderTestSuite {

    @Test
    void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        //When
        BigDecimal calculatedCost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course", description);
    }

    @Test
    void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(40), cost);
    }

    @Test
    void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    void testMyTaxiNetworkChildSeatGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        BigDecimal cost = taxiOrder.getCost();

        //Then
        assertEquals(new BigDecimal(47), cost);
    }

    @Test
    void testMyTaxiNetworkChildSeatGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        //When
        String description = taxiOrder.getDescription();

        //Then
        assertEquals("Drive a course by My Taxi Network + child seat", description);
    }
}
