//Nicholas Brown CIS406 Temperature Conversion
package temperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Temperature Converter\n");
		
		System.out.print("Enter degrees in Farhrenheit: ");
		double f = input.nextDouble();
		
		double c = fahrenheitToCelsius(f);
		System.out.printf("Degrees in Celsius: %.2f%n", c);
		
		System.out.println();
		
		System.out.print("Enter degrees in Celsius: ");
		double cs = input.nextDouble();
		
		double f2 = celsiusToFahrenheit(c);
		System.out.printf("Farhrenheit temperature: %.2f%n", f2);
		
		input.close();
		
		System.out.println();
		System.out.print("Bye!!");
	
}

	public static double fahrenheitToCelsius(double f) {
		return (f - 32) * (5.0 / 9.0);
}
	public static double celsiusToFahrenheit(double c) {
		return (c*(9.0 / 5.0)) + 32;
	}
}

