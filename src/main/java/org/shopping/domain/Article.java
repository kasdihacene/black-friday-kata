package org.shopping.domain;

public class Article {

    private final String itemCode;
    private final String brand;
    private final Price price;
    private final Quantity quantity;

    public Article(String itemCode, String brand, Quantity quantityValue, Price priceValue) {
        this.itemCode = itemCode;
        this.brand = brand;
        this.price = priceValue;
        this.quantity = quantityValue;
    }

    public int calculateAmount() {
        return price.calculateAmount(quantity);
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getBrand() {
        return brand;
    }

    public Price getPrice() {
        return price;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
