import java.util.Scanner;
//creating a class with name as LongestWordFinder
public class LongestWordFinder {

public static String findLongestWord(String sentence) {
// Split sentence into words
String[] words = sentence.split("\\s+"); 
String longestWord = "";

for (String word : words) {
// Update longestWord if current word is longer
if (word.length() > longestWord.length()) {
longestWord = word;
}
}

return longestWord;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//reading input from user 
System.out.print("Enter a sentence: ");
String sentence = sc.nextLine();

//calling method and storing the result
String longestWord = findLongestWord(sentence);

//displaying the result
System.out.println("The longest word is: " + longestWord);

sc.close();
}
}
