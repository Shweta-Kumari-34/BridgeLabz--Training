package junit.testingtemperatureconverter;

public class TemperatureConverter {
	// converts Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // converts Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
