import java.util.Scanner;
//Creating a class with name as PowerOfNumber
public class PowerOfNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number ");
number=input.nextInt();

//while loop run till counter == power
System.out.println("Enter power ");
int power=input.nextInt();
int result = 1;
int counter =0;
while(counter < power ){
result = result *number;
counter ++;
}

//displaying results
System.out.println("Result = " + result );
sc.close();
}
}
