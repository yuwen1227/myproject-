package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileTester {
		
	//throws v.s try catch
	public static void main(String[] args) {
		
    
     try{
    	 //一個try可有一或兩個catch
    	 FileOutputStream out  = new FileOutputStream("data.txt");
    	 out.write(65);
    	 out.write(66);
    	 out.write(67);
    	 out.flush();
    	 out.close();
     }catch(FileNotFoundException e){
    	 System.out.println("File NOT FOUND!!");
     }catch(IOException e){
    	 System.out.println("File Output ERROR!!");
     }
	}

}
