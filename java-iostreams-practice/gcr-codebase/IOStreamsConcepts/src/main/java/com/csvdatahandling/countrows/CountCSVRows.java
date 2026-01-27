package com.csvdatahandling.countrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

        // csv file path
        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\EmployeeDetails.csv";

        int count = 0;

        try {
            // reading csv file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // skip header row
            br.readLine();

            // count records
            while ((line = br.readLine()) != null) {
                count++;
            }

            br.close();

            // printing total records
            System.out.println("total records: " + count);

        } catch (IOException e) {
            System.out.println("error reading csv file");
        }
    }
}

