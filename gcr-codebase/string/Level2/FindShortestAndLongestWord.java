import java.util.Scanner;
//creatinf a class with name as FindShortestAndLongestWord
public class FindShortestAndLongestWord {

// Method to find length of a string using charAt();
public static int findLength(String text) {
int count = 0;
try {
while (true) {
text.charAt(count);
count++;
}
} catch (StringIndexOutOfBoundsException e) {
return count;
}
}
    
// Method to split text into words using charAt()
public static String[] splitUsingCharAt(String text) {

int len = findLength(text);

// Count number of words
int wordCount = 1;
for (int i = 0; i < len; i++) {
if (text.charAt(i) == ' ') {
wordCount++;
}
}

// Store space indexes
int[] spaceIndex = new int[wordCount + 1];
int idx = 0;
spaceIndex[idx++] = -1;

for (int i = 0; i < len; i++) {

if (text.charAt(i) == ' ') {
spaceIndex[idx++] = i;
}
}

spaceIndex[idx] = len;

// Extract words
String[] words = new String[wordCount];

for (int i = 0; i < wordCount; i++) {
String word = "";
for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
word = word + text.charAt(j);
}
words[i] = word;
}

return words;
}

// Method to create 2D array of word and its length
public static String[][] createWordLengthTable(String[] words) {
String[][] table = new String[words.length][2];

for (int i = 0; i < words.length; i++) {
int length = findLength(words[i]);
table[i][0] = words[i];
table[i][1] = String.valueOf(length);
}

return table;
}

// Method to find shortest and longest word indexes
// returns int[0] store shortest index, int[1] store longest index
public static int[] findShortestAndLongest(String[][] table) {

int shortestIndex = 0;
int longestIndex = 0;

int shortestLen = Integer.parseInt(table[0][1]);
int longestLen = Integer.parseInt(table[0][1]);

for (int i = 1; i < table.length; i++) {
int currentLen = Integer.parseInt(table[i][1]);
if (currentLen < shortestLen) {
shortestLen = currentLen;
shortestIndex = i;
}

if (currentLen > longestLen) {
longestLen = currentLen;
longestIndex = i;
}
}

return new int[] { shortestIndex, longestIndex };
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

// Taking user input
System.out.print("Enter the text: ");
String text = sc.nextLine();

// Split text into words
String[] words = splitUsingCharAt(text);

// Create 2D array of word and length
String[][] table = createWordLengthTable(words);

// Find shortest and longest words
int[] result = findShortestAndLongest(table);

// Display table
System.out.println("\nWord\tLength");
System.out.println("---------------");
for (int i = 0; i < table.length; i++) {
System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
}

// Display shortest and longest word
System.out.println("\nShortest word: " + table[result[0]][0]);
System.out.println("Longest word: " + table[result[1]][0]);

sc.close();
}
}
