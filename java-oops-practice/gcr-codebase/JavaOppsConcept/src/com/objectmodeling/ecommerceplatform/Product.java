package com.objectmodeling.ecommerceplatform;

public class Product {
	private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void showProduct() {
        System.out.println("- " + name + " | Price: ₹" + price);
    }
}
