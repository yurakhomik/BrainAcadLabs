package com.brainacad.oop.testshapes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		// Lab2_10_3();
		// Lab2_10_4();
		Lab2_10_5();
	}

	public static void Lab2_10_3() {
		Shape.parseShape("Circle:RED:22");
		System.out.println();
		Shape.parseShape("Rectangle:WHITE:10,12");
		System.out.println();
		Shape.parseShape("Triangle:BLUE:12,63,32");
	}

	public static void Lab2_10_4() {
		// Test
		Shape.parseShape("Rectangle:BLUE:1.2,12.9");
		Shape.parseShape("Triangle:Yellow:7.3,4.1,9.2");
		Shape.parseShape("Circle:RED:9.6");
		System.out.println();
		Rectangle.parseRectangle("Rectangle:BLUE:1.2,12.9");
		Triangle.parseTriangle("Triangle:Yellow:7.3,4.1,9.2");
		Circle.parseCircle("Circle:RED:9.6");

	}

	public static void Lab2_10_5() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int x = Integer.parseInt(s);
		Shape[] arr = new Shape[x];

		for (int i = 0; i < arr.length; ++i) {
			String line = sc.nextLine();
			StringTokenizer st = new StringTokenizer(line, ":,");
			while (st.hasMoreElements()) {
				String figure = st.nextElement().toString();

				if (figure.equals("Rectangle")) {
					arr[i] = Rectangle.parseRectangle(line);
					break;
				} else if (figure.equals("Triangle")) {
					arr[i] = Triangle.parseTriangle(line);
					break;
				} else if (figure.equals("Circle")) {
					arr[i] = Circle.parseCircle(line);
					break;
				} else {
					System.out.println("Wrong figure");
				}

			}

		}
		for (Shape el : arr) {
			el.draw();
		}

	}
}
