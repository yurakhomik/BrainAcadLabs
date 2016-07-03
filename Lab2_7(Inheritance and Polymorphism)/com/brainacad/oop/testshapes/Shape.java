package com.brainacad.oop.testshapes;

public class Shape {

	private String shapeColor;
	double sumArea;

	public double calcArea() {
		return 0;
	}
	

	public Shape(String shapeColor) {
		this.shapeColor = shapeColor;

	}

	@Override
	public String toString() {
		return ", color is: " + shapeColor;
	}
}
