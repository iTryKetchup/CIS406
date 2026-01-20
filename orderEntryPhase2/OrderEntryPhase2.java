// Nicholas Brown CIS406 course Project Phase 2: Calculations of Data Introduction
package orderEntryPhase2;

import java.util.Scanner;
import java.util.InputMismatchException;

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
        System.out.println("Item#\tDescription\tPrice\tQty\tTax%\tTax Amt\tDisc%\tDisc Amt\tNet Amt");

        System.out.printf("%s\t%s\t$%.2f\t%d\t%.2f\t$%.2f\t%.2f\t$%.2f\t$%.2f%n",
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
            try {
                System.out.print(prompt);
                double value = input.nextDouble();
                input.nextLine(); 
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Input format error! Please enter a decimal number.");
                input.nextLine(); 
            }
        }
    }

   
    public static int readInt(Scanner input, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = input.nextInt();
                input.nextLine(); 
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Input format error! Please enter a whole number.");
                input.nextLine(); 
            }
        }
    }
}
