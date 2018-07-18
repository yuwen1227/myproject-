package com.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassMain {
	
	public static void main(String[] args) {
		Class c = new Class();
		try {
			FileReader fr = new FileReader("student.txt");
			BufferedReader bf = new BufferedReader(fr);
			String line = bf.readLine();
			String token[] = line.split(",");
			int count = Integer.parseInt(token[0]);
			for(int i=0;i<count;i++) {
				String name = token[i*2+1];
				int gender = Integer.parseInt(token[i*2+2]);
				c.student.add(new Student(i+1,name,gender));
			}
			c.on();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
