package com.csvdatahandling.validate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidateData {

    public static void main(String[] args) {

        String filePath = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\User.csv";

        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        String phoneRegex = "\\d{10}";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            // skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                // skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                // check column count
                if (data.length < 3) {
                    System.out.println("invalid row format: " + line);
                    continue;
                }

                String email = data[1];
                String phone = data[2];

                boolean valid = true;

                if (!email.matches(emailRegex)) {
                    System.out.println("invalid email in row: " + line);
                    valid = false;
                }

                if (!phone.matches(phoneRegex)) {
                    System.out.println("invalid phone number in row: " + line);
                    valid = false;
                }

                if (valid) {
                    System.out.println("valid row: " + line);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("error reading csv file");
        }
    }
}
