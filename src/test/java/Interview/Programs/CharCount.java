package Interview.Programs;

import java.util.HashMap;
import java.util.Map;

public class CharCount {


	/*
	 * Java Interview Question:

		How To Count Occurrences Of Each Character In String In Java

	 */
	private static void countChar(String name) {
		Map<Character, Integer> charMap= new HashMap<Character, Integer>();
		char[] nameArray = name.toCharArray();
		for (char c : nameArray) {
			if(!String.valueOf(c).isBlank()) {

				if(charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c)+1);
				}else {
					charMap.put(c,1);
				}
			}
		}
		System.err.println(charMap);
	}

	private static void countCharacter(String name) {
		Map<Character, Integer> charMap= new HashMap<Character, Integer>();
		char[] nameArray = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {

			if(!String.valueOf(nameArray[i]).isBlank()) {

				if(charMap.containsKey(nameArray[i])) {
					charMap.put(nameArray[i], charMap.get(nameArray[i])+1);
				}else {
					charMap.put(nameArray[i],1);
				}
			}
		}
		System.err.println(charMap);
	}

	/* find the blank spaces in the given string */
	private static void countSpacesInString (String name) {
		Map<Character, Integer> charMap= new HashMap<Character, Integer>();
		char[] nameArray = name.toCharArray();
		for (int i = 0; i < nameArray.length; i++) {

			if(String.valueOf(nameArray[i]).isBlank()) {
				if(charMap.containsKey(nameArray[i])) {
					charMap.put(nameArray[i], charMap.get(nameArray[i])+1);
				}else {
					charMap.put(nameArray[i],1);
				}
			}
		}
		System.err.println(charMap);
	}

	public static void main(String[] args) {
		countCharacter("chandra chandra chandra");
		countChar("chandra chandra chandra");
		countSpacesInString("chandra chandra chandra	");
	}

}
