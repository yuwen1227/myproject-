package com.work;

public class Student {
	int count;
	String name;
	int gender;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public Student(int count, String name, int gender) {
		super();
		this.count = count;
		this.name = name;
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
}
