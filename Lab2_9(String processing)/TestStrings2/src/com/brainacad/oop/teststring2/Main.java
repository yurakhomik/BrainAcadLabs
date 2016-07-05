package com.brainacad.oop.teststring2;

public class Main {

	public static void main(String[] args) {
		main();

	}

	public static void main() {
		String str1 = "Cartoon";
		String str2 = "Tomcat";
		String str3 = "";
		boolean isDistinct = false;
		for (int i = 0; i < str1.length(); ++i) {
			isDistinct = false;
			for (int j = 0; j < str2.length(); ++j) {
				if (str1.charAt(i) == str2.charAt(j)) {

					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				str3 += str1.charAt(i);

			}

		}

		System.out.println("Leeters present in the Cartoon, but absent in Tomcat: " + str3);

	}

}
