package medistore_pharmacy_inventory;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		Medicine paracetamol = new Tablet("Paracetamol", 2.5, LocalDate.of(2026, 3, 1));

		Medicine coughSyrup = new Syrup("Cough Syrup", 85, LocalDate.of(2025, 2, 20), 5);

		Medicine insulin = new Injection("Insulin", 450, LocalDate.of(2025, 1, 25));

		System.out.println("=== MediStore Sales ===");

		paracetamol.sell(5);
		coughSyrup.sell(2);
		insulin.sell(1);
	}
}
