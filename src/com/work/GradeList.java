package com.work;

import java.util.ArrayList;
import java.util.List;

public class GradeList {
	List<Grade> grade = new ArrayList<>();
	public void on() {
	for(int i=0;i<grade.size();i++) {
		Grade g = grade.get(i);
		System.out.println("第"+ g.getId()+"人"+"\t"+"姓名:"+g.getName()+"   "+"分數:"+g.getGrade());
				
	}
}
}
