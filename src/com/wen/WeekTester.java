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
			System.out.print("�P���@");
			break;
		case 2 :
			System.out.print("�P���G");
			break;
		case 3 :
			System.out.print("�P���T");
			break;
		case 4:
			System.out.print("�P���|");
			break;
		case 5:
			System.out.print("�P����");
			break;
		case 6 :
			System.out.print("�P����");
			break;
		case 7:
			System.out.print("�P����");
			break;
			/* �S�b�H�W�ԭz��  �k�Ǭ��P�@��  �ϥ�"default:" */
		default:
			System.out.print("�l��p�_�C");
			
		}
	}

}
