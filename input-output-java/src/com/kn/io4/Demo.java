package com.kn.io4;

import java.io.FileWriter;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter an integer: ");
			int n = scan.nextInt();
			String path2 = "D:\\io\\output.txt";
			FileWriter fw = new FileWriter(path2);
			fw.write(n);
			scan.close();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
