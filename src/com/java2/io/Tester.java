package com.java2.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Hello");
		//new Tester();
		try {
			Socket socket = new Socket("ptt.cc",23);
			InputStream is = socket.getInputStream();
			int data = 0 ;
			for(int i=0;i<5000;i++){
				data = is.read();
				System.out.println((char)data);
			}
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
