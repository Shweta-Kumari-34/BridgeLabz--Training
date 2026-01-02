package com.encapsulationinterface.ecommerceplatform;

	abstract class Product {
	    private String productId;
	    private String name;
	    private double price;

	    public Product(String productId, String name, double price){
	        this.productId = productId;
	        this.name = name;
	        this.price = price;
	    }
	   
	    public String getProductId(){ return productId; }
	    public String getName(){ return name; }
	    public double getPrice(){ return price; }

	    
	    public void setPrice(double price){
	        this.price = price;
	    }
  
	    public abstract double calculateDiscount();

	    
	    public double finalPrice(){
	        double discount = calculateDiscount();
	        double tax = (this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0;
	        return price + tax - discount;
	    }

	    public void displayProduct(){
	        System.out.println("-------------------------------------");
	        System.out.println("ID: " + productId);
	        System.out.println("Product: " + name);
	        System.out.println("Base Price: " + price);
	        System.out.println("Discount: " + calculateDiscount());

	        if(this instanceof Taxable){
	            System.out.println("Tax: " + ((Taxable)this).calculateTax());
	            System.out.println("Tax Details: " + ((Taxable)this).getTaxDetails());
	        } else {
	            System.out.println("Tax: Not Applicable");
	        }

	        System.out.println("Final Price: " + finalPrice());
	    }
	}


