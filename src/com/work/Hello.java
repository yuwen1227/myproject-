package com.work;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.print("Please enter your name:");
		Scanner scanner  = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello"+","+name+"!");
		System.out.print("Please enter your age:");
		int age = scanner.nextInt();
		if(age<18) {
			System.out.println("未成年");
		}else{
			System.out.println("已成年");
		}
		System.out.print("Please enter your gender:(男1 女2)");
		int gender = scanner.nextInt();
		System.out.print("Please enter your birthday:(year month date)");
		int birthday = scanner.nextInt();
	}

}
