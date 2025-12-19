import java.util.Scanner;
//Creating a class with name as LeapYearOperators
public class LeapYearOperators{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading the number input
System.out.println("Enter year ");
int year = input.nextInt();

// checking the condition for leap year
if((( year % 4 == 0) && (year % 100 !=0)) || ( year % 400 ==0)){
System.out.println(" leap year ");
}
else {
System.out.println(" not a  leap year ");
}
input.close();
}
}


