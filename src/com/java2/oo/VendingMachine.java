package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int total = 0;
	List<Drink> drinks = new ArrayList<>();
	
	public void on(){
		System.out.println("請投硬幣......");
		for(int i=0;i<drinks.size();i++){
			Drink drink = drinks.get(i);
			//輸出飲料+價錢
			System.out.println();
		}
		Scanner scanner = new Scanner(System.in);
	}
}
