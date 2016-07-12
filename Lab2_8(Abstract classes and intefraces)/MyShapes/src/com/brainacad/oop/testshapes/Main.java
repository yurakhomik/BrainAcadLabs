package com.brainacad.oop.testshapes;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		//Lab1
		Shape[] arr = { new Rectangle("BLACK", 1.2, 5.9), 
				        new Rectangle("YELLOW", 3.6, 4.9),
				        new Rectangle("BLUE", 7.1, 9.2), 
				        new Circle("WHITE", 3), 
				        new Circle("GREEN", 7),
				        new Triangle("RED", 2, 3, 4), 
				        new Triangle("RED", 4.3, 3.4, 4.7),
				        new Triangle("RED", 5, 3, 4.4) };

	
		for (Shape element : arr) {
			System.out.println(element);
		}
		System.out.println();
		System.out.println("Rectangle total area: " + Rectangle.sumRectangleArea);
		System.out.println("Triangle total area: " + Triangle.sumTriangleArea);
		System.out.println("Circle total area: " + Circle.sumCircleArea);
		
		
		
		//Lab2
		for (Shape el : arr) {
			el.draw();
		}
		
		
		
		//Lab3
		Arrays.sort(arr);
		System.out.println("\n\nSorted array");
		for (Shape el : arr) {
			el.draw();
		}
		
		
		
		//Lab4
		Rectangle[] arr2 = {new Rectangle("BLACK", 5.2, 32.2),
				            new Rectangle("YELLOW", 6.1, 31.1),
				            new Rectangle("RED", 2.2, 6.2),
				            new Rectangle("BLUE", 5.1, 8.2),
				            new Rectangle("BROWN", 10.1, 9.1) };
		
		Arrays.sort(arr2);
		System.out.println("\n\nSorted Rectangle");
		for (int i = 0; i <arr2.length; ++i) {
			arr2[i].draw();
			

				
		}
		
		
	}
	


}
