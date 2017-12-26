package com.wen.oo;

public class Tester {

	public static void main(String[] args) {
  //  Student stu = new Student("小明",55,77,99);
	  Student stu = new Student("小明");
  	/*
  	  stu.english = 55;
  	  stu.math = 77;
  	  stu.chinese = 99;
  	  stu.pass= 50;
  	*/
    stu.print();
    int avg = stu.getAverage();
    System.out.println(stu.name+":"+avg);
    
    GraduateStudent gstu = new GraduateStudent();
    gstu.print();
	}

}
