// Nicholas Brown CIS406 Tip Calculator Lab
package tipCalculator;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println("Tip Calculator\n");
		
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			System.out.print("Cost of meal: ");
			double mealCost = sc.nextDouble();
			System.out.println();
			
			for(double tipPercent = 0.15; tipPercent <= 0.25 + 1e-9; tipPercent += 0.05) {
				double tipAmount = mealCost * tipPercent;
				double totalAmount = mealCost + tipAmount;
				
				System.out.println((int) Math.round(tipPercent * 100) + "%");
				System.out.println("Tip amount:   " + currency.format(tipAmount));
				System.out.println("Total amount:  " + currency.format(totalAmount));			
			}
			
			do {
				System.out.print("Continue? (y/n):  ");
				choice = sc.next();
			} while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));
		}
		
		System.out.println("Bye!!");
		sc.close();
	}
}
