package com.patterns.strategy.social;

public class ZGeneration extends User {

    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new InstagramPublisher();
    }
}
