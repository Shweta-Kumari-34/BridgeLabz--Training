package setinterface;

import java.util.*;

public class FindSubsets {

	public static void main(String[] args) {

		// Subset candidate
		Set<Integer> set1 = new HashSet<>();
		set1.add(2);
		set1.add(3);

		// Superset
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);

		// Check subset
		boolean isSubset = set2.containsAll(set1);

		// Output
		System.out.println(isSubset); 
	}
}
