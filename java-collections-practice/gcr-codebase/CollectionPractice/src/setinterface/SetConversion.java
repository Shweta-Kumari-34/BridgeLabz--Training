package setinterface;

import java.util.*;

public class SetConversion {

	public static void main(String[] args) {

		// Input HashSet
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(3);
		set.add(9);
		set.add(1);

		// Convert Set to List
		List<Integer> list = new ArrayList<>(set);

		// Sort the List
		Collections.sort(list);

		// Output
		System.out.println(list);
	}
}
