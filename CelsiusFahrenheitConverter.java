// Program to convert temperatures between Fahrenheit and Celsius

import java.util.Scanner;

public class CelsiusFahrenheitConverter {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter temperature in Fahrenheit: ");
        	double fahrenheit = sc.nextDouble();

		System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();

        	double fahrenheitToCelsius = convertFahrenheitToCelsius(fahrenheit);
        	System.out.println("Temperature in Celsius: " + String.format("%.2f", fahrenheitToCelsius));

        	double celsiusToFahrenheit = convertCelsiusToFahrenheit(celsius);
        	System.out.println("Temperature in Fahrenheit: " + String.format("%.2f", celsiusToFahrenheit));
	}

	// convertFahrenheitToCelsius() method to convert fahrenheit to celsius
    	public static double convertFahrenheitToCelsius(double fahrenheit) {
        	return (fahrenheit - 32) * 5.0 / 9.0;
    	}

	// convertCelsiusToFahrenheit() method to convert celsius to fahrenheit
    	public static double convertCelsiusToFahrenheit(double celsius) {
        	return (celsius * 9.0 / 5.0) + 32;
    	}
}

/*
Input:
	Enter temperature in Fahrenheit: 98
	Enter temperature in Celsius: 36
Output:
	Temperature in Celsius: 36.67
	Temperature in Fahrenheit: 96.80
*/
