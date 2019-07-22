package com.store;

public class BronzeCard extends Card {

    private float initDiscountRate = 0f;

    public BronzeCard(String owner, float lastMonthTurnOver) {
        super(owner, lastMonthTurnOver);
    }

    @Override
    public float getDiscountRate() {

        if (super.getLastMonthTurnOver() > 300) {
            return 0.025f;
        } else if (super.getLastMonthTurnOver() <= 300 && super.getLastMonthTurnOver() >= 100) {
            return 0.01f;
        } else {
            return initDiscountRate;
        }
    }




}
