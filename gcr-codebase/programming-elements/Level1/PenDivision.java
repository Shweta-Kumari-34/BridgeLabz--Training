//Creating a class with name as PenDivision
public class PenDivision{
public static void main(String[]args){

//Declaring the Variables and performing computations
int totalPens=14;
int totalStudents=3;
int pensPerStudent=totalPens / totalStudents;
int remainingPens=totalPens % totalStudents;

//displaying the result
System.out.println("The pen per student is " +pensPerStudent +" and the remaining pen not distributed is " +remainingPens);
}
}
