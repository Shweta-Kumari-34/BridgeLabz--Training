package restaurant_ordering_system;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonVegItem extends FoodItem {

	private static Map<String, Double> nonVegDishMap = new LinkedHashMap<>();
	static double price;
static double discount =0.1;
	static {
		nonVegDishMap.put("Chicken Biryani", 399.0);
		nonVegDishMap.put("Mutton Rogan Josh", 699.0);
		nonVegDishMap.put("Egg Curry", 259.0);
		nonVegDishMap.put("Fish Curry", 349.0);
		nonVegDishMap.put("Chicken Tikka Masala", 599.0);
		nonVegDishMap.put("Butter Chicken", 599.0);
	}

	public NonVegItem(String name, double price) {
		super(name, "Non-Veg", price, true);
	}

	public void printNonVegDish() {
		System.out.println("------ Non-Veg Menu ------");
		int i = 1;
		for (Map.Entry<String, Double> entry : nonVegDishMap.entrySet()) {
			System.out.println(i + ". " + entry.getKey() + " - ₹" + entry.getValue());
			i++;
		}
	}

	public static String getDishName(int index) {
		return new ArrayList<>(nonVegDishMap.keySet()).get(index - 1);
	}

	public static double getPrice(int index) {
 price=new ArrayList<>(nonVegDishMap.values()).get(index - 1);
		 //new ArrayList<>(nonVegDishMap.values()).get(index - 1);
 return price;
	}
	
	public static double getBill(int quantity) {
	
		System.out.println("Discount of "+(discount*quantity*price)+" is offered");
		return quantity*price-(discount*quantity*price);
	}


	public static int menuSize() {
		return nonVegDishMap.size();
	}
}
