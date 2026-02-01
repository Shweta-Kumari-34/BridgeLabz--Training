package com.functionalinterfaces.paymentgatewayintegration;

public class CreditCardPayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("Credit card payment of " + amount + " successful");
	}

	// optional: override default method
	@Override
	public void refund(double amount) {
		System.out.println("Credit card refund of " + amount + " processed");
	}
}
