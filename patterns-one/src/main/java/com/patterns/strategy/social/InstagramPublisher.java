package com.patterns.strategy.social;

public class InstagramPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "[INSTAGRAM]";
    }
}
