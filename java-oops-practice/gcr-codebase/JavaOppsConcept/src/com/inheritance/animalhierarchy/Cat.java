package com.inheritance.animalhierarchy;

class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println(name + " meows!");
    }
}
