package com.wen;

import java.util.Scanner;

public class DataOfYear {

	public static void main(String[] args) {
		/*
		 * n是今年的100天為 幾月幾號
		 */
			int n = 300 ;
			int months[]={31,28,31,30,31,30,31,31,30,31,30,31}; 
			for(int i=0; i<months.length;i++){
			if(n<=months[i]){
				System.out.println( (i+1) +" 月 "+ n +" 日 ");
				break;
			}else{
				n = n-months[i];
			}
			}
	}
	}

