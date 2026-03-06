// Nicholas Brown CIS406 Lab 8.1.1 Interest Rate Calculator Part 2

package interestRateCalculatorPart2;

import java.util.Scanner;

public class InterestRateCalculatorPart2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		String continueChoice = "y";
		
		while (!continueChoice.equalsIgnoreCase("n")) {
			double loanAmount = getNumber(input, "Enter loan amount: ");
			double interestRate = getNumber(input, "Enter interest rate: ");
			double interest = calculateInterest(loanAmount, interestRate);
			
			System.out.printf("Loan amount:      $%,.2f%n", loanAmount);
			System.out.printf("Interest rate:    %.1f%%%n", interestRate);
			System.out.printf("Interest:         $%,.2f%n", interest);
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			continueChoice = input.nextLine();
			System.out.println();
			
		}
		
		System.out.println("Bye!!!");
		input.close();
	}
	
	public static double getNumber(Scanner input, String prompt) {
		while (true) {
			System.out.print(prompt);
			String userEntry = input.nextLine();
			
			try {
				double numberValue = Double.parseDouble(userEntry);
				return numberValue;
			} catch (NumberFormatException error) {
				System.out.println("Error! Invalid numeric value. Try again.");
			}
		}
	}
	
	public static double calculateInterest(double loanAmount, double interestRate) {
		double interest = loanAmount * (interestRate / 100.0);
		return interest;
	}
}
