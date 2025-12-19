import java.util.Scanner;
//Creating a class with name as GreatestFactorOfNumber
public class GreatestFactorOfNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number ");
number=input.nextInt();
int greatestFactor=1;

//for Loop run until We find greatestFactor of number
for( int i=number-1; i>=1; i--){
if( number % i == 0){
greatestFactor=i;
break;
}
}

System.out.println(greatestFactor);
input.close();
}
}


