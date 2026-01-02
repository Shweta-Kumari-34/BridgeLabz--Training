package com.inheritance.restaurantmanagementsystem;

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    
    public void performDuties() {
        System.out.println("Duties: Serving customers and taking orders.");
        System.out.println("--------------------------------");
    }
}

