//Nicholas Brown CIS406 course Project Phase 2: Calculations of Data Introduction
package orderEntryPhase2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OrderEntryPhase2 {

	public static void main(String[] args) {
		{
				
			String itemNumber;
			String itemDescription;
			double itemPrice;
			int quantityOrdered;
			double grossAmounnt;
			double taxPercentage;
			double taxAmount;
			double discountPercent;
			double discountAmount;
			double netAmount;
			
			Scanner input = new Scanner(System.in);
			
			try 
			{
				System.out.print("Enter Item Number: ");
				itemNumber = input.nextLine();
				
				System.out.print("Enter Item Decription: ");
				itemDescription = input.nextLine();
				
				System.out.print("Enter Item Price: ");
				itemPrice = input.nextLine();
				
				System.out.print("Enter Quantity Ordered: ");
				quantityOrdered = input.nextLine();
				
				System.out.print("Enter Tax Percentage: ");
				taxPercentage = input.nextLine();
				
				System.out.print("Enter Discount Percent: ");
				discountPercent = input.nextLine();
			}
			Catch (InputMismatchException)
			{
				System.out.println("Input format error!");
				e.printStackTrace();
			}
			Catch (Exception e)
			{
				System.out.println("Some other input error occured!");
			}
		}
	input.close();
	}

}
