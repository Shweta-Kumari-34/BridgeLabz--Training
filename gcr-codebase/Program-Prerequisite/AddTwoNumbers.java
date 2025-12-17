import java.util.Scanner;
class AddTwoNumbers{
static int addTwoNumbers(int x, int y){
int sum=x+y;
return sum;
}
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int num1,num2, sum, result;
System.out.println("Enter first number");
num1=input.nextInt();
System.out.println("Enter Second number");
num2=input.nextInt();
result= addTwoNumbers(num1,num2);
System.out.println("Addition of two numbers is ="+result);
}
}
