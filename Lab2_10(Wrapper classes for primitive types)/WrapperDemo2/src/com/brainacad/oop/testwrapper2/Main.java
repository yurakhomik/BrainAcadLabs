package com.brainacad.oop.testwrapper2;

public class Main {
	public static void main (String[] args) {
		System.out.println("4 + 1275354545L = " + compute((byte) 4, 1275354545));
	}

	public static long compute(Byte num1, Integer num2) {
		long num3 = num1.longValue() + num2.longValue();
		return num3;
	}
}
