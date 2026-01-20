//Nicholas Brown CIS406 Travel Time  Converter
package travelTimeConverter;

import java.util.Scanner;

public class TravelTimeConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Travel Time Calculator\n");
		
		System.out.print("Enter miles:          ");
		double miles = input.nextDouble();
			
		System.out.print("Enter miles per hour: ");
		double mph = input.nextDouble();
		
		System.out.println();
		System.out.println("Estimated travel time\n");
		System.out.println("---------------------");
		
		double totalHours = miles / mph;
		
		int hours = (int) totalHours;
		int minutes = (int) Math.round((totalHours - hours) *60);
		
		if (minutes == 60) {
			hours++;
			minutes = 0;
		}
		
		System.out.println("Hours:   " + hours);
		System.out.println("Minutes: " + minutes);
		
		System.out.println();
		System.out.println("Bye!!");
		
		input.close();
		}
		
	
	}