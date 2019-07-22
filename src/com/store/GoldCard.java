package com.store;

public class GoldCard extends Card {

    private float initDiscountRate = 0.02f;

    public GoldCard(String owner, float lastMonthTurnOver) {
        super(owner, lastMonthTurnOver);
    }

    @Override
    public float getDiscountRate() {

        float discRate = initDiscountRate;
        float growthStep = 0.01f;
        float n = growthStep * (int) (super.getLastMonthTurnOver() / 100);

        if (n >= 0.08f) {
            discRate = 0.10f;
            return discRate;
        } else if (n < 0.08f) {
            return discRate += n;
        } else {
            return discRate;
        }
    }
}
