package com.csvdatahandling.search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployee {

    public static void main(String[] args) {

        // csv file path
        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\EmployeeDetails.csv";

        Scanner input = new Scanner(System.in);

        // take employee name from user
        System.out.println("enter employee name:");
        String searchName = input.next().toLowerCase();

        try {
            // reading csv file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            boolean found = false;

            // skip header row
            br.readLine();

            // search record
            while ((line = br.readLine()) != null) {

                // split csv values
                String[] data = line.split(",");

                String name = data[1].toLowerCase();
                String department = data[2];
                String salary = data[3];

                // check name match
                if (name.equals(searchName)) {
                    System.out.println("department: " + department + ", salary: " + salary);
                    found = true;
                    break;
                }
            }

            br.close();

            if (!found) {
                System.out.println("employee not found");
            }

        } catch (IOException e) {
            System.out.println("error reading csv file");
        }

        input.close();
    }
}

