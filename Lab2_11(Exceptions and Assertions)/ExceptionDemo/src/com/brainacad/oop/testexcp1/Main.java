package com.brainacad.oop.testexcp1;

public class Main {

	public static void main(String[] args) {

		try {
			Person person = new Person();
			person.setAge(131);
		}

		catch (InvalidAgeException e) {
			System.out.println("Invalid Age Exception");
		}

		

	}

}
