package com.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {


    @Test
    void testDefaultSharingStrategies() {
        //Given
        User userOne = new YGeneration("Y Generation");
        User userTwo = new Millenials("Millenials");
        User userThree = new ZGeneration("Z Generation");

        //When
        String userOneSocial = userOne.predict();
        System.out.println("User social: " + userOneSocial);
        String userTwoSocial = userTwo.predict();
        System.out.println("User two: " + userTwoSocial);
        String userThreeSocial = userThree.predict();
        System.out.println("User three: " + userThreeSocial);

        //Then
        assertEquals("[FACEBOOK]", userOneSocial);
        assertEquals("[TWITTER]", userTwoSocial);
        assertEquals("[INSTAGRAM]", userThreeSocial);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Millenials");

        //When
        String socialUser = user.predict();
        System.out.println("User social: " + socialUser);
        user.setSocialPublisher(new InstagramPublisher());
        socialUser = user.predict();
        System.out.println("User social: " + socialUser);

        //Then
        assertEquals("[INSTAGRAM]", socialUser);

    }
}
