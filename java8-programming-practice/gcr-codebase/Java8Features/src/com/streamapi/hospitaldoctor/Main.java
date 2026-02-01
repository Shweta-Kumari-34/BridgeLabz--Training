package com.streamapi.hospitaldoctor;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Johnson", "Neurology", false),
            new Doctor("Dr. Lee", "Pediatrics", true),
            new Doctor("Dr. Patel", "Orthopedics", true),
            new Doctor("Dr. Brown", "Dermatology", false),
            new Doctor("Dr. Davis", "Cardiology", true)
        );

        // Find doctors available on weekends and sort by specialty
        List<Doctor> availableDoctors = doctors.stream()
            .filter(Doctor::isAvailableOnWeekend)          // Only doctors available on weekend
            .sorted(Comparator.comparing(Doctor::getSpecialty)) // Sort by specialty alphabetically
            .collect(Collectors.toList());

        // Print the result
        availableDoctors.forEach(System.out::println);
    }
}

