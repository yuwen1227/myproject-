//有一個遊戲場地，長度由執行當時決定，場地中亂數產生陷阱
//陷阱數也由當時決定，有一個玩家，初始值為100hp，走一步消耗1hp，
//撞到* 牆扣5hp，撞到陷阱扣20hp
package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {

	public static void main(String[] args) {
		new MazeMain();
		
		int row = 5;
		int col = 5;
		int hp = 100;
		
		FileReader fr;
		try {
			fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int col = Integer.parseInt(tokens[0]);
			int row = Integer.parseInt(tokens[1]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	class Main{
		int row,col;
		int trapCount;
		int[] traps;
		int[] positions;
		Player player;
	public void Maze(int col, int row, int trapCount){
		this.col = col;
		this.row = row;
		this.trapCount = trapCount;
	}
	
}
	class Player{
		int hp = 100;
		int pos = 0;
	}
}