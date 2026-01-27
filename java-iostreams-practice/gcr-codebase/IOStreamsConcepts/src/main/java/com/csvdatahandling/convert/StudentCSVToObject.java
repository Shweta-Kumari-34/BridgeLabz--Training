package com.csvdatahandling.convert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentCSVToObject {

    public static void main(String[] args) {

        // csv file path
        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\Student.csv";

        // list to store student objects
        List<Student> students = new ArrayList<>();

        try {
            // reading csv file
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // skip header row
            br.readLine();

            // read records
            while ((line = br.readLine()) != null) {

                // skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // split csv values
                String[] data = line.split(",");

                // create student object
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                students.add(new Student(id, name, age, marks));
            }

            br.close();

        } catch (IOException e) {
            System.out.println("error reading csv file");
        }

        // print student objects
        for (Student s : students) {
            s.display();
        }
    }
}

