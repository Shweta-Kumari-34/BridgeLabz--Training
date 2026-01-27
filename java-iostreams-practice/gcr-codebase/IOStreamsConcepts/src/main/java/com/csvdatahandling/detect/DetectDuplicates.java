package com.csvdatahandling.detect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class DetectDuplicates {
    public static void main(String[] args) {
        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\DuplicateDetect.csv"; // Path to your CSV file
        String line;
        String splitBy = ","; // Assuming CSV is comma-separated

        HashSet<String> ids = new HashSet<>();
        HashSet<String> duplicateIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read header line
            String header = br.readLine();
            System.out.println("Header: " + header);

            // Read remaining lines
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(splitBy);
                String id = columns[0]; // Assuming ID is the first column

                if (!ids.add(id)) {
                    // ID already exists, it's a duplicate
                    duplicateIds.add(id);
                }
            }

            if (duplicateIds.isEmpty()) {
                System.out.println("No duplicate IDs found.");
            } else {
                System.out.println("Duplicate IDs found: " + duplicateIds);

                // Print duplicate records
                br.close(); // Close and reopen to read from start
                BufferedReader br2 = new BufferedReader(new FileReader(filePath));
                br2.readLine(); // skip header

                while ((line = br2.readLine()) != null) {
                    String[] columns = line.split(splitBy);
                    String id = columns[0];
                    if (duplicateIds.contains(id)) {
                        System.out.println(line);
                    }
                }

                br2.close();
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}

