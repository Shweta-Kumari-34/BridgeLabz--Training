// Creating a class with name as SpringSeason
public class SpringSeason {
//check condition whether the season is spring
public static boolean seasonCheck(int month, int day) {
boolean isSpring =
(month == 3 && day >= 20) ||(month == 4) ||(month == 5) ||(month == 6 && day <= 20);
 return isSpring;
}

public static void main(String[] args) {
//check command line arguments
if (args.length < 2) {
System.out.println("Please provide month and day as command line arguments.");
return;
}

//reading input from command line
int month = Integer.parseInt(args[0]);
int day = Integer.parseInt(args[1]);
boolean result = seasonCheck(month, day);

//displaying the results
if (result) {
System.out.println("It's a Spring Season");
} else {
System.out.println("Not a Spring Season");
}
}
}
