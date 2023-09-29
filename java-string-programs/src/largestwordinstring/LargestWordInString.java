package largestwordinstring;

public class LargestWordInString {

	// Method to find the Largest Word in the given String
	public String largestWord(String s1) {

		String[] srr = s1.split(" ");
		String largestWord = "";

		for (int i = 0; i <= srr.length - 1; i++) {
			if (srr.length > largestWord.length()) {
				largestWord = srr[i];
			}
		}

		return largestWord;
	}

}
