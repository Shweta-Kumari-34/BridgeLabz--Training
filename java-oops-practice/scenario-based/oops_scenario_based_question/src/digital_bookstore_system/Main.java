package digital_bookstore_system;

public class Main {
	public static void main(String[] args) {

		Book ebook = new EBook("Clean Code", "Robert C. Martin", 500);

		Book printedBook = new PrintedBook("Effective Java", "Joshua Bloch", 800, 5);

		Order order = new Order();

		System.out.println("=== Welcome to BookBazaar ===");

		order.addBook(ebook, 2);
		order.addBook(printedBook, 1);

		order.placeOrder();
	}
}
