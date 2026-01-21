package questions.insurancepolicymanagementMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        // Sample policies
        Policy p1 = new Policy("P1001", "Alice", "2026-02-28", "Health", 5000);
        Policy p2 = new Policy("P1002", "Bob", "2026-03-10", "Auto", 3000);
        Policy p3 = new Policy("P1003", "Carol", "2026-02-25", "Home", 7000);
        Policy p4 = new Policy("P1004", "Alice", "2026-03-01", "Health", 4000);

        // Add policies
        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        System.out.println("All Policies:");
        manager.displayAll();

        System.out.println("\nRetrieve Policy P1002:");
        System.out.println(manager.getPolicyByNumber("P1002"));

        System.out.println();
        manager.listExpiringSoon("2026-02-01");

        System.out.println();
        manager.listByPolicyholder("Alice");

        System.out.println("\nRemoving expired policies (today = 2026-03-05)...");
        manager.removeExpired("2026-03-05");

        System.out.println("\nAll Policies after removal:");
        manager.displayAll();
    }
}

