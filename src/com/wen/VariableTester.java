package com.wen;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
int age = 0;
float weight = 77.7f;
char c = 77;
char c2 = 'Z';
System.out.println((int)c2);
boolean pass = false;
System.out.println(!pass);
System.out.println(pass);


Random r = new Random();
int n1 = r.nextInt(6)+1;
int n2 = r.nextInt(6)+1;
int n3 = r.nextInt(6)+1;
int n4 = r.nextInt(6)+1;
System.out.println( 3>=2 );

String s = new String("Hello");
int len = s.length();
System.out.println("len:"+ len);
System.out.println(s.charAt(0));

//+-*/ %餘數    &&且    ||或
float f =10.0f;
int x =10;
int y =3;
float z =f/y;
System.out.println(z);

//2進位運算 10=01010
System.out.println(x>>1);

//x++; => x=x+1;
x++;
x--;
System.out.println(x);

//x=x+2; =>x += 2;
x = x+2;
x += 2;
System.out.println(x);



	}

}
