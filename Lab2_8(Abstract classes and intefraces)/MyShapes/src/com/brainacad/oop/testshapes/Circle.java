package com.brainacad.oop.testshapes;

public class Circle extends Shape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	static double sumCircleArea;

	public Circle(String shapeColor, double radius) {
		super(shapeColor);
		this.radius = radius;
	}

	public double calcArea() {
		double S = 2 * Math.PI * Math.pow(radius, 2);
		sumCircleArea += S;
		return S;
	}

	@Override
	public String toString() {
		return "This is Circle" + super.toString() + ", radius=" + radius + ", area=" + calcArea();
	}

	public void draw() {
		System.out.println(this.toString());
	}
	
	
}
