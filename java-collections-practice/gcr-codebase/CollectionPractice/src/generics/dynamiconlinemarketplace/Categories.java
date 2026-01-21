package generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

//Generic type class 
public class Categories<T extends Product> {

	private List<T> items = new ArrayList<>();

	// add items
	public void addItem(T item) {
		items.add(item);
	}

	// getter
	public T getItem(int index) {
		return items.get(index);
	}

	public List<T> getAllItems() {
		return items;
	}

	public void applyDiscount(int discount) {
		for (T item : items) {
			item.setDiscount(discount);
		}
	}

}
