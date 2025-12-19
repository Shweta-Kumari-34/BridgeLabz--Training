import java.util.Scanner;
//Creating a class with name as MultipleOfNumber
public class MultipleOfNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number  below 100 ");
number=input.nextInt();

//checking number is positive and less than 100 
if(number>0 && number < 100){
for( int i=100; i>0; i--){
if( number % i == 0){
//printing if number is multiple
System.out.println("The number is multiple of "+ i);
}
}
}
input.close();
}
}

