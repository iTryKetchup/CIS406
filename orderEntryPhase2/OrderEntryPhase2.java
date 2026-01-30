// Nicholas Brown
// CIS406
// Course Project Phase 2: Calculations of Data Introduction
package orderEntryPhase2;

import java.util.Scanner;

public class OrderEntryPhase2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Item Number: ");
		String itemNumber = input.nextLine();
		
		System.out.print("Enter Item Description: ");
		String itemDescription = input.nextLine();
		
		double itemPrice = readDouble(input, "Enter Item Price: ");
		int quantityOrdered = readInt(input, "Enter Quantity Ordered: ");
		
		double grossAmount = itemPrice * quantityOrdered;
		
		double taxPercentage = readDouble(input, "Enter Tax Percentage: ");
		double taxAmount = grossAmount * (taxPercentage / 100.0);
		
		double discountPercent = readDouble(input, "Enter Discount Percent: ");
		double discountAmount = grossAmount * (discountPercent / 100.0);
		
		double netAmount = grossAmount + taxAmount - discountAmount;
		
		System.out.println();
		System.out.printf("%-8s\t%-12s\t%-8s\t%-4s\t%-6s\t%-8s\t%-6s\t%-8s\t%-8s%n",
				"Item#", "Description", "Price", "Qty", "Tax%", "Tax Amt", "Disc%", "Disc Amt", "Net Amt");

		System.out.printf("%-8s\t%-12s\t$%7.2f\t%-4d\t%6.2f\t$%7.2f\t%6.2f\t$%7.2f\t$%7.2f%n",
				itemNumber,
				itemDescription,
				itemPrice,
				quantityOrdered,
				taxPercentage,
				taxAmount,
				discountPercent,
				discountAmount,
				netAmount
			);
		
			System.out.println();
			System.out.print("Bye!!");
			
			input.close();
	}

public static double readDouble(Scanner input, String prompt) {
	while (true) {
		System.out.print(prompt);
		
		if (input.hasNextDouble()) {
			double value = input.nextDouble();
			input.nextLine();
			return value;
		} else {
			System.out.println("Input format error! Please enter a decimal number.");
			input.nextLine();
		}
	}
}
public static int readInt(Scanner input, String prompt) {
	while(true) {
		System.out.print(prompt);
		
		if(input.hasNextInt()) {
			int value = input.nextInt();
			input.nextLine();
			return value;
		} else {
			System.out.println("Input format error! Please enter a whole number.");
			input.nextLine();
		}
	}
}
}
