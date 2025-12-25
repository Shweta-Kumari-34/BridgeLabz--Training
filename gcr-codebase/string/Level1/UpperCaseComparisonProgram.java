import java.util.Scanner;
//creating a class with name as UpperCaseComparisonProgram
public class UpperCaseComparisonProgram {

// Method to convert text to uppercase using charAt() and ASCII logic
public static String toUpperCaseUsingCharAt(String text) {
String result = "";

for (int i = 0; i < text.length(); i++) {
char ch = text.charAt(i);

// Check if character is lowercase (a-z)
if (ch >= 'a' && ch <= 'z') {
ch = (char) (ch - 32); // ASCII difference between lowercase and uppercase
}

result = result + ch;
}

return result;
}

// Method to compare two strings using charAt()
public static boolean compareStringsUsingCharAt(String s1, String s2) {

if (s1.length() != s2.length()) {
return false;
}

for (int i = 0; i < s1.length(); i++) {
if (s1.charAt(i) != s2.charAt(i)) {
return false;  //if both character are different
}
}

return true;
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

//reading the text as input from user
System.out.print("Enter the text: ");
String text = input.nextLine();

// Convert using user-defined method
String manualUpper = toUpperCaseUsingCharAt(text);

// Convert using built-in method
String builtInUpper = text.toUpperCase();

// Compare both results
boolean result = compareStringsUsingCharAt(manualUpper, builtInUpper);

// Displaying the results
System.out.println("\nUppercase using charAt(): " + manualUpper);
System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
System.out.println("Are both results equal:" + result);

input.close();
}
}
