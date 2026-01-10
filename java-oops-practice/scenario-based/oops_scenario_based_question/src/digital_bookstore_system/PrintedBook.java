package digital_bookstore_system;

public class PrintedBook extends Book {

	public PrintedBook(String title, String author, double price, int stock) {
		super(title, author, price, stock);
	}

	@Override
	public double applyDiscount(double totalAmount) {
		return totalAmount * 0.90;
	}
}
