import java.util.Scanner;
//creating a class with name as SplitTextToWord2D
public class SplitTextToWord2D {

public static int findLength(String text) {
char[] ch = text.toCharArray();
int count = 0;
for(char c : ch) {
count++;
}
 return count;
}

public static String[] splitWords(String text) {
int length = findLength(text);
StringBuilder word = new StringBuilder();
String[] words = new String[100];
int index = 0;

for(int i=0; i<length; i++) {
char ch = text.charAt(i);

 if(ch!=' ') {
 word.append(ch);
 } else if(findLength(word.toString())>0) {
words[index++] = word.toString();
word = new StringBuilder();
}
}

if(findLength(word.toString())>0) {
words[index++] = word.toString();
}

String[] finalWords = new String[index];
for(int i=0; i<index; i++){
finalWords[i] = words[i];
}

return finalWords;
}

public static String[][] wordWithLength(String[] words){
int size = words.length;
String[][] result = new String[size][2];

for(int i=0; i<size; i++){
result[i][0] = words[i];
result[i][1] = String.valueOf(findLength(words[i]));
}
return result;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//reading input from user
System.out.println("Enter a sentence:");
String text = sc.nextLine();

//calling method and storing the result
String[] words = splitWords(text);
String[][] output = wordWithLength(words);

//displaying the result
System.out.printf("%-15s %-10s\n","WORD", "LENGTH");
System.out.println("-------------------------------");
for(int i=0; i<output.length; i++){
int len = Integer.parseInt(output[i][1]);
System.out.printf("%-15s %-10d\n",output[i][0], len);
}
}
}
