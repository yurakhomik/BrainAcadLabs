package topic3_1.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		sc.close();

		try {
			sc = new Scanner(new File(s));
			File file = new File(s);
			while (sc.hasNext()) {
				String k = sc.nextLine();
				File fileTwo = new File(k);
				System.out.println(fileTwo);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}
