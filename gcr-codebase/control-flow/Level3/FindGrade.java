import java.util.Scanner;
//Creating a class with name as FindGrade
public class FindGrade{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading the mark input
System.out.println("Enter the physics mark  ");
int physicsMark = input.nextInt();
System.out.println("Enter the chemistry mark  ");
int chemistryMark = input.nextInt();
System.out.println("Enter the math mark  ");
int mathMark = input.nextInt();

//calculating percentage and averageMark
double percentage= (physicsMark + chemistryMark + mathMark )/100;
double averageMArk = (physicsMark + chemistryMark + mathMark )/3;

// checking the conditions and calculating grade
if( percentage >= 80){
System.out.println(" Average mark is " + averageMArk+ " Grade is A "+ " Remark is "+ "above agency-normalized standards " );
}
else if( percentage >= 70 && percentage <= 79 ){
System.out.println(" Average mark is " + averageMArk+ " Grade is B "+ " Remark is "+ "at agency-normalized standards " );
}
 else if( percentage >= 60  && percentage <= 69 ){
System.out.println(" Average mark is " + averageMArk+ " Grade is C "+ " Remark is "+ " below, but approaching  agency-normalized standards " );
}
else if( percentage >= 50 && percentage <= 59 ){
System.out.println(" Average mark is " + averageMArk+ " Grade is D "+ " Remark is "+ " well below, agency-normalized standards " );
}
else if( percentage >= 40 && percentage <= 49 ){
System.out.println(" Average mark is " + averageMArk+ " Grade is E "+ " Remark is "+ " too below  agency-normalized standards " );
} 
else{
System.out.println(" Average mark is " + averageMArk+ " Grade is R "+ " Remark is " +  " Remedial standards ");
}
input. close();
}
}





