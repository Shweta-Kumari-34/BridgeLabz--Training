package com.inheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    
    public void performDuties() {
        System.out.println("Duties: Cooking meals and managing kitchen.");
        System.out.println("--------------------------------");
    }
}
