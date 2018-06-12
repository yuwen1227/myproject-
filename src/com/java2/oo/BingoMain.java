//25代表有5x5共25顆球，產生時就給亂數排列出來
//如下:
// 5 10 11  8 25
//13  6 21  4  1
//22 15 23 19  7
//2  20 18  3 14
//17  9 12 24 16
//bingo.txt:25
//8,4,7,18,21,3,5,1,9,10
package com.java2.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoMain {
	List<Integer> numbers = new ArrayList<>();
	int count=25;
	int row=5;
	int col=5;
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
	public static void main(String[] args) {
		Bingo b = new Bingo();
	}

}
