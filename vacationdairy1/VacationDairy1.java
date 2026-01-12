//Nicholas Brown CIS406 Vacation Diary Part 1 
package vacationdairy1;

import java.util.Scanner;

public class VacationDairy1 {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			
			System.out.println("Vacation Dairy");
			System.out.println();
			
			System.out.print("Enter Date Vacationn Started (mm/dd/yyyy): ");
			String date = input.nextLine();
			
			System.out.print("Enter City Visited: ");
			String city = input.nextLine();
			
			System.out.print("Enter Country Visited: ");
			String country = input.nextLine();
			
			System.out.print("Enter number of days: ");
			int days = input.nextInt();
			input.nextLine(); 
			
			System.out.print("Enter Mode of Travel (car, airplane, ship, train, bus): ");
			String mode = input.nextLine();
			
			System.out.println();
			System.out.println("Deatils of your trip: ");
			System.out.println("Date: " + date);
			System.out.println("City: " + city);
			System.out.println("Country: " + country);
			System.out.println("Number of Days: " + days);
			System.out.println("Traveled By: " + mode);
			System.out.println();
			System.out.print("BYE!!!");
			
			input.close();
			
	}

}
