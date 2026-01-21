package questions.insurancepolicymanagement;

import java.util.*;

public class PolicyManager {

    Set<Policy> policySet = new HashSet<>();

    // Add a policy
    public void addPolicy(Policy policy) {
        policySet.add(policy);
    }

    // Display all policies
    public void displayPolicies() {
        for (Policy p : policySet) {
            System.out.println(p);
        }
    }

    // Get policies by coverage type
    public void displayByCoverage(String coverage) {
        for (Policy p : policySet) {
            if (p.coverageType.equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }

    // Find duplicate policy numbers in a list
    public void displayDuplicatePolicies(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (Policy p : policies) {
            if (!seen.add(p.policyNumber)) {
                duplicates.add(p.policyNumber);
            }
        }
        System.out.println("Duplicate Policy Numbers: " + duplicates);
    }
}

