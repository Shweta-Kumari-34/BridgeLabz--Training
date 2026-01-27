package com.csvdatahandling.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentCSVReader {

    public static void main(String[] args) {

        // csv file path
        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\StudentIO.csv";

        try {
            // reading file using bufferedreader
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // reading line by line
            while ((line = br.readLine()) != null) {

                // splitting csv values
                String[] data = line.split(",");

                // assigning values
                String id = data[0];
                String name = data[1];
                String age = data[2];
                String marks = data[3];

                // printing in structured format
                System.out.println("id: " + id + 
                                   ", name: " + name + 
                                   ", age: " + age + 
                                   ", marks: " + marks);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("error reading csv file");
        }
    }
}

