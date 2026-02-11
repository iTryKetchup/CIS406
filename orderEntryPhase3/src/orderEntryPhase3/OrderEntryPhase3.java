// Nicholas Brown
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

            System.out.print 'Enter item description (alphanumeric): ');
            String itemDescription = scanner.nextLine().trim();

            System.out.print("Enter item price (decimal): ");
            double itemPrice = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("Enter quantity ordered (integer): ");
            int quantityOrdered = Integer.parseInt(scanner.nextLine().trim());

            double grossAmount = itemPrice * quantityOrdered;

            System.out.print("Enter tax percentage (decimal): ");
            double taxPercent = Double.parseDouble(scanner.nextLine().trim());
            double taxAmount = grossAmount * (taxPercent / 100.0);

            System.out.print("Enter discount percentage (decimal): ");
            double discountPercent = Double.parseDouble(scanner.nextLine().trim());
            double discountAmount = grossAmount * (discountPercent / 100.0);

            double netAmount = grossAmount + taxAmount - discountAmount;

            // Item output: labels on one line, data on next line
            System.out.println();
            System.out.printf("%-15s %-20s %12s %10s %8s %12s %12s %16s %12s%n",
                    "Item Number", "Description", "Item Price", "Quantity", "Tax %", "Tax Amount",
                    "Discount %", "Discount Amount", "Net Amount");

            System.out.printf("%-15s %-20s %12.2f %10d %8.2f %12.2f %12.2f %16.2f %12.2f%n%n",
                    itemNumber, itemDescription, itemPrice, quantityOrdered, taxPercent, taxAmount,
                    discountPercent, discountAmount, netAmount);

            // Totals accumulation
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
        }

        // Summary output: labels on one line, data on next line
        System.out.println();
        System.out.println("Summary Totals");
        System.out.printf("%-18s %18s %18s %24s %18s%n",
                "Total Line Items", "Total Gross Amount", "Total Tax Amount",
                "Total Discount Amount", "Total Net Amount");

        System.out.printf("%-18d %18.2f %18.2f %24.2f %18.2f%n",
                totalLineItems, totalGrossAmount, totalTaxAmount, totalDiscountAmount, totalNetAmount);

        scanner.close();
    }
}
