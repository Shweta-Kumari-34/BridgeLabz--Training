import java.util.Scanner;
/*creating a class named as AddTwoNumbers inside it creating a method named as addTwoNumbers  that take two Parameter named as number1 and number2 it perform the sum operation and store the result in sum variable and return the sum */ 
class AddTwoNumbers{
static int addTwoNumbers(int number1, int number2){
int sum=number1+number2;
return sum;
}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int number1,number2, sum, result;
System.out.println("Enter first number");
number1=input.nextInt();
System.out.println("Enter Second number");
number2=input.nextInt();
// Here we are calling the method named as addTwoNumbers and passing the arguments and storing the result in result variable
result= addTwoNumbers(number1,number2);
System.out.println("Addition of two numbers is ="+result);
}
}
