package com.work;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GradeMain {

	public static void main(String[] args) {
		int m1 = 100;
		int e1 = 90;
		int m2 = 90;
		int e2 = 80;
		int m3 = 80;
		int e3 = 70;
		int m4 = 60;
		int e4 = 90;
		try {
			FileReader fr = new FileReader("grade");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token1 = line.split(",");
			List<String> p1 = new ArrayList<>();
			for(int i=0;i<token1.length;i++) {
				p1.add(token1[i]);
			}
			line = in.readLine();
			String[] token2 = line.split(",");
			List<String> p2 = new ArrayList<>();
			for(int i=0;i<token2.length;i++) {
				p2.add(token2[i]);
			}
			line = in.readLine();
			String[] token3 = line.split(",");
			List<String> p3 = new ArrayList<>();
			for(int i=0;i<token3.length;i++) {
				p3.add(token3[i]);
			}
			line = in.readLine();
			String[] token4 = line.split(",");
			List<String> p4 = new ArrayList<>();
			for(int i=0;i<token4.length;i++) {
				p4.add(token4[i]);
			}
			System.out.println("座號:"+" "+p1.get(0)+"  "+"姓名:"+ p1.get(1)+"  "+"數學成績:"+p1.get(2)+"  "+"英文成績:"+"  "+p1.get(3)+"  "+"平均:"+"  "+(m1+e1)/2);
			System.out.println("座號:"+" "+p2.get(0)+"  "+"姓名:"+ p2.get(1)+"  "+"數學成績:"+p2.get(2)+"  "+"英文成績:"+"  "+p2.get(3)+"  "+"平均:"+"  "+(m2+e2)/2);
			System.out.println("座號:"+" "+p3.get(0)+"  "+"姓名:"+ p3.get(1)+"  "+"數學成績:"+p3.get(2)+"  "+"英文成績:"+"  "+p3.get(3)+"  "+"平均:"+"  "+(m3+e3)/2);
			System.out.println("座號:"+" "+p4.get(0)+"  "+"姓名:"+ p4.get(1)+"  "+"數學成績:"+p4.get(2)+"  "+"英文成績:"+"  "+p4.get(3)+"  "+"平均:"+"  "+(m4+e4)/2);
			
		}catch(FileNotFoundException e) {
			System.out.println("oops!error");
		}catch(IOException e) {
			System.out.println("oops!error");
		}
	}

}
