package com.work;

import java.util.Random;
import com.work.SnowFrame.SnowCanvas;
public class Snow extends Thread {
	int x;
	int y=600;
	Random random = new Random();
	private final SnowFrame.SnowCanvas snowCanvas;
		public Snow(SnowFrame.SnowCanvas snowCanvas) {
			this.snowCanvas = snowCanvas;
			x=random.nextInt(500);
			y=random.nextInt(500);
		}
		
	}

