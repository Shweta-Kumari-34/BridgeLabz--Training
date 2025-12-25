import java.util.Scanner;
//creating a class with name as ReplaceWordOfSentence
public class ReplaceWordOfSentence {

public static String replaceWord(String sentence, String oldWord, String newWord) {
// Replace all occurrences of oldWord with newWord
return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//reading user input
System.out.print("Enter a sentence: ");
String sentence = sc.nextLine();
System.out.print("Enter the word to replace: ");
String oldWord = sc.next();
System.out.print("Enter the new word: ");
String newWord = sc.next();

//calling method and storing the result
String updatedSentence = replaceWord(sentence, oldWord, newWord);

//displaying the result
System.out.println("Updated sentence: " + updatedSentence);

sc.close();
}
}
