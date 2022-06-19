package com.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigMacTestSuite {

    @Test
    void testBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Standard")
                .burgers(2)
                .sauce("Standard")
                .ingredients("Lettuce")
                .ingredients("Tomato")
                .ingredients("Jalapeno")
                .ingredients("Bacon")
                .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        String order = bigMac.toString();

        //Then
        assertEquals("BigMac{bun='Standard', burgers=2, sauce='Standard', ingredients=[Lettuce, Tomato, Jalapeno, Bacon]}", order);
        assertEquals(4, howManyIngredients);

    }
}
