package com.brainacad.oop.testshapes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Lab2_11_4();

	}

	public static void Lab2_11_4() {
		try {
			Shape.parseShape("Rectangle:RED:20,10");
		} catch (InvalidShapeStringException e) {
			e.printStackTrace();
		}

		try {
			Shape.parseShape("Triangle:RED:20,10,10");
		} catch (InvalidShapeStringException e) {
			e.printStackTrace();
		}

		try {
			Shape.parseShape("sadgvsdgds");
		} catch (InvalidShapeStringException e) {
			e.printStackTrace();
		}

	}

}
