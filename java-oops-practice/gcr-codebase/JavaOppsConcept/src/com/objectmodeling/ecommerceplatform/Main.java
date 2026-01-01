package com.objectmodeling.ecommerceplatform;

public class Main {
	public static void main(String[] args) {

        // Products (exist independently)
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Mobile", 20000);
        Product p4 = new Product("Headphones", 1500);

        // Customers
        Customer c1 = new Customer("Amit Verma");
        Customer c2 = new Customer("Sara Khan");
        Order o1 = c1.placeOrder("ORD1001");
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = c1.placeOrder("ORD1002");
        o2.addProduct(p4);

        Order o3 = c2.placeOrder("ORD2001");
        o3.addProduct(p3);
        o3.addProduct(p2);

        // Show orders with product details
        c1.viewOrders();
        c2.viewOrders();
    }
}
