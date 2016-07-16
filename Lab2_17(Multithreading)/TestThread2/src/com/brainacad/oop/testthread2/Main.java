package com.brainacad.oop.testthread2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] myArray  = new int[1000];
		for (int i = 0; i < myArray .length; ++i) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		
		MySumCount m = new MySumCount();
		m.setArray(myArray);
		m.setStartIndex(0);
		m.setStopIndex(100);
		m.start();
		System.out.println("Sum of array elements: " + m.getResultSum());
	}
	

}
