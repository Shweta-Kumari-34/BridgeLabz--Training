package com.functionalinterfaces.sensitivedata;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + productName + "', price=" + price + "}";
    }
}

