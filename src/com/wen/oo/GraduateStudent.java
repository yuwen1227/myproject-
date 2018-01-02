package com.wen.oo;

public class GraduateStudent extends Student {
	int thesis;
	public GraduateStudent() {
		super();
		System.out.println("hahaha");

	}
	@Override
	public void print() {
		super.print();
		System.out.println(pass);
		System.out.println(english + "\t" + 
		math + "\t" + chinese + "\t" + thesis);
	}
	@Override
	public int getAverage(){
		return(english+math+chinese+thesis)/4;
}
}