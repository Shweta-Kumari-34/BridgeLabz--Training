package medistore_pharmacy_inventory;

import java.time.LocalDate;

public class Syrup extends Medicine {

	public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
	}

	@Override
	public boolean checkExpiry() {
		return getExpiryDate().minusDays(7).isBefore(LocalDate.now());
	}
}
