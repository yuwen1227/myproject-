package com.wen;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
/*�ШϥΪ̿�J�@�ӼƦr�A�L�X����Ϊ��P��
 * �p:  ��J6
 * ���G    *#####
 *     **####
 *     ***###
 *     ****##
 *     ******
 */
		System.out.println("�п�J�@�Ӽƭ�:");
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
