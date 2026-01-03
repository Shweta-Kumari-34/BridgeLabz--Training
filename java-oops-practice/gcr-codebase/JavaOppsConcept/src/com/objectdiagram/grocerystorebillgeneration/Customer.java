package com.objectdiagram.grocerystorebillgeneration;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : products) {
            total += p.getCost();
        }
        return total;
    }

    public String getName() { return name; }
}

