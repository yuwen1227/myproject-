package com.java2.schedule;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*有一文字檔儲存了課表(schedule.txt)
 * 請讀取資料後，設計程式可檢查是否有空檔?
 * 如:
 * 請輸入星期(1-7):2
 * 請輸入時(0-24):11
 * [有空檔]
 * 請輸入星期(1-7):4
 * 請輸入時(0-24):14
 * [有課:C004 English 到16時]
 */
public class Main {
	List<Course> courses = new ArrayList<>();
			
	public Main(){
		readCourses();
	}
	public void readCourses(){
		try {
			BufferedReader in = new BufferedReader(new FileReader("schedule.txt"));
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("schdule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String 
		}
		
	}

}
