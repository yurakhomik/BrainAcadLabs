package com.brainacad.oop.testshapes;

import java.util.StringTokenizer;

public abstract class Shape implements Drawable, Comparable<Shape> {

	private String shapeColor;
	double sumArea;

	public abstract double calcArea();
		
	

	public void draw() {

		System.out.println(this);

	}

	public Shape(String shapeColor) {
		this.shapeColor = shapeColor;

	}

	@Override
	public String toString() {
		return ", color is: " + shapeColor;
	}

	public int compareTo(Shape o) {
		if (this.calcArea() > o.calcArea())
			return 1;
		if (this.calcArea() < o.calcArea())
			return -1;
		return 0;

	}

	public static void parseShape(String s) throws InvalidShapeStringException {
		StringTokenizer st = new StringTokenizer(s, ":,");
		
		while (st.hasMoreElements()) {
			String figure = st.nextElement().toString();
			

			if (figure.equals("Rectangle")) {
				Rectangle.parseRectangle(s);
				break;
			} else if (figure.equals("Triangle")) {
				Triangle.parseTriangle(s);
				break;
			} else if (figure.equals("Circle")) {
				Circle.parseCircle(s);
				break;
			} else {
				throw new InvalidShapeStringException();
			}
		}

	}
}
