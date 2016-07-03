package oop2_2.labs.lab4;

public class PersonMain {

	public static void main(String[] args) {
		Person per1 = new Person();
		Person per2 = new Person();
		Person per3 = new Person();

		per1.age = 12;
		per1.firstName = "Kate";
		per1.gender = "female";
		System.out.println(per1);

		per2.phoneNumber = 0674455666;
		per2.lastName = "Pypkin";
		per2.firstName = "Vasja";
		System.out.println(per2);

		per3.firstName = "July";
		per3.lastName = "Whitning";
		per3.age = 23;
		per3.gender = "female";
		per3.phoneNumber = 02211221;
		System.out.println(per3);

	}

}
