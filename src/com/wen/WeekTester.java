package com.wen;

import java.util.Scanner;

public class WeekTester {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		switch(n){
		case 1 :
			System.out.print("星期一");
			break;
		case 2 :
			System.out.print("星期二");
			break;
		case 3 :
			System.out.print("星期三");
			break;
		case 4:
			System.out.print("星期四");
			break;
		case 5:
			System.out.print("星期五");
			break;
		case 6 :
			System.out.print("星期六");
			break;
		case 7:
			System.out.print("星期日");
			break;
			/* 沒有以上敘述的，歸納為同一類，使用"default:" */
		default:
			System.out.print("錯誤");
			
		}
	}

}
