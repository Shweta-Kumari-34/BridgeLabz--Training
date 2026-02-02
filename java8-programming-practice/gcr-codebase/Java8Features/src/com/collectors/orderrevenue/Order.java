package com.collectors.orderrevenue;

//Order class to store order details
public class Order {

 private String customerName;
 private double amount;

 // constructor
 public Order(String customerName, double amount) {
     this.customerName = customerName;
     this.amount = amount;
 }

 // getter for customer name
 public String getCustomerName() {
     return customerName;
 }

 // getter for order amount
 public double getAmount() {
     return amount;
 }
}

