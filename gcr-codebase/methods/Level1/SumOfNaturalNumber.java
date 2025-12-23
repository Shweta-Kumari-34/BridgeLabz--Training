import java.util.Scanner;
//Creating a method with name as SumOfNaturalNumber
public class SumOfNaturalNumber{
//calculating the sum of n natural number 
public static int  findSum(int number ) {
int sum = 0;
for( int i=1 ;i<=number;i++){
sum=sum+ i;
}
 return sum ;
}

public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input 
System.out.println("Enter a number  ");
int number =input.nextInt();

//calling the method
int result = findSum( number );

//displaying output
System.out.println("The sum of " + number + "  natural number is " + result);
input.close();
}
}
