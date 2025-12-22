import java.util.Scanner;
//Creating a class with name as CheckNumber whether the number is positive, negative, or zero
public class CheckNumber{
public static int numberProperties( int number){
if( number < 0){
return -1;        // for negative
}
else if( number ==0){
return 0;         //for zero
}
else {
return 1;           //for positive
}
}
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter  a number ");
int  number = input.nextInt();

//calling the method
int result = numberProperties(number);

// checking the condition and displaying the result
if(result == 0){
System.out.println("Enter number is zero ");
}
else if(result == 1){
System.out.println("Enter number is positive ");
}
else {
System.out.println("Enter number is negative ");
}
input.close();
}
}



