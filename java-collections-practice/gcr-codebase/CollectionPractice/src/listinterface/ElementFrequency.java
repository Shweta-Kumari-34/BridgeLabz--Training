package listinterface;

import java.util.*;

public class ElementFrequency {
	public static void main(String[] args) {

		// Input list
		List<String> items = new ArrayList<>();
		items.add("apple");
		items.add("banana");
		items.add("apple");
		items.add("orange");

		// Map to store frequency
		Map<String, Integer> map = new HashMap<>();

		// Count frequency
		for (String item : items) {

			if (map.containsKey(item)) {
				int count = map.get(item);
				map.put(item, count + 1);
			} else {
				map.put(item, 1);
			}
		}

		// Output
		System.out.println(map);
	}
}