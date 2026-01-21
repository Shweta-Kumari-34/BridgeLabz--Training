package generics.dynamiconlinemarketplace;

public class GadgetsCategory extends Product {
	private String brandName;
	private int discount = 0;

	GadgetsCategory(String name, int price, String brnadName) {
		super(name, price);
		this.brandName = brandName;
	}

	@Override
	public void displayInfo() {
		System.out.println("BookCategory: " + getName() + " , Price: " + getPrice() + " , Title: " + brandName
				+ " , Discount: " + discount + "%");

	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
