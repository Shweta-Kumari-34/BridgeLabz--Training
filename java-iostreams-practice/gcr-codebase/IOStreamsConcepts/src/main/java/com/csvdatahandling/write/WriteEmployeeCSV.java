package com.csvdatahandling.write;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        // csv file name
        String fileName = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\EmployeeDetails.csv";

        try {
            // filewriter to write data into csv file
            FileWriter writer = new FileWriter(fileName);

            // writing header
            writer.write("id,name,department,salary\n");

            // writing employee records
            writer.write("1,rahul,it,50000\n");
            writer.write("2,priya,hr,45000\n");
            writer.write("3,aman,finance,55000\n");
            writer.write("4,neha,marketing,48000\n");
            writer.write("5,rohit,sales,52000\n");

            // closing writer
            writer.close();

            System.out.println("csv file written successfully");

        } catch (IOException e) {
            System.out.println("error writing csv file");
        }
    }
}

