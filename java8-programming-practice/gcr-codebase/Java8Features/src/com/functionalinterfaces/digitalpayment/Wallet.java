package com.functionalinterfaces.digitalpayment;

//Wallet payment implementation
public class Wallet implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Wallet");
	}
}
