import java.util.Scanner;
//Creating a class with name as HarshadNumber
public class HarshadNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading the number input
System.out.println("Enter Number ");
int number = input.nextInt();

//divide the number by 10 to find number digit sum displaying result 
int sum = 0;
while( number !=0 ){
sum=sum+ number % 10 ; 
number =number/10;
}

//displaying result 
if( number % sum == 0){
System.out.println(" Harshad Number ");
}
else {
System.out.println("  Not a Harshad Number ");
}
input.close();
}
}

