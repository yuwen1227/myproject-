package com.wen.quiz;

public class NineLazy {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if(i>3&&i<9){
					System.out.print("..."+"\t");
				}else{
				if (i * j < 10) {
					System.out.print(j + "*" + i + "=" + " " + (i * j) + "\t");
				} else {
					System.out.print(j + "*" + i + "=" + (i * j) + "\t");
				}
				
			}
			
		}System.out.println(" ");
		
			}
		}

	}

