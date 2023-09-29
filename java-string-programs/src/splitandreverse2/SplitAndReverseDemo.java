package splitandreverse2;

import java.util.Scanner;

public class SplitAndReverseDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = scan.nextLine();

		// Create object of SplitAndReverse1 Class
		SplitAndReverse1 result = new SplitAndReverse1();

		// Call the Method to reverse String
		result.splitAndReverse(s1);

		// Release Resources
		scan.close();
	}

}
