import java.util.Scanner;
//creating a class with name as LexicographicaltringCompare
public class LexicographicalStringCompare {

public static int compareStrings(String str1, String str2) {
int len1 = str1.length();
int len2 = str2.length();
int minLen = Math.min(len1, len2);

// Compare characters one by one
for (int i = 0; i < minLen; i++) {
char ch1 = str1.charAt(i);
char ch2 = str2.charAt(i);

if (ch1 != ch2) {
return ch1 - ch2; // If different, return difference of ASCII values
}
}

// If all characters so far are equal, shorter string comes first
return len1 - len2;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter first string: ");
String str1 = sc.nextLine();

System.out.print("Enter second string: ");
String str2 = sc.nextLine();

int result = compareStrings(str1, str2);

if (result < 0) {
System.out.println( str1 + " comes before " + str2 + " in lexicographical order.");
} else if (result > 0) {
System.out.println(  str1 + " comes after " + str2 + " in lexicographical order.");
} else {
System.out.println("Both strings are equal.");
}

sc.close();
}
}
