package gradeConverter;

import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String keepGoing = "y";
		
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		while (!keepGoing.equalsIgnoreCase("n")) {
			System.out.print("Enter numerical grade: ");
			int numericGrade = input.nextInt();
			
			char letterGrade;
			if (numericGrade >= 90 && numericGrade <= 100) {
				letterGrade = 'A';
			} else if (numericGrade >= 80) {
				letterGrade = 'B';
			} else if (numericGrade >= 70) {
				letterGrade = 'C';
			} else if (numericGrade >= 60) { 
				letterGrade = 'D';
			} else {
				letterGrade = 'F';
			}
				
			System.out.println("Letter grade: " + letterGrade);
			System.out.println("Continue? (y/n): ");
			keepGoing = input.next();
		}
		
		System.out.println("Bye!!");
		input.close();
	}
}
