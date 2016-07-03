package oop2_3.labs;

import oop2_3.labs.lab_1.MyWindow;

public class Main {

	public static void main(String[] args) {

		// MyWindow win1 = new MyWindow(2.3, 1.2, 3, "brown", true);
		// MyWindow win2 = new MyWindow(2.24, 3.12, 2, "white", false);
		// MyWindow win3 = new MyWindow(2.3, 1.2, 3);
		// MyWindow win4 = new MyWindow(3.2, 2.1);
		// MyWindow win5 = new MyWindow(5.63, 3.52, 1);
		// MyWindow win6 = new MyWindow();

		MyWindow[] arr = { new MyWindow(2.3, 1.2, 3, "brown", true), new MyWindow(2.24, 3.12, 2, "white", false),
				new MyWindow(2.3, 1.2, 3), new MyWindow(3.2, 2.1), new MyWindow(5.63, 3.52, 1), new MyWindow() };

		for (MyWindow wind : arr) {
			wind.printFields();
			System.out.println();

		}

	}

}
