package com.java2.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo {

	public class BingoMain {
		List<Integer> numbers = new ArrayList<>();
		int count=25;
		int row=5;
		int col=5;
		Bingo b = new Bingo();
		public BingoMain(int count){
			for (int i=0;i<count;i++){
				numbers.add(i+1);
			}
			Collections.shuffle(numbers);
		}
		public void print(){
			Bingo b = new Bingo();
			for(int i=0;i<count;i++){
				int n = numbers.get(i);
				if(n<10){
					System.out.print(" ");
				}
				System.out.print(n<10? " ":" ");
				System.out.print(n);
				if(i%5==0){
					System.out.println(" ");
				}
			}
		}
	}
}