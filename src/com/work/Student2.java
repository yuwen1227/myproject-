package com.work;

public class Student2 {
	int id;
	String name;
	int math;
	int english;
	public Student2(int id, String name, int math, int english) {
		super();
		this.id = id;
		this.name = name;
		this.math = math;
		this.english = english;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
}
