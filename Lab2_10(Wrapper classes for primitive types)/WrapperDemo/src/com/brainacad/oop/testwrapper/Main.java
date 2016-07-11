package com.brainacad.oop.testwrapper;

public class Main {

	public static void main(String[] args) {

		main();
	}
	
	public static void main () {
		Integer x1 = 10;
		Integer x2 = new Integer(10);
		Integer x3 = Integer.valueOf(10);
		Integer x4 = Integer.parseInt("10");
		
		System.out.println("x1 == x2: " + (x1 == x2));
		System.out.println("x2 == x3: " + (x2 == x3));
		System.out.println("x3 == x4: " + (x3 == x4));
		System.out.println("x4 == x1: " + (x4 == x1));
		System.out.println("x1 equals x2: " + x1.equals(x2));
		System.out.println("x2 equals x3: " + x3.equals(x3));
		System.out.println("x3 equals x4: " + x3.equals(x4));
		System.out.println("x4 equals x1: " + x4.equals(x1));
		
	}

}
