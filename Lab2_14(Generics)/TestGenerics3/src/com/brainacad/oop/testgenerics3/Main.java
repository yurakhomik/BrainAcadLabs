package com.brainacad.oop.testgenerics3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Integer[] array = {1,2,3,4,5,6,7,8,9};
		String[] array1 = {"one", "two", "three", "four", "five", "six", "seven", "eigth" , "nine"};
		
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Shuffle arrays: " + Arrays.toString((MyMixer.shuffle(array))));
		
		System.out.println("\n\nArray: " + Arrays.toString(array1));
		System.out.println(Arrays.toString(MyMixer.shuffle(array1)));

	}

}
