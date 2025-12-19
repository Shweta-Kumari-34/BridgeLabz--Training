import java.util.Scanner;
//Creating a class with name as FizzBuzzWhileLoop
public class FizzBuzzWhileLoop{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input
System.out.println("Enter a positive number ");
int number = input.nextInt();

//check for positive number
if(number<=0){
System.out.println(" Pease enter a positive number ");
}
// while loop from 1 to number and check multiple condition
else {
int count =1;
while( count<=number){
//number multiple of 3 and 5
if ( count % 3==0 && count %  5 == 0){
System.out.println("FizzBuzz ");
}
//number multiple of 3
else if ( count % 3 ==0){
System.out.println("Fizz ");
}
//number multiple of 5
else if ( count % 5 == 0){
System.out.println("Buzz ");
}
//otherwise print number
else{
System.out.println(count);
}
count ++;
}
}
input .close();
}
}



