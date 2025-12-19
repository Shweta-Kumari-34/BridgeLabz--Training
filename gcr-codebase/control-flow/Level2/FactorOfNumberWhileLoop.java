import java.util.Scanner;
//Creating a class with name as FactorOfNumberWhileLoop
public class FactorOfNumberWhileLoop{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number ");
number=input.nextInt();

//check for positive number and printing the result
if(number>0){
int counter=1;
while(counter <number ){
if( number % counter == 0){
System.out.println("The number is divisible by "+ counter);
}
counter++;
}
}
else {
System.out.println("Not a positive number ");
}
input.close();
}
}


