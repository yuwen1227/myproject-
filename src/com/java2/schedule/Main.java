package com.java2.schedule;

import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*有一文字檔儲存了課表(schedule.txt)
 * 請讀取資料後，設計程式可檢查是否有空檔?
 * 如:
 * 請輸入星期(1-7):2
 * 請輸入時(0-24):11
 * [有空檔]
 * 請輸入星期(1-7):4
 * 請輸入時(0-24):14
 * [有課:C004 English 到16時]
 */
public class Main {
	Scanner scanner = new Scanner(System.in);

	public void study() {
			int function = 0;
			while(function!=2) {
				showFuctions();
				function = scanner.nextInt();
			switch(function) {
			case 1:
				System.out.println("請輸入星期(1~7):");
				int day = scanner.nextInt();
				System.out.println("請輸入時(0~24):");
				int time = scanner.nextInt();
				
		try {
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
				String[] token1 = line.split(",");
				List<String> list1 = new ArrayList<>();
				for(int i = 0;i<token1.length;i++) {
					list1.add(token1[i]);
				}
				line = in.readLine();
				String[] token2 = line.split(",");
				List<String> list2 = new ArrayList<>();
				for(int i = 0;i<token2.length;i++) {
					list2.add(token2[i]);
				}
				line = in.readLine();
				String[] token3 = line.split(",");
				List<String> list3 = new ArrayList<>();
				for(int i = 0;i<token3.length;i++) {
					list3.add(token3[i]);
				}
				line = in.readLine();
				String[] token4 = line.split(",");
				List<String> list4 = new ArrayList<>();
				for(int i = 0;i<token4.length;i++) {
					list4.add(token4[i]);
				}
				
				
				
				

				switch(day) {
				case 1:
					if(time>=Integer.parseInt(list3.get(3))&&time<=(Integer.parseInt(list3.get(3))+Integer.parseInt(list3.get(4)))) {
						System.out.println("[有課:" + list3.get(0) + list3.get(1) + "到"+(Integer.parseInt(list3.get(3))+Integer.parseInt(list3.get(4)))+"時]");
						break;
					}else {
						System.out.println("[有空檔]");
						break;
					}
					
				case 4:
				
					
					if(time>=Integer.parseInt(list2.get(3))&&time <=(Integer.parseInt(list2.get(3))+Integer.parseInt(list2.get(4)))){
							System.out.println("[有課:" + list2.get(0) + list2.get(1) + "到"+(Integer.parseInt(list2.get(3))+Integer.parseInt(list2.get(4)))+"時]");
							break;
					}
					else {
						if(time>=Integer.parseInt(list4.get(3))&&time <=(Integer.parseInt(list4.get(3))+Integer.parseInt(list4.get(4)))){
							System.out.println("[有課:" + list4.get(0) + list4.get(1) + "到"+(Integer.parseInt(list4.get(3))+Integer.parseInt(list4.get(4)))+"時]");
							break;
					}else {
						System.out.println("[有空檔]");
						break;
					}
					}
					
					
				
				case 2:
					if(time>=Integer.parseInt(list1.get(3))&&time <=(Integer.parseInt(list1.get(3))+Integer.parseInt(list1.get(4)))){
						System.out.println("[有課:" + list1.get(0) + list1.get(1) + "到"+(Integer.parseInt(list1.get(3))+Integer.parseInt(list1.get(4)))+"時]");
						break;
				}else {
					System.out.println("[有空檔]");
					break;
				}
					default:
						System.out.println("[有空檔]");
						break;
				}
				
			}
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			case 2:
				return;
		}
		}
		}

	public static void main(String[] args) {
		Main main = new Main();
		main.study();

	}

	public void showFuctions() {
		System.out.println("請輸入功能(1or2)");
		System.out.println("1)查詢空檔時間");
		System.out.println("2)結束程式");
	}

	public void question() {
		System.out.println("請輸入星期(1~7):");
		int day = scanner.nextInt();
		System.out.println("請輸入時(0~24):");
		int time = scanner.nextInt();
	}

}