package com.functionalinterfaces.cloningprototype;

public class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter and setter (optional)
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }

    // Override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

