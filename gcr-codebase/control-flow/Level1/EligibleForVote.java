import java.util.Scanner;
//Creating a class with name as  EligibleForVote
public class EligibleForVote{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//declaring variable and reading input from user
int age;
System.out.println("Enter the age ");
age=input.nextInt();

//Check conditions for voting eligibility and displaying the result
if(age>=18){
System.out.println("The person's age is "+age+" and can vote ");
}
else {
System.out.println("The person's age is "+age+" and cannot vote ");
}
input.close();
}
}
