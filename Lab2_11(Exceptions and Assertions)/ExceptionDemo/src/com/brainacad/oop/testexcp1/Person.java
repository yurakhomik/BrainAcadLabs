package com.brainacad.oop.testexcp1;

import java.util.Arrays;

public class Person {
	
	String firstName;
	String lastName;
	int age;
	
	
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
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) throws InvalidAgeException {
		if (age > 1 && age <=120)
			this.age = age;
		else
			throw new InvalidAgeException();
		
		
	}
	
	

}
