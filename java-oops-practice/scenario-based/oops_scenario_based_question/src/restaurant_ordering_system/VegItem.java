package restaurant_ordering_system;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class VegItem extends FoodItem {

	private static Map<String, Double> vegDishMap = new LinkedHashMap<>();
static double price;
static double discount=0.2;
	static {
		vegDishMap.put("Chole Bhature", 250.0);
		vegDishMap.put("Paneer Butter Masala", 299.0);
		vegDishMap.put("Rajma Chawal", 355.0);
		vegDishMap.put("Masala Dosa", 199.0);
		vegDishMap.put("Sprouts Salad", 350.0);
		vegDishMap.put("Aloo Paratha", 165.0);
	}

	public VegItem(String name, double price) {
		super(name, "Veg", price, true);
	}

	public void printVegDish() {
		System.out.println("------ Veg Menu ------");
		int i = 1;
		for (Map.Entry<String, Double> entry : vegDishMap.entrySet()) {
			System.out.println(i + ". " + entry.getKey() + " - ₹" + entry.getValue());
			i++;
		}
	}

	public static String getDishName(int index) {
		return new ArrayList<>(vegDishMap.keySet()).get(index - 1);
	}

	public static double getPrice(int index) {
		price= new ArrayList<>(vegDishMap.values()).get(index - 1);
		return new ArrayList<>(vegDishMap.values()).get(index - 1);
	}
	public static double getBill(int quantity) {
		System.out.println("Discount of "+(discount*quantity*price)+" is offered");
		return quantity*price-(discount*quantity*price);
	
	}


	public static int menuSize() {
		return vegDishMap.size();
	}
}
