package com.streamapi.insuranceclaim;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<InsuranceClaim> claims = Arrays.asList(
            new InsuranceClaim("Health", 5000),
            new InsuranceClaim("Auto", 12000),
            new InsuranceClaim("Health", 7000),
            new InsuranceClaim("Life", 15000),
            new InsuranceClaim("Auto", 8000),
            new InsuranceClaim("Health", 6000),
            new InsuranceClaim("Life", 20000)
        );

        // Group by claim type and calculate average amount
        Map<String, Double> averageByType = claims.stream()
            .collect(Collectors.groupingBy(
                InsuranceClaim::getClaimType,          // group by claim type
                Collectors.averagingDouble(InsuranceClaim::getAmount) // calculate average
            ));

        // Print the result
        averageByType.forEach((type, avg) -> 
            System.out.println(type + " -> Average Claim: " + avg)
        );
    }
}

