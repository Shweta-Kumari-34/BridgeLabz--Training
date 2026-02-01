package com.functionalinterfaces.paymentgatewayintegration;

public interface PaymentProcessor {

	// existing abstract method
	void pay(double amount);

	// new feature added without breaking old implementations
	default void refund(double amount) {
		System.out.println("Refunding amount: " + amount);
	}
}
