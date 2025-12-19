import java.util.Scanner;
//Creating a class with name as MultipleOfNumberWhileLoop
public class MultipleOfNumberWhileLoop{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number  below 100 ");
number=input.nextInt();
int counter =number-1;

//checking number is positive and less than 100 
if(number>0 && number < 100){
//while loop runs till counter is greater than 1
while( counter >1){
if( number % counter == 0){
//printing if number is multiple
System.out.println("The number is multiple of "+ counter);
}
counter++;
}
}
input.close();
}
}

