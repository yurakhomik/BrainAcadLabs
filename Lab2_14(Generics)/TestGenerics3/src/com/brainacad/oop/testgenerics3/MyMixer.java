package com.brainacad.oop.testgenerics3;

import java.util.Random;

public class MyMixer<T> {
	Object[] array;
	
	public static <T extends Object>T[] shuffle(T[] arr) {
		Random rnd = new Random();
		for (int i = 0; i < arr.length; ++i) {
			int index = rnd.nextInt(i+1);
			T temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
			
			}
		
		return arr;
	}
	

}
