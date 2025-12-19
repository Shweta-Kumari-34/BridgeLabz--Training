import java.util.Scanner;
//Creating a class with name as FactorOfNumber
public class FactorOfNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number ");
number=input.nextInt();

//check for positive number and printing the result
if(number>0){
for( int i=1; i<number; i++){
if( number % i == 0){
System.out.println("The number is divisible by "+ i);
}
}
}
else {
System.out.println("Not a positive number ");
}
input.close();
}
}


