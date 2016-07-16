package com.brainacad.oop.testthread2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] myArray  = new int[1000];
		for (int i = 0; i < myArray .length; ++i) {
			myArray[i] = (int) (Math.random() * 1000);
		}
		
		
		/*
		//Lab_2_17_3
		MySumCount m = new MySumCount();
		m.setArray(myArray);
		m.setStartIndex(0);
		m.setStopIndex(100);
		m.start();
		System.out.println("Sum of array elements: " + m.getResultSum());
		*/
		
		
		
		//Lab_2_17_4
		MySumCount m2 = new MySumCount();
		m2.setArray(myArray);
		m2.setStartIndex(0);
		m2.setStopIndex(500);
		Thread t = new Thread(m2);
		t.start();
		System.out.println("Sum of array elements: " + m2.getResultSum());
	}
	

}
