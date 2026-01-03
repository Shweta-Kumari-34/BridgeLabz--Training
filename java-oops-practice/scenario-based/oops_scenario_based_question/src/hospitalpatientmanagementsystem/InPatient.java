package hospitalpatientmanagementsystem;


//InPatient Class
public class InPatient extends Patient {
 private int numberOfDays;

 public InPatient(int id, String name, int age, int days) {
     super(id, name, age);
     this.numberOfDays = days;
 }

 @Override
 public void displayInfo() {
     System.out.println("InPatient: " + name + ", Days Admitted: " + numberOfDays);
 }

 public int getNumberOfDays() {
     return numberOfDays;
 }
}

