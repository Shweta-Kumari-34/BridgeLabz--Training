package com.functionalinterfaces.cloningprototype;

public class Main {
	public static void main(String[] args) {
		try {
			// Original object
			Product original = new Product("Laptop", 75000.0);

			// Cloning
			Product clone = (Product) original.clone();

			System.out.println("Original: " + original);
			System.out.println("Clone: " + clone);

			// Check if both are different objects
			System.out.println("Are objects same? " + (original == clone));

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
