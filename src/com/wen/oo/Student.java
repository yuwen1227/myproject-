package com.wen.oo;

public class Student {
	//Ctrl+s 儲存
	int english;
	int math;
	int chinese;
	String name;
	
	//instance variable 屬性  -> 
	public Student(String name,int english,int math, int chinese){
	this.name = name;
	this.english= english;
	this.math= math;
	this.chinese= chinese;
	
	}
	public Student(String n){
		this.name = n ;
	}
	/*void 資料給人家不回傳
	 *int getAverage 自己偷偷算好平均 再給別人(return)
	*/
	public void print(){
		System.out.println(english+"\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return(english+math+chinese)/3;
	}
	
 }

