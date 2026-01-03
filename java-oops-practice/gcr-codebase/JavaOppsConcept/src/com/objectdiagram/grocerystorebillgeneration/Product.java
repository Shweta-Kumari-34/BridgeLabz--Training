package com.objectdiagram.grocerystorebillgeneration;

public class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getCost() {
        return pricePerUnit * quantity;
    }

    public String getProductName() { return productName; }
    public double getPricePerUnit() { return pricePerUnit; }
    public double getQuantity() { return quantity; }
}

