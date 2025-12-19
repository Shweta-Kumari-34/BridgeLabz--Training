import java.util.Scanner;
//Creating a class with name as AbundantNumber
public class AbundantNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
System.out.println("Enter a number ");
number=input.nextInt();

//calculating the sum of digit of number 
int sum=0;
for( int i=1; i<number; i++){
if( number % i == 0){
sum+= i;
}
}
if( number < sum){
System.out.println("Abundant Number ");
}
else{
System.out.println(" Not an Abundant Number ");
}
input.close();
}
}
