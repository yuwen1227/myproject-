package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	List<Drink> drinks = new ArrayList<>();
	
	public void on(){
		System.out.println("請投硬幣......");
		for(int a=0;a<drinks.size();a++){
			Drink drink = drinks.get(a);
			//輸出飲料+價錢
			System.out.println(drink.getId()+"."+"\t"+drink.getName()+drink.getPrice());
		}
		//以下沒意義(未完成)
		Scanner scanner = new Scanner(System.in);
		String drink = scanner.nextLine();
		int data = -1;
		while(data != 0){
			data = scanner.nextInt();
			switch(data){
			case 0 :
				break;
			}
		}
	}
}
