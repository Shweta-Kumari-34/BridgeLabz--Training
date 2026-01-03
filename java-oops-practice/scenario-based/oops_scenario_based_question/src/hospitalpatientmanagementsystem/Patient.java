package hospitalpatientmanagementsystem;

//Patient Base Class
public class Patient {
 protected int patientId;
 protected String name;
 protected int age;
 private String medicalHistory;

 // Normal admission constructor
 public Patient(int patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
     this.medicalHistory = "Not Disclosed";
 }

 // Emergency admission constructor (Overloaded)
 public Patient(int patientId, String name, int age, String medicalHistory) {
     this(patientId, name, age);
     this.medicalHistory = medicalHistory;
 }

 // Encapsulation
 public String getMedicalHistory() {
     return medicalHistory;
 }

 public void setMedicalHistory(String medicalHistory) {
     this.medicalHistory = medicalHistory;
 }

 public void displayInfo() {
     System.out.println("Patient Name: " + name + ", Age: " + age);
 }

 public String getSummary() {
     return "Patient ID: " + patientId + ", Name: " + name;
 }
}

