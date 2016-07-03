package HomeWork;

import java.util.Scanner;

public class LabWork15 {


	public static void main(String[] args) {

		// task1();
		// task2();
		// task3();
		// task4();
		task5();

	}

	public static void task1() {

		for (int max = 1; max < 9; ++max) {
			for (int min = 1, maxCopy = max; min <= maxCopy; --maxCopy) {
				System.out.print(maxCopy + " ");
			}
			System.out.println();

		}
	}

	public static void task2() {

		System.out.println("Please enter some character:");
		String number = new Scanner(System.in).nextLine();

		switch (number) {

		case "1":
			System.out.println("One");
			break;
		case "2":
			System.out.println("Two");
			break;
		case "3":
			System.out.println("Three");
			break;
		case "4":
			System.out.println("Four");
			break;
		case "5":
			System.out.println("Five");
			break;
		case "6":
			System.out.println("Six");
			break;
		case "7":
			System.out.println("Seven");
			break;
		case "8":
			System.out.println("Eight");
			break;
		case "9":
			System.out.println("Nine");
			break;
		default:
			System.out.println("Other nubmer");

		}

		// System.out.println(number);

	}

	public static void task3() {

		System.out.println("* | 1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9" + "\n-----"
				+ "------------------------------------"
				+ "------------------------");

		for (int i = 1; i < 10; ++i) {
			System.out.print(i + " | ");
			for (int k = 1; k < 10; ++k) {
				System.out.print(k * i + "\t");
			}
			System.out.println();
		}

	}

	public static void task4() {

		int count = 0;

		for (int i = 1; i < 300; ++i) {
			if (i % 3 == 0 && i % 4 == 0) {
				count++;
				System.out.printf("%-5d", i);
			}
			if (count == 10)
				break;

		}
		System.out.println();
		System.out.println("Count = " + count);
	}

	public static void task5() {

		int sum = 0;

		double n = 100;

		for (int i = 0; i < n; ++i) {
			sum += i;
		}
		System.out.println("Sum is: " + sum);
		double aver = sum / n;
		System.out.println("Average is: " + aver);
	}


}
