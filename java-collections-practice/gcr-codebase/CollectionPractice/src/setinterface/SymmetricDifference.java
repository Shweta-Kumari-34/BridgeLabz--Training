package setinterface;

import java.util.*;

public class SymmetricDifference {

	public static void main(String[] args) {

		// First set
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		// Second set
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		// Create copies to avoid modifying original sets
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);

		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);

		// Symmetric Difference = Union - Intersection
		union.removeAll(intersection);

		// Output
		System.out.println(union);
	}
}
