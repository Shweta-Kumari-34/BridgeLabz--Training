package generics.dynamiconlinemarketplace;

public abstract class Product {
	private String name;
	private int price;
	protected int discount;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public abstract void displayInfo();
}
