package setinterface;

import java.util.*;

public class CheckSetsEquality {

	public static void main(String[] args) {

		// First set
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		// Second set
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(2);
		set2.add(1);

		// Check if sets are equal
		boolean isEqual = set1.equals(set2);

		// Output
		System.out.println(isEqual); 
	}
}
