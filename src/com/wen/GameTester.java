package com.wen;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hp = 100;
		int d = -1;
		int pos = 0;
		int row = 3;
		int col = 5;

		// �U
		if (pos / col < row - 1) {
			pos = pos + col;

		// �W
		if (pos / col >= row - 2) {
			pos = pos - col;

		// ��
		if (pos % col != 0) {
			pos = pos - 1;

		// �k
		if (pos % col != col - 1) {
			pos = pos + 1;
					}
				}
			}

			while (d != 0) {
				System.out.print("�п�J��V:");
				String direction = scanner.nextLine();
				d = Integer.parseInt(direction);
				switch (d) {
				case 8:
					if (pos / col >= row - 2) {
						pos = pos - col;
						System.out.println("�V�W");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;

				case 4:
					if (pos % col != 0) {
						pos = pos - 1;
						System.out.println("�V��");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;

				case 6:
					if (pos % col != col - 1) {
						pos = pos + 1;
						System.out.println("�V�k");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;

				case 2:
					if (pos / col < row - 1) {
						pos = pos + col;
						System.out.println("�V�U");
						System.out.println(hp = hp - 5);
					} else {
						System.out.println(hp = hp - 30);
					}
					break;
				}
				if (hp <= 0) {
					System.out.println("Game Over");
				}

			}
		}
	}
}
