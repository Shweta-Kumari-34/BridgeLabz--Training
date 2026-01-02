package com.inheritance.restaurantmanagementsystem;

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


interface Worker {
    void performDuties(); 
}
