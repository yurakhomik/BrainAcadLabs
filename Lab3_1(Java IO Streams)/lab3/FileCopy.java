package topic3_1.lab3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\Users\\Oleh\\workspace\\Java SE\\src\\topic3_1\\InputFile");
			fos = new FileOutputStream("C:\\Users\\Oleh\\workspace\\Java SE\\src\\topic3_1\\OutputFile");

			int c;
			
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
