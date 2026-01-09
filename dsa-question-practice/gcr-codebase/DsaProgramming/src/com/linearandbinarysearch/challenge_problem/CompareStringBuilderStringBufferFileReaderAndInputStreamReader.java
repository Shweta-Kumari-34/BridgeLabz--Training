package com.linearandbinarysearch.challenge_problem;
import java.io.*;

public class CompareStringBuilderStringBufferFileReaderAndInputStreamReader {

	    public static void main(String[] args) {
	        int iterations = 1000000;
	        String text = "hello";

	        System.out.println("---- String Concatenation Performance ----");

	        //StringBuilder evaluating
	        StringBuilder  builderString= new StringBuilder();
	        long startSB = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            builderString.append(text);
	        }
	        long endSB = System.nanoTime();
	        System.out.println("StringBuilder time: " + (endSB - startSB) / 1_000_000 + " ms");

	        //StringBuffer evaluating
	        StringBuffer sbf = new StringBuffer();
	        long startSBF = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            sbf.append(text);
	        }
	        long endSBF = System.nanoTime();
	        System.out.println("StringBuffer time: " + (endSBF - startSBF) / 1_000_000 + " ms");

	        System.out.println("\n---- File Reading and Word Count ----");

	        String filePath = "D:\\\\java file\\\\EmployeeBonus.java"; // replace with your file path

	        // FileReader evaluating
	        try {
	            FileReader fr = new FileReader(filePath);
	            BufferedReader br = new BufferedReader(fr);

	            long startFR = System.nanoTime();
	            int wordCountFR = 0;
	            String line;
	            while ((line = br.readLine()) != null) {
	                wordCountFR += line.split("\\s+").length;
	            }
	            long endFR = System.nanoTime();
	            br.close();
	            fr.close();

	            System.out.println("FileReader: Words = " + wordCountFR + ", Time = " + (endFR - startFR) / 1_000_000 + " ms");

	        } catch (IOException e) {
	            System.out.println("FileReader Error: " + e.getMessage());
	        }

	        // InputStreamReader evaluating
	        try {
	            FileInputStream fis = new FileInputStream(filePath);
	            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
	            BufferedReader br = new BufferedReader(isr);

	            long startISR = System.nanoTime();
	            int wordCountISR = 0;
	            String line;
	            while ((line = br.readLine()) != null) {
	                wordCountISR += line.split("\\s+").length;
	            }
	            long endISR = System.nanoTime();
	            br.close();
	            isr.close();
	            fis.close();

	            System.out.println("InputStreamReader: Words = " + wordCountISR + ", Time = " + (endISR - startISR) / 1_000_000 + " ms");

	        } catch (IOException e) {
	            System.out.println("InputStreamReader Error: " + e.getMessage());
	        }
	    }
	}


