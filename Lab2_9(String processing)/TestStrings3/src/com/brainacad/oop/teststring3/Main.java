package com.brainacad.oop.teststring3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String s = "Using methods of class String";
		System.out.println("String: " + s);
		System.out.println("Unique chars: " + Arrays.toString(uniqueChars(s)));

	}

	public static char[] uniqueChars(String s) {
		char[] ch = new char[s.length()];
		int k = 0;

		for (int i = 0; i < ch.length; ++i) {
			boolean noUnique = false;
			for (int j = 0; j < ch.length; ++j) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					noUnique = true;
					break;
				}
			}
			if (!noUnique) {
				ch[k++] = s.charAt(i);
			}
		}

		return ch;

	}

}
