package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {

	public static void main(String[] args) throws FileNotFoundException {
			PrintStream out  = new PrintStream("data.txt");
			out.println("yu wen\t19\t1227");
			out.flush();//確認緩衝區內的資料送出去
			out.close();//關閉資料流
	}

}
