package com.brainacad.oop.testshapes;

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
	
	
	public int compareTo (Shape o) {
		if (this.calcArea() > o.calcArea()) return 1;
		if (this.calcArea() < o.calcArea()) return -1;
		return 0;
		
	}
	

}
