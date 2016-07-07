package com.brainacad.oop.testsregexp;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] userNameString = { "VOVA", "Ivan", "car", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " " };
		System.out.print("String is: ");
		for (String name : userNameString) {
			System.out.print(name + ", ");
		}
		System.out.println();

		for (int i = 0; i < userNameString.length; ++i) {
			System.out.println(checkPersonWithRegExp(userNameString[i]));
		}

	}

	public static boolean checkPersonWithRegExp(String userNameString) {
		if (Character.isUpperCase(userNameString.charAt(0))) {
			for (int j = 1; j < userNameString.length(); j++) {
				if (Character.isLowerCase(userNameString.charAt(j))) {

				} else {

					return false;
				}
			}

			return true;

		}

		return false;
	}

}
