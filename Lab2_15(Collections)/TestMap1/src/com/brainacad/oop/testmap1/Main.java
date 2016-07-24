package com.brainacad.oop.testmap1;

import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Translator translator = new Translator();
		translator.addNewWord("cat", "кіт");
		translator.addNewWord("dog", "пес");
		translator.addNewWord("human", "людина");

		System.out.println("Cat - " + translator.translate("cat"));
		System.out.println("Human - " + translator.translate("human"));
		System.out.println("Batman - " + translator.translate("batman"));

		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		StringTokenizer st = new StringTokenizer(s, " ,");
		String trans = "";
		while (st.hasMoreElements()) {
			trans += translator.translate((String) st.nextElement()) + " ";
		}

		System.out.println(trans);

	}
}
