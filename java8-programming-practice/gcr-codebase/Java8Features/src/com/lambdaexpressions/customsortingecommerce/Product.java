package com.lambdaexpressions.customsortingecommerce;

public class Product {

	String name;
	double price;
	double rating;
	int discount;

	public Product(String name, double price, double rating, int discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}

	public String toString() {
		return name + " | price: " + price + " | rating: " + rating + " | discount: " + discount + "%";
	}
}
