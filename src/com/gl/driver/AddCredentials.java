package com.gl.driver;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.services.CredentialService;

public class AddCredentials {
	
	public static void main (String args[]) {
		
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Hey there!");
		System.out.print("Enter your first name :");
		String firstName = sc.nextLine();
		System.out.print("Enter your last name :");
		String lastName = sc.nextLine();
		
		Employee emp = new Employee(firstName, lastName);
		
		System.out.println("Please enter the department from the following: \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		int selection = sc.nextInt();
		emp.setDepartment(selection);
		
		CredentialService cs = new CredentialService();
		cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), emp.getDepartment());
		cs.generatePassword();
		cs.showCredentials(emp.getFirstName());
	}
}
