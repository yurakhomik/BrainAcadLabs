package com.brainacad.oop.testmap1;

import java.util.*;
import java.util.Map.Entry;

public class Translator {

	private Map<String, String> dictionary = new HashMap<>();
	
	public void addNewWord(String en, String ua) {
		dictionary.put(en, ua);	
	}
	
	public String translate(String en) {
		String translateWord = "";
		
		Iterator <HashMap.Entry<String, String>> it = dictionary.entrySet().
				                                                 iterator();
		
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			if (entry.getKey().equals(en)) {
				translateWord = entry.getValue();
				break;
			}
		}
		return !translateWord.equals("") ? translateWord : "Sorry!There is not"
				+ " translation for this word yes!";
	}
}
