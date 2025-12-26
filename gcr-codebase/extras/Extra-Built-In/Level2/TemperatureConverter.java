import java.util.Scanner;
//creating a class with anme as TemperatureConverter
public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //reading input from user
        System.out.print("Enter Temperature Value: ");
        double temp = input.nextDouble();

        int choice = input.nextInt();
         
        //displaying the result
        if (choice == 1) {
            System.out.println("Celsius = " + fahrenheitToCelsius(temp));
        } else if (choice == 2) {
            System.out.println("Fahrenheit = " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}
