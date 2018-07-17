package com.wen;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		/*請使用者輸入一個數字，印出階梯形的星號
		 * 如:  輸入6
		 * 結果        *#####
		 *     **####
		 *     ***###
		 *     ****##
		 *     ******
		 */
		System.out.println("請輸入一個數值:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for(int x=1;x<=n;x++){
			for (int y=1;y<=x;y++){
				System.out.print("*");
				for(int z=1;z<(n-x);z++){
					System.out.print("#");
					
				}
			}
			System.out.println(" ");
		}
	}

}
