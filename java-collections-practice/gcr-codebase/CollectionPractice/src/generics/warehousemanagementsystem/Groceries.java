package generics.warehousemanagementsystem;

public class Groceries extends WarehouseItem {
	private String expiryDate;

	public Groceries(String name, double price, String expiryDate) {
		super(name, price);
		this.expiryDate = expiryDate;
	}

	@Override
	public void displayInfo() {
		System.out.println("Groceries: " + getName() + ", Price: " + getPrice() + ", Expiry: " + expiryDate);
	}
}
