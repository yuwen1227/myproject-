package com.wen.quiz;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random(); 
		for(int n = 1;n<=10;n++){
		int n1 =  r.nextInt(6)+1;
		int n2 =  r.nextInt(6)+1;
		int n3 =  r.nextInt(6)+1;
		int n4 =  r.nextInt(6)+1;
		
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		System.out.print(n3+" ");
		System.out.print(n4+" ");
		
		if(n1!=n2 && n1!=n3 && n1!=n4 && n2!=n3 && n3!=n4&&n2!=n4){
			System.out.print("*");
	}
	System.out.println(" ");
	}
	
}
}