package com.work;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class SnowFrame extends JFrame {
	SnowCanvas canvas = new SnowCanvas();

	public SnowFrame() {
		setSize(500, 500);
		setLocation(200, 200);
		add(canvas);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public class SnowCanvas extends Canvas {
		List<Snow> snows = new ArrayList<>();

		public void SnowCanvas() {
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
				g.drawString("*", snow.x, snow.y);
			}
		}
	}

	public static void main(String[] args) {
		new SnowFrame();
	}
}
