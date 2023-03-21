package com.qa.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MorseTranslator {
	Map<String, String> morseCode ;
	
	public void MorseCode() {
		morseCode= new HashMap<>();
		morseCode.put( ".-","A");
		morseCode.put( "-...","B");
		morseCode.put("-.-.","C");
		morseCode.put("-..","D");
		morseCode.put( ".","E");
		morseCode.put( "..-.","F");
		morseCode.put( "--.","G");
		morseCode.put( "....","H");
		morseCode.put( "..","I");
		morseCode.put( ".---","J");
		morseCode.put( "-.-","K");
		morseCode.put( ".-..","L");
		morseCode.put( "--","M");
		morseCode.put( "-.","N");
		morseCode.put( "---","O");
		morseCode.put( ".--.","P");
		morseCode.put("--.-","Q");
		morseCode.put(".-.","R");
		morseCode.put( "...","S");
		morseCode.put("-","T");
		morseCode.put("..-","U");
		morseCode.put("...-","V");
		morseCode.put(".--","W");
		morseCode.put("-..-","X");
		morseCode.put( "-.--","Y");
		morseCode.put("-----","0");
		morseCode.put(".----","1");
		morseCode.put( "..---","2");
		morseCode.put( "...--","3");
		morseCode.put( "....-","4");
		morseCode.put( ".....","5");
		morseCode.put( "-....","6");
		morseCode.put("--...","7");
		morseCode.put( "---..","8");
		morseCode.put( "----.","9");
		morseCode.put( ".-.-.-",".");
		morseCode.put( "--..--",",");
		morseCode.put( "..--..","?");
		morseCode.put( " ","");	
		morseCode.put( "/"," ");	

	}
	
	public String translate(String message) {
		MorseCode();

		String result = null;
		String[] morseWords = message.split("/");
		for (String morseWord:morseWords) {
			String[] morseChars = morseWord.split(" ");
			for (String morseChar:morseChars) {
				result += morseCode.get(morseChar);
			}
		}
		result.replaceAll("null", " ");
		
		return result;
	}

}
