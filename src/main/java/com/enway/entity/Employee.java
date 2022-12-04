package com.enway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name="passport_number")
	private String passportNumber;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="working_role")
	private String workingRole;
	
	@Column(name="experience_years")
	private int experienceYears;

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWorkingRole() {
		return workingRole;
	}

	public void setWorkingRole(String workingRole) {
		this.workingRole = workingRole;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	protected Employee() {
		
	}

	public Employee(String passportNumber, String firstName, String lastName, String workingRole, int experienceYears) {
		
		this.passportNumber = passportNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingRole = workingRole;
		this.experienceYears = experienceYears;
	}
	
	

}
