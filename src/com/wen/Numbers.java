package com.wen;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		/*
		 * Please enter a number : 13 1 2 3 4 5 6 7 8 9 10 11 12 13 
		 * 3的倍數不印
		 */
		for (int x = 1; x <= 13; x++) {
			if (x % 3 == 0) {
				continue;
			}
			System.out.print(x + " ");

		}
		System.out.println("");
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int i = 1;
		while (i <= n) {
			System.out.print(i + " ");
			i = i + 1;
			if (i > 10) {
				break;
			}
		}
	}

}
