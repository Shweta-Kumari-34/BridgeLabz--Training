package generics.dynamiconlinemarketplace;

public class BookCategory extends Product {
	private String title;
	private int discount = 0;

    //constructor
	public BookCategory(String name, int price, String title) {
		super(name, price);
		this.title = title;

	}

	@Override
	public void displayInfo() {
		System.out.println("BookCategory: " + getName() + " , Price: " + getPrice() + " , Title: " + title
				+ " , Discount: " + discount + "%");
	}

    //getter
	public void setDiscount(int discount) {

		this.discount = discount;
	}
}
