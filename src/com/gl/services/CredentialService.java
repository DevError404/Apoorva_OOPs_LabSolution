package com.gl.services;
import java.util.Random;

public class CredentialService {
	
	private String email;
	private String password;

	public void generatePassword() {
		Random random = new Random();
		String capsLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String nums = "1234567890";
		String specialChars = "!@#$%^&*()_+=-~`<>,?/";
		
		String values = capsLetters + smallLetters + nums + specialChars;
		
		char[] pass = new char[8];
		
		for (int i = 0; i < 8; i++) {
			pass[i] = values.charAt(random.nextInt(values.length()));
		}
		
		this.password = new String(pass);
	}
	
	public void generateEmailAddress(String firstName, String lastName, String department) {
		this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abc.com";
	}
	
	public void showCredentials(String firstName) {
		System.out.println("\n\nDear "+ firstName + " your generated credentials are as follows");
		System.out.println("Email : " + this.email);
		System.out.println("Password : " + this.password);
	}
}
