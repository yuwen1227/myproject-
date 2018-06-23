//有一個遊戲場地，長度由執行當時決定，場地中亂數產生陷阱
//陷阱數也由當時決定，有一個玩家，初始值為100hp，走一步消耗1hp，
//撞到* 牆扣5hp，撞到陷阱扣20hp
package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MazeMain {

	public MazeMain() {
		try {
			FileReader rd = new FileReader("maze.txt");
			BufferedReader bfr = new BufferedReader(rd);
			String line = bfr.readLine();
			String[] steps = line.split(",");
			int col = Integer.parseInt(steps[0]);
			int row = Integer.parseInt(steps[1]);
			line = bfr.readLine();
		
		} catch (Exception e) {
		} 
	}
}
			