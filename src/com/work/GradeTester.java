package com.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeTester {
		
	public static void main(String[] args) {
		GradeList l = new GradeList();
		try {
			FileReader fr = new FileReader("grade.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String token[] = line.split(",");
			int id = Integer.parseInt(token[0]);
			for(int i=0;i<id;i++) {
				String name = token[i*2+1];
				int grade = Integer.parseInt(token[i*2+2]);
				l.grade.add(new Grade(i+1,name,grade));
			}
			l.on(); 
		}catch(FileNotFoundException e) {
		System.out.println("oops!error");
		}catch(IOException e) {
		e.printStackTrace();	
		}

}
}