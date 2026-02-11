// NIcholas Brown 
// CIS 406 
// Course Project Phase 3: Using a Loop to Allow Multiple Entries
package orderEntryPhase3;

import java.util.Scanner;

public class OrderEntryPhase3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int totalLineItems = 0;
		double totalGrossAmount = 0.0;
		double totalTaxAmount = 0.0;
		double totalDiscountAmount = 0.0;
		double totalNetAmount = 0.0;
		
		String continueInput = "Y";
		
		while (!continueInput.equalsIgnoreCase("N")) {
			System.out.print("Enter item number (alphanumeric): ");
			String itemNumber = scanner.nextLine().trim();
			
			System.out.print("Enter item description (aplhanumeric): ");
			String itemDescription = scanner.nextLine().trim();
			
			System.out.print("Enter item price (decimal): ");
			double itemPrice = Double.parseDouble(scanner.nextLine().trim());
			
			System.out.print("Enter quantity ordered (integer): ");
			int quantityOrdered = Integer.parseInt(scanner.nextLine().trim());
			
			double grossAmount = itemPrice * quantityOrdered;
			
			System.out.print("Entertax percentage (decimal): ");
			double taxPercent = Double.parseDouble(scanner.nextLine().trim());
			double taxAmount = grossAmount * (taxPercent / 100.0);
			
			System.out.print("Enter discount percentage (decimal): ");
			double discountPercent = Double.parseDouble(scanner.nextLine().trim());
			double discountAmount = grossAmount * (discountPercent / 100.0);
			
			double netAmount = grossAmount + taxAmount - discountAmount;
			
			System.out.println("\nItem Number\tDescription\tItem Price\tQuantity\tTax %\tTax Amount\tDiscount %\tDiscount Amount\tNet Amount");
			System.out.printf(
					"%s\t%s\t\t%.2f\t\t%d\t\t%.2f\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f%n%n",
					itemNumber,
					itemDescription,
					itemPrice,
					quantityOrdered,
					taxPercent,
					taxAmount,
					discountPercent,
					discountAmount,
					netAmount);
			
			totalLineItems++;
			totalGrossAmount += grossAmount;
			totalTaxAmount += taxAmount;
			totalDiscountAmount += discountAmount;
			totalNetAmount += netAmount;
			
			System.out.print("Enter N or n to stop, any other key to continue: ");
			continueInput = scanner.nextLine().trim();
			if (continueInput.isEmpty()) {
				continueInput = "Y";
			}
			System.out.println();
		}
		
		System.out.println("Summary Totals");
		System.out.println("Total Line Items\tTotal Gross Amount\tTotal Tax Amount\tTotal Discount Amount\tTotal Net Amount");
		System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2fn",
				totalLineItems,
				totalGrossAmount,
				totalTaxAmount,
				totalDiscountAmount,
				totalNetAmount);
				
		scanner.close();
		
	}

}
