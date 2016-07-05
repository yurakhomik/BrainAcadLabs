package com.brainacad.oop.teststokennizer;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String myStr = "This is String, split by StringTokenizer. "
				+ "Created by Student: Khomik Yurii";
		StringTokenizer myStr2 = new StringTokenizer(myStr);
		while (myStr2.hasMoreElements())
			System.out.println(myStr2.nextElement());
		//System.out.println(myStr);

	}

}
