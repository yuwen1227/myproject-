package com.wen;

public class Prime {

	public static void main(String[] args) {
  int n = 6;
  boolean prime = true;
 	for (int i=2; i<n;i++){
 		
 		if(n % i == 0){
 			//not prime
 			break;
 			//System.out.println("NOT PRIME!")
 		}
 	}
 	if (prime){
 		System.out.println( n + " IS PRIME NUMBER" );
 	}else{
 		System.out.println( n + " NOT PRIME NUMBER" );
 	}
	}

}
