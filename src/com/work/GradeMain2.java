package com.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GradeMain2 {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("grade2.txt");
		BufferedReader in = new BufferedReader(fr);
		String line = in.readLine();
		String[] token1 = line.split(",");
		List<String> g1 = new ArrayList<>();
		for(int i=0;i<token1.length;i++) {
			g1.add(token1[i]);
		}
		line = in.readLine();
		String[] token2 = line.split(",");
		List<String> g2 = new ArrayList<>();
		for(int i=0;i<token2.length;i++) {
			g2.add(token2[i]);
		}
		line = in.readLine();
		String[] token3 = line.split(",");
		List<String> g3= new ArrayList<>();
		for(int i=0;i<token3.length;i++) {
			g3.add(token3[i]);
		}
		line = in.readLine();
		String[] token4 = line.split(",");
		List<String> g4 = new ArrayList<>();
		for(int i=0;i<token4.length;i++) {
			g4.add(token4[i]);
		}
		System.out.println("座號:"+g1.get(0)+"\t"+"姓名:"+g1.get(1)+"\t"+"數學成績:"+g1.get(2)+"\t"+"英文成績:"+g1.get(3));
		System.out.println("座號:"+g2.get(0)+"\t"+"姓名:"+g2.get(1)+"         "+"數學成績:"+g2.get(2)+"\t"+"英文成績:"+g2.get(3));
		System.out.println("座號:"+g3.get(0)+"\t"+"姓名:"+g3.get(1)+"\t"+"數學成績:"+g3.get(2)+"\t"+"英文成績:"+g3.get(3));
		System.out.println("座號:"+g4.get(0)+"\t"+"姓名:"+g4.get(1)+"\t"+"數學成績:"+g4.get(2)+"\t"+"英文成績:"+g4.get(3));
		}catch(FileNotFoundException e) {
		System.out.println("oops!error!");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}