package digital_bookstore_system;

public class EBook extends Book {

	public EBook(String title, String author, double price) {
		super(title, author, price);
	}

	@Override
	public double applyDiscount(double totalAmount) {

		return totalAmount * 0.80;
	}
}
