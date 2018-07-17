package com.work;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	List<Food> f = new ArrayList<>(); 
	
	public void on(){
		for(int a=0; a<f.size();a++) {
			Food food = f.get(a);
			System.out.println(food.getId()+")"+food.getName());
		}
	}
}
