
import java.util.Scanner;
//creating a class with name as StringComparision
public class SubstringComparison {
//Method to create substring using charAt()
public static String substringUsingCharAt(String text, int start, int end) {
String result = "";
for (int i = start; i < end; i++) {
result = result + text.charAt(i);
}
return result;
}

// Method to compare two strings using charAt()
public static boolean compareStringsUsingCharAt(String s1, String s2) {
if (s1.length() != s2.length()) {
return false;       //if different length
}
for (int i = 0; i < s1.length(); i++) {
if (s1.charAt(i) != s2.charAt(i)) {
return false;  // if different character
}
}
return true;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input value
System.out.println("Enter the text: ");
String text = input.next();
System.out.println("Enter start index: ");
int start = input.nextInt();
System.out.println("Enter end index: ");
int end = input.nextInt();

// Substring using charAt()
String subCharAt = substringUsingCharAt(text, start, end);

// Substring using built-in method
String subBuiltIn = text.substring(start, end);

// Compare both substrings
boolean comparisonResult = compareStringsUsingCharAt(subCharAt, subBuiltIn);

// Display results
System.out.println("Substring using charAt() " + subCharAt);
System.out.println("Substring using substring() " + subBuiltIn);
System.out.println("Are both substrings equal  Result is  " + comparisonResult);

input.close();
}
}
