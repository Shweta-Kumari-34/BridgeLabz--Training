package com.functionalinterfaces.digitalpayment;

//common interface for all payment types
public interface Payment {

	// method to make payment
	void pay(double amount);
}
