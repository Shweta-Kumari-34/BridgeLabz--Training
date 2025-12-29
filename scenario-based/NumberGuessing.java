import java.util.Scanner;
import java.util.Random;
public class NumberGuessing{
public  static int numberGuess(int high, int low){
Random random =new Random();
int randomNum =random.nextInt(high-low+1)+low;
return randomNum;
}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int low =1;
int high=100;
int computerGuess=numberGuess(high, low);
int attempts=0;
int userGuess;

do{
System.out.println("----------------------------------------------");

System.out.println("Welcom to Number Guessing Game");
System.out.println("Guess a number between 1 to 100");
System.out.println(" ");
 
userGuess=input.nextInt(); 
System.out.println(" ");

attempts++;

if(computerGuess==userGuess){

System.out.println("Hurrah! You Guess the right number in "+attempts +" Attempts");
break;
}
else if(computerGuess>userGuess){
System.out.println(" your guess is too low ");
}
else {
System.out.println("Your guess is too high");
}
}while(attempts<5);
System.out.println("----------------------------------------------");
System.out.println("Thank You");
if(userGuess != computerGuess){
System.out.println("Wrong guess. All attempts have been used ");
System.out.println("The correct number was: "+computerGuess);
}
input.close();
}
}
 

