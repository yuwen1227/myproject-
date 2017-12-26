package com.wen.oo;

public class Student {
	//Ctrl+s 儲存
	int english;
	int math;
	int chinese;
	String name;
	static int pass = 60;
	
	//instance variable 屬性  -> 
	public Student(String name,int english,int math, int chinese){
	this.name = name;
	this.english= english;
	this.math= math;
	this.chinese= chinese;
	}
	//建立空建構子
	public Student(){
	}
	 
	public Student(String n){
		this.name = n ;
	}
	/*void 資料給人家不回傳
	 *int getAverage 自己偷偷算好平均 再給別人(return)
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

