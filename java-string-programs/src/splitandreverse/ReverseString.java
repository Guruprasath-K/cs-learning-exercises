package splitandreverse;

public class ReverseString {

	// Method to split and reverse the String
	public void stringReversal(String s1) {

		String[] srr = s1.split(" ");

		for (int i = srr.length - 1; i >= 0; i--) {
			System.out.print(srr[i] + " ");
		}
	}

}
