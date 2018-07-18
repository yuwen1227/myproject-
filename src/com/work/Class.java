package com.work;

import java.util.ArrayList;
import java.util.List;

public class Class {
	List<Student> student = new ArrayList<>();
	public void on(){
		for(int a=0;a<student.size();a++) {
			Student s = student.get(a);
			System.out.println("第"+s.getCount()+"人,"+s.getName()+","+s.getGender());
		}
	}
}
