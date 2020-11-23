package org.shopping.domain;

public class Quantity {
    private int quantity;

    public Quantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateAmount(int amount) {
        return amount * quantity;
    }
}
