package org.shopping.domain;

public class Price {
    private int amount;

    public Price(int amount) {
        this.amount = amount;
    }

    public int calculateAmount(Quantity quantity) {
        return  quantity.calculateAmount(amount);
    }
}
