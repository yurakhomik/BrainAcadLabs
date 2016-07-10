package com.brainacad.oop.testnested11;

import java.util.Arrays;
import java.util.Comparator;

import com.brainacad.oop.testnested11.MyPhoneBook.PhoneNumber;

public class MyPhone {

	class Camera {
	}

	class Bluetooth {
	}

	class TouchScreen {
	}

	class PowerOnButton {
	}

	class HeadPhones {
	}

	class PhoneBattery {
	}

	class PhoneCharger {
	}

	class PhoneDisplay {
	}

	class PhoneSpeaker {
	}

	public MyPhone() {

	}

	public void swichOn() {
		System.out.print("\nLoading PhoneBook records… ");
		System.out.println("OK!");
	}
	
	private static MyPhoneBook addNum() {
		MyPhone k = new MyPhone();
		MyPhoneBook book = k.new MyPhoneBook();
		book.addPhoneNumber("Kate", "0935544666");
		book.addPhoneNumber("Bohdan", "0636654666");
		book.addPhoneNumber("Igor", "0975263633");
		book.addPhoneNumber("Yura", "0806746363");
		book.addPhoneNumber("Yulia", "5437452322");
		book.addPhoneNumber("Petro", "4346436463");
		book.addPhoneNumber("Vasyl", "2264325457");
		book.addPhoneNumber("Oleh", "1452464577");
		book.addPhoneNumber("Roman", "06236947542");
		return book;
	}

	public void call(int n) {
		MyPhoneBook mp = addNum();
		System.out.print("Calling to: " + mp.phoneNumbers[n]);
	}

	public class MyPhoneBook {

		class MemoryCard {
		}

		class SimCard {
		}

		private PhoneNumber[] phoneNumbers;
		private int available;

		{
			available = 0;
			phoneNumbers = new PhoneNumber[available];
		}

		public void addPhoneNumber(String name, String phone) {
			++available;
			phoneNumbers = Arrays.copyOf(phoneNumbers, available);
			phoneNumbers[phoneNumbers.length - 1] = new PhoneNumber(name, phone);
		}

		public void printPhoneBook() {
			for (int i = 0; i < phoneNumbers.length; ++i) {
				System.out.println(phoneNumbers[i]);
			}
		}

		public void sortByName() {
			Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
				public int compare(PhoneNumber o1, PhoneNumber o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
		}

		public void sortByPhoneNumber() {
			Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
				public int compare(PhoneNumber o1, PhoneNumber o2) {
					return o1.getPhone().compareTo(o2.getPhone());
				}
			});

		}

	}

}