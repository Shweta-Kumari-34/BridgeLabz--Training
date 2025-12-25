import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//creating a class with name as DateFormatting
public class DateFormatting {
public static void main(String[] args) {
LocalDate currentDate = LocalDate.now();

// Define different date formats
DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

// Display current date in different formats
System.out.println("Current date in dd/MM/yyyy: " + currentDate.format(format1));
System.out.println("Current date in yyyy-MM-dd: " + currentDate.format(format2));
System.out.println("Current date in EEE, MMM dd, yyyy: " + currentDate.format(format3));
    }
}
