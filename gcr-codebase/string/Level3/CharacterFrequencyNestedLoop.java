import java.util.Scanner;
//creating a class with name as CharacterFrequencyNestedLoop
public class CharacterFrequencyNestedLoop {

// Method to find frequency using nested loops
public static String[] findFrequency(String text) {

 char[] chars = text.toCharArray();   // Convert to char array
int len = chars.length;
int[] freq = new int[len];           // Frequency array
        
// Find frequency using nested loops
for (int i = 0; i < len; i++) {
freq[i] = 1;   // set initial frequency to 1

for (int j = i + 1; j < len; j++) {
if (chars[i] == chars[j] && chars[j] != '0') {
freq[i]++;
chars[j] = '0';   // mark duplicate as counted
}
}
}

// Count how many unique characters (not '0')
int count = 0;
for (int i = 0; i < len; i++) {
if (chars[i] != '0') count++;
}

// Store result in 1D String array
String[] result = new String[count];
 int index = 0;

 for (int i = 0; i < len; i++) {
if (chars[i] != '0') {  
//store only unique characters
result[index] = chars[i] + " - " + freq[i];
index++;
}
}

 return result;
 }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a string: ");
String text = sc.nextLine();

//calling the method and storing the result
String[] frequency = findFrequency(text);
System.out.println("\nCharacter | Frequency");

//displaying the result
for (String item : frequency) {
 String[] parts = item.split(" - ");
System.out.printf("   %s     |    %s%n", parts[0], parts[1]);
}

sc.close();
}
}
