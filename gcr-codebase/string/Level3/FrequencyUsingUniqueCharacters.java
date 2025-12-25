import java.util.Scanner;
//creating a class with name as FrequencyUsingUniqueCharacters
public class FrequencyUsingUniqueCharacters {

// find the length of a string 
public static int getLength(String str) {
int count = 0;
try {
while (true) {
str.charAt(count);
count++;
}
} catch (StringIndexOutOfBoundsException e) {
}
return count;
}

 //  find unique characters in a string using charAt() and nested loops
public static char[] uniqueCharacters(String str) {
int len = getLength(str);
 char[] unique = new char[len]; // temp array
int uniqueCount = 0;

for (int i = 0; i < len; i++) {
char current = str.charAt(i);
 boolean isUnique = true;

// Check if character already exists in unique array
 for (int j = 0; j < uniqueCount; j++) {
if (unique[j] == current) {
 isUnique = false;
 break;
  }
 }

if (isUnique) {
unique[uniqueCount] = current;
uniqueCount++;
}
}

 // Create an array of exact size
char[] result = new char[uniqueCount];
for (int i = 0; i < uniqueCount; i++) {
result[i] = unique[i];
}

return result;
}

//find frequency of characters in a string using unique character
public static String[][] frequencyUsingUnique(String str) {
char[] uniqueChars = uniqueCharacters(str);
int[] freq = new int[256];

// Count frequency of all characters
for (int i = 0; i < getLength(str); i++) {
freq[str.charAt(i)]++;
}

// Create 2D array to store unique characters and their frequency
String[][] result = new String[uniqueChars.length][2];
for (int i = 0; i < uniqueChars.length; i++) {
result[i][0] = Character.toString(uniqueChars[i]);
result[i][1] = Integer.toString(freq[uniqueChars[i]]);
}

return result;
    }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = sc.nextLine();

String[][] freqResult = frequencyUsingUnique(input);

System.out.println("Character  | Frequency");
System.out.println("--------------------");
for (int i = 0; i < freqResult.length; i++) {
System.out.printf("    %s     |    %s%n", freqResult[i][0], freqResult[i][1]);
}

sc.close();
}
}
