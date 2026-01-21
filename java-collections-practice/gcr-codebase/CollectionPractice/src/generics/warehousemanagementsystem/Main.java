package generics.warehousemanagementsystem;

public class Main {
	public static void main(String[] args) {

		Storage<Electronics> electronicsStorage = new Storage<>();
		electronicsStorage.addItem(new Electronics("Laptop", 75000, 2));
		electronicsStorage.addItem(new Electronics("Smartphone", 45000, 1));

		Storage<Groceries> groceryStorage = new Storage<>();
		groceryStorage.addItem(new Groceries("Rice", 1200, "2026-01-10"));
		groceryStorage.addItem(new Groceries("Milk", 60, "2025-09-01"));

		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.addItem(new Furniture("Chair", 3500, "Wood"));
		furnitureStorage.addItem(new Furniture("Table", 12000, "Metal"));

		System.out.println("=== Electronics ===");
		WarehouseUtil.displayItems(electronicsStorage.getAllItems());

		System.out.println("\n=== Groceries ===");
		WarehouseUtil.displayItems(groceryStorage.getAllItems());

		System.out.println("\n=== Furniture ===");
		WarehouseUtil.displayItems(furnitureStorage.getAllItems());
	}
}
