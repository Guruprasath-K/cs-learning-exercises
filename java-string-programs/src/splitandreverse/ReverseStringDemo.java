package splitandreverse;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {

		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = scan.nextLine();

		// Create object of ReverseString Class
		ReverseString reverse = new ReverseString();

		// Call the Method to reverse String
		reverse.stringReversal(s1);

		// Release Resources
		scan.close();
	}

}
