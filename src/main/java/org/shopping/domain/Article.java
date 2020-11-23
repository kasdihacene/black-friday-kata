package org.shopping.domain;

public class Article {

    private final String itemCode;
    private final String brand;
    private final int price;
    private final int quantity;

    public Article(String itemCode, String brand, int price, int quantity) {
        this.itemCode = itemCode;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public int calculateAmount() {
        return this.getPrice() * this.getQuantity();
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
