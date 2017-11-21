package com.wen;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = 100;
		while (d != 0) {
			System.out.print("請輸入方向:");
			String direction = scanner.nextLine();
			d = Integer.parseInt(direction);
			switch (d) {
			case 8:
				System.out.println("向上");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 2:
				System.out.println("向下");
				break;
			case 0:
				System.out.println("GAME OVER");
				break;
			}
		}

	}

}
