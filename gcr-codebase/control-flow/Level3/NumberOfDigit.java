import java.util.Scanner;
//Creating a class with name as NumberOfDigit
public class NumberOfDigit{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading the number input
System.out.println("Enter a number ");
int number=input.nextInt();
int counter = 0;

//divide the number by 10 to find the number of digit
while( number !=0 ){
number =number/10;
counter++;
}

//Displaying the result
System.out.println(counter);
input.close();
}
}
