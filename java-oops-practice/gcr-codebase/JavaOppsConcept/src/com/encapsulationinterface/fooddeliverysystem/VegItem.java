package com.encapsulationinterface.fooddeliverysystem;

	class VegItem extends FoodItem implements Discountable {

	    public VegItem(String itemName, double price, int quantity) {
	        super(itemName, price, quantity);
	    }

	    public double calculateTotalPrice() {
	        return getPrice() * getQuantity();
	    }

	    public double applyDiscount() {
	        return calculateTotalPrice() * 0.10; // 10% discount
	    }

	    public String getDiscountDetails() {
	        return "Veg Item Discount: 10%";
	    }
	}

