package com.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		try {
			FileReader f = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(f);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int id = Integer.parseInt(tokens[0]);
			for(int i=0;i<id;i++) {
			String name = (tokens[i*2+1]);
			int price = Integer.parseInt(tokens[i*2+2]);
			int kcal = Integer.parseInt(tokens[i*3+3]);
			line = in.readLine();
			m.f.add(new Food(id,name,price,kcal));
			}
			m.on();
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	
	}

}
