import java.util.Scanner;
//creating a class with name as TrimLeadingTrailingSopaces
public class TrimLeadingTrailingSpaces {

// Method to find start and end index after trimming leading/trailing spaces
public static int[] findTrimIndexes(String text) {
 int start = 0;
 int end = text.length() - 1;

// Trim leading spaces
while (start <= end && text.charAt(start) == ' ') {
start++;
}

// Trim trailing spaces
while (end >= start && text.charAt(end) == ' ') {
end--;
}

return new int[] { start, end };
}

// Method to create substring using charAt()
public static String substringUsingCharAt(String text, int start, int end) {
String result = "";
for (int i = start; i <= end; i++) {
result += text.charAt(i);
}
return result;
 }

 // Method to compare two strings using charAt()
public static boolean compareStrings(String s1, String s2) {
if (s1.length() != s2.length()) {
return false;
}
for (int i = 0; i < s1.length(); i++) {
if (s1.charAt(i) != s2.charAt(i)) {
return false;
}
}
return true;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Takiing  user input
 System.out.print("Enter a string with spaces: ");
String text = sc.nextLine();

// Get trim indexes
int[] trimIndexes = findTrimIndexes(text);

// Trim using user-defined substring method
String trimmedManual = substringUsingCharAt(text, trimIndexes[0], trimIndexes[1]);

// Trim using built-in method
String trimmedBuiltIn = text.trim();

// Compare results
boolean isEqual = compareStrings(trimmedManual, trimmedBuiltIn);

// Displaying the  results
System.out.println("\nTrimmed using charAt(): '" + trimmedManual + "");
System.out.println("Trimmed using trim(): '" + trimmedBuiltIn + "");
System.out.println("Are both results equal: " + isEqual);

sc.close();
}
}
