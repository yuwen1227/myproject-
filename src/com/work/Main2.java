package com.work;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException,UnsupportedEncodingException,IOException {
		char ch[] = new char[100];
		int len = 100;
		StringBuilder sb = new StringBuilder();
		FileReader fr = new FileReader("D:\\201806.csv");
		while((len = fr.read(ch))>0) {
			  //添加	  //將陣列轉為字串
	  		sb.append(new String(ch,0,len));
		}
		System.out.println(sb);
	}

}
