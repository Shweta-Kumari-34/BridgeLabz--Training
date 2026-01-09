package com.linearandbinarysearch.input_stream_reader;
import java.io.*;

public class ConvertByteStreamToCharacterStream {

	    public static void main(String[] args) {

	        String filePath = "D:\\\\java file\\\\EmployeeBonus.java"; // change to your file path

	        try {	         
	            FileInputStream file = new FileInputStream(filePath);
	            InputStreamReader input = new InputStreamReader(file, "UTF-8");
	            BufferedReader reader = new BufferedReader(input);

	            String line;

	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            reader.close();
	            input.close();
	            file.close();

	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
	}


