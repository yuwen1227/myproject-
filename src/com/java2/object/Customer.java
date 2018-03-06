package com.java2.object;

public class Customer {

	int amount;
	private float discount = 0.01f;
	
	public Customer(int amount){
		this.amount = amount;
	}
		
	public void print(){
		int total = (int)(amount * (1-discount));
		System.out.println(amount+"\t"+total);
		
	}
	
}
