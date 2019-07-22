package com.store;

public abstract class PayDesk {


    private static float discountRate(Card card) {
        return card.getDiscountRate()*100;
    }

    private static float discount(float purchaseValue, Card card) {
        //discount = purchaseValue * discountRate
        return purchaseValue * card.getDiscountRate();
    }

    private static float total(float discount, float purchaseValue) {
        //total = purchase value - discount
        return purchaseValue - discount;
    }

    protected static void printPurchaseInfo(Card card, float purchaseValue){

        float discountRate = discountRate(card);
        float discount = discount(purchaseValue,card);
        float total = total(discount,purchaseValue);

        System.out.printf("Purchase value: $%.2f%n", purchaseValue);
        System.out.printf("Discount rate: %.2f%%%n", discountRate);
        System.out.printf("Discount: $%.2f%n", discount);
        System.out.printf("Total: $%.2f%n", total);
        System.out.printf("-------------------------------%n");
    }
}
