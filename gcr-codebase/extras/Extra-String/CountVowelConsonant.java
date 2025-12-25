import java.util.Scanner;
//Creating a class with name as CountVowelConsonant
public class CountVowelConsonant{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//taking user input
System.out.println("Enter the text ");
String text=input.next();

//declaring the variables
int vowel = 0;
int consonants = 0;

//check coinditions
for( int i = 0; i<text.length() ;i++){
char ch = text.charAt(i);
if((ch=='A'|| ch =='E' || ch =='I'|| ch=='O'|| ch=='U') || (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
vowel++;
}else {
consonants++;
}
}

//displaying the result
System.out.println("count of vowel are " +vowel);
System.out.println("count of consonants are " +consonants);
input.close();
}
}

