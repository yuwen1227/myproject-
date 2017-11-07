package com.wen;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
/*請問以下誰年紀最大?
		 1)周杰倫
		 2)華晨宇
		 3)梁朝偉
 * 答案為3
 * 依使用者輸入資料判斷答對或答錯
 */
System.out.println("請問以下誰年紀最大?");
System.out.println("1)周杰倫");
System.out.println("2)華宸宇");
System.out.println("3)梁朝偉");
Scanner scanner = new Scanner(System.in);
String line = scanner. nextLine();
int n = Integer.parseInt(line);
	}

}
