package com.wen.oo;

public class Student {
	//Ctrl+s �x�s
	int english;
	int math;
	int chinese;
	String name;
	static int pass = 60;
	
	//instance variable �ݩ�  -> 
	public Student(String name,int english,int math, int chinese){
	this.name = name;
	this.english= english;
	this.math= math;
	this.chinese= chinese;
	}
	//�إߪūغc�l
	public Student(){
	}
	 
	public Student(String n){
		this.name = n ;
	}
	/*void ��Ƶ��H�a���^��
	 *int getAverage �ۤv������n���� �A���O�H(return)
	*/
	public void print(){
		System.out.println(pass);
		System.out.println(english+"\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return(english+math+chinese)/3;
	}
	public static void method(){
		System.out.println("hello");
	}
 }

