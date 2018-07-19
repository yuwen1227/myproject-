package com.work;

public class Multipliclation {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + " " + "X" + " " + i + " " + "=" + " " + i * j + "\t");
				if (j == 9) {
					System.out.println(" ");
					
					}
				}
			}

		}
	}

