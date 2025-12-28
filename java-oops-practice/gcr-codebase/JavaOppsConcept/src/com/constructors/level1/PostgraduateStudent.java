package com.constructors.level1;

public class PostgraduateStudent extends Student{
	
	public PostgraduateStudent(String rollNumber, String name,double cgpa) {

// calling Student class constructor
super("0111CS221207", "Priya", 8.5);
	}
	
	public void showPostGraduateDetails() {
		//accessing the protected member of parent class
		System.out.println("PostGraduate Student Name is: "+ name);	
		super.display();
	}
	
}


