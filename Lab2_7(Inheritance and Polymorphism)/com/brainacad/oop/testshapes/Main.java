package com.brainacad.oop.testshapes;

public class Main {

	public static void main(String[] args) {

		/*
		 * Triangle tr = new Triangle("RED", 2, 3, 4); System.out.println(tr +
		 * "area=" + tr.calcArea());
		 * 
		 * Rectangle rec = new Rectangle("BLACK", 1.2, 5.9);
		 * System.out.println(rec + "area=" + rec.calcArea());
		 * 
		 * Circle cir = new Circle ("WHITE", 3); System.out.println(cir);
		 */

		Shape[] arr = { new Rectangle("BLACK", 1.2, 5.9), new Rectangle("YELLOW", 3.6, 4.9),
				new Rectangle("BLUE", 7.1, 9.2), new Circle("WHITE", 3), new Circle("GREEN", 7),
				new Triangle("RED", 2, 3, 4), new Triangle("RED", 4.3, 3.4, 4.7), new Triangle("RED", 5, 3, 4.4) };

		for (Shape element : arr) {
			System.out.println(element);
		}
		System.out.println();
		System.out.println("Rectangle total area: " + Rectangle.sumRectangleArea);
		System.out.println("Triangle total area: " + Triangle.sumTriangleArea);
		System.out.println("Circle total area: " + Circle.sumCircleArea);
	}

}
