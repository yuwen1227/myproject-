package com.wen.sogo;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		//陣列放同質資料   集合放異質資料
		
		//ArrayList可放異質資料   <Integer>可全部轉型為同類型的整數
			ArrayList<Customer>customers = new ArrayList<>();
	    
			customers.add(new Customer(10000));
			customers.add(new SilverCustomer(10000));
			customers.add(new GoldenCustomer(10000));
			
			//Customer c1 = new Customer(10000);
			//SilverCustomer c2 = new SilverCustomer(10000);
			//GoldenCustomer c3 = new GoldenCustomer(10000);
			//customers.add(c1);
			//customers.add(c2);
			//customers.add(c3);
			
				for(int i = 0; i<customers.size();i++){
					Customer c = customers.get(i);
					c.print();
			}
		ArrayList<Integer>list = new ArrayList();
		list.add(94); //0
		list.add(87); //1
		list.add(55); //2
		list.add(44); //3
		int n= list.get(0); 
		int n1= list.get(1);
		int n2= list.get(2);
		System.out.println(list.get(1));
		System.out.println(list.size()); //size:集合中有n個資料
			for(int i=0 ; i<list.size();i++){
				System.out.println(list.get(i));
			}
		Customer c1 = new Customer(1000);
		c1.print();
		SilverCustomer c2 = new SilverCustomer(1000);
		c2.print();


	}

}
