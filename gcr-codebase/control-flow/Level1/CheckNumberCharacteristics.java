import java.util.Scanner;
//Creating a class with name as  CheckNumberCharacteristics
public class CheckNumberCharacteristics{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//declaring variable and reading input from user
int number;
System.out.println("Enter the number ");
number=input.nextInt();

//Checking the characteristics of number 
//and displaying the result
if( number>0){
System.out.println("The given number is positive ");
}else if(number <0){
System.out.println("The given number is negative ");
}
else {
System.out.println("The given number is zero ");
}
input.close();
}
}



