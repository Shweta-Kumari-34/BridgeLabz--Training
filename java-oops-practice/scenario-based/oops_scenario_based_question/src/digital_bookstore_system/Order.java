package digital_bookstore_system;

import java.util.ArrayList;

public class Order {

	private ArrayList<Book> bookList;
	private double totalAmount;
	private String orderStatus;

	public Order() {
		bookList = new ArrayList<>();
		totalAmount = 0;
		orderStatus = "CREATED";
	}

	public void addBook(Book book, int quantity) {

		if (book.updateStock(quantity)) {

			double cost = book.getPrice() * quantity;
			cost = book.applyDiscount(cost);

			totalAmount += cost;
			bookList.add(book);

			System.out.println(quantity + " copies of \"" + book.getTitle() + "\" book ordered.");
		} else {
			System.out.println("Insufficient stock for " + book.getTitle());
		}
	}

	private void updateStatus(String status) {
		this.orderStatus = status;
	}

	public void placeOrder() {
		updateStatus("PLACED");
		System.out.println("\nOrder Status: " + orderStatus);
		System.out.println("Total Payable Amount: ₹" + totalAmount);
	}
}
