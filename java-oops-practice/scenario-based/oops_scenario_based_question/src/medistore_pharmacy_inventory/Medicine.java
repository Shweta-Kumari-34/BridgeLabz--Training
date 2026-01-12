package medistore_pharmacy_inventory;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

	private String name;
	private double price;
	private LocalDate expiryDate;
	private int quantity;

	public Medicine(String name, double price, LocalDate expiryDate) {
		this(name, price, expiryDate, 10);
	}

	public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	protected double getPrice() {
		return price;
	}

	protected LocalDate getExpiryDate() {
		return expiryDate;
	}

	private double applyDiscount(double total) {
		return total > 1000 ? total * 0.9 : total;
	}

	@Override
	public void sell(int qty) {
		if (qty <= quantity && !checkExpiry()) {
			double total = qty * price;
			total = applyDiscount(total);
			quantity -= qty;

			System.out.println(qty + " units of " + name + " sold");
			System.out.println("Amount: ₹" + total);
		} else {
			System.out.println("Cannot sell " + name);
		}
	}
}
