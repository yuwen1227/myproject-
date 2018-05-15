package com.java2.threading;

public class HorseRunable implements Runnable{
	@Override
	public void run(){
		for (int i =0; i<=50; i++){
			System.out.println("R:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
