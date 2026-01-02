package com.encapsulationinterface.ecommerceplatform;

	class Groceries extends Product {
	    public Groceries(String id, String name, double price){
	        super(id, name, price);
	    }
  
	    public double calculateDiscount(){
	        return getPrice() * 0.03; 
	    }
	}


