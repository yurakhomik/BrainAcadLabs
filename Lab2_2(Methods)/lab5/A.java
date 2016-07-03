package oop2_2.labs.lab5;

public class A {
	
	public  void calcSquare(double a, double b) {
		double S = a * b;
		System.out.println("Square of rectangle = " + S);
		
		
	}
	
	public  void calcSquare(double a) {
		double S = a * a;
		System.out.println("Square of square = " + S);
	}

	public  void calcSquare(int radius) {
		double S = Math.PI * Math.pow(radius, 2);
		System.out.println("Square of circle = " + S);
		
	}

	

}
