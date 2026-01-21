package generics.dynamiconlinemarketplace;

public class ClothingCategory extends Product {
	private String fabric;
	private int discount = 0;

	ClothingCategory(String name, int price, String fabric) {
		super(name, price);
		this.fabric = fabric;
	}

	@Override
	public void displayInfo() {
		System.out.println("BookCategory: " + getName() + " , Price: " + getPrice() + " , Title: " + fabric
				+ " , Discount: " + discount + "%");

	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
