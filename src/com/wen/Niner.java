package com.wen;

/*          2 x 1 =  2
       		2 x 2 =  4
			2 x 3 =  6
			2 x 4 =  8
			2 x 5 = 10
			2 x 6 = 12
			2 x 7 = 14
			2 x 8 = 16
			2 x 9 = 18
*/
public class Niner {

	public static void main(String[] args) {
		for (int n = 1; n < 10; n++)
			for (int i = 1; i <= 9; i++) {
				System.out.print(n + " x " + i + " = ");
				if ((n * i) < 10) {
					System.out.print(" ");
				}
				System.out.println((n * i));
			}
	}
}