// Nicholas Brown CIS406 Project Phase 1: Data Entry
package orderEntryPhase1;

import java.util.Scanner;

public class OrderEntryPhase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String itemNumber = promptAlphaNum(sc, "Enter item number (alphanumeric): ");
		String itemDescription = promptAlphaNum(sc, "Enter item description (alphanumeric): ");
		
		double itemPrice = promptDecimal(sc, "Enter the item price (decimal): ", 0.0);
		int quantityOrdered = promptInt(sc, "Enter quantity ordered (interger): ", 0);
		
		String taxPrompt =
				"Enter the total tax for the item (decimal). "
			   +"Enter the dollar amount, not a percent: ";
		double taxAmount = promptDecimal(sc,taxPrompt, 0.0);
		
		String discountPrompt =
				"Enter the total discount for the item (decimal). "
			   +"Enter the dollar amount, not a precent: ";
		double discountAmount = promptDecimal(sc, discountPrompt, 0.0);
		
		double netAmount = promptDecimal(sc, "Enter the net amount for the item (decimal): ", 0.0);
		
		System.out.println();
		System.out.println("Item Number\tItem Description\tItem Price\tQuantity\tTax\tDiscount\tNet Amount");
		System.out.printf("%s\t\t%s\t\t%s\t\t%d\t\t%s\t%s\t\t%s%n", 
				itemNumber,
				itemDescription,
				money(itemPrice),
				quantityOrdered,
				money(taxAmount),
				money(discountAmount),
				money(netAmount)
		);
		
		sc.close();
	}
	
	private static String promtAlphaNum(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine().trim();
			
			if (!input.isEmpty() && input.matches("[A-Za-z0-9 ]+")) {
				return input;
			}
			System.out.println("Invalid entry. Please enter alphanumeric character only.");
		}
	}

	private static double promptDecimal(Scanner sc, String prompt, double minValue) {
		while (true) {
			System.out.print(prompt);
			String input = sc.nextLine().trim();
			
			try {
				double value = Double.parseDouble(input);
				if (value >= minValue) {
					return value;
				}
				System.out.println("Invalid entry. Value must be " + minValue + " or greater.");
		  } catch (NumberFormatException ex) {
				System.out.println("Invalid entry. Please enter a whole number (example 3).");
			}
		}
	}
	
	private static int promptInt(Scanner sc, String prompt, int minValue) {
    while (true) {
        System.out.print(prompt);
        String input = sc.nextLine().trim();

        try {
            int value = Integer.parseInt(input);
            if (value >= minValue) {
                return value;
            }
            System.out.println("Invalid entry. Value must be " + minValue + " or greater.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid entry. Please enter a whole number (example 3).");
        }
    }
}

	private static String money(double v) {
		return String.format("$%.2f", v);
	}
}


