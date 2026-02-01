package com.functionalinterfaces.digitalpayment;

//Credit Card payment implementation
public class CreditCard implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card");
	}
}
