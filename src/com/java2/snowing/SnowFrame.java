package com.java2.snowing;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

// JFrame 開視窗
public class SnowFrame extends JFrame {
	SnowCanvas canvas = new SnowCanvas();
	
//建立物件(雪)，設定視窗大小，顯示視窗
	public SnowFrame() {
		setSize(850, 650);
		setLocation(500, 200);
		add(canvas);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
//Canvas 的子項目永遠不會調整大小，它們只會位於其指定的座標上。
	public class SnowCanvas extends Canvas {
		List<Snow> snows = new ArrayList<>();

		public SnowCanvas() {
			for (int i = 0; i < 100; i++) {
				Snow snow = new Snow(SnowCanvas.this);
				snows.add(snow);
				snow.start();

			}
		}

		
		

		@Override
		public void paint(Graphics g) {
			for (int i = 0; i < 100; i++) {
				Snow snow = snows.get(i);
				g.drawString("雪", snow.x, snow.y);
			}
		}

	}
	public static void main(String[] args) {
		new SnowFrame();
	}
}
