package com.functionalinterfaces.paymentgatewayintegration;



public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiPayment();
        PaymentProcessor card = new CreditCardPayment();

        upi.pay(1000);
        upi.refund(500);

        card.pay(2000);
        card.refund(1000);
    }
}

