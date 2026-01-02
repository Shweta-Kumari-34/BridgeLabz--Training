package com.encapsulationinterface.fooddeliverysystem;


	public class OrderProcessor {

	    public static void processOrder(FoodItem item) {
	        item.getItemDetails();
	        double total = item.calculateTotalPrice();

	        if (item instanceof Discountable) {
	            Discountable discountItem = (Discountable) item;
	            double discount = discountItem.applyDiscount();
	            System.out.println(discountItem.getDiscountDetails());
	            System.out.println("Discount Amount: ₹" + discount);
	            total -= discount;
	        }

	        System.out.println("Final Amount: ₹" + total);
	        System.out.println("--------------------------------");
	    }
	}


