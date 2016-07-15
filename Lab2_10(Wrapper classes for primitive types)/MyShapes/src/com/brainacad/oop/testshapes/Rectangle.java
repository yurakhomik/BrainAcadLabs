package com.brainacad.oop.testshapes;

import java.util.StringTokenizer;

public class Rectangle extends Shape  {

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
	
	public void draw() {
		System.out.println(this.toString());
	}
	
	public static Rectangle parseRectangle (String s) {
		StringTokenizer st = new StringTokenizer(s, ":,");
		
		while (st.hasMoreElements()) {
			    String figure = st.nextElement().toString();
				String color = st.nextElement().toString();
				String a = st.nextElement().toString();
				String b = st.nextElement().toString();
				Rectangle rectangle = new Rectangle(color, Double.parseDouble(a), 
						                            Double.parseDouble(b));
		
				//System.out.println(rectangle.toString());
		}
		return new Rectangle("WHITE", 1.1, 1.1);
	}

	}

