package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
//showFunction方法:顯示主功能列表
//start方法:開始接使用者輸入功能
//inputSales方法:開始接收使用者輸入功能

public class Sogo {
	Scanner scanner = new Scanner(System.in);

	public void start(){
		switch (function) {
		while(function != 3){
		case 1 :
			inputSales();
			break;
		case 2 :
			List<Sales> list = new ArrayList<>();
				try{
				FileIntputStream fis = new FileInputStream("sales.txt");
				InputStreamReader isr = new BufferedReader(isr);
				BufferedReader in = new BufferedReader(isr);
				String line = in.readLine();
				while(line != null){
					String[] token = line.split("\t");
					try{
						int type = Integer.parseInt(token[0]);
						int amount = Integer.parseInt(token[1]);
						Sales sales = new Sales(type,amount);
						list.add(sales);
					}catch(NumberFormatException e){
						System.out.println("資料格式錯誤");
						 return;
					}
					line = in.readLine();
				}
				}catch(FileNotFoundException e ) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				//report
				for (Sales sales: list){
				Customer customer = null;
		switch(sales.type){
				case 1: 
				customer = new Customer(sales.getAmount());
				break;
				case 2:
				customer = new SilverCustomer(sales.getAmount());
				break;
				case 3:
				customer = new GoldenCustomer(sales.getAmount());
				break;
									}
				customer.print();
			} 
				break;
				case 3 ;
				return;
		}
		}

	public Sogo() {

	}

	public void inputSales(){
		try{
		FileOutputStream fos = new FileOutputStream("sales.txt",true);
		PrintStream out  = new PrintStream(fos);
		System.out.print("請輸入會員等級:");
		int type = scanner.nextInt(); 
		System.out.print("請輸入銷售金額");
		int amount = scanner.nextInt();
		out.print(type +"\t"+amount);
		out.flush();
		out.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

	public void showFunctions() {
		System.out.println("請輸入功能(1~3):");
		System.out.println("1) 輸入銷售紀錄");
		System.out.println("2) 印出銷售報表");
		System.out.println("3) 結束程式");
	}

	public static void main(String[] args) {
		Sogo sogo = new Sogo();
	}
}
