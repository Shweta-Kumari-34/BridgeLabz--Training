package com.encapsulationinterface.fooddeliverysystem;

	class NonVegItem extends FoodItem implements Discountable {

	    private static final double NON_VEG_CHARGE = 30.0;

	    public NonVegItem(String itemName, double price, int quantity) {
	        super(itemName, price, quantity);
	    }

	    public double calculateTotalPrice() {
	        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
	    }

	    public double applyDiscount() {
	        return calculateTotalPrice() * 0.05; // 5% discount
	    }


	    public String getDiscountDetails() {
	        return "Non-Veg Item Discount: 5% + Extra Charge ₹30";
	    }
	}

