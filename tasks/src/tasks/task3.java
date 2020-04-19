package tasks;

public class task3 {

	public static void main(String[] args) {
		System.out.println(isAnagram("NewYork", "YORKnew"));

	}

	private static Boolean isAnagram(String firstWord, String secondWord) {
		firstWord = firstWord.toLowerCase();
		secondWord = secondWord.toLowerCase();
		if (firstWord.length() != secondWord.length()) {
			return false;
		} else {
			for (int i = 0; i < firstWord.length(); i++) {
				int j = secondWord.indexOf(firstWord.charAt(i)); // we check if SecondWord has the char plus we get its
																	// location in SecondWord.
				if (j != -1) {
					secondWord = secondWord.substring(0, j) + secondWord.substring(j + 1, secondWord.length());
				} else {
					return false;
				}
			}
		}
		return true;
	}
}

/*
 * Task 3 Write Algorithms to Check if Two String are Anagram An anagram is
 * something where length and character matches but not the order like Army and
 * Mary, both have the same number of characters.
 */
