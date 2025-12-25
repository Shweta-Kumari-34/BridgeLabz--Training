import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//creating a class with name as DateArithmetic
public class DateArithmetic {

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

// reading  input date from user
System.out.print("Enter a date (yyyy-MM-dd): ");
String input = sc.nextLine();

// Parse input to LocalDate
LocalDate date = LocalDate.parse(input, formatter);
System.out.println("Original Date: " + date.format(formatter));

// Add 7 days, 1 month, and 2 years
LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate.format(formatter));

// Subtract 3 weeks
modifiedDate = modifiedDate.minusWeeks(3);
System.out.println("After subtracting 3 weeks: " + modifiedDate.format(formatter));

sc.close();
}
}
