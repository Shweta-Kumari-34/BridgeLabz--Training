import java.util.Scanner;
//Creating a class with name as GreatestFactorOfNumberWhileLoop
public class GreatestFactorOfNumberWhileLoop{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number ");
number=input.nextInt();
int greatestFactor=1;

//while Loop run until We find greatestFactor of number
int counter = number - 1;
while(counter > 0 ){
if( number % counter == 0){
greatestFactor = counter;
break;
}
counter--;
}

//Displaying the result
System.out.println(greatestFactor);
input.close();
}
}
