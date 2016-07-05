package com.brainacad.oop.teststring1;

public class Main {

	public static void main(String[] args) {

		main();
		System.out.println("String: abcd");
		System.out.println("Reverse string: " + reverseString("abcd"));

	}

	public static void main() {
		String myStr = "abracadabra";
		System.out.println("Index of " + "'ra': " + myStr.indexOf("ra"));
		System.out.println("Index of " + "'ra': " + myStr.lastIndexOf("ra"));
		System.out.println("Substring from 3 to 7 char index: " + myStr.substring(3, 7));

	}

	public static String reverseString(String str) {
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			str2 += str.charAt(i);

		}

		return str2;

	}

}
