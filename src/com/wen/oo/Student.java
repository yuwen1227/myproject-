package com.wen.oo;

public class Student {
	//Ctrl+s �x�s
	int english;
	int math;
	int chinese;
	String name;
	
	//instance variable �ݩ�  -> 
	public Student(String name,int english,int math, int chinese){
	this.name = name;
	this.english= english;
	this.math= math;
	this.chinese= chinese;
	
	}
	public Student(String n){
		this.name = n ;
	}
	/*void ��Ƶ��H�a���^��
	 *int getAverage �ۤv������n���� �A���O�H(return)
	*/
	public void print(){
		System.out.println(english+"\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return(english+math+chinese)/3;
	}
	
 }

