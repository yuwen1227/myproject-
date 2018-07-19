package com.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("ticket.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token1 = line.split(","); 
			List<String> t1 = new ArrayList<>();
			for(int i=0;i<token1.length;i++) {
				t1.add(token1[i]);
			}
			line = in.readLine();
			String[] token2 = line.split(",");
			List<String> t2 = new ArrayList<>();
			for(int i=0;i<token2.length;i++) {
				t2.add(token2[i]);
			}
			line = in.readLine();
			String[] token3 = line.split(",");
			List<String> t3 = new ArrayList<>();
			for(int i=0;i<token3.length;i++) {
				t3.add(token3[i]);
			}
			System.out.println("項目:"+t1.get(0)+"\t"+"起程時間:"+"\t"+t1.get(1)+"\t"+"目的地:"+t1.get(2)+"\t"+"票價:"+t1.get(3));
			System.out.println("項目:"+t2.get(0)+"\t"+"起程時間:"+"\t"+t2.get(1)+"\t"+"目的地:"+t2.get(2)+"\t"+"票價:"+t2.get(3));
			System.out.println("項目:"+t3.get(0)+"\t"+"起程時間:"+"\t"+t3.get(1)+"\t"+"目的地:"+t3.get(2)+"\t"+"票價:"+t3.get(3));
			System.out.println("請投入紙鈔或硬幣(10元 50元 100元) : ");
			Scanner scanner = new Scanner(System.in);
			int money = scanner.nextInt();
			//都投10元的情況下
			while(money<100) {
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money2 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money3 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money4 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money5 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money6 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money7 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money8 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money9 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money10 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money11 = scanner.nextInt();
				System.out.println("金額不足!請繼續投入紙鈔或硬幣!");
				int money12 = scanner.nextInt();
			while(money+money2+money3+money4+money5+money6+money7+money8+money9+money10+money11+money12>=100) {
				System.out.println("請選擇購買項目:");
				break;
			
			}
			}
		
			
			
			int number = scanner.nextInt();
			System.out.println("購買成功!祝您旅途愉快!");
		}catch(FileNotFoundException e) {
		System.out.println("oops!error");
	    }catch(IOException e) {
	    	e.getStackTrace();
	    	
	    }

}
}