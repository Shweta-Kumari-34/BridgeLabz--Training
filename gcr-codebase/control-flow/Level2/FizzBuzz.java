import java.util.Scanner;
//Creating a class with name as FizzBuzz
public class FizzBuzz{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input
System.out.println("Enter a positive number ");
int number = input.nextInt();

//check for positive number
if(number<=0){
System.out.println(" Pease enter a positive number ");
}
// for loop from 1 to number and check multiples condition
else {
for ( int i=1; i<=number; i++){
if ( i%3==0 && i% 5 == 0){
System.out.println("FizzBuzz ");
}
else if ( i%3==0){
System.out.println("Fizz ");
}
else if ( i%5==0){
System.out.println("Buzz ");
}
else{
System.out.println(i);
}
}
}
input .close();
}
}



