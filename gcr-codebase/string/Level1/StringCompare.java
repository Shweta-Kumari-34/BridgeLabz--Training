import java.util.Scanner;
//creating a class with name as StringCompare
public class StringCompare {

//Method to compare two strings using charAt()
public static boolean compareUsingCharAt(String s1, String s2) {

//If lengths are different, strings are not equal
if (s1.length() != s2.length()) {
return false;
}

//Compare each character
for (int i = 0; i < s1.length(); i++) {
if (s1.charAt(i) != s2.charAt(i)) {
return false;
}
}
return true; //  if all characters matched
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
//reading input from user
System.out.println("Enter first string ");
String str1 = input.next();
System.out.println("Enter second string ");
String str2 = input.next();

//Comparing using charAt() method
boolean charAtResult = compareUsingCharAt(str1, str2);

// Comparing using built-in equals() method
boolean equalsResult = str1.equals(str2);

//Displaying results
System.out.println("Result using charAt() method " + charAtResult);
System.out.println("Result using equals() method " + equalsResult);
//Checking if both results are same
if (charAtResult == equalsResult) {
System.out.println(" Both methods give the SAME result");
} else {
System.out.println(" Results are DIFFERENT");
}

input.close();
}
}
