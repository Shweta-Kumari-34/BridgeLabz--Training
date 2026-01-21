package listinterface;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// Input list
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		// Set to track seen elements
		Set<Integer> seen = new HashSet<>();

		// List to store result
		List<Integer> result = new ArrayList<>();

		// Remove duplicates while keeping order
		for (Integer num : numbers) {
			if (!seen.contains(num)) {
				seen.add(num);
				result.add(num);
			}
		}

		// Output
		System.out.println(result); 
	}
}
