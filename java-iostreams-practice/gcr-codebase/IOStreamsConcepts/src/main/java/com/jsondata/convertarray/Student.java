package com.jsondata.convertarray;

public class Student {

	private String name;
	private int age;

	// default constructor (needed if json is read later)
	public Student() {
	}

	// parameterized constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
