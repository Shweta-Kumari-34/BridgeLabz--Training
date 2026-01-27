package com.csvdatahandling.modify;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalary{

    public static void main(String[] args) {

        // input and output csv files
        String inputFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\EmployeeDetails.csv";
        String outputFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\EmployeeDetails.csv";

        try {
            // reader and writer
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            String line;

            // write header
            line = br.readLine();
            writer.write(line + "\n");

            // process records
            while ((line = br.readLine()) != null) {

                // split csv values
                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // increase salary by 10% for it department
                if (department.equalsIgnoreCase("it")) {
                    salary = salary + (salary * 0.10);
                }

                // write updated record
                writer.write(data[0] + "," + data[1] + "," + department + "," + (int) salary + "\n");
            }

            br.close();
            writer.close();

            System.out.println("salary updated successfully");

        } catch (IOException e) {
            System.out.println("error processing csv file");
        }
    }
}

