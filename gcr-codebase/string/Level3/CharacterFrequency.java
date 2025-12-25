import java.util.Scanner;
//creating a class with name as CharacterFrequency
public class CharacterFrequency {

//find the frequency of characters in a string
public static String[][] findFrequency(String str) {
int[] freq = new int[256]; // ASCII array to store frequency

// Count frequency of each character
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
freq[ch]++;
}

// Count how many unique characters exist
int uniqueCount = 0;
for (int i = 0; i < 256; i++) {
 if (freq[i] > 0) {
 uniqueCount++;
}
}
// Create 2D array to store character and frequency
String[][] result = new String[uniqueCount][2];
int index = 0;
for( int i=0; i<256;i++){
if (freq[i] > 0) {
result[index][0] = Character.toString((char) i);
result[index][1] = Integer.toString(freq[i]);
index++;
 }
 }

return result;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.print("Enter a string: ");
String text = input.nextLine();

String[][] frequency = findFrequency(text);
System.out.println("Character  | Frequency");

//displaying the result
 for (int i = 0; i < frequency.length; i++) {
System.out.printf("    %s     |    %s%n", frequency[i][0], frequency[i][1]);
}

input.close();
}
}
