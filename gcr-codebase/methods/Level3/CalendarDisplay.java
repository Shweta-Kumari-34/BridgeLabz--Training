import java.util.Scanner;
//creating a class with name as CalenderDisplay
public class CalendarDisplay {

// Method to get month name
public static String getMonthName(int month) {
String[] months = {
 "", "January", "February", "March", "April", "May", "June",
"July", "August", "September", "October", "November", "December"
};
return months[month];
}

// Method to check for leap year
public static boolean isLeapYear(int year) {
if (year % 400 == 0)
return true;
if (year % 100 == 0)
return false;
return year % 4 == 0;
}

// Method to get days in  that month
public static int getDaysInMonth(int month, int year) {
int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

if (month == 2 && isLeapYear(year))
return 29;

return days[month];
}

// Method to get first day using Gregorian calendar
public static int getFirstDay(int month, int year) {
int d = 1;
int y0 = year - (14 - month) / 12;
int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
int m0 = month + 12 * ((14 - month) / 12) - 2;
int d0 = (d + x + (31 * m0) / 12) % 7;
return d0;   // 0 = Sunday
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.print("Enter month (1-12): ");
int month = input.nextInt();
System.out.print("Enter year: ");
int year = input.nextInt();

System.out.println("\n  " + getMonthName(month) + " " + year);
System.out.println("Sun Mon Tue Wed Thu Fri Sat");

int firstDay = getFirstDay(month, year);
int totalDays = getDaysInMonth(month, year);
//this loop add space before first day
for (int i = 0; i < firstDay; i++) {
System.out.print("    ");
}

//this for loop print day of a month
for (int day = 1; day <= totalDays; day++) {
System.out.printf("%3d ", day);    //print day in a field of 3 characters

if ((day + firstDay) % 7 == 0) {
System.out.println(); //move to next line after Saturday
}
}
input.close();
}
}