package oop2_2.labs.lab3;

public class Accountant {
	public static void main (String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.calcSalary("Ira", 350);
		emp2.calcSalary("Ihor", 900);
		emp3.calcSalary("Jack", 2750);
		
		System.out.println("Total salary is: " + Employee.totalSalary + "$");
	}

}
