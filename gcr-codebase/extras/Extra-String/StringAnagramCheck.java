import java.util.Arrays;
import java.util.Scanner;
//creating a class with name as StringAnagramCheck
public class StringAnagramCheck {

public static boolean areAnagrams(String str1, String str2) {
// Remove spaces and convert to lowercase
str1 = str1.replaceAll("\\s+", "").toLowerCase();
str2 = str2.replaceAll("\\s+", "").toLowerCase();

// If lengths differ, cannot be anagrams
if (str1.length() != str2.length()) {
return false;
}

// Convert to char array and sort
char[] arr1 = str1.toCharArray();
char[] arr2 = str2.toCharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);

// Check if sorted arrays are equal
return Arrays.equals(arr1, arr2);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//reading input from user
System.out.print("Enter the first string: ");
String str1 = sc.nextLine();
System.out.print("Enter the second string: ");
String str2 = sc.nextLine();

//checking conditions and displaying the result
if (areAnagrams(str1, str2)) {
System.out.println("The strings are anagrams.");
 } else {
System.out.println("The strings are not anagrams.");
}

sc.close();
}
}
