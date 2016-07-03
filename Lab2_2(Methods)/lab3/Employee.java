package oop2_2.labs.lab3;

public class Employee {

	public String name;
	public double salary;
	public static double totalSalary;

	public void calcSalary(String name, double salary) {
		System.out.println(name + " have salary: " + salary + "$");
		totalSalary += salary;

	}

}
