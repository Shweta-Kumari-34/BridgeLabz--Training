package com.lambdaexpressions.customsortingecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		products.add(new Product("Laptop", 60000, 4.5, 10));
		products.add(new Product("Phone", 30000, 4.7, 15));
		products.add(new Product("Tablet", 25000, 4.2, 5));

		// sort by price
		Collections.sort(products, (p1, p2) -> Double.compare(p1.price, p2.price));

		System.out.println("sorted by price:");
		products.forEach(System.out::println);

		// sort by rating
		Collections.sort(products, (p1, p2) -> Double.compare(p2.rating, p1.rating));

		System.out.println("\nsorted by rating:");
		products.forEach(System.out::println);

		// sort by discount
		Collections.sort(products, (p1, p2) -> p2.discount - p1.discount);

		System.out.println("\nsorted by discount:");
		products.forEach(System.out::println);
	}
}
