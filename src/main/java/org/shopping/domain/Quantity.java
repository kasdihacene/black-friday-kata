package org.shopping.domain;

public class Quantity {
    private int quantity;

    private Quantity(int quantity) {
        this.quantity = quantity;
    }

    public static Quantity of(int quantity) {
        return new Quantity(quantity);
    }

    public int calculateAmount(int amount) {
        return amount * quantity;
    }
}
