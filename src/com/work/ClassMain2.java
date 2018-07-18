package com.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassMain2 {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("grade.txt");
		BufferedReader bf = new BufferedReader(fr);
		
		String line = bf.readLine();
		String[] token1 = line.split(",");
		List<String> s1 = new ArrayList<>();
		for(int i=0;i<token1.length;i++) {
		s1.add(token1[i]);
		}
		line = bf.readLine();
		String[] token2 = line.split(",");
		List<String> s2 = new ArrayList<>();
		for(int i=0;i<token2.length;i++) {
		s2.add(token2[i]);
		}
		line = bf.readLine();
		String[] token3 = line.split(",");
		List<String> s3 = new ArrayList<>();
		for(int i=0;i<token3.length;i++) {
		s3.add(token3[i]);
		}
		line = bf.readLine();
		String[] token4 = line.split(",");
		List<String> s4 = new ArrayList<>();
		for(int i=0;i<token4.length;i++) {
		s4.add(token4[i]);
		}
		System.out.println("座號:"+s1.get(0)+"\t"+"姓名:"+s1.get(1)+" "+"數學成績:"+s1.get(2)+"\t"+"國文成績:"+s1.get(3));
		System.out.println("座號:"+s2.get(0)+"\t"+"姓名:"+s2.get(1)+" "+"數學成績:"+s2.get(2)+"\t"+"國文成績:"+s2.get(3));
		System.out.println("座號:"+s3.get(0)+"\t"+"姓名:"+s3.get(1)+" "+"數學成績:"+s3.get(2)+"\t"+"國文成績:"+s3.get(3));
		System.out.println("座號:"+s4.get(0)+"\t"+"姓名:"+s4.get(1)+" "+"數學成績:"+s4.get(2)+"\t"+"國文成績:"+s4.get(3));
	}catch(FileNotFoundException e) {
		System.out.println("oops,error!");
	}catch(IOException e) {
		e.getStackTrace();
	}

}
}