package com.java2.object;

import java.util.List;
import java.util.ArrayList;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(11);
		cards.add(1);
		cards.add(7);
		//set 0,1,2  第3個數值由7變為10
		cards.set(2,10);
		System.out.println("removing number:" +cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(1));
		
	}

}
