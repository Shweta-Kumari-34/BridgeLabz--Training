package hospitalpatientmanagementsystem;


	// Main Class
	public class Main {
	    public static void main(String[] args) {

	        Patient p1 = new InPatient(101, "Rahul", 35, 5);
	        Patient p2 = new OutPatient(102, "Anita", 28);

	        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

	        Bill bill = new Bill(10000);

	        // Polymorphism
	        p1.displayInfo();
	        p2.displayInfo();
	        d1.displayInfo();

	        System.out.println("Final Bill Amount: ₹" + bill.calculatePayment());
	    }
	}


