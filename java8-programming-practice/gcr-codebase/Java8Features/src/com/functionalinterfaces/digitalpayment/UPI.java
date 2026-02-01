package com.functionalinterfaces.digitalpayment;

//UPI payment implementation
public class UPI implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}
