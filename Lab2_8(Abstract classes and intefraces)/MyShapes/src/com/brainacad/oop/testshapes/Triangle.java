package com.brainacad.oop.testshapes;

public class Triangle extends Shape {
	
	private double a;
	private double b;
	private double c;
	
	static double sumTriangleArea;

	public Triangle(String shapeColor, double a, double b, double c) {
		super(shapeColor);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calcArea () {
		double S = (a + b + c) / 2;
		double A = Math.sqrt(S*(S - a) * (S - b) * (S - c));
		sumTriangleArea += A;
		return A;
	}

	@Override
	public String toString() {
		return "This is Triangle" + super.toString()   + ", a=" + a + ", b=" + b + ", c=" 
	            + c + ", area=" + calcArea();
	}
	
	public void draw() {
		System.out.println(this.toString());
	}
	

	
	

}
