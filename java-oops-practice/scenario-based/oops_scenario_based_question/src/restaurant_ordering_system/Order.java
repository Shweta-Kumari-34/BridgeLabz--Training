package restaurant_ordering_system;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

	private static class OrderEntry {
		FoodItem item;
		int quantity;

		OrderEntry(FoodItem item, int quantity) {
			this.item = item;
			this.quantity = quantity;
		}
	}

	private List<OrderEntry> orderedItems = new ArrayList<>();
	private double total = 0;

	public void addItem(FoodItem item, int quantity) {
		if (item.isAvailable()) {
			orderedItems.add(new OrderEntry(item, quantity));
			total += item.getPrice() * quantity;
		}
	}

	@Override
	public void placeOrder() {
		double discount = 0;

		System.out.println("\n========== BILL ==========");
		for (OrderEntry entry : orderedItems) {
			double itemTotal = entry.item.getPrice() * entry.quantity;
			System.out.println(entry.quantity + " x " + entry.item.getName() + " = ₹" + itemTotal);

			if (entry.item instanceof VegItem) {
				discount += itemTotal * 0.15;
			} else if (entry.item instanceof NonVegItem) {
				discount += itemTotal * 0.10;
			}
		}

		double finalAmount = total - discount;

		System.out.println("--------------------------");
		System.out.println("Subtotal : ₹" + total);
		System.out.println("Discount : ₹" + discount);
		System.out.println("Payable  : ₹" + finalAmount);
		System.out.println("Order placed ");
		System.out.println("==========================");
	}

	@Override
	public void cancelOrder() {
		orderedItems.clear();
		total = 0;
		System.out.println("Order cancelled ");
	}
}
