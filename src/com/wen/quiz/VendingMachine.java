package com.wen.quiz;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Drink d1 = new Drink("a",15);
		Drink d2 = new Drink("a",20);
		Drink d3 = new Drink("a",30);
		
		/*
		����}�C 
		Drink[] drinks = new Drink[10]; 
		drinks[0]= new Drink("a",15);
		drinks[1]= new Drink("b",20);
		drinks[2]= new Drink("c",30);
		*/
        System.out.println("�п�J1 5 10");	
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int money = Integer.parseInt(line);
		System.out.println(money++);
		
	}

}
