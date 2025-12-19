import java.util.Scanner;
//Creating a class with name as PrimeNumber
public class PrimeNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading the number input
System.out.println("Enter a number ");
int number = input.nextInt();
boolean isPrime = true;

//checking for prime number
for( int i=2; i<=number/2; i++) {
if( number % i == 0);
isPrime = false;
break;
}

//Displaying the result
System.out.println(isPrime);
input.close();
}
}
