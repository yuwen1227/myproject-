package com.java2.quiz.pratice;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	List<Drink> drink = new ArrayList<>();
	public void on() {
		for(int a=0;a<drink.size();a++) {
			Drink D = drink.get(a);
			System.out.println(D.getId()+"."+"\t"+D.getName()+"\t"+D.getPrice());
		}
	}
}
