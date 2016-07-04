package oop2_4.labs._2_4_1;

import java.util.Arrays;

public class MyMath {
	
	final static double PI = 3.14;
	int radius;
	
	public static void areaOfCircle(int radius) {
		double area = PI * Math.pow(radius, 2);
		System.out.println(area);
	}
	
	
	
	
	
	public static int findMin (int[] array) {
		Arrays.sort(array);
		int min = array[0];
		return min;
	}
	

	public static int findMax (int[] array) {
		Arrays.sort(array);
		int max = array[array.length-1];
		return max;
		
	}
	
	

}
