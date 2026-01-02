package com.encapsulationinterface.employeemanagementsystem;

class FullTimeEmployee extends Employee {
 private double fixedSalary;

 public FullTimeEmployee(int id, String name, double baseSalary, double fixedSalary){
     super(id, name, baseSalary);
     this.fixedSalary = fixedSalary;
 }

 public double calculateSalary(){
     return getBaseSalary() + fixedSalary;
 }
}

