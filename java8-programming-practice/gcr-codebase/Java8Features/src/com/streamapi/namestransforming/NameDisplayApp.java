package com.streamapi.namestransforming;

import java.util.Arrays;
import java.util.List;

public class NameDisplayApp {

    public static void main(String[] args) {

        // list of customer names
        List<String> names = Arrays.asList(
                "rahul", "neha", "aman", "priya"
        );

        // stream to transform and sort names
        names.stream()
             .map(String::toUpperCase)   // convert each name to UPPERCASE
             .sorted()                   // sort names alphabetically
             .forEach(System.out::println); // print each name
    }
}
