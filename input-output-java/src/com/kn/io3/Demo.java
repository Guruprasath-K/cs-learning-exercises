package com.kn.io3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args) {
		try {
			String path1 = "D:\\io\\input.txt";
			String path2 = "D:\\io\\output.txt";

			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			String x;

			while ((x = br.readLine()) != null) {
				bw.write(x);
			}
			bw.flush();
			br.close();
			bw.close();
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
