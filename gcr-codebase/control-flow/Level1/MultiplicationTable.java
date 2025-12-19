import java.util.Scanner;
//Creating a class with name as MultiplicationTable
public class MultiplicationTable{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input
System.out.println("Enter a number ");
int number = input.nextInt();

//printing multiplication table
for(int count =5; count <=9; count ++){
System.out.println( number + " * " + count + " = " + ( number * count ));
}
input .close();
}
}
