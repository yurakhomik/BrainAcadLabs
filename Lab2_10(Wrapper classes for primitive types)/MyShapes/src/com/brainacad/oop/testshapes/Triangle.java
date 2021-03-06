package com.brainacad.oop.testshapes;

import java.util.StringTokenizer;

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
		return "This is Triangle" + super.toString()   + ", a=" + a + ", b=" 
	                              + b + ", c=" + c + ", area=" + calcArea();
	}
	
	public void draw() {
		System.out.println(this.toString());
	}
	
	public static Triangle parseTriangle (String s) {
		StringTokenizer st = new StringTokenizer(s, ":,");
		
		while (st.hasMoreElements()) {
			    String figure = st.nextElement().toString();
				String color = st.nextElement().toString();
				String a = st.nextElement().toString();
				String b = st.nextElement().toString();
				String c = st.nextElement().toString();
				Triangle triangle = new Triangle(color, Double.parseDouble(a), 
						                                Double.parseDouble(b),
						                                Double.parseDouble(c));
				//System.out.println(triangle.toString());
		
		}
		
		return new Triangle("WHITE", 1.1, 1.1, 1.1);
	}
	

	
	

}
