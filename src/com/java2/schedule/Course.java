package com.java2.schedule;

public class Course {
	String id;
	String name;
	int weekday;
	int hour;
	int duration;
	
	public Course(String id, String name, int weekday, int hour, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.weekday = weekday;
		this.hour = hour;
		this.duration = duration;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	public int getHour() {
		return hour;
	}
	public void setTime(int hour) {
		this.hour = hour;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
