/*
 * Each policy has the following attributes:
● Policy Number (unique identifier)
● Policyholder Name
● Expiry Date
● Coverage Type (e.g., Health, Auto, Home)
● Premium Amount

Requirements:
1. Store Unique Policies: Implement methods to store policies using different
types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
purposes:
 HashSet for quick lookups.
 LinkedHashSet to maintain the order of insertion.
 TreeSet to maintain policies sorted by expiry date.

2. Retrieve Policies: Implement methods to retrieve and display policies based on
certain criteria:
 All unique policies.
 Policies expiring soon (within the next 30 days
 Policies with a specific coverage type.
 Duplicate policies based on policy numbers.

3. Performance Comparison: Compare the performance of HashSet,
LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
policies.

 */
package questions.insurancepolicymanagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        // Sample policies
        Policy p1 = new Policy("P1001", "Alice", "2026-02-28", "Health", 5000);
        Policy p2 = new Policy("P1002", "Bob", "2026-03-10", "Auto", 3000);
        Policy p3 = new Policy("P1003", "Carol", "2026-02-25", "Home", 7000);
        Policy p4 = new Policy("P1001", "Alice", "2026-02-28", "Health", 5000); // Duplicate
        Policy p5 = new Policy("P1004", "Dave", "2026-03-01", "Health", 4000);

        List<Policy> allPolicies = Arrays.asList(p1, p2, p3, p4, p5);

        // Add policies
        for (Policy p : allPolicies) {
            manager.addPolicy(p);
        }

        System.out.println("All Unique Policies:");
        manager.displayPolicies();

        System.out.println("\nHealth Coverage Policies:");
        manager.displayByCoverage("Health");

        System.out.println();
        manager.displayDuplicatePolicies(allPolicies);
    }
}

