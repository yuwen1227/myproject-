package com.java2.snowing;

import java.util.Random;

public class Snow extends Thread{
	int x;
	int y = 800;
	Random random = new Random();
	public Snow(){
		x = random.nextInt(600);
	}
	@Override
	public void run(){
		for(int i = 800; i > 0; i--){
//			System.out.println(getName()+":("+ x +","+ y +")");
			y =  y - 1;
			int movement = random.nextInt(3)-1;
			x = x-movement; 
			
			//前面空格
			System.out.print(new String(new char[x]).replace("\0"," "));
			System.out.println("雪");
	}
	
	
	
}
}