package com.wen;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = 100;
		while (d != 0) {
			System.out.print("�п�J��V:");
			String direction = scanner.nextLine();
			d = Integer.parseInt(direction);
			switch (d) {
			case 8:
				System.out.println("�V�W");
				break;
			case 4:
				System.out.println("�V��");
				break;
			case 6:
				System.out.println("�V�k");
				break;
			case 2:
				System.out.println("�V�U");
				break;
			case 0:
				System.out.println("GAME OVER");
				break;
			}
		}

	}

}
