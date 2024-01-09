package com.kn.io2;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args) {
		try {
			String path1 = "D:\\io\\input.txt";
			String path2 = "D:\\io\\output.txt";

			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);

			int x;

			while ((x = fr.read()) != -1) {
				fw.write(x);
			}
			fw.flush();
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

