package com.linearandbinarysearch.reverse_string_using_stringbuilder;
import java.util.Scanner;

public class ReverseString {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String text = input.nextLine();
	        //creating StringBuilder
	        StringBuilder sb = new StringBuilder();
	        //append the string
	        sb.append(text);
	        //reversing the string
	        sb.reverse();
	        //converting back to String
	        String reversedString = sb.toString();

	        System.out.println("Reversed String: " + reversedString);
	        input.close();
	    }
	}


