package oop2_2.labs.lab4;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	public String gender;
	public int phoneNumber;

	public void setFields(String firstName) {
		firstName = "Ira";

	}
	
	public void setFields (String firstName, String lastName) {
		firstName = "Petja";
		lastName = "Kovboy";
		
	}
	
	public void setFields (int age) {
		age = 21;
	}
	
	public void setFields (String gender, int age) {
		gender = "male";
		age = 4;
	}
	
	public void setFields (int age, int phoneNumber) {
		age = 22;
		phoneNumber = 0674455666;
		
	}

	@Override
	public String toString() {
		return "\tPerson \nFirst name: " + firstName + "\nLast name: " + lastName + "\nAge: "
	           + age + "\nGender: " + gender + "\nPhone number: " + phoneNumber + "\n";
	}

	
}
