package com.inheritance.animalhierarchy;

 public class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }

    
    void makeSound(){
        System.out.println(name + " barks!");
    }
}
