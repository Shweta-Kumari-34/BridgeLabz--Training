package com.objectmodeling.ecommerceplatform;
import java.util.ArrayList;
public class Order {
	private String orderId;
    private ArrayList<Product> products = new ArrayList<>();
    private Customer customer; // associated customer

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    // Aggregation: Add product to order
    public void addProduct(Product p) {
        products.add(p);
    }
    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId + " placed by " + customer.getName());
        System.out.println("Products in Order:");
        double total = 0;
        for(Product p : products) {
            p.showProduct();
            total += p.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}
