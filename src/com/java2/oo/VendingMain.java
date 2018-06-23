//vendint.txt : 3,Coke,25,Orange Juice,30,Sprite,20
package com.java2.oo;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class VendingMain {


	public static void main(String[] args) {
		//讀取鍵盤輸入     BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//readLine()    讀取檔案每行資料 傳回為String 自動刪除跳行符號 因此字會擠在一起
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		
		try {
					fr = new FileReader("vending.txt");
				
/*讀取"vending.txt"*/BufferedReader in = new BufferedReader(fr);
					String line = in.readLine();
/*資料以,做分割*/		String[] tokens = line.split(",");
/*3項飲料*/			int count = Integer.parseInt(tokens[0]);
					for(int i = 0;i<count;i++){
/*奇數項為名稱*/		String name = tokens[i*2+1];
/*偶數項為價錢*/		int price = Integer.parseInt(tokens[i*2+2]);
						vm.drinks.add(new Drink(i+1,name,price));
			}
			
			vm.on();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
	}
}
