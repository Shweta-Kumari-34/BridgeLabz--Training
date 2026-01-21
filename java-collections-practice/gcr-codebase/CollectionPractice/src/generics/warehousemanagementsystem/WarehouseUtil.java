package generics.warehousemanagementsystem;

import java.util.List;

public class WarehouseUtil {

	public static void displayItems(List<? extends WarehouseItem> items) {
		if (items.isEmpty()) {
			System.out.println("  (No items in storage)");
			return;
		}
		System.out.println("  Stored items:");
		for (WarehouseItem item : items) {
			item.displayInfo();
		}
	}
}