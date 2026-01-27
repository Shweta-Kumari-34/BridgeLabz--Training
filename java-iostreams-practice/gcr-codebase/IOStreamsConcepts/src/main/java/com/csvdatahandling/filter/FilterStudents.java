package com.csvdatahandling.filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudents{

    public static void main(String[] args) {

        // csv file path
        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\StudentIO.csv";

        try {
            // reading csv file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // skip header row
            br.readLine();

            // read each record
            while ((line = br.readLine()) != null) {

                // split csv values
                String[] data = line.split(",");

                String name = data[1];
                int marks = Integer.parseInt(data[3]);

                // filter students with marks > 80
                if (marks > 80) {
                    System.out.println("name: " + name + ", marks: " + marks);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("error reading csv file");
        }
    }
}

