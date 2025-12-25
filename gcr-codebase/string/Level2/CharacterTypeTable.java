import java.util.Scanner;
//creating a class with name as CharacterTypeTable
public class CharacterTypeTable {

//check whether a character is vowel, consonant, or not a letter
public static String checkCharacter(char ch) {

// Convert uppercase to lowercase using ASCII
if (ch >= 'A' && ch <= 'Z') {
ch = (char) (ch + 32);
}

// Check if it is a letter
if (ch >= 'a' && ch <= 'z') {
// Check vowels
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
return "Vowel";
} else {
return "Consonant";
}
}

return "Not a Letter";
}

// Method to find vowels and consonants in a string and store in 2D array
public static String[][] getCharacterTypes(String text) {

int len = text.length();
String[][] result = new String[len][2];

for (int i = 0; i < len; i++) {
char ch = text.charAt(i);
result[i][0] = String.valueOf(ch);
result[i][1] = checkCharacter(ch);
}

return result;
 }

// Method to display 2D array in tabular format
public static void displayTable(String[][] table) {
System.out.println("\nCharacter\tType");
System.out.println("----------------------");
for( int i=0; i<table.length;i++){
System.out.println(table[i][0] + "\t\t" + table[i][1]);
}
}
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

// Taking user input
System.out.print("Enter the text: ");
String text = sc.nextLine();

// Get character types
String[][] charTable = getCharacterTypes(text);
//calling method to print the result
displayTable(charTable);

sc.close();
 }
}
