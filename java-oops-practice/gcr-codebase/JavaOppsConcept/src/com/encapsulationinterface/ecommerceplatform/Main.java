package com.encapsulationinterface.ecommerceplatform;

	import java.util.*;

	public class Main{
	    public static void main(String[] args) {

	        List<Product> cart = new ArrayList<>();

	        cart.add(new Electronics("E101", "Laptop", 60000));
	        cart.add(new Clothing("C202", "Jacket", 3000));
	        cart.add(new Groceries("G303", "Rice (5kg)", 450));

	        System.out.println("------ E-Commerce Billing System ------");

	        for(Product p : cart){
	            p.displayProduct(); 
	        }
	    }
	}


