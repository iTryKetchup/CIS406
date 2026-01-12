//Nicholas Brown CIS406 Student Registration Lab//
package studentRegistration;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 1 Students Last Name
		System.out.print("Enter student's last name: ");
		String lastName = input.nextLine();
		
		// 2 Students First Name
		System.out.print("Enter student's first name: ");
		String firstName = input.nextLine();
		
		// 3 Students year of birth
		System.out.print("Enter student's year of birth: ");
		int yearofBirth = input.nextInt();
		
		// 4 Concatenate first + last name
		String fullName = firstName + " " + lastName;
		
		// 5 Create password: First name + yearofBirth
		String password = firstName + "*" + yearofBirth;
		
		System.out.println();
		System.out.println("Student Full Name: " + fullName);
		System.out.println("Password: " + password);
		
		input.close();
	}

}
