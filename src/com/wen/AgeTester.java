package com.wen;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
System.out.println("請輸入您的年齡");
Scanner scanner = new Scanner(System.in);
String line =  scanner.nextLine();
int age = Integer.parseInt(line);
if(age < 12){
    System.out.println("國小生?");
  }else{
	  if(age <= 15){
	System.out.println("國中生?");
  }else{
	  if(age <= 18){
	System.out.println("高中生?");
  }else{
	System.out.println("......");
	
	for(int i=1 ; i<=5 ; i=i+1);
	System.out.println();
			}
	}
	}
	}
	}
