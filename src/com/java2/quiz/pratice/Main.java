package com.java2.quiz.pratice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.security.GeneralSecurityException;

public class Main {

	public static void main(String[] args) {
	FileReader fx ;
	Machine m = new Machine();
	try {
		fx = new FileReader("drink.txt");
		BufferedReader in = new BufferedReader(fx);
		String line = in.readLine();
		String[] tokens = line.split(",");
		int count = Integer.parseInt(tokens[0]);
		
		for(int i=0;i<count;i++) {
			String name = tokens[i*2+1];
			int price = Integer.parseInt(tokens[i*2+2]);
			m.drink.add(new Drink(i+1, name, price));
		}
		
		
		
		
		m.on();
	} catch (Exception e) {
		
	}
	
	}

}
