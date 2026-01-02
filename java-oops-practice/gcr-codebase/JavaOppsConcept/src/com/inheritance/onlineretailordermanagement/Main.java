package com.inheritance.onlineretailordermanagement;

public class Main {
	 public static void main(String[] args) {

	        Order order1 = new Order("ORD001", "2026-01-01");
	        ShippedOrder order2 = new ShippedOrder("ORD002", "2026-01-02", "TRK12345");
	        DeliveredOrder order3 = new DeliveredOrder("ORD003", "2026-01-03", "TRK67890", "2026-01-05");

	        System.out.println(order1.getOrderStatus());
	        order1.displayDetails();
	        System.out.println("-------------------------------");

	        System.out.println(order2.getOrderStatus());
	        order2.displayDetails();
	        System.out.println("-------------------------------");

	        System.out.println(order3.getOrderStatus());
	        order3.displayDetails();
	        System.out.println("-------------------------------");
	    }
}
