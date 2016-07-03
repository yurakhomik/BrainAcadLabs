package com.brainacad.oop.testshapes;

public class Rectangle extends Shape {

	private double a;
	private double b;
	
	static double sumRectangleArea;

	public Rectangle(String shapeColor, double a, double b) {
		super(shapeColor);
		this.a = a;
		this.b = b;
	}

	public double calcArea() {
		double S = a * b;
		sumRectangleArea += S;
		return S;
	}

	@Override
	public String toString() {
		return "This is Rectangle" + super.toString() + ", a=" + a + ", b=" + b + ", area=" + calcArea();
	}

}
