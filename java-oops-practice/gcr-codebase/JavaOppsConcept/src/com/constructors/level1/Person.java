package com.constructors.level1;

class Person {
    String name;
    int age;

    // Normal constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p3 ) {
        this.name = p3.name;
        this.age = p3.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Shweta", 22);
        Person p2 = new Person(p1); // cloning p1

        p1.display();
        p2.display();
    }
}

