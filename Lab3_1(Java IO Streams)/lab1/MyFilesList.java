package topic3_1.lab1;

import java.io.File;

public class MyFilesList {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Oleh\\workspace\\Java SE\\src");
		File[] listOfFiles = file.listFiles();
		method("", listOfFiles);

	}

	public static void method(String separator, File[] listOfFiles) {

		for (File f : listOfFiles) {
			System.out.println(separator + f.getName());
			if (f.isDirectory()) {
				separator += "  ";
				method(separator, f.listFiles());
				separator = "  ";

			}
		

		}

	}
}