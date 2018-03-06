package com.java2.object;

public class Food {
	private int apple ;
	private	int banana ;
	private int orange;
	
	public Food(int apple,int banana,int orange){
		this.apple= apple;
		this.banana = banana;
		this.orange =orange ;
		
	}
	public void print(){
		System.out.println(apple+"\t"+banana+"\t"+orange);
	}
	public int getAverage(){
		return(apple+banana+orange/3);
	}
}
