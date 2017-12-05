package com.wen.oo;

public class Tester {

	public static void main(String[] args) {
  Student stu = new Student("¤p©ú",55,77,99);
  	/*stu.english = 55;
  	  stu.math = 77;
  	  stu.chinese = 99;
  	*/
    stu.print();
    int avg = stu.getAverage();
    System.out.println(stu.name+":"+avg);
	}

}
