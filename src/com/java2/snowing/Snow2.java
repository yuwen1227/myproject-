package com.java2.snowing;

import java.awt.Canvas;
import java.util.Random;

public class Snow2 extends Thread {
	Canvas canvas;
	Random random = new Random();
	int x;
	int y = 500;

	public Snow2(Canvas canvas) {
		this.canvas = canvas;
		x = random.nextInt(300);
	}

	@Override
	public void run() {
		for (int i = 0; i < 400; i++) {
			y = y + 1;
			int movent = random.nextInt(3) - 1;
			x = x - movent;
			try {
				sleep(50);
				canvas.repaint();
				canvas.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
