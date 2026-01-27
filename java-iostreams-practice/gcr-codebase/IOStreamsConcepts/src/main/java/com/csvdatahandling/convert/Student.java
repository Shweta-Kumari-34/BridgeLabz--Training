package com.csvdatahandling.convert;

public class Student {

    int id;
    String name;
    int age;
    int marks;

    // constructor
    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // display student details
    public void display() {
        System.out.println("id: " + id +
                ", name: " + name +
                ", age: " + age +
                ", marks: " + marks);
    }
}

