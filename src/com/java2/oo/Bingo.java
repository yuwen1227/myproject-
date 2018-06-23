package com.java2.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bingo {
	public class Form {
		int table;
		int number;
		List<Integer> bingos;
		List<Integer> numbers = new ArrayList<>();
		public Form(int table, int number, List<Integer> bingo) {
			this.table = table;
			this.number = number;
			this.bingos = bingo;
	}	
	}
}