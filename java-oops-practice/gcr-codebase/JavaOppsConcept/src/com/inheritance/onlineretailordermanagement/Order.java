package com.inheritance.onlineretailordermanagement;

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
