package com.java2.object;

public class Tester {
	String name; 
	String email;
	int experience;
	
		class Employee {
			public void get(String name,String email,int experience){
				this.name = name;
				
			}
		    

			
			}

			class Developer extends Employee {

			  
			}

			class DataAnalyst extends Employee {

			  
			}
	}
	public static void main(String[] args) {
		String[] skills = { "git", "Scala", "JBoss", "UML" };
		Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

		String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
		DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
	
}
