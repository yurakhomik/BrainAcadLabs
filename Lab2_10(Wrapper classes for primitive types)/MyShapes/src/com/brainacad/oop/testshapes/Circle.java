package com.brainacad.oop.testshapes;

import java.util.StringTokenizer;

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
		double S = Math.PI * Math.pow(radius, 2);
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
	
	public static Circle parseCircle (String s) {
		StringTokenizer st = new StringTokenizer(s, ":,");
		
		while (st.hasMoreElements()) {
			    String figure = st.nextElement().toString();
				String color = st.nextElement().toString();
				String a = st.nextElement().toString();
				Circle circle = new Circle(color, Double.parseDouble(a));
				//System.out.println(circle.toString());
		
		}
		return new Circle("WHITE", 1.1);
	}
	
	
}
