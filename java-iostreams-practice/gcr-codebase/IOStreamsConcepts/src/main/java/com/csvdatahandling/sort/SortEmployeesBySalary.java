package com.csvdatahandling.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {

    public static void main(String[] args) {

        // csv file path
        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\EmployeeDetails.csv";

        // list to store records
        List<String[]> employees = new ArrayList<>();

        try {
            // reading csv file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // skip header
            br.readLine();

            // read records
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                employees.add(data);
            }

            br.close();

            // sort by salary (descending)
            Collections.sort(employees, new Comparator<String[]>() {
                public int compare(String[] a, String[] b) {
                    int sal1 = Integer.parseInt(a[3]);
                    int sal2 = Integer.parseInt(b[3]);
                    return sal2 - sal1;
                }
            });

            // print top 5 highest-paid employees
            System.out.println("top 5 highest-paid employees:");
            for (int i = 0; i < 5 && i < employees.size(); i++) {
                String[] e = employees.get(i);
                System.out.println(e[1] + " | " + e[2] + " | " + e[3]);
            }

        } catch (IOException e) {
            System.out.println("error reading csv file");
        }
    }
}

