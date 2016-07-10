package com.brainacad.oop.testnested11;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {

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

	static class PhoneNumber {
		private String name;
		private String phone;

		public PhoneNumber(String name, String phone) {
			this.name = name;
			this.phone = phone;

		}

		public String getName() {
			return name;
		}

		public String getPhone() {
			return phone;
		}

		@Override
		public String toString() {
			return "Name:" + name + ", phone:" + phone;
		}

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
