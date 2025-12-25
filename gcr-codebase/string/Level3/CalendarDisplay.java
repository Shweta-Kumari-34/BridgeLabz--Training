import java.util.Scanner;
//ctreating a class with name as CalendarDisplay
public class CalendarDisplay {

    // Array of month names
    static String[] months = { "", "January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December" };

    // Array of days in each month (non-leap year)
    static int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30,
                                 31, 31, 30, 31, 30, 31 };

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February
            return isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month using Gregorian calendar algorithm
    // Returns 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDayOfMonth(int month, int year) {
        int m = month;
        int y = year;
        if (month < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int d = 1; // first day of the month
        int f = d + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j;
        int dayOfWeek = f % 7; // 0=Saturday, 1=Sunday...
        // Convert to 0=Sunday
        dayOfWeek = (dayOfWeek + 6) % 7;
        return dayOfWeek;
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        System.out.println("     " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int numOfDays = getDaysInMonth(month, year);

        // Print initial spaces for first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces
        }

        // Print all days of the month
        for (int day = 1; day <= numOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
        sc.close();
    }
}
