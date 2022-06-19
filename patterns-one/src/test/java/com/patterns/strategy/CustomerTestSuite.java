package com.patterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTestSuite {

    @Test
    void testDefaultInvestingStrategy() {
        //Given
        Customer customerOne = new IndividualCustomer("Customer 1");
        Customer customerTwo = new IndividualYoungCustomer("Customer 2");
        Customer customerThree = new CorporateCustomer("Customer 3");

        //When
        String customerOneShouldBuy = customerOne.predict();
        System.out.println("Customer One should: " + customerOneShouldBuy);
        String customerTwoShouldBuy = customerTwo.predict();
        System.out.println("Customer Two should: " + customerTwoShouldBuy);
        String customerThreeShouldBuy = customerThree.predict();
        System.out.println("Customer Three should: " + customerThreeShouldBuy);

        //Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ",  customerOneShouldBuy);
        assertEquals("[Aggressive predictor] Buy stock of XYZ",  customerTwoShouldBuy);
        assertEquals("[Balance predictor] Buy shared units of Fund XYZ",  customerThreeShouldBuy);

    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        Customer customer = new IndividualCustomer("Customer");

        //When
        String customerShouldBuy = customer.predict();
        System.out.println("Customer should: " + customerShouldBuy);
        customer.setBuyingStrategy(new AggressivePredictor());
        customerShouldBuy = customer.predict();
        System.out.println("Customer should: " + customerShouldBuy);

        //Then
        assertEquals("[Aggressive predictor] Buy stock of XYZ",  customerShouldBuy);
    }
}
