package generics.dynamiconlinemarketplace;

import java.util.List;

public class ProductUtil {
	 public static void displayItems(List<? extends Product> items) {
		 if (items.isEmpty()) {
				System.out.println("  (No items in storage)");
				return;
			}
	    	System.out.println("  Stored items:");
	        for (Product item : items) {
	            item.displayInfo();
	        }
	    }
}
