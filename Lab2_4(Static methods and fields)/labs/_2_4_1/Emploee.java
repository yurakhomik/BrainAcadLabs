package oop2_4.labs._2_4_1;

public class Emploee {
	
	private String firstName;
	private String lastName;
	private String occupation;
	private int telephone;
	
	private static int numberOfEmployees;

	public Emploee (String firstName, String lastName, String occupation, int telephone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this.telephone = telephone;
		numberOfEmployees++;
	}

	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	

	

	
	
	
	
	

}
