import java.util.Scanner;
//Creating a class with name as IntOperation
public class IntOperation{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//reading input from user
System.out.println("Enter  the value of a ");
int a = input.nextInt();
System.out.println("Enter  the value of b ");
int b = input.nextInt();
System.out.println("Enter  the value of c ");
int c = input.nextInt();

//performing integer operations
int result1 = a + b * c;
int result2 = a * b + c;
int result3 = c + a / b ;

//displaying result
System.out.println("The results of Int Operations are " + result1 + " , " +result2+ ", and " +result3);
input.close();
}
}




