package com.store;

public abstract class Card {

    private String owner;
    private float lastMonthTurnOver;

    public Card(String owner, float lastMonthTurnOver) {
        this.owner = owner;
        this.lastMonthTurnOver = lastMonthTurnOver;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getLastMonthTurnOver() {
        return lastMonthTurnOver;
    }

    public abstract float getDiscountRate();
}
