package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileReader;

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
