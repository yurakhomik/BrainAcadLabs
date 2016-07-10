package com.brainacad.oop.testnested11;

import com.brainacad.oop.testnested11.MyPhoneBook.PhoneNumber;

public class Main {

	public static void main(String[] args) {

		MyPhoneBook book = getMyPhoneBook();
		book.printPhoneBook();
		
		System.out.println("\n");

		book.sortByName();
		book.printPhoneBook();
		
		System.out.println("\n");
		
		book.sortByPhoneNumber();
		book.printPhoneBook();
		
		MyPhone k = new MyPhone();
		k.swichOn();
		k.call(1);
		
	
		

	}
	
	private static MyPhoneBook getMyPhoneBook() {
		MyPhoneBook book = new MyPhoneBook();

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

}
