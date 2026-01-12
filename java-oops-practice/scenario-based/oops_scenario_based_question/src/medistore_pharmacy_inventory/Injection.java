package medistore_pharmacy_inventory;

import java.time.LocalDate;

public class Injection extends Medicine {

	public Injection(String name, double price, LocalDate expiryDate) {
		super(name, price, expiryDate);
	}

	@Override
	public boolean checkExpiry() {
		return getExpiryDate().minusDays(15).isBefore(LocalDate.now());
	}
}
