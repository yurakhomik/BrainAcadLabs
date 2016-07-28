package topic3_2.labs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		//lab3_2_1_and_2();
		lab3_2_3();
	}

	public static void lab3_2_1_and_2() {
		Employee emp = new Employee("Ivan", "Lviv", 5254643, 1);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			String outputPath = "src/topic3_2/labs/employee1_2.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Employee employeeRead;

		FileInputStream fis = null;
		ObjectInputStream oin = null;

		try {
			String inputPath = "src/topic3_2/labs/employee1_2.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			employeeRead = (Employee) oin.readObject();

			System.out.println("Name: " + emp.getName());
			System.out.println("Address: " + emp.getAddress());
			System.out.println("SSN: " + emp.getSSN());
			System.out.println("Number: " + emp.getNumber());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void lab3_2_3() {
		
		Employee employee = new Employee("Yura", "Lviv", 12345, 2);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			String outputPath = "src/topic3_2/labs/employee1_3.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Employee employeeRead;

		FileInputStream fis = null;
		ObjectInputStream oin = null;

		try {
			String inputPath = "src/topic3_2/labs/employee1_3.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			employeeRead = (Employee) oin.readObject();

			System.out.println("Name: " + employeeRead.getName());
			System.out.println("Address: " + employeeRead.getAddress());
			System.out.println("SSN: " + employeeRead.getSSN());
			System.out.println("Number: " + employeeRead.getNumber());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}