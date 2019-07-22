package com.store;

public class SilverCard extends Card {

    private float initDiscountRate = 0.02f;

    public SilverCard(String owner, float lastMonthTurnOver) {
        super(owner, lastMonthTurnOver);
    }

    @Override
    public float getDiscountRate() {

        if (super.getLastMonthTurnOver() > 300) {
            return 0.035f;
        } else {
            return initDiscountRate;
        }
    }
}
