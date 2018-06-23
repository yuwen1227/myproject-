//25代表有5x5共25顆球，產生時就給亂數排列出來
//如下:
// 5 10 11  8 25
//13  6 21  4  1
//22 15 23 19  7
//2  20 18  3 14
//17  9 12 24 16
//bingo.txt:25
//8,4,7,18,21,3,5,1,9,10
package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BingoMain extends Bingo{
	public BingoMain() {
	try {
		FileReader rd	 = new FileReader("Bingo.txt");
	BufferedReader in = new BufferedReader(rd);
	String line = in.readLine();
	int number = Integer.parseInt(line);
	int table = (int)Math.sqrt(number);
	line = in.readLine();
	String[] tokens = line.split(",");
	List<Integer> bingos = new ArrayList<>();
	for (int i=0; i<=tokens.length-1; i++) {
		int bingo= Integer.parseInt(tokens[i]);
		bingos.add(bingo);
		
	}
	Form form = new Form(table, number, bingos);
	form.print();
	form.Bingo();
	
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
}

public static void main(String[] args) {
	new BingoMain();
}
}