package com.linearandbinarysearch.read_file_using_file_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadeer {

    public static void main(String[] args) {

        String filePath = "D:\\java file\\EmployeeBonus.java";

        try (
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader)
        ) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
