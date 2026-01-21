package questions.insurancepolicymanagementMap;

import java.util.*;

public class PolicyManager {

    Map<String, Policy> hashMap = new HashMap<>();           
    Map<String, Policy> linkedHashMap = new LinkedHashMap<>(); 
    Map<String, Policy> treeMap = new TreeMap<>();           

    // Add a policy to all maps
    public void addPolicy(Policy policy) {
        hashMap.put(policy.policyNumber, policy);
        linkedHashMap.put(policy.policyNumber, policy);
        treeMap.put(policy.expiryDate + "-" + policy.policyNumber, policy); 
        // Key = expiryDate + policyNumber to avoid duplicate keys
    }

    // Retrieve by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List policies expiring within next 30 days
    public void listExpiringSoon(String today) {
        System.out.println("Policies expiring within 30 days from " + today + ":");
        for (Policy p : hashMap.values()) {
            int daysDiff = getDaysDifference(today, p.expiryDate);
            if (daysDiff >= 0 && daysDiff <= 30) {
                System.out.println(p);
            }
        }
    }

    // List policies for a specific policyholder
    public void listByPolicyholder(String name) {
        System.out.println("Policies for " + name + ":");
        for (Policy p : hashMap.values()) {
            if (p.policyholderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies
    public void removeExpired(String today) {
        Iterator<Policy> iter = hashMap.values().iterator();
        while (iter.hasNext()) {
            Policy p = iter.next();
            if (getDaysDifference(p.expiryDate, today) < 0) {
                iter.remove();
                linkedHashMap.remove(p.policyNumber);
                treeMap.remove(p.expiryDate + "-" + p.policyNumber);
            }
        }
        System.out.println("Expired policies removed.");
    }

    //finding the days difference
    private int getDaysDifference(String startDate, String endDate) {
        String[] s = startDate.split("-");
        String[] e = endDate.split("-");
        int start = Integer.parseInt(s[0]) * 365 + Integer.parseInt(s[1]) * 30 + Integer.parseInt(s[2]);
        int end = Integer.parseInt(e[0]) * 365 + Integer.parseInt(e[1]) * 30 + Integer.parseInt(e[2]);
        return end - start;
    }

    // Display all policies
    public void displayAll() {
        for (Policy p : hashMap.values()) {
            System.out.println(p);
        }
    }
}

