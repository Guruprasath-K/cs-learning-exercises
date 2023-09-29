package largestwordinstring;

import java.util.Scanner;

public class LargestWordInStringDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = scan.nextLine();

		// Create object of LargestWordInString Class
		LargestWordInString word = new LargestWordInString();

		// Call the method to find the largest word
		String largest = word.largestWord(s1);

		// Print the resultant data
		System.out.println("The largest Word in the given String = " + largest);

		// Release Resources
		scan.close();
	}

}
