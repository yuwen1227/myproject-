package com.wen;

public class ScoreTester {

	public static void main(String[] args) {
/*score 0 ~ 59 failed
 * 		60 ~ 69 passed
 * 		70 ~ 79 good
 * 		80 ~ 89 great
 * 		90 ~ 100 excellent
 */
		int score = 50;
		System.out.println(score/10);
		int level =(score / 10);
		switch(level){
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
			System.out.println("failed");
			break;
		case 6 :
			System.out.println("passed");
			break;
		case 7 :
			System.out.println("good");
			break;
		case 8 :
			System.out.println("great");
			break;
		default :
			System.out.println("excellent");
			
		
		}
	}

}
