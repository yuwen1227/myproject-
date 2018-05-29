package com.java2.net;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MySever {

	public static void main(String[] args) {
		try{
		ServerSocket sever = new ServerSocket(9958);
		Socket socket = sever.accept();
		System.out.println("connected");
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferReader 
		
		
		
		
		
 	}

}
