package com.java2.threading;

public class Horse extends Thread{
	@Override
	public void run(){
		for (int i =0; i<=50; i++){
			System.out.println(getName()+":"+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}


