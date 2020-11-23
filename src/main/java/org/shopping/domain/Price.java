package org.shopping.domain;

public class Price {
    private int amount;

    private Price(int amount) {
        this.amount = amount;
    }

    public static Price of(int amount) {
        return new Price(amount);
    }

    public int calculateAmount(Quantity quantity) {
        return  quantity.calculateAmount(amount);
    }
}
