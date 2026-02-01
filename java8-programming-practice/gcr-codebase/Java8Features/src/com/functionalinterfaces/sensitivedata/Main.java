package com.functionalinterfaces.sensitivedata;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new User("Alice", "123-45-6789");
        Object obj2 = new Product("Laptop", 75000);

        process(obj1);
        process(obj2);
    }

    public static void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
            // call your encryption logic here
        } else {
            System.out.println("Regular object: " + obj);
        }
    }
}

