package com.brainacad.oop.testgenerics2;

import java.util.Arrays;

public class MyTestMethod<T> {

	public static <T extends Number> int calcNum(T[] arr, T maxeIm) {
		int count = 0;
		for (T el : arr)
			if (el.doubleValue() > maxeIm.doubleValue())
				++count;

		return count;

	}

	public static <T extends Number> double calcSum(T[] arr, T maxeIm) {
		double sum = 0;
		for (int i = 0; i < arr.length; ++i)
			if (arr[i].doubleValue() > 0)
				sum += arr[i].doubleValue();

		return sum;

	}

}
