// Nicholas Brown CIS406 Interest Rate Calculator Part 1 Lab
package interestRateCalculatorPart1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InterestRateCalculatorPart1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		percentFormat.setMinimumFractionDigits(0);
		percentFormat.setMaximumFractionDigits(2);
		
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		char continueChoice = 'y';
		while (continueChoice != 'n' && continueChoice != 'N') {
			double loanAmount = promptForDouble(scanner, "Enter loan amount: ");
			double rateAsWholeNumber = promptForDouble(scanner, "Enter interestrate: ");
			double interestRate = rateAsWholeNumber / 100.0;
			
			double interestAmount = calculateInterest(loanAmount, interestRate);
			
			System.out.println();
			System.out.printf("%-15s %s%n", "Loan amount:", currencyFormat.format(loanAmount));
			System.out.printf("%-15s %s%n", "Interest rate:", percentFormat.format(interestRate));
			System.out.printf("%-15s %s%n", "Interest:", currencyFormat.format(interestAmount));
			System.out.println();
			
			continueChoice = promptForContinueChoice(scanner, "Continue? (y/n): ");
			System.out.println();
		}
	
		System.out.println("Bye!!");
		scanner.close();
	}
	
	public static double calculateInterest(double loanAmount, double interestRate) {
		return loanAmount * interestRate;
	}

	private static double promptForDouble(Scanner scanner, String prompt) {
		while (true) {
			System.out.print(prompt);
			if (scanner.hasNextDouble()) {
				return scanner.nextDouble();
			
			}
		
			String invalidInput = scanner.next();
			System.out.println("Invalid number: " + invalidInput + ". Please try Again.");
		}
	}
	
	private static char promptForContinueChoice(Scanner scanner, String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.next().trim();
			
			if (input.length() == 1) {
				char choice = input.charAt(0);
				if (choice == 'y' || choice == 'Y' || choice == 'n' || choice == 'N') {
					return choice;
				}
			}
			System.out.println("Please enter y or n.");
		}
	}
}

