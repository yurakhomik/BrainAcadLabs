package com.brainacad.oop.testgenerics2;

import java.util.Arrays;

public class Main<T> extends MyTestMethod<T> {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
		System.out.println("Arrays values:\n" + Arrays.toString(arr));
		int number = 3;
		System.out.println("Number of elements that are greated than " 
		                    + number +":\n" + calcNum(arr, number));
		System.out.println("Sum of elements that are greated than " 
                + number +":\n" + calcSum(arr, number));
		
		System.out.println("\n\nArrays values:\n" + Arrays.toString(arr2));
		
		System.out.println("Number of elements that are greated than " 
		                    + number +":\n" + calcNum(arr2, number));
		
		System.out.println("Sum of elements that are greated than " 
               + number +":\n" + calcSum(arr2, number));
		

	}

}
