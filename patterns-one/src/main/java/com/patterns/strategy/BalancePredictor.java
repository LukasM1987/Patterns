package com.patterns.strategy;

public class BalancePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Balance predictor] Buy shared units of Fund XYZ";
    }
}
