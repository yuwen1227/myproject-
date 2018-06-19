package com.java2.net;

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;

public class MySever {

	public static void main(String[] args) {
		try {
			ServerSocket sever = new ServerSocket(9958);
			Socket socket = sever.accept();
			System.out.println("connected");
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			System.out.println(line);
			String tokens[] = line.split(":");
			String command = tokens[0];
			String option = tokens[1];
			System.out.println(command + "/" + option);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error!!!");
		}

	}

}
