//Nicholas Brown CIS406 Lab Vacation Diary Part 2

package vacationDairyPart2;

import java.util.Scanner;

public class VacationDiaryPart2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String table = "";
		table= table + "==================================================================\n";
		table= table + "==================== Vacation Diary ========================\n";
		table= table + "Date\t\tCity\t\tCountry\t\tDays\tMode\n";
		table= table + "========\t===============\t===============\t====\t========\n";
		
		while (true) {
			System.out.print("Enter Date Vacation Started (mmddyyyy) or End to quit: ");
			String dateInput = scanner.nextLine();
			
			if (dateInput.equalsIgnoreCase("End")) {
				break;
			}
		
			while (!isValidDate(dateInput)) {
				System.out.println("Invalid date format. Please re-enter");
				System.out.print("Enter Date Vacation Started (mmddyyyy): ");
				dateInput = scanner.nextLine();
			}
			
			System.out.print("Enter City Visited: ");
			String cityInput = scanner.nextLine();
			
			System.out.print("Enter Country Visited: ");
			String countryInput = scanner.nextLine();
			
			System.out.print("Enter number of days: ");
			String dayText = scanner.nextLine();
			while (!isValidDays(dayText)) {
				System.out.println("Days must be between 1 and 30");
				System.out.print("Enter number of days: ");
				dayText = scanner.nextLine();
			}
			
			System.out.print("Enter Mode of Travel (car, airplane, ship, train, bus): ");
			String modeInput = scanner.nextLine();
			while (!isValidMode(modeInput)) {
				System.out.println("Please enter a valid travel mode");
				System.out.print("Enter Mode of travel (car, airplane, ship, train, bus): ");
				modeInput = scanner.nextLine();
			}
			
			String formattedDate = formatDate(dateInput);
			String fixedCity = fixTextLength(cityInput);
			String fixedCountry = fixTextLength(countryInput);
			
			table = table + formattedDate + "\t" + fixedCity + "\t" + fixedCountry + "\t" + dayText 
					+ "\t" + modeInput.toLowerCase() + "\n";	
		}
		
		table = table + "=================================================================\n";
		System.out.println();
		System.out.println(table);
		System.out.println("Byes!!!");
		
		scanner.close();
		
	}
	
	public static boolean isValidDate(String text) {
		if (text.length() != 8) {
			return false;
		}
		
		int i = 0;
		while (i < text.length()) {
			char current = text.charAt(i);
			if(current < '0' || current > '9') {
				return false;
			}
			i = i + 1;
		}
	
		int month = Integer.parseInt(text.substring(0, 2));
		int day = Integer.parseInt(text.substring(2, 4));
		int year = Integer.parseInt(text.substring(4, 8));
		
		if (month < 1 || month > 12) {
			return false;
		}
		
		if (day < 1 || day > 30) {
			return false;
		}
		
		return true;		
	}
	
	public static boolean isValidDays(String text) {
		if (text.length() == 0) {
			return false;
		}
		
		int i = 0;
		while (i < text.length()) {
			char current = text.charAt(i);
			if (current < '0' || current > '9') {
				return false;
			}
			i = i +1;
		}
		
		int dayNumber = Integer.parseInt(text);
		if(dayNumber < 1 || dayNumber > 30) {
			return false;
		}
		
		return true;
	}
	
	public static String fixTextLength(String text) {
		if (text.length() > 15) {
			return text.substring(0, 15);
		}
		
		while (text.length() < 15) {
			text = text + " ";
		}
		
		return text;
	}
	
	public static boolean isValidMode(String text) {
		String lower = text.toLowerCase();
		
		if (lower.equals("car")) {
			return true;
		}
		if (lower.equals("airplane")) {
			return true;
		}
		if (lower.equals("ship")) {
			return true;
		}
		if (lower.equals("train")) {
			return true;
		}
		if (lower.equals("bus")) {
			return true;
		}
		
		return false;
	}
	
	public static String formatDate(String text) {
		String month = text.substring(0, 2);
		String day = text.substring(2, 4);
		String year = text.substring(4, 8);
		return month + "/" + day + "/" + year;
 	}
}

