// Nicholas Brown CIS406 Powers Table Lab
package powersTable;

import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continueChoice = "y";
		
		System.out.println("Welcome to the Squares and Cubes table");
		
		while (!continueChoice.equalsIgnoreCase("n")) {
			System.out.print("\nEnter and integer: ");
			int upperLimit = scanner.nextInt();
			
			StringBuilder table = new StringBuilder();
			table.append("\nNumber\tSquared Cubed\n");
			table.append("======\t======= =====\n");
			
			for (int number = 1; number <= upperLimit; number++) {
				int square = number * number;
				int cube = number * number * number;
				table.append(number)
						.append("\t")
						.append(square)
						.append("\t")
						.append(cube)
						.append("\n");
			}
			System.out.println(table);
			
			System.out.print("continue? (y/n): ");
			continueChoice = scanner.next();
		}
		
		System.out.println("\nBye!!");
		scanner.close();

	}

}
