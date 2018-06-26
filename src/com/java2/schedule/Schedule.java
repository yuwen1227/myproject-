package com.java2.schedule;

public class Schedule {
	
		String classroom;
		String name;
		int day1;
		int time1;
		int due1;
		public Schedule() {
			
		}
		public Schedule(String classroom,String name,int day1,int time1,int due1) {
			this.classroom = classroom;
			this.name = name;
			this.day1 = day1;
			this.time1 = time1;
			this.due1 = due1;
		}
		public String getclassroom() {
			return classroom;
		}
		public String getname() {
			return name;
		}
		public int getday1() {
			return day1;
		}
		public int gettime1() {
			return time1;
		}
		public int getdue1() {
			return due1;
		}
		

	}

