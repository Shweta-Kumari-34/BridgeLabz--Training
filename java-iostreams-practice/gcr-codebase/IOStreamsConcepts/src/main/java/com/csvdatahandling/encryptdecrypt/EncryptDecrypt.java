package com.csvdatahandling.encryptdecrypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;

public class EncryptDecrypt {

    // AES key (for simplicity, generate once)
    private static SecretKey secretKey;

    static {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128); // 128-bit AES
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Encrypt a string
    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // Decrypt a string
    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(encryptedData);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }

    // Write CSV with encrypted Salary and Email
    public static void writeEncryptedCsv(String csvFile) {
        String[] headers = {"ID", "Name", "Email", "Department", "Salary"};
        String[][] data = {
                {"101", "Ananya", "ananya@example.com", "IT", "50000"},
                {"102", "Rahul", "rahul@example.com", "HR", "45000"},
                {"103", "Priya", "priya@example.com", "Finance", "60000"}
        };

        try (FileWriter writer = new FileWriter(csvFile)) {
            // Write header
            writer.append(String.join(",", headers)).append("\n");

            // Write rows with encrypted Email and Salary
            for (String[] row : data) {
                String encryptedEmail = encrypt(row[2]);
                String encryptedSalary = encrypt(row[4]);
                writer.append(row[0]).append(",")
                      .append(row[1]).append(",")
                      .append(encryptedEmail).append(",")
                      .append(row[3]).append(",")
                      .append(encryptedSalary).append("\n");
            }

            System.out.println("Encrypted CSV written: " + csvFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read CSV and decrypt Email and Salary
    public static void readDecryptedCsv(String csvFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String header = br.readLine();
            System.out.println(header);

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String decryptedEmail = decrypt(values[2]);
                String decryptedSalary = decrypt(values[4]);
                System.out.println(values[0] + "," + values[1] + "," + decryptedEmail + "," + values[3] + "," + decryptedSalary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String csvFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\EmployeeDetails.csv";

        writeEncryptedCsv(csvFile);
        System.out.println("\nReading and decrypting CSV:\n");
        readDecryptedCsv(csvFile);
    }
}

