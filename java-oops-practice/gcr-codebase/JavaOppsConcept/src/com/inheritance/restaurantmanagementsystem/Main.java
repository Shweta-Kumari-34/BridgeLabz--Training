package com.inheritance.restaurantmanagementsystem;
public class Main{
public static void main(String[] args) {

    Chef chef = new Chef("Arjun", 101);
    Waiter waiter = new Waiter("Meera", 102);

    chef.showDetails();
    chef.performDuties();

    waiter.showDetails();
    waiter.performDuties();
}
}