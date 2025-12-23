import java.util.Scanner;

// Creating a class with name as WindChillTemperature
public class WindChillTemperature {
// method for calculating the wind chill temperature
public static double calculateWindChill(double temperature, double windSpeed) {
double windChill = 35.74 + (0.6215 * temperature)+ (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
return windChill;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Reading input from user
System.out.println("Enter temperature ");
double temperature = input.nextDouble();
System.out.println("Enter wind speed ");
double windSpeed = input.nextDouble();

// Calling the method and storing the result
double result = calculateWindChill(temperature, windSpeed);

// Displaying the result
 System.out.println("Wind Chill Temperature = " + result);
 input.close();
}
}
