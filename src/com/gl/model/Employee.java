/**
 * 
 */
package com.gl.model;

/**
 * @author Apoorva Gupta
 *
 */
public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName.trim();
		this.lastName = lastName.trim();
	}

	public String getFirstName () {
		return this.firstName;
	}
	
	public String getLastName () {
		return this.lastName;
	}
	
	public String getDepartment () {
		return this.department;
	}
	
	public void setDepartment (int selection) {
		switch(selection) {
		case 1: this.department = "technical";
			break;
		case 2: this.department = "admin";
			break;
		case 3: this.department = "humanresource";
			break;
		case 4: this.department = "legal";
			break;
		default :
			this.department = "default";
			
		}
	}
	
}
