//25代表有5x5共25顆球，產生時就給亂數排列出來
//如下:
// 5 10 11  8 25
//13  6 21  4  1
//22 15 23 19  7
//2  20 18  3 14
//17  9 12 24 16

package com.java2.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoMain {
	List<Integer> numbers = new ArrayListst<>();
	public BingoMain(int count){
		for (int i=0;i<count;i++){
			numbers.add(i+1);
		}
		Collections.shuffle(numbers);
	}
	public void print(){
		for(int i=0;i<count;i++){
			int n = numbers.get(i);
			System.out.print(n<10? " ":" ");
			System.out.print(n);
		}
	}
	public static void main(String[] args) {

	}

}
