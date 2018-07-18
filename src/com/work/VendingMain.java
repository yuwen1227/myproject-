package com.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		try {
			FileReader fr = new FileReader("machine.txt");
			BufferedReader bf = new BufferedReader(fr);
			
			String line = bf.readLine();
			String[] token1 = line.split(",");
			List<String> d1 = new ArrayList<>();
			for(int i=0;i<token1.length;i++) {
				d1.add(token1[i]);
			}
			line = bf.readLine();
			String[] token2 = line.split(",");
			List<String> d2 = new ArrayList<>();
			for(int i=0;i<token2.length;i++) {
				d2.add(token2[i]);
			}
			line = bf.readLine();
			String[] token3 = line.split(",");
			List<String> d3 = new ArrayList<>();
			for(int i=0;i<token3.length;i++) {
				d3.add(token3[i]);
			}
			line = bf.readLine();
			String[] token4 = line.split(",");
			List<String> d4 = new ArrayList<>();
			for(int i=0;i<token4.length;i++) {
				d4.add(token4[i]);
			}
			line = bf.readLine();
			String[] token5 = line.split(",");
			List<String> d5 = new ArrayList<>();
			for(int i=0;i<token5.length;i++) {
				d5.add(token5[i]);
			}
			System.out.println("項目"+d1.get(0)+"\t"+"品項名:"+d1.get(1)+"\t"+"價錢:"+d1.get(2));
			System.out.println("項目"+d2.get(0)+"\t"+"品項名:"+d2.get(1)+"\t"+"價錢:"+d2.get(2));
			System.out.println("項目"+d3.get(0)+"\t"+"品項名:"+d3.get(1)+"\t"+"價錢:"+d3.get(2));
			System.out.println("項目"+d4.get(0)+"\t"+"品項名:"+d4.get(1)+"\t"+"價錢:"+d4.get(2));
			System.out.println("項目"+d5.get(0)+"\t"+"品項名:"+d5.get(1)+"\t"+"價錢:"+d5.get(2));
			System.out.println("請投入硬幣(1元 5元 10元 50元) : ");
			Scanner scanner = new Scanner(System.in);
			int money = scanner.nextInt();
			while(money<20) {
				System.out.println("oops!金額不足!請再投入硬幣");
			int money2 = scanner.nextInt();
			while(money==20||money+money2==20)
				System.out.println("請輸入購買項目:"+d3.get(0)+" "+d3.get(1)+"  "+d4.get(0)+" "+d4.get(1) );
			
			int number = scanner.nextInt();
				System.out.println("購買完成!謝謝光臨!");
				break;
			}
		}catch(FileNotFoundException e) {
			System.out.println("oops!error!");
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
