package tasks;

import java.util.HashMap;
import java.util.Map;

public class task4 {

	public static void main(String[] args) {
		repeatedChar("Combination");
	}
	
	private static void repeatedChar(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < str.length(); i++) {
			String c = String.valueOf(str.charAt(i));
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		 map.forEach((k,v)->{ if(v>1) System.out.println(k +" : "+v );});
	}
}

/*
 * Task 4 Write a program to find repeated characters in a String. For example,
 * if given input to your program is "Java", it should print all duplicates
 * characters, i.e. characters appear more than once in String and their count
 * e.g. a = 2 because character 'a' has appeared twice in String "Java".¨
 * Example of output: List of duplicate characters in String 'Programming' g : 2
 * r : 2 m : 2 List of duplicate characters in String 'Combination' n : 2 o : 2
 * i : 2
 */