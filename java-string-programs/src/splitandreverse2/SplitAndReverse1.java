package splitandreverse2;

public class SplitAndReverse1 {

	// Method to split and reverse the words in a string
	public void splitAndReverse(String s1) {

		String[] srr = s1.split(" ");

		for (int i = srr.length - 1; i >= 0; i--) {
			printCharactersInReverse(srr[i]);
		}
	}

	public void printCharactersInReverse(String s1) {
		char[] crr = s1.toCharArray();

		StringBuffer buffer = new StringBuffer();

		for (int i = crr.length - 1; i >= 0; i--) {
			buffer = buffer.append(crr[i]);
		}
		String s2 = buffer.toString();
		System.out.print(s2 + " ");
	}

}
