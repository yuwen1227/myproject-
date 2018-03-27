package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	List<Integer> cards = new ArrayList<>();
	String number = "SHDC";
	public void shuffle() {
		for (int i=0;i<52;i++){
			int r = random.nextInt(52);
			cards.set(i,r);
			
		}
		
	}
	
}
