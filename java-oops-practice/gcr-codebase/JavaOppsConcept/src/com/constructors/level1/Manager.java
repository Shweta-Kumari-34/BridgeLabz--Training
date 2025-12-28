package com.constructors.level1;

public class Manager extends Employee {
	 public Manager(String employeeID, String department, double salary) {
	        super("111666999", "IT", 55000); 
	        
		}
		
		public void showSavingsAccountDetails() {
			//accessing the protected member of parent class
			System.out.println("Employee ID is: "+ employeeID);	
			System.out.println("Department  is : "+ department);	
			super.displayEmployeeDetails();
		}
}
