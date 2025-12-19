import java.util.Scanner;
//Creating a class with name as ArmstrongNumber
public class ArmstrongNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number ");
number=input.nextInt();

//while loop run till original Number become 0 
int sum=0;
int originalNumber = number;
while(originalNumber !=0){
int digit = originalNumber % 10 ;
//finding the cube of the digit and store it to sum
sum =sum + (digit * digit * digit);
//remove last digit using division
originalNumber = originalNumber / 10 ;
}
//check sum equal to number
if(sum == number){
System.out.println(number + " is an Armstrong Number ");
}
else {
System.out.println(number + " is not an Armstrong Number ");
}
input.close();
}
}


