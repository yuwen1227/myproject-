package com.java2.oo;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("vending.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token = line.split(",");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
