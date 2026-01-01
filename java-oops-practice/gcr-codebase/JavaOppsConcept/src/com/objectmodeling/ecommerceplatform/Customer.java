package com.objectmodeling.ecommerceplatform;
import java.util.ArrayList;
public class Customer {
	private String name;
    private ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    // Communication: Customer places an order
    public Order placeOrder(String orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        System.out.println("\n" + name + " placed a new order with ID: " + orderId);
        return order;
    }
    public void viewOrders() {
        System.out.println("\nCustomer: " + name + " Orders:");
        for(Order o : orders) {
            o.showOrderDetails();
        }
    }
}
