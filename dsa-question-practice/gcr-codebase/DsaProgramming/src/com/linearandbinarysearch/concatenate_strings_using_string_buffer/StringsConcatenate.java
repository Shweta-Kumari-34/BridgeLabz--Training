package com.linearandbinarysearch.concatenate_strings_using_string_buffer;
import java.util.Scanner;

public class StringsConcatenate {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of strings: ");
	        int n = input.nextInt();
	        input.nextLine(); 
	        String[] arr = new String[n];
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = input.nextLine();
	        }
	        //Create StringBuffer
	        StringBuffer sb = new StringBuffer();
	        //Append strings one by one
	        for (String str : arr) {
	            sb.append(str);
	        }
	        String result = sb.toString();

	        System.out.println("Concatenated String is: " + result);
	        input.close();
	    }
	}


