package com.collectors.orderrevenue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

	public static void main(String[] args) {

		// list of orders
		List<Order> orders = Arrays.asList(new Order("Aman", 1200.50), new Order("Neha", 800.00),
				new Order("Aman", 450.75), new Order("Ravi", 1000.00), new Order("Neha", 300.25));

		// sum order amounts per customer
		// group by customer
		Map<String, Double> revenueByCustomer = orders.stream().collect(Collectors.groupingBy(Order::getCustomerName,

				Collectors.summingDouble(Order::getAmount // sum order amount
				)));

		// print revenue summary
		revenueByCustomer.forEach((customer, total) -> System.out.println(customer + " -> Total Revenue: " + total));
	}
}
