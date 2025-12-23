import java.util.Scanner;
//Creating a class with name as LeapYear
public class LeapYear{
//methods to check for leap year
public static boolean isLeapYear(int year) {
boolean ans;
if( year % 400 == 0) {
ans = true;
}
else if ( year % 4 ==0 && year % 100 !=0 ){
ans = true;
}
else {
ans = false;
}
return ans;
}

public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading year from user
System.out.println("Enter year ");
int year = input.nextInt();

// checking the condition for leap year and printing the result
if(year < 1582){
System.out.println(" leap year is valid only for year 1582 or later ");
}
else {
boolean result = isLeapYear( year);
if (result) {
System.out.println(year + " is a Leap Year.");
} else {
System.out.println(year + " is NOT a Leap Year.");
}

 }
input.close();
}
}


