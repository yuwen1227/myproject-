package com.java2.snowing;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class SnowFrame extends JFrame {
	public class SnowCanvas extends Canvas{
		List<Snow> snows = new ArrayList<>();
		public SnowCanvas() {
			for(int i =0 ; i<100; i++) {
				Snow snow = new Snow();
				snow.start();
				snows.add(snow);
				
			}
		}
		
	}
	public static void main(String[] args) {
		
	}
	public void paint(Graphics g) {
		for(int i =0;i<100;i++) {
			Snow snow = snows.get(i);
			g.drawString("雪", snow.x, snow.y);
		}
	}
		
	}
